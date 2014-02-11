package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

import war.domain.Hasp_ClientRepository;

import com.google.inject.Inject;

@SuppressWarnings("serial")
public class DongleNewClientPage extends WebPage {
	
	@Inject
	Hasp_ClientRepository haspClientRepository;

	private TextField<String> name;
	private TextField<String> clientId;
	
	public DongleNewClientPage () {
		
		Form<?> form = new Form<Object>("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		name = new TextField<String>("name", new Model<String>(""));
		clientId = new TextField<String>("clientId", new Model<String>(""));
		
		
		Button saveNewHaspClient = new Button("saveNewHaspClient"){
			private static final long serialVersionUID = 1L;
			@Override
			public void onSubmit(){
				String namevalue = (String) name.getModelObject();
				String clientIdvalue = (String) clientId.getModelObject();
				
				name.setModelObject(namevalue);
				clientId.setModelObject(clientIdvalue);
				
				
				setResponsePage(new DonglesListPage()); 
			}
		};				
		form.add(saveNewHaspClient);
		
		
		Button cancelNewHaspClient = new Button("cancelNewHaspClient"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new DonglesListPage()); 
			}
		};				
		
		form.add(name);
		form.add(clientId);
		form.add(cancelNewHaspClient);
		
		add(form);	 
	}
}
