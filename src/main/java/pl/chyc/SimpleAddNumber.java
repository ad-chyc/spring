package pl.chyc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleAddNumber {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AddNumber number = (AddNumber)context.getBean("add");
        number.summary();
        number.setNumber(20);
        number.setNumber2(25);
        number.summary();

        AddNumber number2 = (AddNumber) context.getBean("add");
        number2.summary();
    }
}
