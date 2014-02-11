package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class PackageFreezedPage extends WebPage {
	
	private TextField search;
	private Label packName;
	private Label client;
	
	public PackageFreezedPage(){
		
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		search = new TextField ("search", new Model("Search"));
		packName = new Label ("packName", "...");
		client = new Label ("client", "...");
		
		
		Button backToPackages = new Button("backToPackages"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HomePage()); 
			}
		};				
		form.add(backToPackages);
		
		Button addNote = new Button("addNote"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new NotePage()); 
			}
		};				
		form.add(addNote);
		
		Button infoPackages = new Button("infoPackages"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageInfoFreezedPage()); 
			}
		};				
		form.add(infoPackages);
		
		form.add(client);
		form.add(packName);
		form.add(search);
		add(form);	 
		
	}

}
