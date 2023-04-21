package org.jsp.springtest.controller;

import javax.servlet.http.HttpSession;

import org.jsp.springtest.dto.User;
import org.jsp.springtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;

@Controller
public class UserController {

	@Autowired
	 private UserService service;
	
	@RequestMapping("/load")
	public ModelAndView load(ModelAndView view)
	{
		view.setViewName("register");
		view.addObject("user",new User());
		return view;
	}
	
	@RequestMapping("/Edit")
	public ModelAndView updateUser(@ModelAttribute User user,ModelAndView view)
	{
		User u=service.updateUser(user);
		System.out.println(u);
		view.addObject("user", u);
		view.setViewName("edit");
		view.addObject("message", "user updated Successfully");
		return view;
		
	}
	
	
	@RequestMapping("/reg")
	public ModelAndView saveUser(@ModelAttribute User user,ModelAndView view)
	{
		User u=service.saveUser(user);
		view.setViewName("print");
		view.addObject("message","User Saved with ID:"+u.getId());
		return view;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteuser(@RequestParam int id,ModelAndView view,HttpSession session)
	{
		service.deleteUser(id);
		session.invalidate();
		view.setViewName("print");
		view.addObject("message","User Deleted");
		return view;
	}

	@RequestMapping("/login")
	public ModelAndView loginload(ModelAndView view)
	{
		view.setViewName("login");
		return view;
	}
	
     @RequestMapping(value="/loginuser",method=RequestMethod.POST)
	public String login(@RequestParam long phone,@RequestParam String password,Model model)
	{
		User user=service.verifyUser(phone, password);
		System.out.println("@@@@@@:"+user);
		if(user!=null)
		{
			model.addAttribute("user", user);
			return "home";
		}
		else
			return "login";
	}
     @RequestMapping("/profile")
     public String profile(User u,ModelAndView view)
     {
     	u=service.updateUser(u);
      view.setViewName("view");
      view.addObject(u);
     return "view";
     }
}
