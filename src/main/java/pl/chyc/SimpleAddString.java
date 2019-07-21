package pl.chyc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleAddString {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AddString text = (AddString) context.getBean("addString");
        text.setText("dsa");
        text.setText2("maska");
        //context.registerShutdownHook();
        context.close();
    }

}
