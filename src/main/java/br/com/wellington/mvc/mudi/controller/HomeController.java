package br.com.wellington.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.wellington.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("God of War Ragnarök");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/71pZepzZHoL._AC_SL1500_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/God-War-Ragnar%C3%B6k-Standard-PlayStation/dp/B0BH58QPYN/?_encoding=UTF8&pd_rd_w=Yt9e2&content-id=amzn1.sym.52e74d21-088e-4a9d-888d-8b14bf95d4ae&pf_rd_p=52e74d21-088e-4a9d-888d-8b14bf95d4ae&pf_rd_r=EZ7VMV1Q3AS3N0X7ETCC&pd_rd_wg=x5nLW&pd_rd_r=bed2a707-b2c8-429c-8877-c66e9d28fc80&ref_=pd_gw_crs_zg_bs_7791985011");
		pedido.setDescricao("Uma descrição qualquer para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}

