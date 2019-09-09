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
	final PlanetBuilder builder = new PlanetBuilder();

	@RequestMapping("/")
	public ModelAndView home() {
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


	@RequestMapping("jupiter")
	public ModelAndView jupiter() {
		return new ModelAndView("jupiter", "planet", new Jupiter());
	}

	@RequestMapping("mars")
	public ModelAndView mars() {
		return new ModelAndView("mars", "planet", new Mars());
	}

	@RequestMapping("mercury")
	public ModelAndView mercury() {
		return new ModelAndView("mercury", "planet", new Mercury());
	}

	@RequestMapping("neptune")
	public ModelAndView neptune() {
		return new ModelAndView("neptune", "planet", new Neptune());
	}

	@RequestMapping("saturn")
	public ModelAndView saturn() {
		return new ModelAndView("saturn", "planet", new Saturn());
	}

	@RequestMapping("uranus")
	public ModelAndView uranus() {
		return new ModelAndView("uranus", "planet", new Uranus());
	}

	@RequestMapping("venus")
	public ModelAndView venus() {
		return new ModelAndView("venus", "planet", new Venus());
	}

}