package com.company;

public class Faculty extends Employee {
    private String rank;

    public Faculty(String officeHours, int salary, Date dateHired, String rank) {
        super( officeHours, salary, dateHired );
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "rank='" + rank + '\'' +
                '}';
    }
}
