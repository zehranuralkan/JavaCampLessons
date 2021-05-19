package kodlamaio.northwind.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
///api/products istekte bulunursa bunu karşılar 
//controller olduğunu ifade eder.
public class ProductsController {
//isimlendirme kuralı! (çoğul)
	private ProductService productService;
	@Autowired
	//@Autowired Projeyi tarıyor 
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}
	@GetMapping("/getall")
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
