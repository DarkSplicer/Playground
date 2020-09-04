package jar.utils;

import java.util.Locale;

import javax.faces.context.FacesContext;

public class JsfUtils {

	public static FacesContext getFacesContext() {
		return FacesContext.getCurrentInstance();
	}

	public static void setLocale(Locale locale) {
		getFacesContext().getViewRoot().setLocale(locale);
	}
}
