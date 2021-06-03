package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
@Service
//Bu cass service görevi göreceğinin bilgisini veriyoruz
public class ProductManager implements ProductService {
private ProductDao productDao;

@Autowired
	public ProductManager(ProductDao productDao) {
	super();
	this.productDao = productDao;
}
	@Override
	public DataResult<List<Product>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
				
		//bütün dataları getirir.
	}
	@Override
	public kodlamaio.northwind.core.utilities.results.Result add(Product product) {
		this.productDao.save(product);	
		return new SuccessResult("Ürün eklendi");

	}
	
	

}
