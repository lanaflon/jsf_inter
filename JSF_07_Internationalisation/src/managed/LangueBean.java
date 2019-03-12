package managed;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
@ManagedBean
@SessionScoped
public class LangueBean {	
	public String getLangueCourante(){
		System.out.println("getLangueCourante");
		Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
		return locale.getLanguage();
	}
	public String activerFR() {
		System.out.println("cativeFR2");
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.FRENCH);
		return null;
	}
	public String activerEN() {
		System.out.println("Anglais 3");
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.ENGLISH);
		return null;
	}
	public String activerES() {
		System.out.println("activerES()");
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale("es"));
		return null;
	}
	public String activerIT() {
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(Locale.ITALY);
		return null;
	}
	public String activerCH() {
		System.out.println("CHINOIS");
		FacesContext context = FacesContext.getCurrentInstance();
		context.getViewRoot().setLocale(new Locale("ch"));
		return null;
	}
	public String languesSupportees(){
		Locale[] locale = Locale.getAvailableLocales(); 
		System.out.println("Langues supportées : ");
		for (int i=0; i<locale.length; i++) { 
		    System.out.println( locale[i].getLanguage()+", "+locale[i].getCountry()+", " 
		                        +locale[i].getVariant()+", "+locale[i].getDisplayName() 
		                   ); 
		}
		return null;
	}
}
