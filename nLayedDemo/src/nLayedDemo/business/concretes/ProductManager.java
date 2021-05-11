package nLayedDemo.business.concretes;

import java.util.List;

import nLayedDemo.business.abstracs.ProductService;
import nLayedDemo.core.LoggerService;
import nLayedDemo.dataAccess.Abstracts.ProductDao;
import nLayedDemo.dataAccess.concretes.HibernateProductDao;
import nLayedDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}
	
	@Override
	public void add(Product product) {
		//iþ kodlarý
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride ürün kabul edilmiyor.");
			return;
		}
	this.productDao.add(product);
	this.loggerService.logToSystem("Ürün eklendi"+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
