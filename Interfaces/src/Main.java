
public class Main {
       public static void main(String[] args) {
           Logger[] loggers= {new SmsLogger(),new EmailLogger(), new FileLogger()};
           CustomerManager customerManager=new CustomerManager(loggers); //bağımlılığını sms yaptık
           Customer zehra=new Customer(1,"zehra","alkan");
           customerManager.add(zehra);
           //yönetim dedi ki biz birden fazla loglama yapabiliyoruz . Çoklu loglama getrilseydi nasıl yazardınız?
       }
}
