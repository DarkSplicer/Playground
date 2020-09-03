package jar.factories;

import jar.service.classes.UserServiceImpl;
import jar.service.interfaces.UserService;

public class ServiceFactory {
    public static UserService createUserService() {
		return new UserServiceImpl();
	}
}
