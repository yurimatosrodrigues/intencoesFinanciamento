package br.gov.sp.etec.intencaoFinanciamento.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etec.intencaoFinanciamento.dto.Estado;
import br.gov.sp.etec.intencaoFinanciamento.dto.IntencaoFinanciamento;
import br.gov.sp.etec.intencaoFinanciamento.dto.TipoFinanciamento;
import br.gov.sp.etec.intencaoFinanciamento.service.TipoFinanciamentoService;
import br.gov.sp.etec.intencaoFinanciamento.service.impl.IntencaoFinanciamentoServiceImpl;
import br.gov.sp.etec.intencaoFinanciamento.service.EstadoService;

@Controller
public class IntencaoFinanciamentoController {
	@Autowired
	IntencaoFinanciamentoServiceImpl service;
	
	@Autowired
	TipoFinanciamentoService tipoFinanciamentoService;
	
	@Autowired
	EstadoService estadoService;
	
	@GetMapping("nova-intencao")
	public ModelAndView homeIntencao() {
		ModelAndView view = new ModelAndView("intencao");
		
		List<TipoFinanciamento> tiposFinanciamento = tipoFinanciamentoService.listaTipoFinanciamento();
		view.addObject("tiposFinanciamento", tiposFinanciamento);
		
		List<Estado> estados = estadoService.listaEstados();
		view.addObject("estados", estados);
		
		view.addObject("intencao", new IntencaoFinanciamento());
		return view;
	}
	
	@PostMapping("salvar-intencao")
	public String salvarIntencao(@Valid IntencaoFinanciamento intencao, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(intencao);
			return "intencao";
		}
		service.salvarIntencao(intencao);
		return "redirect:/";
	}

}
