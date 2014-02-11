package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class DongleNewFeaturePage extends WebPage {
	
	public DongleNewFeaturePage () {
		
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
	
	Button saveNewFeature = new Button("saveNewFeature"){
		private static final long serialVersionUID = 1L;
		public void onSubmit(){
			setResponsePage(new DonglesListPage()); 
		}
	};				
	form.add(saveNewFeature);
	
	
	Button cancelNewFeature = new Button("cancelNewFeature"){
		private static final long serialVersionUID = 1L;
		public void onSubmit(){
			setResponsePage(new DonglesListPage()); 
		}
	};				
	form.add(cancelNewFeature);
	
	add(form);	 
	
	}

}
