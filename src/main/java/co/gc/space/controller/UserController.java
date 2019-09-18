package co.gc.space.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.gc.space.HouseEnum;
import co.gc.space.PlanetBuilder;
import co.gc.space.entity.planet.*;
import co.gc.space.land.*;
import co.gc.space.repo.HouseRepo;
import co.gc.space.repo.UserRepo;
import co.gc.space.user.CreditCard;
import co.gc.space.user.User;

@Controller
public class UserController {

	@SuppressWarnings("unchecked")
	private static ArrayList<Object>[] partitionHouses(List<House> houses) {
		ArrayList<House> _1 = new ArrayList<>();
		ArrayList<House> _2 = new ArrayList<>();
		ArrayList<House> _3 = new ArrayList<>();
		if (houses.size() == 1) {
			_3.add(houses.get(0));
		} else if (houses.size() == 2) {
			_3.add(houses.get(0));
			_2.add(houses.get(1));
		} else {
			for (int i = 0; i < houses.size(); ++i) {
				if ((i % 3) == 0) {
					_3.add(houses.get(i));
				} else if ((i % 2) == 0) {
					_2.add(houses.get(i));
				} else {
					_1.add(houses.get(i));
				}
			}
		}
		return new ArrayList[] { _3, _2, _1 };
	}

	public final class Hasher {
		
		final HashMap<String, String> hashes = new HashMap<>();
		final HashMap<String, String> rhashes = new HashMap<>();

		// uniqueness isnt import
		// if two passwords produce the same hash, that isn't an issue
		private String hash(String in) {
			return co.gc.space.Hasher.Hash(in);
		}

		// guaranteed unique hash
		private String uniqueHash(String in) {
			if (!rhashes.containsKey(in)) {
				// spaces are bad
				// hash that caused this: sTOA/8Io7l/XwUC iH5WWg==
				String _hash = hash(in).replace(" ", "");
				// guarantee uniqueness at all costs
				while (hashes.containsKey(_hash)) {
					_hash += "-";
				}
				hashes.put(_hash, in);
				rhashes.put(in, _hash);
				return _hash;
			} else {
				return rhashes.get(in);
			}
		}

		// get the String used to create a unique hash
		// this is fairly secure because it's only stored in memory
		private String getOriginalStringFromHash(String in) {
			return hashes.get(in);
		}
	}

	final Hasher hasher = new Hasher();

	@Autowired
	UserRepo repo;

	@Autowired
	HouseRepo hrepo;

	@RequestMapping("create-user")
	public ModelAndView addUser() {
		return new ModelAndView("create-user");
	}

	@RequestMapping("login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@GetMapping("logged-in")
	public ModelAndView loggedIn(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("logged-in");
		Optional<User> user = repo.findByEmail(email);
		try {
			if (user.get().getPassword().equals(hasher.hash(password))) {
				mv.addObject("account", user.get());
				mv.addObject("success", true);
				// logged in for the entire session
				Cookie cookie = new Cookie("authenticated", hasher.uniqueHash(email));
				response.addCookie(cookie);
			} else {
				mv.addObject("success", false);
				mv.addObject("error", "Error: Password does not match.");
			}
		} catch (NoSuchElementException e) {
			mv.addObject("success", false);
			mv.addObject("error", "Error: Email address is not in the database.");
		}
		return mv;
	}

	@RequestMapping("save-user")
	public ModelAndView saveUser(User user) {
		if (user.getCreditcard() != null && user.getCvv() != null) {
			user.setPassword(hasher.hash(user.getPassword()));
			String test = CreditCard.getMatchingCreditCard(user.getCreditcard(), user.getCvv());
			if (test == null) {
				return new ModelAndView("error-message");
			} else {
				repo.save(user);
				return new ModelAndView("user-created");
			}
		} else {
			return new ModelAndView("user-created");
		}
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

	@GetMapping("save-user-land")
	public ModelAndView saveUserLand(String house, String auth) {
		
		House house2 = null;
		switch (HouseEnum.valueOf(house)) {
			case MARS: {
				house2 = new MarsHouse();
				break;
			}
			case MARS2: {
				house2 = new MarsHouse2();
				break;
			}
			case MARS3: {
				house2 = new MarsHouse3();
				break;
			}
			case SATURN: {
				house2 = new SaturnHouse();
				break;
			}
			case SATURN2: {
				house2 = new SaturnHouse2();
				break;
			}
			case SATURN3: {
				house2 = new SaturnHouse3();
				break;
			}
			case JUPITER: {
				house2 = new JupiterHouse();
				break;
			}
			case JUPITER2: {
				house2 = new JupiterHouse2();
				break;
			}
			case JUPITER3: {
				house2 = new JupiterHouse3();
				break;
			}
			case MERCURY: {
				house2 = new MercuryHouse();
				break;
			}
			case MERCURY2: {
				house2 = new MercuryHouse2();
				break;
			}
			case MERCURY3: {
				house2 = new MercuryHouse3();
				break;
			}
			case NEPTUNE: {
				house2 = new NeptuneHouse();
				break;
			}
			case NEPTUNE2: {
				house2 = new NeptuneHouse2();
				break;
			}
			case NEPTUNE3: {
				house2 = new NeptuneHouse3();
				break;
			}
			case URANUS: {
				house2 = new UranusHouse();
				break;
			}
			case URANUS2: {
				house2 = new UranusHouse2();
				break;
			}
			case URANUS3: {
				house2 = new UranusHouse3();
				break;
			}
			case VENUS: {
				house2 = new VenusHouse();
				break;
			}
			case VENUS2: {
				house2 = new VenusHouse2();
				break;
			}
			case VENUS3: {
				house2 = new VenusHouse3();
				break;
			}
			case _47_UMA_B: {
				house2 = new UmaBHouse();
				break;
			}
			case _47_UMA_B2: {
				house2 = new UmaBHouse2();
				break;
			}
			case _47_UMA_B3: {
				house2 = new UmaBHouse3();
				break;
			}
			case EUROPA: {
				house2 = new EuropaHouse();
				break;
			}
			case EUROPA2: {
				house2 = new EuropaHouse2();
				break;
			}
			case EUROPA3: {
				house2 = new EuropaHouse3();
				break;
			}
			case KEPLER_421_B: {
				house2 = new Kepler421BHouse();
				break;
			}
			case KEPLER_421_B2: {
				house2 = new Kepler421BHouse2();
				break;
			}
			case KEPLER_421_B3: {
				house2 = new Kepler421BHouse3();
				break;
			}
			case BETAPICB: {
				house2 = new BetaPicBHouse();
				break;
			}
			case BETAPICB2: {
				house2 = new BetaPicBHouse2();
				break;
			}
			case BETAPICB3: {
				house2 = new BetaPicBHouse3();
				break;
			}
			case BETAPICC: {
				house2 = new BetaPicCHouse();
				break;
			}
			case BETAPICC2: {
				house2 = new BetaPicCHouse2();
				break;
			}
			case BETAPICC3: {
				house2 = new BetaPicCHouse3();
				break;
			}
			case K2_18_B: {
				house2 = new K2_18BHouse();
				break;
			}
			case K2_18_B2: {
				house2 = new K2_18BHouse2();
				break;
			}
			case K2_18_B3: {
				house2 = new K2_18BHouse3();
				break;
			}
			case TRAPPIST_1_H: {
				house2 = new Trappist_1HHouse();
				break;
			}
			case TRAPPIST_1_H2: {
				house2 = new Trappist_1HHouse2();
				break;
			}
			case TRAPPIST_1_H3: {
				house2 = new Trappist_1HHouse3();
				break;
			}
			case K2_3_C: {
				house2 = new K2_3CHouse();
				break;
			}
			case K2_3_C2: {
				house2 = new K2_3CHouse2();
				break;
			}
			case K2_3_C3: {
				house2 = new K2_3CHouse3();
				break;
			}
		}
		
		String email = hasher.getOriginalStringFromHash(auth);
		Optional<User> user = repo.findByEmail(email);
		
		if (user.isPresent()) {
			final House newHouse = new House();
			newHouse.setUserId(user.get().getId());
			hrepo.save(newHouse.From(house2));
			List<Planet> planets = new ArrayList<>();
			planets.add(new Mars());
			planets.add(new Jupiter());
			planets.add(new Saturn());
			planets.add(new Mercury());
			planets.add(new Neptune());
			planets.add(new Uranus());
			planets.add(new Venus());
			planets.add(new Europa());
			planets.add(PlanetBuilder.Build("47 uma b"));
			planets.add(PlanetBuilder.Build("kepler-421 b"));
			planets.add(PlanetBuilder.Build("beta pic b"));
			planets.add(PlanetBuilder.Build("beta pic c"));
			planets.add(PlanetBuilder.Build("K2-18 b"));
			planets.add(PlanetBuilder.Build("K2-3 c"));
			planets.add(PlanetBuilder.Build("Trappist-1 h"));
			final ArrayList<Object>[] planetArr = partition(planets);
			final ModelAndView mv = new ModelAndView("index");
			mv.addObject("first", planetArr[0]);
			mv.addObject("second", planetArr[1]);
			mv.addObject("third", planetArr[2]);
			mv.addObject("all", planets.toArray());
			return mv;
		} else {
			return (new ModelAndView("index")).addObject("error", "Error: Could not save the house to the database.");
		}
	}

	@GetMapping("see-houses")
	public ModelAndView seeHouses(String auth) {
		String email = hasher.getOriginalStringFromHash(auth);
		Optional<User> user = repo.findByEmail(email);
		if (user.isPresent()) {
			List<House> houses = hrepo.findByUserId(user.get().getId());
			final ArrayList<Object>[] houseArr = partitionHouses(houses);
			final ModelAndView mv = new ModelAndView("see-houses");
			mv.addObject("first", houseArr[0]);
			mv.addObject("second", houseArr[1]);
			mv.addObject("third", houseArr[2]);
			mv.addObject("all", houses.toArray());
			return mv;
		} else {
			// bad cookie
			return new ModelAndView("see-houses", "houses", new ArrayList<House>()).addObject("error", "ERROR: You must log in to see your purchased land.");
		}
	}
}
