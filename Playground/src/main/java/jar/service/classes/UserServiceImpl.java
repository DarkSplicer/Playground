package jar.service.classes;

import java.util.List;

import jar.dao.classes.UserDaoImpl;
import jar.dao.interfaces.UserDao;
import jar.model.interfaces.User;
import jar.service.interfaces.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserServiceImpl() {
		this.userDao = UserDaoImpl.getInstance();
	}

	@Override
	public List<User> findAllUsers() {
		return this.userDao.getList();
	}

	@Override
	public void saveUser(User user) {
		this.userDao.saveUser(user);
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
	}

	@Override
	public User findUser(int userID) {
		return this.userDao.findUser(userID);
	}

	@Override
	public User findUserByName(String userName) {
		return this.userDao.findUserByName(userName);
	}

}
