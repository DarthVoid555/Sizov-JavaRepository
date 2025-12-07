public interface UserRepository {
    void save(User user);
    User findById(int id);
}