package com.entity;

public class Employee {

    private int empid;
    private String ename;
    private String erole;
    private int salary;

    public Employee(int empid, String ename, String erole, int salary) {
        this.empid = empid;
        this.ename = ename;
        this.erole = erole;
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEname() {
        return ename;
    }

    public String getErole() {
        return erole;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", ename=" + ename + ", erole=" + erole + ", salary=" + salary + "]";
    }
}
