package pl.chyc;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("My Custom event");
    }
}
