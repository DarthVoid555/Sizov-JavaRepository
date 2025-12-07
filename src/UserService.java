public class UserService {
    private UserRepository userRepository;
    private Notification notification;

    public UserService(UserRepository userRepository, Notification notification) {
        this.userRepository = userRepository;
        this.notification = notification;
    }

    public void registerUser(User user) {
        userRepository.save(user);
        notification.send("Welcome " + user.getName() + "!");
    }

    public void notifyUser(int userId, String message) {
        User user = userRepository.findById(userId);
        if (user != null) {
            notification.send("Message for " + user.getName() + ": " + message);
        }
    }
}