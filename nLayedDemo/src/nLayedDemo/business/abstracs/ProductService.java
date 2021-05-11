package nLayedDemo.business.abstracs;

import java.util.List;

import nLayedDemo.entities.concretes.Product;

public interface ProductService {
void add(Product product);
List<Product>getAll();
}
