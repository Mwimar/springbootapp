package foo.bar;

import org.springframework.stereotype.Component;

@Component
//marking with annotation;
public class WelcomeMessage {
    public String getWelcomeMessage(){
        return "Intro to Spring Dev";
    }
}
