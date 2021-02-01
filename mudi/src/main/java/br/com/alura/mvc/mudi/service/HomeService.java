package br.com.alura.mvc.mudi.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.com.alura.mvc.mudi.model.Pedido;

@Service
public class HomeService {

	public String getHome(Model model) {
		Pedido pedido = new Pedido(
				1l, 
				"Smartphone Samsung Galaxy S20+ 128GB Cloud Blue - 8GB RAM Tela 6,7” Câm. Quádrupla + Selfie 10MP",
				new BigDecimal(5.000),
				"https://www.amazon.com.br/Smartphone-Samsung-Galaxy-128GB-Cloud/dp/B085F3VMT8/ref=sr_1_6?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&dchild=1&keywords=galaxy+s20&qid=1612109757&sr=8-6",
				"https://images-na.ssl-images-amazon.com/images/I/61Trx3jsMFL._AC_SL1500_.jpg",
				"Marca	SAMSUNG\r\n"
				+ "Fabricante	Samsung\r\n"
				+ "Cor	Azul\r\n"
				+ "Formato	Smartphone\r\n"
				+ "Altura do produto	2.5 polegadas\r\n"
				+ "Largura do produto	3 polegadas\r\n"
				+ "Tamanho de tela vertical	6.7 Polegadas\r\n"
				+ "Tamanho da memória externa	128 GB\r\n"
				+ "Tamanho da memória	8 GB\r\n"
				+ "Portadora para sem fio	AT&T\r\n"
				+ "Pilhas ou baterias inclusas	Sim\r\n"
				+ "Conteúdo de energia da bateria de lítio	3.1 Watt-hora\r\n"
				+ "Pacote da bateria de lítio	Pilhas contidas no equipamento\r\n"
				+ "Peso da bateria ou pilha de lítio	0.85 Grams\r\n"
				+ "Número de células ou pilhas de íon de lítio	1\r\n"
				+ "Peso do produto	450 g\r\n"
				+ "Dimensões do produto	17.78 x 7.62 x 6.35 cm; 450 g\r\n"
				+ "Pilha(s) ou bateria(s):	1 Íon de lítio baterias ou pilhas necessárias (inclusas).\r\n"
				+ "Referência do fabricante	SM-G985F/DS\r\n"
				+ "Is Discontinued By Manufacturer	Não\r\n"
				+ "Funciona a bateria ou pilha?	Não\r\n"
				+ "EAN	8806090326493");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
