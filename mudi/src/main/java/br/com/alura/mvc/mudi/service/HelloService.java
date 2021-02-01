package br.com.alura.mvc.mudi.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class HelloService {

	public String getHello(Model model) {
		model.addAttribute("nome", "Roberto");
		return "hello";
	}

}
