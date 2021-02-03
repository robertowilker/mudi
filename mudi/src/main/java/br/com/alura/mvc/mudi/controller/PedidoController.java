package br.com.alura.mvc.mudi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.mudi.dto.request.PedidoRequestPostDTO;
import br.com.alura.mvc.mudi.service.PedidoService;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;

	@GetMapping("formulario")
	public String form(PedidoRequestPostDTO request) {
		return pedidoService.form();
	}
	
	@PostMapping("novo")
	public String post(@Valid PedidoRequestPostDTO request, BindingResult result) {
		return pedidoService.post(request, result);
	}
}
