package in.apcfss.demogen.demogen.repos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor 
public class Employee {
    private int id;
    private String name;
    private String department;
    private int salary;

}
