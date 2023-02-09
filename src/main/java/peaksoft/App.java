package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Message message1 = context.getBean("smsService", SMSService.class);
        Message message2 = context.getBean("emailService", EmailService.class);
//        message1.getMessage();
//        message2.getMessage();

        MessagePrinter printer1=context.getBean("messagePrinter", MessagePrinter.class);
        MessagePrinter printer2=context.getBean("messagePrinter", MessagePrinter.class);
        System.out.println(printer1);
        context.close();
    }
}
