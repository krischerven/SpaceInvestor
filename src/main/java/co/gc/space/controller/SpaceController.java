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
		planets.add(builder.Build(repo, "47 uma b"));
		return new ModelAndView("index", "planetList", planets);
	}
	// solar system planets
	@RequestMapping("/planets/jupiter")
	public ModelAndView jupiter() {
		return new ModelAndView("planets/jupiter", "planet", new Jupiter());
	}
	@RequestMapping("/planets/mars")
	public ModelAndView mars() {
		return new ModelAndView("planets/mars", "planet", new Mars());
	}
	@RequestMapping("/planets/mercury")
	public ModelAndView mercury() {
		return new ModelAndView("planets/mercury", "planet", new Mercury());
	}
	@RequestMapping("/planets/neptune")
	public ModelAndView neptune() {
		return new ModelAndView("planets/neptune", "planet", new Neptune());
	}
	@RequestMapping("/planets/saturn")
	public ModelAndView saturn() {
		return new ModelAndView("planets/saturn", "planet", new Saturn());
	}
	@RequestMapping("/planets/uranus")
	public ModelAndView uranus() {
		return new ModelAndView("planets/uranus", "planet", new Uranus());
	}
	@RequestMapping("/planets/venus")
	public ModelAndView venus() {
		return new ModelAndView("planets/venus", "planet", new Venus());
	}
	// exoplanets
	@RequestMapping("/planets/47_uma_b")
	public ModelAndView _47_uma_b() {
		return new ModelAndView("planets/47_uma_b", "planet", builder.Build(repo, "47 uma b"));
	}
}