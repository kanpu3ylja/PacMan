package war.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "hasp_features")
public class Hasp_Features {

	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int hf_id;
	private String feature_id;
	private String feature_name;

	
	public int getHf_id() {
		return hf_id;
	}
	public void setHf_id(int hf_id) {
		this.hf_id = hf_id;
	}
	public String getFeature_id() {
		return feature_id;
	}
	public void setFeature_id(String feature_id) {
		this.feature_id = feature_id;
	}
	public String getFeature_name() {
		return feature_name;
	}
	public void setFeature_name(String feature_name) {
		this.feature_name = feature_name;
	}

	
}
