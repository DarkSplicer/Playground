package jar.dao.classes;

import java.util.ArrayList;
import java.util.List;

import jar.dao.interfaces.UserDao;
import jar.model.classes.UserImpl;
import jar.model.interfaces.Role;
import jar.model.interfaces.User;

public class UserDaoImpl implements UserDao {
	private List<User> userTable;
	private static UserDao userDao;

	private UserDaoImpl() {
		this.userTable = new ArrayList<User>();

		this.userTable.add(new UserImpl("Tommy", "1234", Role.ADMIN));
		this.userTable.add(new UserImpl("Chov", "5678", Role.USER));
	}

	/**
	 * Gibt die UserDao zurück. Erstellt eine wenn keine vorhanden ist.
	 * @return Die derzeitige UserDao.
	 */
	public static UserDao getInstance() {
		if (userDao == null) {
			userDao = new UserDaoImpl();
		}

		return userDao;
	}

	/**
	 * Gibt eine Liste mit allen User zurück.
	 */
	@Override
	public List<User> getList() {
		return this.userTable;
	}

	/**
	 * Speichert ein User in die Liste.
	 */
	@Override
	public void saveUser(User user) {
		this.userTable.add(user);
	}

	/**
	 * Löscht ein User aus der Liste.
	 */
	@Override
	public void delete(User user) {
		this.userTable.remove(user);

	}

	/**
	 * Gibt ein User zurück mit der passenden ID.
	 * @param id: ID des Users
	 */
	@Override
	public User findUser(int id) {
		for(User current: this.userTable) {
			if(current.getUserId() == id) {
				return current;
			}
		}

		return null;
	}

	/**
	 * Gibt ein User zurück mit dem passenden Name.
	 * @param userName: der Name der gesuchten Users
	 */
	@Override
	public User findUserByName(String userName) {
		for(User current: this.userTable) {
			if(current.getUsername() == userName) {
				return current;
			}
		}

		return null;
	}
}
