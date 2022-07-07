package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//anotação de controle da classe da API
@RestController 
//anotação para definir o end point
@RequestMapping("/mensagem")
public class MensagemSpring {
	
	@GetMapping("/simples")
	public String mensagemSimples() {
		return "Mensagem simples";
	}
}