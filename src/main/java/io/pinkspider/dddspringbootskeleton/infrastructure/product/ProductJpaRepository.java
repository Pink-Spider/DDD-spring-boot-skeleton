public class JpaProductRepository implements ProductRepository {
    @Override
    public Product findById(Long id) {
        return new Product(id, "Sample");
    }

    @Override
    public void save(Product product) {
        System.out.println("Saved product: " + product.getName());
    }
}
