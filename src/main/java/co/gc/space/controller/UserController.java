package co.gc.space.controller;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import co.gc.space.user.CreditCard;
import co.gc.space.user.User;
import co.gc.space.user.UserRepo;

@Controller
public class UserController {

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
	
	@GetMapping("logged-in") 
	public ModelAndView loggedIn(@RequestParam("email") String email, 
			@RequestParam("password") String password, 
			HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("logged-in");
		Optional<User> user = repo.findByEmail(email);
		try {
			if (user.get().getPassword().equals(password)) {
				mv.addObject("account", user.get());
				mv.addObject("success", true);
				// logged in for 15 minutes
				Cookie cookie = new Cookie("authenticated", "true");
				cookie.setMaxAge(60*15);
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
			String test = CreditCard.getMatchingCreditCard(user.getCreditcard(), user.getCvv());
			System.out.println(test);
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
}
