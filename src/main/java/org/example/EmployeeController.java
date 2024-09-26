package org.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    //add new employee
    public void addEmployee(Employee employee){
        employeeService.addEmployee(employee);
    }
    //get employee details by ID
    public void getEmployeeDetails(int id){
        Employee employee = employeeService.getEmployee(id);
        if(employee!=null){
            System.out.println(employee);
        }else{
            System.out.println("employee with ID "+id+"not found");
        }
    }
    //update employee details
    public void updateEmployee(Employee employee){
        employeeService.updateEmployee(employee);
    }
    //delete an employee by ID
    public void deleteEmployee(int id){
        employeeService.deleteEmployee(id);
    }
    //list all employees
    public void listAllEmployees(){
        System.out.println("All employees: "+employeeService.getAllEmployees());
    }
}
