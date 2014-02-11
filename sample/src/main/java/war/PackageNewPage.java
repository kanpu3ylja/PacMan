package war;

import java.util.Arrays;
import java.util.List;

import org.apache.wicket.extensions.markup.html.form.DateTextField;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
// ласс дл€ создани€ нового инсталл€ционного пакета
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class PackageNewPage extends WebPage {
	
	private TextField packageName;
	private DropDownChoice selectClient;
	private TextField directoProject;
	private DateTextField till;
	private CheckBox win7x32;
	private CheckBox win7x64;
	private CheckBox ws2008r2;
	private CheckBox ws2008;
	private CheckBox ws2003;
	private CheckBox xp;
	
	
	//private Date tillDate = new Date();
	
	//private Integer one=1;
	private static final List<Integer> listFive = Arrays.asList(1,2,3,4,5);
	
	
	
	public PackageNewPage (){
		Form form = new Form("form");
		form.add(new ButtonPanelPage("buttonPanel"));//бокова€ панель с кнопками
		packageName = new TextField ("packageName", new Model(""));
		selectClient = new DropDownChoice("clients", new PropertyModel(this, "one"), listFive);
		directoProject = new TextField("directoProject", new Model(""));
		
		till = new DateTextField("tillDate", new PropertyModel(this, "tillDate"));
/*		DatePicker datePicker = new DatePicker();
        datePicker.setShowOnFieldClick(true);
        datePicker.setAutoHide(true);
        till.add(datePicker);*/

		win7x32 = new CheckBox("win7x32");
		win7x64 = new CheckBox("win7x64");
		ws2008r2 = new CheckBox("ws2008r2");
		ws2008 = new CheckBox("ws2008");
		ws2003 = new CheckBox("ws2003");
		xp = new CheckBox("xp");
		
		
		
		Button saveNewPackage = new Button("saveNewPackage"){
			//данна€ кнопка сохран€ет новый пакет, записывает все данные в базу данных в соответствущую таблицу
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HomePage()); 
			}
		};				
		form.add(saveNewPackage);
		
		Button cancelNewPackage = new Button("cancelNewPackage"){
			//кнопка отмен€ет создание нового пакета, без сохранений 
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
			setResponsePage(new HomePage()); 
			}
		};				
		form.add(cancelNewPackage);
		
		Button softNewPackage = new Button("softNewPackage"){
			
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new SoftwareSelectNewPage()); 
			}
		};				
		form.add(softNewPackage);
		
		Button haspNewPackage = new Button("haspNewPackage"){
			private static final long serialVersionUID = 1L;
			public void onSubmit(){
				setResponsePage(new HaspListNewPage()); 
			}
		};				
		form.add(haspNewPackage);
		
		
		form.add(packageName);
		form.add(selectClient);
		form.add(directoProject);
		form.add(till);
		form.add(win7x32);
		form.add(win7x64);
		form.add(ws2008r2);
		form.add(ws2008);
		form.add(ws2003);
		form.add(xp);
		add(form);	 
		
	}

}
