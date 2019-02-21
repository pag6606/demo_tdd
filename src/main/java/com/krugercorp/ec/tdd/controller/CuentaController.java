package com.krugercorp.ec.tdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.krugercorp.ec.tdd.model.Cuenta;
import com.krugercorp.ec.tdd.service.CuentaService;

@Controller
public class CuentaController {

	@Autowired
	private Cuenta cuenta;
	
	@GetMapping("/cuenta")
	public String cuenta(Model model) {
		model.addAttribute("titulo", "Demo pronaca");
		model.addAttribute("cuenta", cuenta.toString());
		return "index";
		
		
	}
}
