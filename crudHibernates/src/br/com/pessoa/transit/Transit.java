package br.com.pessoa.transit;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Transit {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pessoa");
	
	public EntityManager getEntityManager(){
		return emf.createEntityManager();
		
	}
}
