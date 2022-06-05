package com.giftcard.giftcard.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.giftcard.giftcard.models.GiftcardModel;
import com.giftcard.giftcard.repositories.GiftcardRepository;

@Controller
public class GiftcardController {
	
	@Autowired
	GiftcardRepository giftcardRepo;
	
	@RequestMapping(method = RequestMethod.GET, value = "/cadastrargift")
	public String inicio() {
		return "cadastro/cadastrargift";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/salvar")
	public String register(GiftcardModel giftcard) {
		giftcardRepo.save(giftcard);		
		return "cadastro/cadastrargift";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/listar")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("estoque/listar");
		Iterable<GiftcardModel> giftcards = giftcardRepo.findAll();
		mav.addObject("list", giftcards);
		return mav;
	}
	
	

}
