public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void handle(Long id, String name) {
        User user = new User(id, name);
        userRepository.save(user);
    }
}
