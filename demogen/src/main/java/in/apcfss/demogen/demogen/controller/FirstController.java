package in.apcfss.demogen.demogen.controller;
//import restcontroller
import org.springframework.web.bind.annotation.RestController;

import in.apcfss.demogen.demogen.repos.EmployeeRepository;

//import requestmapping
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import getmapping
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class FirstController {
    
    @Autowired
    private EmployeeRepository employeeRepository;
  
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/employees")   
    public ResponseEntity<?> getEmployees() {
        return ResponseEntity.ok(employeeRepository.getEmployees());
    }


    @GetMapping("/employees/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable("id") int id) {
        return ResponseEntity.ok(employeeRepository.getEmployees().get(id));
    }

    // public List<Employee> getEmployees() {
    //     return new EmployeeRepository().getEmployees();
    // }

    //list of 30 employees data in json format
    

    // list of 30 employees data in the form of array of objects
// coreect this json array
// 1. add 10 more employees


}
