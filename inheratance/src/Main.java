
public class Main {
    public static void main(String[] args){
        //Miras yapısı ile beraber şunu sağlıyoruz: İki adet sınıfımızda bazı operasyonlar ortak yapıya sahıp.
//        Customer customer1=new Customer();
//        customer1.id=1;
//        customer1.firstName="zehra";
//        customer1.lastName="alkan";
//        customer1.nationalIdentity="11111111111";
//        customer1.customerNumber="123";
//        
IndividualCustomer zehra=new IndividualCustomer();
zehra.customerNumber="12345";
CorporateCustomer hepsiBurada=new CorporateCustomer();
hepsiBurada.companyName="hepsi Burada";
hepsiBurada.customerNumber="78910";
SendikaCustomer abc=new SendikaCustomer();
abc.customerNumber="99999";
CustomerManager customerManager=new CustomerManager();
//customerManager.add(hepsiBurada);
//customerManager.add(zehra);
//customerManager.add(abc);
Customer[] customers={zehra, hepsiBurada, abc};
customerManager.addMultiple(customers);

    }
}
