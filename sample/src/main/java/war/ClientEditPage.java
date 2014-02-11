package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

@SuppressWarnings("serial")
public class ClientEditPage extends WebPage {
	
	private TextField<String> clientName;
	private TextField<String> directoClient;
	private TextField<String> jira1;
	private TextField<String> jira2;
	private TextField<String> jira3;
	private TextField<String> directo1;
	private TextField<String> directo2;
	private TextField<String> directo3;
	private TextField<String> directo4;

	public ClientEditPage () {
		
		Form<?> form = new Form<Object>("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		clientName = new TextField<String>("clientName", new Model<String>("defined client name"));
		clientName.setEnabled(false);
		directoClient = new TextField<String>("directoClient", new Model<String>("defined directo client id"));
		directoClient.setEnabled(false);
		jira1 = new TextField<String>("jira1", new Model<String>(""));
		jira2 = new TextField<String>("jira2", new Model<String>(""));
		jira3 = new TextField<String>("jira3", new Model<String>(""));
		directo1 = new TextField<String>("directo1", new Model<String>(""));
		directo2 = new TextField<String>("directo2", new Model<String>(""));
		directo3 = new TextField<String>("directo3", new Model<String>(""));
		directo4 = new TextField<String>("directo4", new Model<String>(""));
		
		Button saveEditClient = new Button("saveEditClient"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new ClientListPage()); 
			}
		};				
		form.add(saveEditClient);
		
		
		
		Button cancelEditClient = new Button("cancelEditClient"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new ClientListPage()); 
			}
		};				
		form.add(cancelEditClient);
		
		
		
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
