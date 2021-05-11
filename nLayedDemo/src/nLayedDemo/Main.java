package nLayedDemo;

import nLayedDemo.business.abstracs.ProductService;
import nLayedDemo.business.concretes.ProductManager;
import nLayedDemo.core.JLoggerServiceAdapter;
import nLayedDemo.dataAccess.concretes.AbcProductDao;
import nLayedDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//ToDo: Spring IoC ile çözülecek
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerServiceAdapter());
		Product product=new Product(1,2,"Elma",12,50);
		productService.add(product);
	}

}
