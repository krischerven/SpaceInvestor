package co.gc.space.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import co.gc.space.repo.UserRepo;
import co.gc.space.user.CreditCard;
import co.gc.space.user.User;

import co.gc.space.Hasher;
import co.gc.space.HouseEnum;
import co.gc.space.entity.planet.Europa;
import co.gc.space.entity.planet.Jupiter;
import co.gc.space.entity.planet.Mars;
import co.gc.space.entity.planet.Mercury;
import co.gc.space.entity.planet.Neptune;
import co.gc.space.entity.planet.Planet;
import co.gc.space.entity.planet.Saturn;
import co.gc.space.entity.planet.Uranus;
import co.gc.space.entity.planet.Venus;
import co.gc.space.land.House;
import co.gc.space.land.MarsHouse;

@Controller
public class UserController {
	
	@SuppressWarnings("unchecked")
	private static ArrayList<Object>[] partitionHouses(List<House> houses) {
		ArrayList<House> _1 = new ArrayList<>();
		ArrayList<House> _2 = new ArrayList<>();
		ArrayList<House> _3 = new ArrayList<>();
		for (int i = 0; i < houses.size(); ++i) {
			if ((i % 3) == 0) {
				_3.add(houses.get(i));
			} else if ((i % 2) == 0) {
				_2.add(houses.get(i));
			} else {
				_1.add(houses.get(i));
			}
		}
		return new ArrayList[] { _3, _2, _1 };
	}
	
	public final class Hasher {
		final HashMap<String,String> hashes = new HashMap<>();
		// uniqueness isnt import
		// if two passwords produce the same hash, that isn't an issue
		private String hash(String in) {
			return co.gc.space.Hasher.Hash(in);
		}
		// guaranteed unique hash
		private String uniqueHash(String in) {
			String _hash = hash(in);
			// guarantee uniqueness at all costs
			while (hashes.containsKey(_hash)) {
				_hash += "-";
			}
			hashes.put(_hash, in);
			return _hash;
		}
		// get the String used to create a unique hash
		// this is fairly secure because it's only stored in memory
		private String getStringFromHash(String in) {
			return hashes.get(in);
		}
	}
	
	final Hasher hasher = new Hasher();

	@Autowired
	UserRepo repo;

	@RequestMapping("create-user")
	public ModelAndView addUser() {
		return new ModelAndView("create-user");
	}
	
	@RequestMapping("login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="logged-in", method=RequestMethod.POST) 
	public ModelAndView loggedIn(@RequestParam("email") String email, 
			@RequestParam("password") String password, 
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("logged-in");
		Optional<User> user = repo.findByEmail(email);
		try {
			if (user.get().getPassword().equals(hasher.hash(password))) {
				mv.addObject("account", user.get());
				mv.addObject("success", true);
				// logged in for 15 minutes
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
	
	@SuppressWarnings("incomplete-switch")
	@RequestMapping("save-user-land")
	public ModelAndView saveUserLand(HouseEnum _house, String auth) {
		_house = HouseEnum.MARS;
		House house = null;
		switch (_house) {
			case MARS: {
				house = new MarsHouse();
			}
		}
		String email = hasher.getStringFromHash(auth);
		Optional<User> _user = repo.findByEmail(email);
		if (!_user.isEmpty()) {
			User user = _user.get();
			user.addHouse(house);
			repo.save(user);
		}
		List<Planet> planets = new ArrayList<>();
		planets.add(new Mars());
		planets.add(new Jupiter());
		planets.add(new Saturn());
		planets.add(new Mercury());
		planets.add(new Neptune());
		planets.add(new Uranus());
		planets.add(new Venus());
		planets.add(new Europa());
		/*planets.add(builder.Build("47 uma b"));
		planets.add(builder.Build("kepler-421 b"));
		planets.add(builder.Build("beta pic b"));
		planets.add(builder.Build("beta pic c"));
		planets.add(builder.Build("K2-18 b"));
		planets.add(builder.Build("K2-3 c"));
		planets.add(builder.Build("Trappist-1 h"));*/
		final ArrayList<Object>[] planetArr = partition(planets);
		final ModelAndView mv = new ModelAndView("index");
		mv.addObject("first", planetArr[0]);
		mv.addObject("second", planetArr[1]);
		mv.addObject("third", planetArr[2]);
		mv.addObject("all", planets.toArray());
		return mv;
	}
	
	@RequestMapping("see-houses")
	public ModelAndView seeHouses(String auth) {
		String email = hasher.getStringFromHash(auth);
		Optional<User> user = repo.findByEmail(email);
		if (!user.isEmpty()) {
			final ArrayList<Object>[] houseArr = partitionHouses(new ArrayList<>(user.get().getHouses()));
			final ModelAndView mv = new ModelAndView("see-houses");
			mv.addObject("first", houseArr[0]);
			mv.addObject("second", houseArr[1]);
			mv.addObject("third", houseArr[2]);
			mv.addObject("all", user.get().getHouses().toArray());
			return mv;
		} else {
			return new ModelAndView("see-houses", "houses", new ArrayList<House>());
		}
	}
}
