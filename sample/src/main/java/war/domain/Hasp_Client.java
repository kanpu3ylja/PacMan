package war.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "HASP_CLIENT")
public class Hasp_Client {


    private String client_id;
	private String client_name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "")
	private List<Hasp> hasp;
	
	
	public String getClient_id() {
		return client_id;
	}
	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	
	
}
