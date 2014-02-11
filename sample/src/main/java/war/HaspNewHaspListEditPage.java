package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class HaspNewHaspListEditPage extends WebPage {

	public HaspNewHaspListEditPage () {
		
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		
		Button newHaspEditPackage = new Button("newHaspEditPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspListEditPage()); 
			}
		};				
		form.add(newHaspEditPackage);
		
		
		Button cancelHaspEditPackage = new Button("cancelHaspEditPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspListEditPage()); 
			}
		};				
		form.add(cancelHaspEditPackage);
		
		add(form);	 
	}
}
