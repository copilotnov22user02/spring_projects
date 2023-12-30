package in.apcfss.demogen.demogen.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.apcfss.demogen.demogen.repos.Employee;

@RestController
@RequestMapping("/api/json")
public class EmployeeController {

    // write getmapping for reading all employees data from emplyees.json file
    // create method to read data from json file
    // create method to read data from json file by id
    // create method to add employee to json file

    // implement this method to read data from json file
    @GetMapping("/employees-hello")
    public ResponseEntity<?> getEmployees() {

        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/employees")
    public ResponseEntity<?> getAllEmployees() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Employee>> typeReference = new TypeReference<List<Employee>>() {
        };
        System.out.println("TypeReference: " + typeReference);

List<Employee> employees = null;
          // Replace with your absolute path
          File jsonFile = new File("C:\\gen_ai_spring\\spring_second\\demogen\\src\\main\\resources\\json\\employees.json");
          try {
              employees = mapper.readValue(jsonFile, typeReference);
                
          } catch (IOException e){
              System.out.println("Unable to read employees: " + e.getMessage());
          }

        // InputStream inputStream = TypeReference.class.getResourceAsStream("/json/emplyees.json");
        // if (inputStream == null) {
        //     System.out.println("Could not find file /json/emplyees.json");
        //     return null;
        // }
        // try {
        //     List<Employee> employees = mapper.readValue(inputStream, typeReference);
        //     return employees;
        // } catch (IOException e) {
        //     System.out.println("Unable to read employees: " + e.getMessage());
        // }

        // InputStream inputStream = TypeReference.class.getResourceAsStream("/json/emplyees.json");
        // try {
        //     List<Employee> employees = mapper.readValue(inputStream, typeReference);
        //     return employees;
        // } catch (IOException e) {
        //     System.out.println("Unable to read employees: " + e.getMessage());
        // }

        //return list of employees is json format in responseentity
            


        //return ResponseEntity.ok(employees);
        //return new ResponseEntity<List<JSONObject>>(employees, HttpStatus.OK);
        return ResponseEntity.ok(employees);
    }

    // @Autowired
    // private EmployeeService employeeService;

    // @RequestMapping("/employees")
    // public List<Employee> getAllEmployees(){
    // return employeeService.getAllEmployees();
    // }

    // @RequestMapping("/employees/{id}")
    // public Employee getEmployee(@PathVariable String id){
    // return employeeService.getEmployee(id);
    // }

    // @RequestMapping(method=RequestMethod.POST, value="/employees")
    // public void addEmployee(@RequestBody Employee employee){
    // employeeService.addEmployee(employee);
    // }

    // @RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
    // public void updateEmployee(@RequestBody Employee employee, @PathVariable
    // String id){
    // employeeService.updateEmployee(id, employee);
    // }

    // @RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
    // public void deleteEmployee(@PathVariable String id){
    // employeeService.deleteEmployee(id);
    // }

}
