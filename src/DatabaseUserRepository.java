import java.util.HashMap;
import java.util.Map;

public class DatabaseUserRepository implements UserRepository {
    private Map<Integer, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getId(), user);
        System.out.println("User saved: " + user.getName());
    }

    @Override
    public User findById(int id) {
        User user = users.get(id);
        if (user != null) {
            System.out.println("User found: " + user.getName());
        } else {
            System.out.println("User not found with id: " + id);
        }
        return user;
    }
}