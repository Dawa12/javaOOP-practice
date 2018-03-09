package com.company;

public class Main {
    public static void main(String[] args) {
        Person bob = new Person("Bob", "1600 Pennsylvania Ave", 8002227777L, "email@gmail.com");
        Student sally = new Student("Sophomore");
        Employee billy = new Employee( "3pm-5pm", 30000, new Date( 2017, 10, 20 ));
        Faculty max = new Faculty( "3pm - 7pm", 50000, new Date(2000, 10, 10), "Senior");
        Staff samantha = new Staff( "3pm-8pm", 90000, new Date(2000, 01, 12), "VP");

        System.out.println(bob.toString());
        System.out.println(sally.toString());
        System.out.println(billy.toString());
        System.out.println(max.toString());
        System.out.println(samantha.toString());

        System.out.println(billy.getDateHired());
    }
}
