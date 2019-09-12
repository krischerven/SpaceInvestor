package co.gc.space.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	UserRepo a;

	@RequestMapping("create-user")
	public ModelAndView addUser() {
		return new ModelAndView("create-user");
	}

	@RequestMapping("save-user")
	public ModelAndView saveUser(User user) {
		if (user.getCreditcard() != null && user.getCvv() != null) {
			String test = CreditCard.getMatchingCreditCard(user.getCreditcard(), user.getCvv());
			System.out.println(test);
			if (test != null)
				a.save(user);
			if (test == null)
				return new ModelAndView("error-message");

		}
	
		return new ModelAndView("user-created");
	}
}
