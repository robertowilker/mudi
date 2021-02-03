package br.com.alura.mvc.mudi.dto.request;

import javax.validation.constraints.NotBlank;

public class PedidoRequestPostDTO {

	@NotBlank
	private String nomeDoProduto;
	@NotBlank
	private String urlDoProduto;
	@NotBlank
	private String urlDaImagemDoProduto;
	@NotBlank
	private String descricao;
	
	public PedidoRequestPostDTO() {}

	public PedidoRequestPostDTO(String nomeDoProduto, String urlDoProduto, String urlDaImagemDoProduto,
			String descricao) {
		this.nomeDoProduto = nomeDoProduto;
		this.urlDoProduto = urlDoProduto;
		this.urlDaImagemDoProduto = urlDaImagemDoProduto;
		this.descricao = descricao;
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
