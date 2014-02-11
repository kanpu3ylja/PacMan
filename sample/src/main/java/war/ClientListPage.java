package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class ClientListPage extends WebPage {
	private Label clientName;
	private Label directoID;
	private Label jiraID;
	private TextField search;
	
	
	
	public ClientListPage () {
			Form form = new Form("form");
			clientName = new Label("clientName", "");
			directoID = new Label("directoID", "");
			jiraID = new Label("jiraID", "");
			search = new TextField("search", new Model("Search"));
			
			
	Button newClientButton = new Button("NewClientButton"){
		private static final long serialVersionUID = 1L;
		public void onSubmit(){
			setResponsePage(new ClientNewPage()); 
		}
	};				
	form.add(newClientButton);
	
	
	Button clientInfo = new Button("clientInfo"){
		private static final long serialVersionUID = 1L;
		public void onSubmit(){
			setResponsePage(new ClientInfoPage()); 
		}
	};				
	form.add(clientInfo);
	
	
	Button clientEdit = new Button("clientEdit"){
		private static final long serialVersionUID = 1L;
		public void onSubmit(){
			setResponsePage(new ClientEditPage()); 
		}
	};				
	form.add(clientEdit);
	
	
	
	
	form.add(new ButtonPanelPage("buttonPanel"));
	form.add(clientName);
	form.add(directoID);
	form.add(jiraID);
	form.add(search);
	add(form);
	
	}

}
