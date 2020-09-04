package jar.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

import jar.model.classes.Language;
import jar.utils.JsfUtils;
import jar.utils.StringUtils;

@ManagedBean
@SessionScoped
public class I18nBean {
	/**
	 * The code of the current locale.
	 */
	private String localeCode;

	/**
	 * Contains the available languages.
	 */
	private List<Language> languages;

	@PostConstruct
	public void initialize() {
		languages = new ArrayList<Language>();
		languages.add(new Language(Locale.GERMAN, "Deutsch"));
		languages.add(new Language(Locale.ENGLISH, "English"));
		localeCode = Locale.GERMAN.getLanguage();
	}

	/**
	 * Returns the language selected  by the user. If no language is selected the first
	 * language is returned.
	 * @return The selected language or the first language.
	 */
	public Language getSelectedLanguage() {
		if (StringUtils.isEmpty(localeCode)) {
			for (final Language language: languages) {
				if (StringUtils.areStringsEqual(language.getLanguageCode(), localeCode)) {
					return language;
				}
			}
		}

		return languages.get(0);
	}

	/**
	 * Is fired if the user wants to change the language. Looks for the selected language in the list with the
	 * available languages and sets the new locale.
	 * @param valueChangeEvent The event that was fired.
	 */
	public void onLocaleCodeChange(ValueChangeEvent valueChangeEvent) {
		final String newLocale = valueChangeEvent.getNewValue().toString();

		for (final Language language: languages) {
			if (StringUtils.areStringsEqual(language.getLanguageDescription(), newLocale)) {
				JsfUtils.setLocale(language.getLocale());
			}
		}
	}

	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
}
