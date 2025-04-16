public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void handle(Long id, String name) {
        Order order = new Order(id, name);
        orderRepository.save(order);
    }
}
