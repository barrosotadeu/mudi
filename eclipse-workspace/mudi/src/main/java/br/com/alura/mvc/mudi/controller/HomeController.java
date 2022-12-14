package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
@RequestMapping(value = "pages")
public class HomeController {

	// private EntityManagerFactory emf =
	// Persistence.createEntityManagerFactory("mudi");
	@Autowired
	private HomeService service;

	@GetMapping("/home")
	public String home(Model model) {

		List<Pedido> pedidos = service.consultarPedidos();

		model.addAttribute("pedidos", pedidos);

		return "home";
	}
}
