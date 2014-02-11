package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class HaspNewHaspListNewPage extends WebPage {

	public HaspNewHaspListNewPage () {
		
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		
		Button newHaspNewPackage = new Button("newHaspNewPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspListNewPage()); 
			}
		};				
		form.add(newHaspNewPackage);
		
		
		Button cancelHaspNewPackage = new Button("cancelHaspNewPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspListNewPage()); 
			}
		};				
		form.add(cancelHaspNewPackage);
		
		add(form);	 
		
	}
}
