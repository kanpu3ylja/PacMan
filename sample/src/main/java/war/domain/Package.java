package war.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "package")
public class Package {
	
	@Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
	private int package_id;
	private String Package_name;
	private int Directo_Project_ID;
	private String Client;
	private String OS;
	private Date till_date;
	private Boolean freezed;
	private String Note;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "SL_ID", nullable = false)
	private Stuff_List project_manager;
	
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "SL_ID")
	private Stuff_List implementation_manager;
		
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "SL_ID")
	private Software_List software_list;
		
	@OneToOne (fetch = FetchType.LAZY)
	@JoinColumn(name = "HL_ID")
	private Hasp_List hasp_list;


	public Stuff_List getProject_manager() {
		return project_manager;
	}


	public void setProject_manager(Stuff_List project_manager) {
		this.project_manager = project_manager;
	}


	public Stuff_List getImplementation_manager() {
		return implementation_manager;
	}


	public void setImplementation_manager(Stuff_List implementation_manager) {
		this.implementation_manager = implementation_manager;
	}


	public Software_List getSoftware_list() {
		return software_list;
	}


	public void setSoftware_list(Software_List software_list) {
		this.software_list = software_list;
	}


	public Hasp_List getHasp_list() {
		return hasp_list;
	}


	public void setHasp_list(Hasp_List hasp_list) {
		this.hasp_list = hasp_list;
	}


	public int getPackage_id() {
		return package_id;
	}


	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}


	public String getPackage_name() {
		return Package_name;
	}


	public void setPackage_name(String package_name) {
		Package_name = package_name;
	}


	public int getDirecto_Project_ID() {
		return Directo_Project_ID;
	}


	public void setDirecto_Project_ID(int directo_Project_ID) {
		Directo_Project_ID = directo_Project_ID;
	}


	public String getClient() {
		return Client;
	}


	public void setClient(String client) {
		Client = client;
	}


	public String getOS() {
		return OS;
	}


	public void setOS(String oS) {
		OS = oS;
	}


	public Date getTill_date() {
		return till_date;
	}


	public void setTill_date(Date till_date) {
		this.till_date = till_date;
	}


	public Boolean getFreezed() {
		return freezed;
	}


	public void setFreezed(Boolean freezed) {
		this.freezed = freezed;
	}


	public String getNote() {
		return Note;
	}


	public void setNote(String note) {
		Note = note;
	}



	
	
}
