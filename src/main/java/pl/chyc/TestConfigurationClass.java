package pl.chyc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfigurationClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Car car = context.getBean(Car.class);
        car.setPart(context.getBean(Part.class));
        car.setEngine(context.getBean(Engine.class));

        car.getPart().setName("PArty");
        car.getPart().setSize(12);
        car.getEngine().setPower(99999);

        System.out.println("Part name: " + car.getPart().getName());
        System.out.println("Part size: " + car.getPart().getSize());
        System.out.println("Engine power: " + car.getEngine().getPower());
        CustomEventPublisher customEventPublisher = context.getBean(CustomEventPublisher.class);
        customEventPublisher.publisher();
       // ((AnnotationConfigApplicationContext)context).refresh();
    }
}
