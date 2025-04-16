public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void handle(Long id, String name) {
        Product product = new Product(id, name);
        productRepository.save(product);
    }
}
