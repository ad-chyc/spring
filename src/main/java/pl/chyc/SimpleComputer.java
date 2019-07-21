package pl.chyc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleComputer {
    public static void main(String[] args) {
        String file = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(file);
        Computer computer = (Computer) context.getBean("computer");

        computer.setMsg("nanana");
        computer.getHardDrive().setPower(100);

        computer.getHardDrive().getPower();
        computer.getHardDrive().getName();
        System.out.println(computer.getMsg());
    }
}
