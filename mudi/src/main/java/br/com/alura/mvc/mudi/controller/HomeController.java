package br.com.alura.mvc.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.mudi.service.HomeService;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private HomeService homeService;
	
	@GetMapping
	public String home(Model model) {
		return homeService.getHome(model);
	}
	
	@GetMapping("/{status}")
	public String status(@PathVariable("status") String status, Model model) {
		return homeService.getStatus(status, model);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public String error() {
		return homeService.onError();
	}
}
