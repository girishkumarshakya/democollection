package core.spring.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        SetExample setExample = context.getBean("setExample",SetExample.class);
        System.out.println(setExample);
    }
}
