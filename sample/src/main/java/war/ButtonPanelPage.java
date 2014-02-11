package war;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.panel.Panel;

public class ButtonPanelPage extends Panel {
	
	private static final long serialVersionUID = 1L;

	public ButtonPanelPage(String id) {
		super(id);
	    
		
		Button packageButton = new Button("PackagesButton"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HomePage());
			}
		};				
		add(packageButton);
	
		Button clientsButton = new Button("ClientsButton"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new ClientListPage());
			}
		};				
		add(clientsButton);
		
		Button softwareButton = new Button("SoftwareButton"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new SoftwareListPage());
			}
		};				
		add(softwareButton);
	
		Button donglesButton = new Button("DonglesButton"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new DonglesListPage());
			}
		};				
		add(donglesButton);
	}
}
