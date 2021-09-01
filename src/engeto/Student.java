package engeto;

import java.time.LocalDate;

public class Student extends Teacher {

    private final Integer birthYear;
    private final String studentId;

    public Student(String firstName, String surName, Integer birthYear, String studentId) {
        super(firstName, surName);
        this.birthYear = birthYear;
        this.studentId = studentId;
    }

    public String print(){
        return "ID" + studentId + ", " + firstName + " " + surName;
    }

    @Override
    public String toString() {
        return " # " + "ID" + studentId + " - " + firstName + " " + surName + " (" + birthYear + ")";
    }
}
