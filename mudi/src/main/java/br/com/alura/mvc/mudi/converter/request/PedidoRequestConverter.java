package br.com.alura.mvc.mudi.converter.request;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.alura.mvc.mudi.dto.request.PedidoRequestPostDTO;
import br.com.alura.mvc.mudi.model.Pedido;

@Component
public class PedidoRequestConverter implements Converter<PedidoRequestPostDTO, Pedido>{

	@Override
	public Pedido convert(PedidoRequestPostDTO source) {
		return new Pedido(source.getNomeDoProduto(),
							source.getUrlDoProduto(),
							source.getUrlDaImagemDoProduto(),
							source.getDescricao());
	}

}
