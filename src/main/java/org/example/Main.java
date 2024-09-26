package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp1=(Employee) context.getBean("employee1");
        Employee emp2=(Employee) context.getBean("employee2");
        Employee emp3=(Employee) context.getBean("employee3");
        Employee emp4=(Employee) context.getBean("employee4");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
    }
}