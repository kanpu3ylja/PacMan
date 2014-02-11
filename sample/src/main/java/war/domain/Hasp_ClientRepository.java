package war.domain;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import war.WicketApplication;

public class Hasp_ClientRepository {
	
private static EntityManager entityManager = WicketApplication.emf.createEntityManager();
	
	public Hasp_Client loadHaspClient(String id) {
		Hasp_Client result = null;
		try{
			result = entityManager.createQuery("select h from Hasp_Client h where h.client_id = :id order by h.client_id", Hasp_Client.class)
					.setParameter("id", id)
                    .getSingleResult();
		}catch (NoResultException nre){
			throw nre;
		}
		return result;
	}
	
	public Hasp_Client addHaspClient (String client_id, String client_name){
		entityManager.getTransaction().begin();
		Hasp_Client hasp_client = new Hasp_Client();
		hasp_client.setClient_id(client_id);
		hasp_client.setClient_name(client_name);
		entityManager.persist(hasp_client);
		entityManager.getTransaction().commit();
		return hasp_client;
	}

}
