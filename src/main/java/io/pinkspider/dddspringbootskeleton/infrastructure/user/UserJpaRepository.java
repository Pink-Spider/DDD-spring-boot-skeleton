public class JpaUserRepository implements UserRepository {
    @Override
    public User findById(Long id) {
        return new User(id, "Sample");
    }

    @Override
    public void save(User user) {
        System.out.println("Saved user: " + user.getName());
    }
}
