package com.skilldistillery.golfsocial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.golfsocial.data.GolfSocialDao;

@Controller
public class PlayerController {

	@Autowired
	private GolfSocialDao gsDao;
	
	//home page
	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("players", gsDao.findAll());
		return "index";
	}
	//takes client to create profile page form
	@RequestMapping(path = {"create.do"})
	public String create(Model model) {
		//model.addAttribute("players", gsDao.findAll());
		return "createProfile";
	}
	
	//takes client to show individual profile 
//	
//	//delete Profile Page
//		@RequestMapping(path = {"delete.do"})
//		public String delete(Model model) {
//			model.addAttribute("players", gsDao.findAll());
//			return "index";
//		}
//	
//		//update Profile Page
//		@RequestMapping(path = {"update.do"})
//		public String update(Model model) {
//			model.addAttribute("players", gsDao.findAll());
//			return "index";
//		}
}
