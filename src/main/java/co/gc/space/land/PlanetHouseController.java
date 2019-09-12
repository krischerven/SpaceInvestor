package co.gc.space.land;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlanetHouseController {

	@RequestMapping("/planethouses/mercuryhouse")
	public ModelAndView mercuryHouse() {
		return new ModelAndView("/planethouses/mercuryhouse", "house", new MercuryHouse());
	}

	@RequestMapping("/planethouses/venushouse")
	public ModelAndView venusHouse() {
		return new ModelAndView("/planethouses/venushouse", "house", new VenusHouse());
	}

	@RequestMapping("/planethouses/marshouse")
	public ModelAndView marsHouse() {
		return new ModelAndView("/planethouses/marshouse", "house", new MarsHouse());
	}

	@RequestMapping("/planethouses/jupiterhouse")
	public ModelAndView jupiterHouse() {
		return new ModelAndView("/planethouses/jupiterhouse", "house", new JupiterHouse());
	}

	@RequestMapping("/planethouses/saturnhouse")
	public ModelAndView saturnHouse() {
		return new ModelAndView("/planethouses/saturnhouse", "house", new SaturnHouse());
	}

	@RequestMapping("/planethouses/neptunehouse")
	public ModelAndView neptuneHouse() {
		return new ModelAndView("/planethouses/neptunehouse", "house", new NeptuneHouse());
	}

	@RequestMapping("/planethouses/uranushouse")
	public ModelAndView uranusHouse() {
		return new ModelAndView("/planethouses/uranushouse", "house", new UranusHouse());
	}

	@RequestMapping("/planethouses/47umabhouse")
	public ModelAndView _47umaBHouse() {
		return new ModelAndView("/planethouses/47umabhouse", "house", new UmaBHouse());
	}

	@RequestMapping("/planethouses/kepler-421bhouse")
	public ModelAndView kepler_421BHouse() {
		return new ModelAndView("/planethouses/kepler-421bhouse", "house", new Kepler421BHouse());
	}

	@RequestMapping("/planethouses/betapicbhouse")
	public ModelAndView betaPicBHouse() {
		return new ModelAndView("/planethouses/betapicbhouse", "house", new BetaPicBHouse());
	}

	@RequestMapping("/planethouses/betapicchouse")
	public ModelAndView betaPicCHouse() {
		return new ModelAndView("/planethouses/betapicchouse", "house", new BetaPicCHouse());
	}
}
