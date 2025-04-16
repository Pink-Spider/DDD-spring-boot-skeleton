public class JpaOrderRepository implements OrderRepository {
    @Override
    public Order findById(Long id) {
        return new Order(id, "Sample");
    }

    @Override
    public void save(Order order) {
        System.out.println("Saved order: " + order.getName());
    }
}
