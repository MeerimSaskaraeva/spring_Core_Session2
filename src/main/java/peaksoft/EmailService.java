package peaksoft;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("emailService")
@Primary
public class EmailService implements Message{


    @Override
    public String toString() {
        return "EmailService{}";
    }

    @Override
    public void getMessage() {
        System.out.println("This is email message");
    }
}
