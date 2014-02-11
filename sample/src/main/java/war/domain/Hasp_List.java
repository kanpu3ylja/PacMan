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
@Table(name = "hasp_list")
public class Hasp_List {

	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int hl_id;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "")
	private Hasp hasp_key_id;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "")
	private Package package_id;

	public int getHl_id() {
		return hl_id;
	}

	public void setHl_id(int hl_id) {
		this.hl_id = hl_id;
	}

	public Hasp getHasp_key_id() {
		return hasp_key_id;
	}

	public void setHasp_key_id(Hasp hasp_key_id) {
		this.hasp_key_id = hasp_key_id;
	}

	public Package getPackage_id() {
		return package_id;
	}

	public void setPackage_id(Package package_id) {
		this.package_id = package_id;
	}
	
}
