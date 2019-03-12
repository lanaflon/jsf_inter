package managed;

import java.io.Serializable;
import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class Hello implements Serializable {
	
	public String getBonjour(){
		return "Bonjour JSF 2";
	}
	public String activerEN() {
		System.out.println("Anglais 2");
		/*Locale[] locale = Locale.getAvailableLocales(); 
		System.out.println("Langues supportées : ");
		for (int i=0; i<locale.length; i++) { 
		    System.out.println( locale[i].getLanguage()+", "+locale[i].getCountry()+", " 
		                        +locale[i].getVariant()+", "+locale[i].getDisplayName() 
		                   ); 
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.ENGLISH);*/
		return null;
	}
}
