package co.gc.space.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.space.repo.PlanetRepo;

@Controller
public class PlanetController {
	
	@Autowired
	PlanetRepo p;
	
	
	@RequestMapping("/search")
	public ModelAndView searchPlanet() { //@RequestParam("planetName") String pName
//		System.out.println(p.findById("test").orElse(null));
		System.out.println(p.findAll());
		return new ModelAndView("searchPl", "findPlanet",p.findAll());
	}

}
