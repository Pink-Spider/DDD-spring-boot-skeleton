public interface ProductRepository {
    Product findById(Long id);
    void save(Product product);
}
