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
@Table(name = "feature_list")
public class Feature_List {

	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int fl_id;

	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "hf_id")
	private Hasp_Features feature_id;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "key_id")
	private Hasp hasp_key_id;
	
}
