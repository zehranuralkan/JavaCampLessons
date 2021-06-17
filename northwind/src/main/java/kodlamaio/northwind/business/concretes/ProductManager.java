package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired//Araştır
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>
		("Data Listelendi",this.productDao.findAll());
	}
	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}
	
	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>
		("Data Listelendi",this.productDao.getByProductName(productName));
	}
	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<Product>
		("Data Listelendi",this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId));
	}
	
	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>
		("Data Listelendi",this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId));
	}
	@Override
	public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>
		("Data Listelendi",this.productDao.getByCategoryIn(categories));
	
	}
	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>
		("Data Listelendi",this.productDao.getByProductNameContains(productName));
	}
	
	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>
		("Data Listelendi",this.productDao.getByProductNameStartsWith(productName));
	}
	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>
		("Data Listelendi",this.productDao.getByNameAndCategory(productName,categoryId));
	}
	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable=PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent());
	}
	@Override
	public DataResult<List<Product>> getAllSorted() {
		Sort sort=Sort.by(Sort.Direction.DESC,"productName");
		return new SuccessDataResult<List<Product>>
		("Başarılı ",this.productDao.findAll(sort));
	}

	@Override
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		
		return new SuccessDataResult<List<ProductWithCategoryDto>>("Data listelendi.",this.productDao.getProductWithCategoryDetails());
	}
	
}	
