package br.com.alura.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUTIL;

public class CadastroDeProduto {
	
	public static void main(String[] args) {
		Produto celular = new Produto("Xiaomi Redmi","Muito Legal","Muito Legal","800"),Categoria.CELULARES);
		
		
		EntityManager em =JPAUTIL.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);

        em.getTransaction().begin();
        em.persist(celular);
        em.getTransaction().commit();
        em.close();
	}
}
