package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class QuestFreezeClientInfoPage extends WebPage{
	
	public QuestFreezeClientInfoPage () {
		Form form = new Form("form");
		
		Button freezeYes = new Button("freezeYes"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageFreezedPage()); 
			}
		};				
		form.add(freezeYes);
		
		Button freezeNo = new Button("freezeNo"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HomePage()); 
			}
		};				
		form.add(freezeNo);
		form.add(new ButtonPanelPage("buttonPanel"));
		add(form);	 
		
	}

}
