package pl.chyc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleBeanTemplate {
    public static void main(String[] args) {
        String file = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(file);
        BeanFirstTemplate beanTestTemplate = (BeanFirstTemplate) context.getBean("beanTestTemplate");
        beanTestTemplate.getMsg();
        beanTestTemplate.getMsg2();
        beanTestTemplate.getMsg3();
    }
}
