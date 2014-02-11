package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class QuestFreezeInfoPage extends WebPage{
	
	public QuestFreezeInfoPage () {
		Form form = new Form("form");
		
		Button freezeYes = new Button("freezeYes"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageInfoPage()); 
			}
		};				
		form.add(freezeYes);
		
		Button freezeNo = new Button("freezeNo"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageInfoPage()); 
			}
		};				
		form.add(freezeNo);
		form.add(new ButtonPanelPage("buttonPanel"));
		add(form);	 
		
	}

}
