package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class HaspListNewPage extends WebPage{

	public HaspListNewPage () {
		
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		
		Button newHaspNewPackage = new Button("newHaspNewPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspNewHaspListNewPage()); 
			}
		};				
		form.add(newHaspNewPackage);
		
		Button haspEdit = new Button("haspEdit"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspEditPage()); 
			}
		};				
		form.add(haspEdit);
		
		
		Button cancelHaspNewPackage = new Button("cancelHaspNewPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageNewPage()); 
			}
		};				
		form.add(cancelHaspNewPackage);
		
		add(form);	 
	}
}
