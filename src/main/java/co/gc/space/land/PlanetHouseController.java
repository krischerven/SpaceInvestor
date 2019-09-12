package co.gc.space.land;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlanetHouseController {
	
	@RequestMapping("/mercuryhouse")
		public ModelAndView mercuryHouse() {
			return new ModelAndView("/planethouses/mercuryhouse", "house", new MercuryHouse());
		}
}


