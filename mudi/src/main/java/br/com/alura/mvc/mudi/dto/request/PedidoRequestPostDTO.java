package br.com.alura.mvc.mudi.dto.request;

import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.mudi.model.StatusPedido;

public class PedidoRequestPostDTO {

	@NotBlank
	private String nomeDoProduto;
	@NotBlank
	private String urlDoProduto;
	@NotBlank
	private String urlDaImagemDoProduto;
	@NotBlank
	private String descricao;
	private StatusPedido status;
	
	public PedidoRequestPostDTO() {}

	public PedidoRequestPostDTO(String nomeDoProduto, String urlDoProduto, String urlDaImagemDoProduto,
			String descricao, StatusPedido status) {
		this.nomeDoProduto = nomeDoProduto;
		this.urlDoProduto = urlDoProduto;
		this.urlDaImagemDoProduto = urlDaImagemDoProduto;
		this.descricao = descricao;
		this.status = status;
	}
	
	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}

	public String getUrlDoProduto() {
		return urlDoProduto;
	}

	public void setUrlDoProduto(String urlDoProduto) {
		this.urlDoProduto = urlDoProduto;
	}

	public String getUrlDaImagemDoProduto() {
		return urlDaImagemDoProduto;
	}

	public void setUrlDaImagemDoProduto(String urlDaImagemDoProduto) {
		this.urlDaImagemDoProduto = urlDaImagemDoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
