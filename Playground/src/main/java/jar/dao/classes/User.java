package jar.dao.classes;

import jar.model.interfaces.Role;

public interface User {
    public int getUserID();
	public void setUserID(int userID);

	public String getUserName();
	public void setUserName(String username);

	public String getEmailAddress();
	public void setEmailAddress(String emailaddress);

	public String getPassword();
	public void setPassword(String password);

	Role getRole();
	void setRole(Role role);
}
