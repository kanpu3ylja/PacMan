package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;

public class SoftwareSelectEditInfoPage extends WebPage {
	
	private CheckBox softCB;
	private Label softName;
	private Label softVR;

	public SoftwareSelectEditInfoPage () {
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		softName = new Label ("softName", "");
		softVR = new Label ("softVR", "");
		softCB = new CheckBox("softCB", new Model(""));
		
		
		Button saveSoftEdit = new Button("saveSoftEdit"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageEditPage()); 
			}
		};				
		form.add(saveSoftEdit);
		
		
		Button cancelSoftEdit = new Button("cancelSoftEdit"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageEditPage()); 
			}
		};				
		form.add(cancelSoftEdit);
		
		
		form.add(softCB);
		form.add(softName);
		form.add(softVR);
		add(form);	 
		
	}
}
