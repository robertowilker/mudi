package br.com.alura.mvc.mudi.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import br.com.alura.mvc.mudi.converter.request.PedidoRequestConverter;
import br.com.alura.mvc.mudi.dto.request.PedidoRequestPostDTO;
import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PedidoRequestConverter pedidoRequestConverter;

	public String form() {
		return "pedido/form";
	}
	
	public List<Pedido> getAll(){
		List<Pedido> pedidos = pedidoRepository.findAll();
		return pedidos;
	}
	
	public String post(@Valid PedidoRequestPostDTO request, BindingResult result) {
		if(result.hasErrors()) {
			return form();
		}else {
			Pedido pedido = pedidoRequestConverter.convert(request);
			pedidoRepository.save(pedido);
			return "pedido/form";
		}
	}
}
