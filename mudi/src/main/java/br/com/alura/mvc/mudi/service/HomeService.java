package br.com.alura.mvc.mudi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Service
public class HomeService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	public String getHome(Model model) {
		
		List<Pedido> pedidos = pedidoRepository.findAll();
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
	
//	public ModelAndView getHome1() {
//		List<Pedido> pedidos = pedidoRepository.findAll();
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.addObject("pedidos", pedidos);
//		return modelAndView;
//	}
}
