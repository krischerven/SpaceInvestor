package co.gc.space.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import co.gc.space.repo.PlanetRepo;
import co.gc.space.PlanetBuilder;
import co.gc.space.entity.planet.*;
import co.gc.space.graph.*;
import co.gc.space.land.*;

@Controller
public class SpaceController {
	
	private enum Houses{
		MERCURY, VENUS, MARS, JUPITER, SATURN, NEPTUNE, URANUS, EUROPA, _47_UMA_B, KEPLER_421_B, BETAPICB, BETAPICC,
		MERCURY2, VENUS2, MARS2, JUPITER2, SATURN2, NEPTUNE2, URANUS2, EUROPA2, _47_UMA_B2, KEPLER_421_B2, BETAPICB2, BETAPICC2,
		MERCURY3, VENUS3, MARS3, JUPITER3, SATURN3, NEPTUNE3, URANUS3, EUROPA3, _47_UMA_B3, KEPLER_421_B3, BETAPICB3, BETAPICC3;
	}

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
		planets.add(builder.Build("K2-18 b"));
		planets.add(builder.Build("K2-3 c"));
		planets.add(builder.Build("Trappist-1 h"));
		final ArrayList<Object>[] planetArr = partition(planets);
		final ModelAndView mv = new ModelAndView("index");
		mv.addObject("first", planetArr[0]);
		mv.addObject("second", planetArr[1]);
		mv.addObject("third", planetArr[2]);
		mv.addObject("all", planets.toArray());
		return mv;
	}

	@RequestMapping("/planets/jupiter")
	public ModelAndView jupiter() {
		ModelAndView mv = new ModelAndView ("planets/jupiter", "planet", new Jupiter());
		mv.addObject("graph1", new JupiterGraph());
		mv.addObject("house", new JupiterHouse());
		mv.addObject("house2", new JupiterHouse2());
		mv.addObject("house3", new JupiterHouse3());
		return mv;
	}

	@RequestMapping("/planets/mars")
	public ModelAndView mars() {
		ModelAndView mv = new ModelAndView("planets/mars", "planet", new Mars());
		mv.addObject("graph1", new MarsGraph());
		mv.addObject("house", new MarsHouse());
		mv.addObject("house2", new MarsHouse2());
		mv.addObject("house3", new MarsHouse3());
		return mv;
	}

	@RequestMapping("/planets/mercury")
	public ModelAndView mercury() {
		ModelAndView mv = new ModelAndView("planets/mercury", "planet", new Mercury());
		mv.addObject("graph1", new MercuryGraph());
		mv.addObject("house", new MercuryHouse());
		mv.addObject("house2", new MercuryHouse2());
		mv.addObject("house3", new MercuryHouse3());
		return mv;
	}

	@RequestMapping("/planets/neptune")
	public ModelAndView neptune() {
		ModelAndView mv = new ModelAndView("planets/neptune", "planet", new Neptune());
		mv.addObject("graph1", new NeptuneGraph());
		mv.addObject("house", new NeptuneHouse());
		mv.addObject("house2", new NeptuneHouse2());
		mv.addObject("house3", new NeptuneHouse3());
		return mv;
	}

	@RequestMapping("/planets/saturn")
	public ModelAndView saturn() {
		ModelAndView mv = new ModelAndView("planets/saturn", "planet", new Saturn());
		mv.addObject("graph1", new SaturnGraph());
		mv.addObject("house", new SaturnHouse());
		mv.addObject("house2", new SaturnHouse2());
		mv.addObject("house3", new SaturnHouse3());
		return mv;
	}

	@RequestMapping("/planets/uranus")
	public ModelAndView uranus() {
		ModelAndView mv = new ModelAndView("planets/uranus", "planet", new Uranus());
		mv.addObject("graph1", new UranusGraph());
		mv.addObject("house", new UranusHouse());
		mv.addObject("house2", new UranusHouse2());
		mv.addObject("house3", new UranusHouse3());
		return mv;
	}

	@RequestMapping("/planets/venus")
	public ModelAndView venus() {
		ModelAndView mv = new ModelAndView("planets/venus", "planet", new Venus());
		mv.addObject("graph1", new VenusGraph());
		mv.addObject("house", new VenusHouse());
		mv.addObject("house2", new VenusHouse2());
		mv.addObject("house3", new VenusHouse3());
		return mv;
	}

	@RequestMapping("/planets/47_uma_b")
	public ModelAndView _47_uma_b() {
		ModelAndView mv = new ModelAndView("planets/47_uma_b", "planet", builder.Build("47 uma b"));
		mv.addObject("house", new UmaBHouse());
		mv.addObject("house2", new UmaBHouse2());
		mv.addObject("house3", new UmaBHouse3());
		return mv;
	}

	@RequestMapping("/planets/kepler-421_b")
	public ModelAndView _kepler_421_b() {
		ModelAndView mv = new ModelAndView("planets/kepler-421_b", "planet", builder.Build("kepler-421 b"));
		mv.addObject("house", new Kepler421BHouse());
		mv.addObject("house2", new Kepler421BHouse2());
		mv.addObject("house3", new Kepler421BHouse3());
		return mv;
	}

	@RequestMapping("/planets/beta_pictoris_b")
	public ModelAndView beta_pictoris_b() {
		ModelAndView mv = new ModelAndView("planets/beta_pictoris_b", "planet", builder.Build("beta pic b"));
		mv.addObject("house", new BetaPicBHouse());
		mv.addObject("house2", new BetaPicBHouse2());
		mv.addObject("house3", new BetaPicBHouse3());
		return mv;
	}

	@RequestMapping("/planets/beta_pictoris_c")
	public ModelAndView beta_pictoris_c() {
		ModelAndView mv = new ModelAndView("planets/beta_pictoris_c", "planet", builder.Build("beta pic c"));
		mv.addObject("house", new BetaPicCHouse());
		mv.addObject("house2", new BetaPicCHouse2());
		mv.addObject("house3", new BetaPicCHouse3());
		return mv;
	}
	
	@RequestMapping("/planets/europa")
	public ModelAndView europa() {
		ModelAndView mv = new ModelAndView("planets/europa", "planet", new Europa());
		mv.addObject("europaGraph1", new EuropaGraph());
		mv.addObject("house", new EuropaHouse());
		mv.addObject("house2", new EuropaHouse2());
		mv.addObject("house3", new EuropaHouse3());
		return mv;
	}
	
	@RequestMapping("/planets/k2_18")
	public ModelAndView k2_18() {
		ModelAndView mv = new ModelAndView("/planets/k2_18_b", "planet", builder.Build("K2-18 b"));
		return mv;
	}
	
	@RequestMapping("/planets/k2_3")
	public ModelAndView k2_3() {
		ModelAndView mv = new ModelAndView("/planets/k2_3", "planet", builder.Build("K2-3 c"));
		return mv;
	}
	
	@RequestMapping("/planets/trappist-1h")
	public ModelAndView Trappist_1 () {
		ModelAndView mv = new ModelAndView("/planets/trappist-1h", "planet", builder.Build("Trappist-1 h"));
		return mv; 
	}
	
	@RequestMapping("/buyhouse") 
	public ModelAndView buyHouse(@RequestParam("house") Houses house) {
		
		switch(house) {
			case MERCURY:
				return new ModelAndView("buyhouse", "house", new MercuryHouse().setPlanet(new Mercury()));
				
			case VENUS:
				return new ModelAndView("buyhouse", "house", new VenusHouse().setPlanet(new Venus()));
				
			case MARS:
				return new ModelAndView("buyhouse", "house", new MarsHouse().setPlanet(new Mars()));
				
			case JUPITER:
				return new ModelAndView("buyhouse", "house", new JupiterHouse().setPlanet(new Jupiter()));
				
			case SATURN:
				return new ModelAndView("buyhouse", "house", new SaturnHouse().setPlanet(new Saturn()));
				
			case NEPTUNE:
				return new ModelAndView("buyhouse", "house", new NeptuneHouse().setPlanet(new Neptune()));
				
			case URANUS:
				return new ModelAndView("buyhouse", "house", new UranusHouse().setPlanet(new Uranus()));
				
			case EUROPA:
				return new ModelAndView("buyhouse", "house", new EuropaHouse().setPlanet(new Europa()));
				
			case _47_UMA_B:
				return new ModelAndView("buyhouse", "house", new UmaBHouse().setPlanet(builder.Build("47 uma b")));
				
			case KEPLER_421_B:
				return new ModelAndView("buyhouse", "house", new Kepler421BHouse().setPlanet(builder.Build("kepler-421 b")));
				
			case BETAPICB:
				return new ModelAndView("buyhouse", "house", new BetaPicBHouse().setPlanet(builder.Build("beta pic b")));
				
			case BETAPICC:
				return new ModelAndView("buyhouse", "house", new BetaPicCHouse().setPlanet(builder.Build("beta pic c")));
			
			case MERCURY2:
				return new ModelAndView("buyhouse", "house", new MercuryHouse2().setPlanet(new Mercury()));
				
			case VENUS2:
				return new ModelAndView("buyhouse", "house", new VenusHouse2().setPlanet(new Venus()));
				
			case MARS2:
				return new ModelAndView("buyhouse", "house", new MarsHouse2().setPlanet(new Mars()));
				
			case JUPITER2:
				return new ModelAndView("buyhouse", "house", new JupiterHouse2().setPlanet(new Jupiter()));
				
			case SATURN2:
				return new ModelAndView("buyhouse", "house", new SaturnHouse2().setPlanet(new Saturn()));
				
			case NEPTUNE2:
				return new ModelAndView("buyhouse", "house", new NeptuneHouse2().setPlanet(new Neptune()));
				
			case URANUS2:
				return new ModelAndView("buyhouse", "house", new UranusHouse2().setPlanet(new Uranus()));
				
			case EUROPA2:
				return new ModelAndView("buyhouse", "house", new EuropaHouse2().setPlanet(new Europa()));
				
			case _47_UMA_B2:
				return new ModelAndView("buyhouse", "house", new UmaBHouse2().setPlanet(builder.Build("47 uma b")));
				
			case KEPLER_421_B2:
				return new ModelAndView("buyhouse", "house", new Kepler421BHouse2().setPlanet(builder.Build("kepler-421 b")));
				
			case BETAPICB2:
				return new ModelAndView("buyhouse", "house", new BetaPicBHouse2().setPlanet(builder.Build("beta pic b")));
				
			case BETAPICC2:
				return new ModelAndView("buyhouse", "house", new BetaPicCHouse2().setPlanet(builder.Build("beta pic c")));
		
			case MERCURY3:
				return new ModelAndView("buyhouse", "house", new MercuryHouse3().setPlanet(new Mercury()));
				
			case VENUS3:
				return new ModelAndView("buyhouse", "house", new VenusHouse3().setPlanet(new Venus()));
				
			case MARS3:
				return new ModelAndView("buyhouse", "house", new MarsHouse3().setPlanet(new Mars()));
				
			case JUPITER3:
				return new ModelAndView("buyhouse", "house", new JupiterHouse3().setPlanet(new Jupiter()));
				
			case SATURN3:
				return new ModelAndView("buyhouse", "house", new SaturnHouse3().setPlanet(new Saturn()));
				
			case NEPTUNE3:
				return new ModelAndView("buyhouse", "house", new NeptuneHouse3().setPlanet(new Neptune()));
				
			case URANUS3:
				return new ModelAndView("buyhouse", "house", new UranusHouse3().setPlanet(new Uranus()));
				
			case EUROPA3:
				return new ModelAndView("buyhouse", "house", new EuropaHouse3().setPlanet(new Europa()));
				
			case _47_UMA_B3:
				return new ModelAndView("buyhouse", "house", new UmaBHouse3().setPlanet(builder.Build("47 uma b")));
				
			case KEPLER_421_B3:
				return new ModelAndView("buyhouse", "house", new Kepler421BHouse3().setPlanet(builder.Build("kepler-421 b")));
				
			case BETAPICB3:
				return new ModelAndView("buyhouse", "house", new BetaPicBHouse3().setPlanet(builder.Build("beta pic b")));
				
			case BETAPICC3:
				return new ModelAndView("buyhouse", "house", new BetaPicCHouse3().setPlanet(builder.Build("beta pic c")));
		}
		
		return null;
	}

}