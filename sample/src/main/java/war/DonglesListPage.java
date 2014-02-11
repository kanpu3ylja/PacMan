package war;
import javax.inject.Inject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.Model;
import org.hibernate.mapping.List;

import war.domain.Hasp_Client;
import war.domain.Hasp_ClientRepository;

public class DonglesListPage extends WebPage {
	
	@Inject
	Hasp_ClientRepository hasp_clientRepository;
	
	public DonglesListPage () {
		Form form = new Form("form");
		
		form.add(new ButtonPanelPage("buttonPanel"));
		
		Button newHaspClientButton = new Button("newHaspClientButton"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new DongleNewClientPage());
			}
		};				
		form.add(newHaspClientButton);
		
		
		Button newHaspFeatureButton = new Button("newHaspFeatureButton"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new DongleNewFeaturePage());
			}
		};			
		
//		final List<Hasp_Client> hasp = (List) hasp_clientRepository.loadHaspClient();
//		/*RepeatingView listItems = new RepeatingView("client_id");
//		listItems.add(new Label(listItems.newChildId(), new Model(((Object) listItems).gtClient_id()));*/
//		
//		form.add(new ListView<Hasp_Client>("tableHaspClient", hasp) {
//			@Override
//			protected void populateItem(final ListItem<Hasp_Client> item) {
//				final Hasp_Client hasp = item.getModelObject();
//				item.add(new Label("client_id", new Model<String>(hasp.getClient_id())));
//				item.add(new Label("client_name", new Model<String>(hasp.getClient_name())));
//			}
//		});
		Hasp_Client hasp = hasp_clientRepository.loadHaspClient("00000001");
		System.out.print(">>>>>"+hasp+"<<<");
		form.add(new Label("client_id", new Model(hasp.getClient_id())));
		form.add(new Label("client_name", new Model(hasp.getClient_name())));
		
		
				
		
		form.add(newHaspFeatureButton);
		
		add(form);
	}

}
