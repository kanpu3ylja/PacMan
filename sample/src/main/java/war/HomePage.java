package war;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

/**
 * Homepage
 */
public class HomePage extends WebPage {

	private Label packName;
	private Label client;
	private TextField search;

	public HomePage() {
		Form form = new Form("form");
			
		packName = new Label ("packName", "...");
		client = new Label ("client", "...");
		search = new TextField ("search", new Model("Search"));

		Button newPackageBTN = new Button("newPackageBTN"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				
				setResponsePage(new PackageNewPage()); 
			}
		};				
		form.add(newPackageBTN);
		
		Button freezedPackagesBTN = new Button("freezedPackagesBTN"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageFreezedPage()); 
			}
		};				
		form.add(freezedPackagesBTN);
		
		
		Button freezeQuest = new Button("freezeQuest"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new QuestFreezePage()); 
			}
		};				
		form.add(freezeQuest);
		
		
		Button editPackageBTN = new Button("editPackageBTN"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageEditPage()); 
			}
		};				
		form.add(editPackageBTN);
		
		
		Button infoPackageBTN = new Button("infoPackageBTN"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageInfoPage()); 
			}
		};				
		form.add(infoPackageBTN);

		form.add(search);
		form.add(client);
		form.add(packName);
		form.add(new ButtonPanelPage("buttonPanel"));
		 			
		add(form);	 
		
	         }

    }
