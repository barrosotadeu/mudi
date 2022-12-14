package br.com.alura.mvc.mudi.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import br.com.alura.mvc.mudi.model.Pedido;

@Service
public class HomeService {

	@PersistenceContext
	private EntityManager em;

	public List<Pedido> consultarPedidos() {

		Query query = em.createQuery("select p from Pedido p", Pedido.class);
		List<Pedido> pedidos = query.getResultList();

		return pedidos;
	}

}
