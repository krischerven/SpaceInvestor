package co.gc.space.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.gc.space.PlanetBuilder;
import co.gc.space.entity.planet.Europa;
import co.gc.space.entity.planet.Jupiter;
import co.gc.space.entity.planet.Mars;
import co.gc.space.entity.planet.Mercury;
import co.gc.space.entity.planet.Neptune;
import co.gc.space.entity.planet.Planet;
import co.gc.space.entity.planet.Saturn;
import co.gc.space.entity.planet.Uranus;
import co.gc.space.entity.planet.Venus;
import co.gc.space.graph.EuropaGraph;
import co.gc.space.graph.JupiterGraph;
import co.gc.space.graph.MarsGraph;
import co.gc.space.graph.MercuryGraph;
import co.gc.space.graph.NeptuneGraph;
import co.gc.space.graph.SaturnGraph;
import co.gc.space.graph.UranusGraph;
import co.gc.space.graph.VenusGraph;
import co.gc.space.land.BetaPicBHouse;
import co.gc.space.land.BetaPicCHouse;
import co.gc.space.land.EuropaHouse;
import co.gc.space.land.JupiterHouse;
import co.gc.space.land.Kepler421BHouse;
import co.gc.space.land.MarsHouse;
import co.gc.space.land.MercuryHouse;
import co.gc.space.land.NeptuneHouse;
import co.gc.space.land.SaturnHouse;
import co.gc.space.land.UmaBHouse;
import co.gc.space.land.UranusHouse;
import co.gc.space.land.VenusHouse;
import co.gc.space.repo.PlanetRepo;

@Controller
public class SpaceController {

	@Autowired PlanetRepo repo;
	final PlanetBuilder builder = new PlanetBuilder();

	@PostConstruct private void initialize() {
		builder.setRepo(repo);
	}

	@SuppressWarnings("unchecked")
	private static ArrayList<Object>[] partition(List<Planet> planets) {
		ArrayList<Planet> _1 = new ArrayList<>();
		ArrayList<Planet> _2 = new ArrayList<>();
		ArrayList<Planet> _3 = new ArrayList<>();
		for (int i = 0; i < planets.size(); ++i) {
			if ((i % 3) == 0) {
				_3.add(planets.get(i));
			} else if ((i % 2) == 0) {
				_2.add(planets.get(i));
			} else {
				_1.add(planets.get(i));
			}
		}
		return new ArrayList[] { _3, _2, _1 };
	}

	@RequestMapping("/")
	public ModelAndView home() {
		List<Planet> planets = new ArrayList<>();
		planets.add(new Mars());
		planets.add(new Jupiter());
		planets.add(new Saturn());
		planets.add(new Mercury());
		planets.add(new Neptune());
		planets.add(new Uranus());
		planets.add(new Venus());
		planets.add(new Europa());
		planets.add(builder.Build("47 uma b"));
		planets.add(builder.Build("kepler-421 b"));
		planets.add(builder.Build("beta pic b"));
		planets.add(builder.Build("beta pic c"));
		final ArrayList<Object>[] planetArr = partition(planets);
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("first", planetArr[0]);
		mv.addObject("second", planetArr[1]);
		mv.addObject("third", planetArr[2]);
		return mv;
	}

	@RequestMapping("/planets/jupiter")
	public ModelAndView jupiter() {
		ModelAndView mv = new ModelAndView ("planets/jupiter", "planet", new Jupiter());
		mv.addObject("jupiterGraph1", new JupiterGraph());
		mv.addObject("jupiterHouse", new JupiterHouse());
		return mv;
	}

	@RequestMapping("/planets/mars")
	public ModelAndView mars() {
		ModelAndView mv = new ModelAndView("planets/mars", "planet", new Mars());
		mv.addObject("marsGraph1", new MarsGraph());
		mv.addObject("marsHouse", new MarsHouse());
		return mv;
	}

	@RequestMapping("/planets/mercury")
	public ModelAndView mercury() {
		ModelAndView mv = new ModelAndView("planets/mercury", "planet", new Mercury());
		mv.addObject("mercuryGraph1", new MercuryGraph());
		mv.addObject("mercuryHouse", new MercuryHouse());
		return mv;
	}

	@RequestMapping("/planets/neptune")
	public ModelAndView neptune() {
		ModelAndView mv = new ModelAndView("planets/neptune", "planet", new Neptune());
		mv.addObject("neptuneGraph1", new NeptuneGraph());
		mv.addObject("neptuneHouse", new NeptuneHouse());
		return mv;
	}

	@RequestMapping("/planets/saturn")
	public ModelAndView saturn() {
		ModelAndView mv = new ModelAndView("planets/saturn", "planet", new Saturn());
		mv.addObject("saturnGraph1", new SaturnGraph());
		mv.addObject("saturnHouse", new SaturnHouse());
		return mv;
	}

	@RequestMapping("/planets/uranus")
	public ModelAndView uranus() {
		ModelAndView mv = new ModelAndView("planets/uranus", "planet", new Uranus());
		mv.addObject("uranusGraph1", new UranusGraph());
		mv.addObject("uranusHouse", new UranusHouse());
		return mv;
	}

	@RequestMapping("/planets/venus")
	public ModelAndView venus() {
		ModelAndView mv = new ModelAndView("planets/venus", "planet", new Venus());
		mv.addObject("venusGraph1", new VenusGraph());
		mv.addObject("venusHouse", new VenusHouse());
		return mv;
	}

	@RequestMapping("/planets/47_uma_b")
	public ModelAndView _47_uma_b() {
		ModelAndView mv = new ModelAndView("planets/47_uma_b", "planet", builder.Build("47 uma b"));
		mv.addObject("47umaBHouse", new UmaBHouse());
		return mv;
	}

	@RequestMapping("/planets/kepler-421_b")
	public ModelAndView _kepler_421_b() {
		ModelAndView mv = new ModelAndView("planets/kepler-421_b", "planet", builder.Build("kepler-421 b"));
		mv.addObject("kepler-421BHouse", new Kepler421BHouse());
		return mv;
	}

	@RequestMapping("/planets/beta_pictoris_b")
	public ModelAndView beta_pictoris_b() {
		ModelAndView mv = new ModelAndView("planets/beta_pictoris_b", "planet", builder.Build("beta pic b"));
		mv.addObject("betaPicBHouse", new BetaPicBHouse());
		return mv;
	}

	@RequestMapping("/planets/beta_pictoris_c")
	public ModelAndView beta_pictoris_c() {
		ModelAndView mv = new ModelAndView("planets/beta_pictoris_c", "planet", builder.Build("beta pic c"));
		mv.addObject("betaPicCHouse", new BetaPicCHouse());
		return mv;
	}
	
	@RequestMapping("/planets/europa")
	public ModelAndView europa() {
		ModelAndView mv = new ModelAndView("planets/europa", "planet", new Europa());
		mv.addObject("europaGraph1", new EuropaGraph());
		mv.addObject("europaHouse", new EuropaHouse());
		return mv;
	}
}