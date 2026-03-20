/*
 * Implementation of the user repository
 */
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void getUser() {
        // Call the database
        DatabaseUtils databaseUtils = new DatabaseUtils();
        databaseUtils.getUser();
    }
}