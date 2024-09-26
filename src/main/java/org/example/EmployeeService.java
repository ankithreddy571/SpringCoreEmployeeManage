package org.example;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    private Map<Integer, Employee>employeeMap = new HashMap<>();
    public void addEmployee(Employee employee){
        employeeMap.put(employee.getId(), employee);
        System.out.println("Employee added:"+employee);
    }
    // get an employee ID
    public Employee getEmployee(int id){
        return employeeMap.get(id);
    }
    //update an employee
    public void updateEmployee(Employee employee){
        employeeMap.put(employee.getId(),employee);
        System.out.println("employee updated: "+employee);
    }
    //delete an employee
    public void deleteEmployee(int id){
        Employee removedEmployee = employeeMap.remove(id);
        if (removedEmployee!=null){
            System.out.println("employee deleted : "+ removedEmployee);
        }else {
            System.out.println("Employee with ID "+id+"not found");
        }
    }
    //get all employees
    public Map<Integer,Employee>
    getAllEmployees(){
        return employeeMap;
    }
}
