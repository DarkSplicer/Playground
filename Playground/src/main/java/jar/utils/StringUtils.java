package jar.utils;

public class StringUtils {
	/**
	 * Überprüft oder der String nicht leer ist.
	 * @param aString der zu überprüfene String
	 * @return ob es nicht leer ist
	 */
	public static boolean isNotEmpty(final String aString) {
		if (aString == null) {
			return false;
		}
		return !aString.trim().isEmpty();
	}

	/**
	 * Überprüft oder der String leer ist.
	 * @param aString der zu überprüfene String
	 * @return ob er leer ist
	 */
	public static boolean isEmpty(final String aString) {
		if (aString == null) {
			return true;
		}
		return aString.trim().isEmpty();
	}

	/**
	 * Überprüft ob die übergebenen Strings den gleichen Inhalt haben.
	 * @param string1
	 * @param string2
	 * @return
	 */
	public static boolean areStringsEqual(final String string1, final String string2) {
		if (string1.equals(string2)) {
			return true;
		} else {
			return false;
		}
	}
}
