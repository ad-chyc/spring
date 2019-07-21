package pl.chyc;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "My event Handler";
    }
}
