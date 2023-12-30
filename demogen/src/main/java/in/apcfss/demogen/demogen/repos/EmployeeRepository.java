package in.apcfss.demogen.demogen.repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    //add five employess to the list
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Raj", "IT", 10000));
        employees.add(new Employee(2, "Ravi", "IT", 20000));
        employees.add(new Employee(3, "Ram", "IT", 30000));
        employees.add(new Employee(4, "Raju", "IT", 40000));
        employees.add(new Employee(5, "Rakesh", "IT", 50000));
        return employees;
    }


}
