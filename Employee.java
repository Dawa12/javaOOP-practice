package com.company;

public class Employee {
    private String officeHours;
    private int salary;
    private Date dateHired;

    public Employee(String officeHours, int salary, Date dateHired) {
        this.officeHours = officeHours;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "officeHours='" + officeHours + '\'' +
                ", salary=" + salary +
                ", dateHired=" + dateHired +
                '}';
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
}
