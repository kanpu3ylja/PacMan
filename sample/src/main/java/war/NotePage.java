package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class NotePage extends WebPage {
	
	private TextField note;

	public NotePage () {
		
		Form form = new Form("form");
		note = new TextField("note", new Model("Enter note here"));
		
		Button saveNote = new Button("saveNote"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageFreezedPage()); 
			}
		};				
		form.add(saveNote);
		
		
		Button cancelNote = new Button("cancelNote"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageFreezedPage()); 
			}
		};				
		form.add(cancelNote);
		form.add(new ButtonPanelPage("buttonPanel"));
		
		form.add(note);
		add(form);	 
		
	}
}
