public interface OrderRepository {
    Order findById(Long id);
    void save(Order order);
}
