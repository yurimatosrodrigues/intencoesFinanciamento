package br.gov.sp.etec.intencaoFinanciamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.intencaoFinanciamento.dto.IntencaoFinanciamento;
import br.gov.sp.etec.intencaoFinanciamento.service.impl.IntencaoFinanciamentoServiceImpl;

@Controller
public class HomeController {
	@Autowired
	private IntencaoFinanciamentoServiceImpl service;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("index");
		List<IntencaoFinanciamento> intencoes = service.listaIntencoes();
		view.addObject("intencoes", intencoes);
		return view;		
	}
}
