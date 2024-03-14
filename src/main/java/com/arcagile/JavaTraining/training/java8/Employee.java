package com.arcagile.JavaTraining.training.java8;

public class Employee {

    private Integer id;
    private String name;
    private Integer age;
    private String address;
    private String department;

    private Long salary;

    public Employee(Integer id, String name, Integer age, String address, String department, Long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.department = department;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
