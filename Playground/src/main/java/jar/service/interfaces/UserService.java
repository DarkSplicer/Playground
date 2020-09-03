package jar.service.interfaces;

import java.util.List;

import jar.model.interfaces.User;


public interface UserService {

	List<User> findAllUsers();

	void saveUser(User user);

	void delete(User user);

	User findUser(int userID);

	User findUserByName(String userName);

}
