package com.skilldistillery.golfsocial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.golfsocial.data.GolfSocialDao;
import com.skilldistillery.golfsocial.entities.Player;

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
	public String create(ModelAndView model) {
		//model.addAttribute("players", gsDao.findAll());
		return "createProfile";
	}
	
	//takes client to show individual profile 
	
	@RequestMapping(path = "submitCreate.do", method = RequestMethod.GET)
	public ModelAndView createPlayer(Player newPlayer) {
		ModelAndView mv = new ModelAndView();
		
		newPlayer = gsDao.createPlayer(newPlayer);
		
		boolean playerAdded = false;
		if (newPlayer != null) {
			playerAdded = true;
		}
		
		mv.addObject("player", newPlayer);
		mv.setViewName("showCreatedSuccess");
		return mv;
	}
	
	
	@RequestMapping (path = "chooseProfileToUpdate.do", method = RequestMethod.POST)
	public String selectProfile(int playerId, Player player, Model model) {
		model.addAttribute("player", gsDao.findById(playerId));
		return "selectProfileToUpdate";
		
	}
	
	
	@RequestMapping (path ="update.do", method = RequestMethod.POST)
	public ModelAndView updateProfile(int playerId, Player player) {
		ModelAndView mv = new ModelAndView();
		player = gsDao.updatePlayer(playerId, player);
		mv.addObject("player", player);
		mv.setViewName("index");
		return mv;
	}
	
	
	@RequestMapping(path = "delete.do", method = RequestMethod.POST)
	public String deleteProfile(int playerId, Model model) {
		boolean playerExistsInDb = gsDao.deletePlayer(playerId); //delete player returns false if not in db
		if(playerExistsInDb == false) {
			return "showDeletedSuccess";
		}else {
			return "unsuccessful";
		}
	}
	
	
	
}
