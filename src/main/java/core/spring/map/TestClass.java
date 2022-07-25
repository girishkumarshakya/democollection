package core.spring.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        MapExample example = context.getBean("mapExample",MapExample.class);
        System.out.println(example);
    }
}
