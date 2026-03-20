/*
 * Main application entry point
 */
public class Application {
    public static void main(String[] args) {
        // Initialize the application
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Start the application
        context.getBean("application", Application.class).start();
    }

    public void start() {
        // Start the application logic
        UserController userController = new UserControllerImpl();
        userController.handleRequest();
    }
}