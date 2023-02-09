package peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Scope("singleton")
public class MessagePrinter {
    private Message message;
    @Value("${name}")
    private String name;



    @Autowired
    public MessagePrinter( @Qualifier("smsService") Message message) {
        this.message = message;
    }


    public Message getMessage() {
        return message;
    }

    public void setMessageList(Message message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "MessagePrinter{" +
                "messageList=" + message +
                ", name='" + name + '\'' +
                '}';
    }
}
