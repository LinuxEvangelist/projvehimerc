package com.reglamb.projvehimerc.controller;

//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
// 
//@Controller
//public class MainController {
// 
//@RequestMapping(value="/spring/main", method = RequestMethod.GET)
//	public void printWelcome(ModelMap model) {
// 
////		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
////		String name = user.getUsername();
//		UserDetails userDetails =
//				 (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		String name = userDetails.getUsername();
//	
//		model.addAttribute("username", name);
//		model.addAttribute("message", "Spring Security login + database example");
//		 
//	}
//}