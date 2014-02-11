package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;

@SuppressWarnings("serial")
public class ClientInfoPage extends WebPage {

	private Label clientName;
	private Label directoClient;
	private Label jira1;
	private Label jira2;
	private Label jira3;
	private Label directo1;
	private Label directo2;
	private Label directo3;
	private Label directo4;
	private Label packageName;
	
	
	
	public ClientInfoPage () {
				
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		
		clientName = new Label("clientName", "-Defined client name-");
		directoClient = new Label ("directoClient", "-Defined directo client ID-");
		jira1 = new Label ("jira1", "-Defined JIRA project-");
		jira2 = new Label ("jira2", "-Defined JIRA project-");
		jira3 = new Label ("jira3", "-Defined JIRA project-");
		directo1 = new Label ("directo1", "-Defined Directo project-");
		directo2 = new Label ("directo2", "-Defined Directo project-");
		directo3 = new Label ("directo3", "-Defined Directo project-");
		directo4 = new Label ("directo4", "-Defined Directo project-");
		packageName = new Label ("packageName", "");
		
		
		Button freezeQuest = new Button("freezeQuest"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new QuestFreezeClientInfoPage()); 
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
		
		
		
		Button clientEdit = new Button("clientEdit"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new ClientEditPage()); 
			}
		};				
		form.add(clientEdit);
		
				
		Button cancelClientInfo = new Button("cancelClientInfo"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new ClientListPage()); 
			}
		};				
		form.add(cancelClientInfo);
		
		
		form.add(clientName);
		form.add(directoClient);
		form.add(jira1);
		form.add(jira2);
		form.add(jira3);
		form.add(directo1);
		form.add(directo2);
		form.add(directo3);
		form.add(directo4);
		form.add(packageName);
		add(form);	 
	}
}
