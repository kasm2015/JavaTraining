package training.inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Department {

    String departmentName;
    String departmentCode;

    public List<String> getEmployee() {

        System.out.println("i am inside getEmployee method of Department class");
        List<String> employees = new ArrayList<>();
        employees.add("emp1");
        employees.add("emp2");
        employees.add("emp3");
        employees.add("emp4");
        return employees;
    }


}
