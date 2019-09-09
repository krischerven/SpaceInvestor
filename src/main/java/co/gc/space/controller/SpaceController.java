package co.gc.space.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.space.PlanetBuilder;
import co.gc.space.entity.planet.*;
import co.gc.space.repo.PlanetRepo;

@Controller
public class SpaceController {
	@Autowired
	PlanetRepo repo;
	@RequestMapping("/")
	public ModelAndView home() {
		PlanetBuilder builder = new PlanetBuilder();
		List<Planet> planets = new ArrayList<>();
		planets.add(new Jupiter());
		planets.add(new Mars());
		planets.add(new Mercury());
		planets.add(new Neptune());
		planets.add(new Saturn());
		planets.add(new Uranus());
		planets.add(new Venus());
		return new ModelAndView("index", "planetList", planets);
	}
}