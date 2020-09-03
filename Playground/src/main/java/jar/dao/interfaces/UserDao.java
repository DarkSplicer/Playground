package jar.dao.interfaces;

import java.util.List;

import jar.model.interfaces.User;

public interface UserDao {
	public List<User> getList();
	public void saveUser(User user);
	public void delete(User user);
	public User findUser(int id);
	User findUserByName(String userName);
}
