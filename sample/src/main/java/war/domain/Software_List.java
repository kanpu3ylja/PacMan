package war.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "software_list")
public class Software_List {

	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int sl_id;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "package_id")
	private Package package_id;
	
	@OneToMany (fetch = FetchType.LAZY)
	@JoinColumn(name = "soft_id")
	private Software software_id;

	public int getSl_id() {
		return sl_id;
	}

	public void setSl_id(int sl_id) {
		this.sl_id = sl_id;
	}

	public Package getPackage_id() {
		return package_id;
	}

	public void setPackage_id(Package package_id) {
		this.package_id = package_id;
	}

	public Software getSoftware_id() {
		return software_id;
	}

	public void setSoftware_id(Software software_id) {
		this.software_id = software_id;
	}

	
}
