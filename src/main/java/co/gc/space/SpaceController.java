package co.gc.space;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import co.gc.space.entity.planet.Planet;

@Controller
public class SpaceController {
	@RequestMapping("/")
	public ModelAndView home() {
		List<Planet> planets = new ArrayList<>();
		return new ModelAndView("index", "response", planets);
	}
}