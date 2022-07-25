package core.spring.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        PropExample propExample = context.getBean("propExample",PropExample.class);
        System.out.println(propExample);
    }
}
