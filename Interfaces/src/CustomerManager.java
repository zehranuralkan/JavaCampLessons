
public class CustomerManager {
    //iki tip bağımlılık vardır.
    // loosly(gevşek)- tightly(katı) bağlılık
    private Logger[] loggers;
    public CustomerManager(Logger[] loggers){
        this.loggers=loggers;
    }
    public void add(Customer customer){
        System.out.println("müşteri eklendi"+customer.getFirstName());
//      DatabaseLogger logger=new DatabaseLogger();
//      logger.log(customer.getFirstName()+"veri tabanında loglandı.");
//      this.loggers.log(customer.getFirstName());
//      for(Logger logger:loggers){
//      logger.log(customer.getFirstName());
//      Utils utils=new Utils();//utils de void önüne static eklediğimiz için
//statik tanımaldığımızda referansı hep bellekte hep durur. O yüzden kullanıp atmadığımız yerlerde static 
           Utils.RunLoggers(loggers, customer.getFirstName());
 
//         }
    }
    public void delete(Customer customer){
//          ils.RunLogger System.out.println("müşteri eklendi"+customer.getFirstName());
//         DatabaseLogger logger=new DatabaseLogger();
//          logger.log(customer.getFirstName()+"veri tabanında loglandı.");
//          this.loggers.log(customer.getFirstName());
//          for(Logger logger:loggers){
//          logger.log(customer.getFirstName());
//          Uts(loggers, customer.getFirstName());
     Utils.RunLoggers(loggers, customer.getFirstName());
 
        }
    }

