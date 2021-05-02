
public class Main {
    public static void main(String[] args)
    {
        //referans oluşturma
    
     
       Product product2=new Product();
       product2.setId(2);
       product2.setName("lenovo v15");
       product2.setDetail("16gb ram");
       product2.setUnitPrice(14500);
       product2.setDiscount(10);
       System.out.println(product2.getUnitPriceAfterDiscount());

     //yazmak set 
     //okumak get
     Category category1=new Category();
     category1.setId(1);
     category1.setName("içecek");
     Category category2=new Category();
     category2.setId(2);
     category2.setName("yiyecek");
     System.out.println(category1.getName());
     System.out.println(category2.getName());
    }
}
