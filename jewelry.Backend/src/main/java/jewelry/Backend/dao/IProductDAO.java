package jewelry.Backend.dao;

import jewelry.Backend.model.Product;
import java.util.List;

public interface IProductDAO {
	public List<Product> getProducts();
	public Product getProduct(int id);
	public boolean addProducts(Product p);
	public boolean updateProduct(Product p);
	public boolean deleteProduct(int id);
}
