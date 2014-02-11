package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class SoftwareListPage extends WebPage {
	
	private TextField search;
	
	public SoftwareListPage() {
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		search = new TextField("search", new Model("Search"));
		
		Button newMPButton = new Button("newMPButton"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new SoftwareMPNewPage());
			}
		};				
		form.add(newMPButton);
		
		
		Button new3rdButton = new Button("new3rdButton"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new SoftwareNewPage());
			}
		};	
		
		form.add(search);
		form.add(new3rdButton);
		add(form);
	}

}
