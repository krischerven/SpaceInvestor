package co.gc.space.controller;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("logged-in") 
	public ModelAndView loggedIn(@RequestParam("email") String email, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView("logged-in");
		Optional<User> user = repo.findByEmail(email);
		try {
			mv.addObject("account", user.get());
		} catch (NoSuchElementException e) {
			mv.addObject("account", "ERROR");
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
