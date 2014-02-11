package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;

public class SoftwareSelectNewPage extends WebPage {
	
	private CheckBox softCB;
	private Label softName;
	private Label softVR;
	
	public SoftwareSelectNewPage () {
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		softName = new Label ("softName", "");
		softVR = new Label ("softVR", "");
		softCB = new CheckBox("softCB", new Model(""));
		
		Button saveSoftNew = new Button("saveSoftNew"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageNewPage()); 
			}
		};				
		form.add(saveSoftNew);
		
		
		Button cancelSoftNew = new Button("cancelSoftNew"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageNewPage()); 
			}
		};				
		form.add(cancelSoftNew);
		
		
		form.add(softCB);
		form.add(softName);
		form.add(softVR);
		add(form);	 
		
	}

}
