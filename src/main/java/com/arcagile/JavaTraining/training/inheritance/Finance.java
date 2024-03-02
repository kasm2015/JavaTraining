package training.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Finance extends Department {

    public static void main(String[] args) {
        Department department  = new Department();
        department.departmentCode = "DEPARMENT_CODE";
        department.departmentName = "DEPARTMENT";

        List<String> departments =  department.getEmployee();

        System.out.println("Department list : " + departments);

        Finance finance = new Finance();
        List<String> financeEmployees =  finance.getEmployee();
        System.out.println("Finance list : " + financeEmployees);

        Department department1 = new Finance();
        department1.departmentName = "FINANCE";
        department1.departmentCode = "FINANCE_CODE";
        System.out.println("Department Name " +department1.departmentName);
        System.out.println("Department Code " +department1.departmentName);
        System.out.println("Calling getEmployee method - " +department1.getEmployee());
    }

    @Override
    public List<String> getEmployee() {
        System.out.println("i am inside getEmployee method of Finance class");
        List<String> employees = new ArrayList<>();
        employees.add("emp3");
        employees.add("emp4");
        employees.add("emp5");
        employees.add("emp6");
        return employees;

    }

}
