package pl.chyc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleCar {
    public static void main(String[] args) {
        String file = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(file);
        Car car = (Car) context.getBean("car");
        car.getEngine().setPower(100);
        car.getPart().setName("Master of Part");

        System.out.println(car.getEngine().getPower());
        System.out.println(car.getPart().getName());
    }
}
