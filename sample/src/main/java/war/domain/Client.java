package war.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int c_id;
	private String client_name;
	private String Jira1;
	private int directo_project_id;
	private String Jira2;
	private String Jira3;
	private int directo_project_id2;
	private int directo_project_id3;
	private int directo_project_id4;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getJira1() {
		return Jira1;
	}
	public void setJira1(String jira1) {
		Jira1 = jira1;
	}
	public int getDirecto_project_id() {
		return directo_project_id;
	}
	public void setDirecto_project_id(int directo_project_id) {
		this.directo_project_id = directo_project_id;
	}
	public String getJira2() {
		return Jira2;
	}
	public void setJira2(String jira2) {
		Jira2 = jira2;
	}
	public String getJira3() {
		return Jira3;
	}
	public void setJira3(String jira3) {
		Jira3 = jira3;
	}
	public int getDirecto_project_id2() {
		return directo_project_id2;
	}
	public void setDirecto_project_id2(int directo_project_id2) {
		this.directo_project_id2 = directo_project_id2;
	}
	public int getDirecto_project_id3() {
		return directo_project_id3;
	}
	public void setDirecto_project_id3(int directo_project_id3) {
		this.directo_project_id3 = directo_project_id3;
	}
	public int getDirecto_project_id4() {
		return directo_project_id4;
	}
	public void setDirecto_project_id4(int directo_project_id4) {
		this.directo_project_id4 = directo_project_id4;
	}

}
