package br.com.pessoa.teste;

import javax.persistence.EntityManager;

import br.com.pessoa.modelo.Pessoa;
import br.com.pessoa.transit.Transit;



public class Teste {

	public static void main(String[] args) {
	
		EntityManager frm = new Transit().getEntityManager();
		
		frm.getTransaction().begin();
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("231456");
		pessoa.setNome("João");
		pessoa.setRg("56722");
		
		frm.getTransaction().commit();
		frm.persist(pessoa);
		frm.close();
	}

}
