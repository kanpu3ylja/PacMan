package war;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.wicket.guice.GuiceComponentInjector;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication
{    
	
	public static EntityManagerFactory emf;
	
	
    /**
     * Constructor
     */
//	public WicketApplication(){
//		
//		 emf = Persistence.createEntityManagerFactory("pacman");
//		 PackageRepository rep = new PackageRepository();
//		 rep.loadById(1);
//	}
	
/*	@Override
	protected void init(){
		super.init();
		emf = Persistence.createEntityManagerFactory("pacman");
		getComponentInstantiationListeners().add(new GuiceComponentInjector(this));
	}
	*/
	/**
	 * @see wicket.Application#getHomePage()
	 */
	
	
	public Class getHomePage()
	{
		return HomePage.class;
	}

}
