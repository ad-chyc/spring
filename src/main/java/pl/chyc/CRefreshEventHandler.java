package pl.chyc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class CRefreshEventHandler implements ApplicationListener<ContextRefreshedEvent> {
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("Refreshed event: Recived");
    }
}
