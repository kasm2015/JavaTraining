package com.arcagile.JavaTraining.training.flowcontrols;

import java.util.HashMap;
import java.util.Map;

public class ForLoopExample {

    public static void main(String[] args) {

        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "Rajesh");
        employees.put(2, "Rahul");
        employees.put(3, "Rohit");
        employees.put(4, "Sanjay");
        employees.put(5, "Srikanth");
        employees.put(6, "Sanjana");
        employees.put(7, "Rohini");
        employees.put(8, "Sridhar");


        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            String name = entry.getValue();
            if( name.startsWith("S") && name.endsWith("a")) {
                System.out.println("The name of employee : " +name);
            }

        }



        Map<String, String> employeesWithDept = new HashMap<>();
        employeesWithDept.put("Rajesh","HR");
        employeesWithDept.put("Rahul","FINANCE");
        employeesWithDept.put("Rohit","IT");
        employeesWithDept.put("Sanjay","HR");
        employeesWithDept.put("Srikanth","FINANCE");
        employeesWithDept.put("Sanjana","IT" );
        employeesWithDept.put( "Rohini","HR");
        employeesWithDept.put("Sridhar","IT");

        ///Find employees who belong HR dept
        for (Map.Entry<String, String> entry : employeesWithDept.entrySet()) {
            //System.out.println("Key Value : " + entry.getKey() + " , Value : " +entry.getValue());
            String deptName = entry.getValue();
            if(deptName.equals("HR")) {
                System.out.println("Employee " +entry.getKey()+ " belongs to dept " +deptName);
            }

            if(deptName.equals("IT")) {
                System.out.println("Employee " +entry.getKey()+ " belongs to dept " +deptName);
            }
        }

        //GIven a employee with its department stored in a map, count the no of employees for each dept,
        /// HR - 5, IT - 5, FINANCE - 5
        Map<String, Integer> deptCounts = new HashMap<>();

        for (Map.Entry<String, String> entry : employeesWithDept.entrySet()) {
            String empName = entry.getKey();
            String deptName = entry.getValue();
            if( deptCounts.containsKey(deptName)) {
                Integer empCount = deptCounts.get(deptName);
                deptCounts.put(deptName,empCount + 1);
            } else {
                deptCounts.put(deptName,1);
            }
        }

        //Printing dept with employees count
        for (Map.Entry<String, Integer> entry : deptCounts.entrySet()) {
            System.out.println("Department : " +entry.getKey() + " having " +entry.getValue() + " employees");
        }
        //Create a employee with Emp name(as key) and Emp Salary as (value) and store 15 records
        //Using for loop find all the employees who is having salary greater than 15



    }
}
