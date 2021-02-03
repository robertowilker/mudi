package br.com.alura.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeDoProduto;
	private BigDecimal valorNegociado;
	private LocalDate dataDaEntrega;
	private String urlDoProduto;
	private String urlDaImagemDoProduto;
	private String descricao;
	
	public Pedido() {}
	
	public Pedido(String nomeDoProduto, String urlDoProduto, String urlDaImagemDoProduto, String descricao) {
		this.nomeDoProduto = nomeDoProduto;
		this.urlDoProduto = urlDoProduto;
		this.urlDaImagemDoProduto = urlDaImagemDoProduto;
		this.descricao = descricao;
	}


	public Pedido(Long id, String nomeDoProduto, BigDecimal valorNegociago,
			String urlDoProduto, String urlDaImagemDoProduto, String descricao) {
		this.id = id;
		this.nomeDoProduto = nomeDoProduto;
		this.valorNegociado = valorNegociago;
		this.urlDoProduto = urlDoProduto;
		this.urlDaImagemDoProduto = urlDaImagemDoProduto;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	public BigDecimal getValorNegociago() {
		return valorNegociado;
	}
	public void setValorNegociago(BigDecimal valorNegociago) {
		this.valorNegociado = valorNegociago;
	}
	public LocalDate getDataDaEmtrega() {
		return dataDaEntrega;
	}
	public void setDataDaEmtrega(LocalDate dataDaEmtrega) {
		this.dataDaEntrega = dataDaEmtrega;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataDaEntrega == null) ? 0 : dataDaEntrega.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeDoProduto == null) ? 0 : nomeDoProduto.hashCode());
		result = prime * result + ((urlDaImagemDoProduto == null) ? 0 : urlDaImagemDoProduto.hashCode());
		result = prime * result + ((urlDoProduto == null) ? 0 : urlDoProduto.hashCode());
		result = prime * result + ((valorNegociado == null) ? 0 : valorNegociado.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (dataDaEntrega == null) {
			if (other.dataDaEntrega != null)
				return false;
		} else if (!dataDaEntrega.equals(other.dataDaEntrega))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeDoProduto == null) {
			if (other.nomeDoProduto != null)
				return false;
		} else if (!nomeDoProduto.equals(other.nomeDoProduto))
			return false;
		if (urlDaImagemDoProduto == null) {
			if (other.urlDaImagemDoProduto != null)
				return false;
		} else if (!urlDaImagemDoProduto.equals(other.urlDaImagemDoProduto))
			return false;
		if (urlDoProduto == null) {
			if (other.urlDoProduto != null)
				return false;
		} else if (!urlDoProduto.equals(other.urlDoProduto))
			return false;
		if (valorNegociado == null) {
			if (other.valorNegociado != null)
				return false;
		} else if (!valorNegociado.equals(other.valorNegociado))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Pedido [id=" + id + ", nomeDoProduto=" + nomeDoProduto + ", valorNegociago=" + valorNegociado
				+ ", dataDaEmtrega=" + dataDaEntrega + ", urlDoProduto=" + urlDoProduto + ", urlDaImagemDoProduto="
				+ urlDaImagemDoProduto + ", descricao=" + descricao + "]";
	}
}
