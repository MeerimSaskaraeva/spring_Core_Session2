package peaksoft;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService implements Message{


    @Override
    public String toString() {
        return "SMSService{}";
    }

    @Override
    public void getMessage() {
        System.out.println("This is SMS message");
    }
}
