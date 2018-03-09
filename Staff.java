package com.company;

public class Staff extends Employee {
    private String title;

    public Staff(String officeHours, int salary, Date dateHired, String title) {
        super( officeHours, salary, dateHired );
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "title='" + title + '\'' +
                '}';
    }
}
