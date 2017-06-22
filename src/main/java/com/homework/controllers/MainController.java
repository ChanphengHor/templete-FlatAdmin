package com.homework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping({"","/home","/"})
	public String homepage(ModelMap model){
		model.addAttribute("SMS","Hello");
		return "home";
	}
	@RequestMapping({"/admin/user-list","/admin/user-lists"})
	public String userpage(ModelMap model){
		model.addAttribute("ACTIVE","active");
		model.addAttribute("DISACTIVE","");
		return "/admin/user-lists";
	}
	@RequestMapping({"/admin/user-cu"})
	public String userCU(ModelMap model){
		return "/admin/user-cu";
	}
	@RequestMapping("/admin/role-list")
	public String roleList(ModelMap model){
		return "/admin/role-list";
	}
	@RequestMapping("/admin/role-cu")
	public String roleCu(ModelMap model){
		return "/admin/role-cu";
	}
}