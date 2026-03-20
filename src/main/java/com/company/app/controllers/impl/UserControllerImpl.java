/*
 * Implementation of the UserController
 */
public class UserControllerImpl implements UserController {
    @Override
    public void handleRequest() {
        // Call the user service
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}