package war.domain;

import javax.persistence.EntityManager;

import war.WicketApplication;


public class PackageRepository {
	

	EntityManager em = WicketApplication.emf.createEntityManager();

	
	public Package loadById(int id) {
		return em.createQuery("select p from Package p where p.id = :id", Package.class)
		.setParameter("id", id)
		.getSingleResult();
	}
	

	
}
