package jar.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ComponentSystemEvent;

import jar.factories.ServiceFactory;
import jar.model.interfaces.User;
import jar.service.interfaces.UserService;


/**
 * Diese Klasse repraesentiert das Fenster, in welchem der Benutzer sich in der Seite einloggen kann.
 *
 */
@ManagedBean
@SessionScoped
public class LoginView {
	private List<User> userList;
	private UserService userService;
	private String username;
	private String password;
	private User currentUser;

	@PostConstruct
	public void initializeBean() {
		userService = ServiceFactory.createUserService();
		userList = userService.findAllUsers();
	}

	public void initialize(ComponentSystemEvent event) {
		username = "";
		password = "";
	}

	public String login() {
		for (final User user: userList) {
			if (user.getUsername().equals(username)) {
				if (user.getPasswort().equals(password)) {
					currentUser = user;
					return "home";
				}
			}
		}
		return null;
	}

	public void logOut(ActionEvent actionEvent) {
		this.currentUser = null;
	}

	public boolean isUserLoggedIn() {
		if (this.currentUser == null) {
			return false;
		} else {
			return true;
		}
	}

	public String getLoginLinks() {
		if (isUserLoggedIn()) {
			return "navigationLoggedIn.xhtml";
		} else {
			return "navigation.xhtml";
		}
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

}
