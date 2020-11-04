package com.transportadora.transporte.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.transportadora.transporte.model.Filter;
import com.transportadora.transporte.model.Pacote;
import com.transportadora.transporte.repository.PacoteRepository;

@Controller
public class IndexController {
	
	@Autowired
	public PacoteRepository pacoteRepository;
	
	@RequestMapping("/")
	public ModelAndView  index() {
		ModelAndView modelView = new ModelAndView("index");
		List<Pacote> listPacotes= pacoteRepository.findAll();
		modelView.addObject("listaPacotes", listPacotes);
		return modelView;
	}
	@PostMapping("/doFind")
	public ModelAndView doFind(Long filter) {
		ModelAndView modelView = new ModelAndView("index");
		Pacote pacote = pacoteRepository.getOne(filter);
		modelView.addObject("pacote", pacote);
		return modelView;
	}
}
