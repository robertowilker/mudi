package br.com.alura.mvc.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	@GetMapping("/home")
	public String home(Model model) {
		return homeService.getHome(model);
	}
}
