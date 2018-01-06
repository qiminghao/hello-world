package pres.qmh.springmvc.web.controller;

import java.util.Map;

import pres.qmh.springmvc.web.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(User user) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home_page");
		mav.addObject("user", user);
		return mav;
	}
}
