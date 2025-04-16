public interface UserRepository {
    User findById(Long id);
    void save(User user);
}
