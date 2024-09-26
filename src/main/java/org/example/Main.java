package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //get the employee controller from the context
        EmployeeController controller = context.getBean(EmployeeController.class);
        //add some employees
        controller.addEmployee(new Employee(101,"john sena","engineering"));
        controller.addEmployee(new Employee(102,"Smith","marketing"));
        controller.addEmployee(new Employee(103,"ankith reddy","computer science"));
        //get employee details by ID
        controller.getEmployeeDetails(101);
        controller.getEmployeeDetails(103);
        //update an employee
        controller.updateEmployee(new Employee(101,"john doe","Research"));
        //delete an employee
        controller.deleteEmployee(102);
        //list all employees
        controller.listAllEmployees();

    }
}