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
	
	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("players", gsDao.findAll());
		return "index";
	}
}
