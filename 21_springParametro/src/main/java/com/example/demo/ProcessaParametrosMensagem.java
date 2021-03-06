package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProcessaParametrosMensagem {

	// método com parâmetro
	@GetMapping("/paramentro/{nome}/{idade}")
	public String mensagemParamentro(@PathVariable String nome, @PathVariable String idade) {
		return "Olá " + nome + " a sua idade é " + idade + " anos";
	}
}
