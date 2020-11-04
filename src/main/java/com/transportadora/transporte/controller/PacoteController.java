package com.transportadora.transporte.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.transportadora.transporte.model.Pacote;
import com.transportadora.transporte.model.StatusPacote;
import com.transportadora.transporte.repository.PacoteRepository;

@Controller
@RequestMapping("/transportadora/")
public class PacoteController {
	
	@Autowired
	public  PacoteRepository pacoteRepository;
	
	@GetMapping("/cadastroPacotes")
	public ModelAndView form() {
		ModelAndView modelAndView = new ModelAndView("pacote/form");
		List<StatusPacote> listSituacaoPacote = Arrays.asList(StatusPacote.values());
		modelAndView.addObject("situacaoPacote", listSituacaoPacote);
		modelAndView.addObject("pacote", new Pacote());
		return modelAndView;
	}
	
	@PostMapping("/salvar")
	public RedirectView salvar(Pacote pacote, RedirectAttributes redirectAttributes) {
		pacoteRepository.save(pacote);
		redirectAttributes.addFlashAttribute("mensagem", "Cadastro feito com sucesso!");
		return new RedirectView("/", true);
	}
	
	@GetMapping("/edit")
	public ModelAndView edit(@RequestParam long id) {
		ModelAndView modelAndView = new ModelAndView("pacote/form");
		modelAndView.addObject("pacote", pacoteRepository.findById(id));
		return modelAndView;
	}
	
}
