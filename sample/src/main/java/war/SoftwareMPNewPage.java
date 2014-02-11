package war;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class SoftwareMPNewPage extends WebPage {
	
	
	private TextField softName;
	private TextField jenkinsBuild;
	private TextField jenkinsLink;
	private TextField svnRevision;
	private TextField svnFolder;
	private CheckBox jenkinsCB;
	private CheckBox svnCB;
	
	public SoftwareMPNewPage () {
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		softName = new TextField ("softName", new Model("Enter software name"));
		
		jenkinsCB = new CheckBox ("jenkinsCB");
		jenkinsBuild = new TextField ("jenkinsBuild", new Model("Enter Jenkins Build number"));
		jenkinsLink = new TextField ("jenkinsLink", new Model("Enter link to Jenkins build"));
		
		/*			
		if (jenkinsCB != null){
			jenkinsBuild.setEnabled(true);
			jenkinsLink.setEnabled(true);
			svnFolder.setEnabled(false);
		}*/
		
		svnCB = new CheckBox ("svnCB");
		svnRevision = new TextField ("svnRevision", new Model("Enter SVN revision"));
		svnFolder = new TextField ("svnFolder", new Model("Enter link to SVN folder"));

		/*		
		if (svnCB != null){
			svnRevision.setEnabled(true);
			svnFolder.setEnabled(true);
			jenkinsCB.setEnabled(false);
		}
		*/
		
		
		Button saveMPBuild = new Button("saveMPBuild"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new SoftwareListPage());
			}
		};				
		form.add(saveMPBuild);
		
		Button cancelMPBuild = new Button("cancelMPBuild"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new SoftwareListPage());
			}
		};				
		form.add(cancelMPBuild);
		
		
		form.add(softName);
		form.add(jenkinsBuild);
		form.add(jenkinsLink);
		form.add(svnRevision);
		form.add(svnFolder);
		form.add(jenkinsCB);
		form.add(jenkinsCB);
		form.add(svnCB);
		add(form);	 
	}

}
