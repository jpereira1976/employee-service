package uy.edu.um.employeeservice;

public class Employee {
    private String ssn;
    private String name;
    private int age;

    public Employee(String ssn, String name, int age) {
        this.ssn = ssn;
        this.name = name;
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
