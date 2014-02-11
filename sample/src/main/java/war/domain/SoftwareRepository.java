package war.domain;

import javax.persistence.EntityManager;

import war.WicketApplication;

public class SoftwareRepository {

	private EntityManager entityManager = WicketApplication.emf.createEntityManager();	
	
	
	public Software addSoft (String software_name ){
        entityManager.getTransaction().begin();
        Software currentSoft = new Software();
        currentSoft.setSoftware_name(software_name);
        entityManager.persist(currentSoft);
        entityManager.getTransaction().commit();
        return currentSoft;
    }
	
	
}
