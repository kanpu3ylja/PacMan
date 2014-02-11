package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class ClientNewPage extends WebPage {

	private TextField clientName;
	private TextField directoClient;
	private TextField jira1;
	private TextField jira2;
	private TextField jira3;
	private TextField directo1;
	private TextField directo2;
	private TextField directo3;
	private TextField directo4;
	
	
	public ClientNewPage() {
		
		Form form = new Form("form");
		
		form.add(new ButtonPanelPage("buttonPanel"));
		clientName = new TextField("clientName", new Model("Enter client name"));
		directoClient = new TextField("directoClient", new Model("Enter directo client id"));
		jira1 = new TextField("jira1", new Model(""));
		jira2 = new TextField("jira2", new Model(""));
		jira3 = new TextField("jira3", new Model(""));
		directo1 = new TextField("directo1", new Model(""));
		directo2 = new TextField("directo2", new Model(""));
		directo3 = new TextField("directo3", new Model(""));
		directo4 = new TextField("directo4", new Model(""));
		
	
		
		Button saveNewClient = new Button("saveNewClient"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new ClientListPage()); 
			}
		};				
		form.add(saveNewClient);
		
		
		Button cancelNewClient = new Button("cancelNewClient"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new ClientListPage()); 
			}
		};				
		form.add(cancelNewClient);
		
		
		form.add(clientName);
		form.add(directoClient);
		form.add(jira1);
		form.add(jira2);
		form.add(jira3);
		form.add(directo1);
		form.add(directo2);
		form.add(directo3);
		form.add(directo4);
		add(form);	 
		
	}
}
