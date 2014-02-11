package war;

import javax.inject.Inject;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

import war.domain.Software;
import war.domain.SoftwareRepository;


public class SoftwareNewPage extends WebPage {
	
	@Inject
	SoftwareRepository softwareRepository;
	private TextField softName;
	
	
	
	public SoftwareNewPage () {
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));
		softName = new TextField("softName", new Model("Enter software name"));
		
		
		Button saveSoftBuild = new Button("saveSoftBuild"){
			private static final long serialVersionUID = 1L;
			@Override
			public void onSubmit(){
						
				String softwareNamevalue = (String) softName.getModelObject();
				softName.setModelObject(softwareNamevalue);
							
				Software software = softwareRepository.addSoft(softwareNamevalue);
				setResponsePage(new SoftwareListPage());
			}
		};				
		form.add(saveSoftBuild);
		
		Button cancelSoftBuild = new Button("cancelSoftBuild"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new SoftwareListPage());
			}
		};				
		form.add(cancelSoftBuild);
		
		
		form.add(softName);
		add(form);	 
	}

}
