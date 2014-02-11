package war.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "hasp")
public class Hasp {
	
	@Id
    private int key_id;
	private String hasp_key_name;
	private String hasp_type;
	private Date time;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "fl_id", nullable = false)
	private Feature_List feature_list;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "client_id", nullable = false)
	private Hasp_Client hasp_client;

	public int getKey_id() {
		return key_id;
	}

	public void setKey_id(int key_id) {
		this.key_id = key_id;
	}

	public String getHasp_key_name() {
		return hasp_key_name;
	}

	public void setHasp_key_name(String hasp_key_name) {
		this.hasp_key_name = hasp_key_name;
	}

	public String getHasp_type() {
		return hasp_type;
	}

	public void setHasp_type(String hasp_type) {
		this.hasp_type = hasp_type;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Feature_List getFeature_list() {
		return feature_list;
	}

	public void setFeature_list(Feature_List feature_list) {
		this.feature_list = feature_list;
	}

	public Hasp_Client getHasp_client() {
		return hasp_client;
	}

	public void setHasp_client(Hasp_Client hasp_client) {
		this.hasp_client = hasp_client;
	}
	
	
	
}
