package co.gc.space;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpaceController {

	final RestTemplate template = new RestTemplate();
	
	/*
	 * The @Value annotation allows us to pull values from aplication.properties
	 * Remember to add application.properties to the .gitignore
	 */
	
	@Value("${exoplanets.appKey}")
	String key;

	@Value("${exoplanets.appId}")
	String id;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index", "response", null);
	}

	@RequestMapping("/test")
	public ModelAndView testResponse() {

		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", key);
		headers.add("ID", id);
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);

		try {
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			ResponseEntity<Object> response = template.exchange(
					"https://api.REPLACEME.com/query?app_id=" + id + "&app_key=" + key,
					HttpMethod.GET, entity, Object.class);
			return new ModelAndView("index", "response", response.getBody());
			// also can use RestClientException - might be better
		} catch (HttpClientErrorException e) {
			return new ModelAndView("index", "response", e);
		} catch (RestClientException e) {
			return new ModelAndView("index", "response", e);
		}

	}
}