/*
 * Implementation of the user service
 */
public class UserServiceImpl implements UserService {
    @Override
    public void getUser() {
        // Call the user repository
        UserRepository userRepository = new UserRepositoryImpl();
        userRepository.getUser();
    }
}