package war.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "package_list")
public class Package_List {

	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int pl_id;
	
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "c_id")
	private Client client_id;
	
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "package_id")
	private Package package_id;


	public int getPl_id() {
		return pl_id;
	}


	public void setPl_id(int pl_id) {
		this.pl_id = pl_id;
	}


	public Client getClient_id() {
		return client_id;
	}


	public void setClient_id(Client client_id) {
		this.client_id = client_id;
	}


	public Package getPackage_id() {
		return package_id;
	}


	public void setPackage_id(Package package_id) {
		this.package_id = package_id;
	}
	
	
}
