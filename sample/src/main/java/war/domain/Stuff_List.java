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
@Table(name = "stuff_list")
public class Stuff_List {

	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int sl_id;


	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "stuff_id")
	private Stuff stuff_id;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "package_id")
	private Package package_id;

	public int getSl_id() {
		return sl_id;
	}

	public void setSl_id(int sl_id) {
		this.sl_id = sl_id;
	}

	public Stuff getStuff_id() {
		return stuff_id;
	}

	public void setStuff_id(Stuff stuff_id) {
		this.stuff_id = stuff_id;
	}

	public Package getPackage_id() {
		return package_id;
	}

	public void setPackage_id(Package package_id) {
		this.package_id = package_id;
	}
}
