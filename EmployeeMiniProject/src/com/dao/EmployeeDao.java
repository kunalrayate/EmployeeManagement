package com.dao;

import com.entity.Employee;

public class EmployeeDao {

    private Employee[] employees;
    private int size;

    public EmployeeDao(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee e) {
        if (size < employees.length) {
            employees[size++] = e;
        }
    }

    public Employee showEmployeeById(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmpid() == id) {
                return employees[i];
            }
        }
        return null;
    }

    public void showAllEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee getEmployeeWithMaxSalary() {
        if (size == 0) return null;
        Employee max = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() > max.getSalary()) {
                max = employees[i];
            }
        }
        return max;
    }

    public Employee getEmployeeWithMinSalary() {
        if (size == 0) return null;
        Employee min = employees[0];
        for (int i = 1; i < size; i++) {
            if (employees[i].getSalary() < min.getSalary()) {
                min = employees[i];
            }
        }
        return min;
    }

    public void showEmployeesByRole(String role) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getErole().equalsIgnoreCase(role)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void sortEmployeesAsc() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (employees[i].getEmpid() > employees[j].getEmpid()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        showAllEmployees();
    }

    public void sortEmployeesDesc() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (employees[i].getEmpid() < employees[j].getEmpid()) {
                    Employee temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
        showAllEmployees();
    }
}
