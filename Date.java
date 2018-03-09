package com.company;

//Create a Date class defined to create an object for date hired for Employee class

public class Date {
    private int year;
    private int month;
    private int date;

    //    Create a Date class defined to create an object for date hired
    public Date(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                '}';
    }
}
