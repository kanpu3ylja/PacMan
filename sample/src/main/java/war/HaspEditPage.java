package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class HaspEditPage extends WebPage {

	public HaspEditPage () {
		
		Form form = new Form("form");
		
		form.add(new ButtonPanelPage("buttonPanel"));
		
		Button saveHaspChanges = new Button("saveHaspChanges"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspListNewPage()); 
			}
		};				
		form.add(saveHaspChanges);
		
		Button cancelHaspChanges = new Button("cancelHaspChanges"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspListNewPage()); 
			}
		};				
		form.add(cancelHaspChanges);
		
		
		add(form);	 
	}
}
