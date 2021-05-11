package nLayedDemo.dataAccess.Abstracts;


import java.util.List;

import nLayedDemo.entities.concretes.Product;

public interface ProductDao {
void add(Product product);
void update(Product product);
void delete(Product product);
Product get(int id);
//bana bir tane id ver bu id içeriden bir product bulsun.
List<Product> getAll();
//arrayler sabit yapýlardýr. arraylere eleman eklersek sýkýntý yaþarýz.

}
