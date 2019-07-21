package pl.chyc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationClass {
    @Bean
    public Collections collections(){
        return new Collections();
    }

    @Bean
    public AddNumber addNumber(){
        return new AddNumber();
    }

    @Bean
    public CRefreshEventHandler cRefreshEventHandler(){
        return new CRefreshEventHandler();
    }

    @Bean
    public CustomEventPublisher customEventPublisher(){
        return new CustomEventPublisher();
    }

    @Bean
    public CustomEventHandler customEventHandler(){
        return new CustomEventHandler();
    }

    @Bean(initMethod = "getText2")
    @Lazy(value = true)
    public AddString addString(){
        return new AddString();
    }

    @Bean
    @Scope("singleton")
    public Car car(){
        return new Car();
    }

    @Bean Engine engine(){
        return new Engine();
    }

    @Bean Part part(){
        return new Part();
    }

}
