package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

public class PackageInfoPage extends WebPage {
	
	private Label packName;
	private Label client;
	private Label projectIDs;
	private Label date;
	private Label OS;
	private Label client_id;
	private Label client_name;
	private Label keyIDs;
	private Label keyFeatures;
	private Label keyName;
	
	public PackageInfoPage () {
		
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		
		packName = new Label("packName", "...");
		client = new Label("client", "...");
		projectIDs = new Label ("projectID", "...");
		date = new Label ("date", "...");
		OS = new Label ("OS", "...");
		client_id = new Label ("client_id", "...");
		client_name = new Label ("client_name", "...");
		keyIDs = new Label ("keyID", "...");
		keyFeatures = new Label ("keyFeatures", "...");
		keyName = new Label ("keyName", "...");

		
		
		Button freezeQuest = new Button("freezeQuest"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new QuestFreezeInfoPage()); 
			}
		};				
		form.add(freezeQuest);
		
		
		Button editPackageBTN = new Button("editPackageBTN"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new PackageEditInfoPage()); 
			}
		};				
		form.add(editPackageBTN);
		
		
		Button backToList = new Button("backToList"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HomePage()); 
			}
		};				
		form.add(backToList);
		
		
		form.add(packName);
		form.add(client);
		form.add(projectIDs);
		form.add(date);
		form.add(OS);
		form.add(client_id);
		form.add(client_name);
		form.add(keyIDs);
		form.add(keyFeatures);
		form.add(keyName);
		add(form);	 
	}

}
