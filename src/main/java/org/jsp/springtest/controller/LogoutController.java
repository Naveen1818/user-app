package org.jsp.springtest.controller;

import javax.servlet.http.HttpSession;

import org.jsp.springtest.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {
    @RequestMapping("/logout")
	public String logout(HttpSession session,Model model)
	{
		session.invalidate();
		model.addAttribute("message", "Logged out");
		return "login";
	}
 
}
