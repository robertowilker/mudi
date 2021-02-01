package br.com.alura.mvc.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/hello")
	public String hello(Model model) {
		return helloService.getHello(model);
	}
}
