package repository;


import java.util.List;
import model.Product;

public class ProductRepository {

    private final List<Product> products;

    public ProductRepository() {
        products = List.of(
            new Product(1, "A", 10),
            new Product(2, "V", 3),
            new Product(3, "B", 111),
            new Product(4, "D", 32)
        );
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void updateProduct(Product updatedProduct) {
        for (Product product : products) {
            if (product.getId() == updatedProduct.getId()) {
                product.setName(updatedProduct.getName());
                product.setPrice(updatedProduct.getPrice());
                break;
            }
        }
    }

    public void deleteProduct(int id) {
        Product productToRemove = null;
        for (Product product : products) {
            if (product.getId() == id) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
        }
    }
}
