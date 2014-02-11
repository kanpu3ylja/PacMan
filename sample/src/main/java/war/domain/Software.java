package war.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "software")
public class Software {
	
	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int soft_id;
	private String software_name;
	private int svn_revision;
	private int jenkins_build;
	private String note;
	
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "soft_id")
	private Software_List sl_id;
	
	public int getSoft_id() {
		return soft_id;
	}
	public void setSoft_id(int soft_id) {
		this.soft_id = soft_id;
	}
	public String getSoftware_name() {
		return software_name;
	}
	public void setSoftware_name(String software_name) {
		this.software_name = software_name;
	}
	public int getSvn_revision() {
		return svn_revision;
	}
	public void setSvn_revision(int svn_revision) {
		this.svn_revision = svn_revision;
	}
	public int getJenkins_build() {
		return jenkins_build;
	}
	public void setJenkins_build(int jenkins_build) {
		this.jenkins_build = jenkins_build;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}


}
