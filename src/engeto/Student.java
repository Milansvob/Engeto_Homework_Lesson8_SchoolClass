package engeto;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String surName;
    private final Integer birthYear;
    private final String studentId;
    private int count;

    public Student(String firstName, String surName, Integer birthYear, String studentId) {
        this.firstName = firstName;
        this.surName = surName;
        this.birthYear = birthYear;
        this.studentId = studentId;
    }

    public int setCount(int count) {
       return count+=2;
    }

    public String print(){
        return "ID" + studentId + ", " + firstName + " " + surName;
    }

    @Override
    public String toString() {
        return "# " + setCount(1) + " # " + "ID" + studentId + " - " + firstName + " " + surName + " (" + birthYear + ")";
    }
}
