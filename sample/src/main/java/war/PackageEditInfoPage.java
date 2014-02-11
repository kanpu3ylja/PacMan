package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class PackageEditInfoPage extends WebPage {

	public PackageEditInfoPage () {
		
		Form form = new Form("form");
		
		form.add(new ButtonPanelPage("buttonPanel"));
		
		Button softEditPackage = new Button("softEditPackage"){
			private static final long serialVersionUID = 2L;
			public void onSubmit(){
				setResponsePage(new SoftwareSelectEditInfoPage()); 
			}
		};				
		form.add(softEditPackage);
		
		Button haspEditPackage = new Button("haspEditPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspListEditInfoPage()); 
			}
		};				
		form.add(haspEditPackage);
		
		
		Button saveChanges = new Button("saveChanges"){
			private static final long serialVersionUID = 2L;
			public void onSubmit(){
				setResponsePage(new PackageInfoPage()); 
			}
		};				
		form.add(saveChanges);
		
		Button cancelChanges = new Button("cancelChanges"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageInfoPage()); 
			}
		};				
		form.add(cancelChanges);
		
		add(form);	 
		
		
	}
}
