package jar.model.classes;

import java.util.Locale;

/**
 * KlassenImpl für die Sprachen.
 *
 */
public class Language {
	private String languageCode;		// die Kurzform der Sprache
	private String languageDescription;	// Name der Sprache
	private Locale locale;				//locale der Sprache

	public Language(Locale locale, String languageDescription) {
		this.languageDescription = languageDescription;
		this.locale = locale;
		this.languageCode = locale.getLanguage();
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageDescription() {
		return languageDescription;
	}

	public void setLanguageDescription(String languageDescription) {
		this.languageDescription = languageDescription;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}
