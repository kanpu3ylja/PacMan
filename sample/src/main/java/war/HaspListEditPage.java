package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class HaspListEditPage extends WebPage {

	public HaspListEditPage () {
		
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		
		Button newHaspEditPackage = new Button("newHaspEditPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspNewHaspListEditPage()); 
			}
		};				
		form.add(newHaspEditPackage);
		
		Button haspEdit = new Button("haspEdit"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspEditPage()); 
			}
		};				
		form.add(haspEdit);
		
		
		Button cancelHaspEditPackage = new Button("cancelHaspEditPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageEditPage()); 
			}
		};				
		form.add(cancelHaspEditPackage);
		
		add(form);	 
	}
}
