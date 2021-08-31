package engeto;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    public static final String DELIMITER = "\t";

    private String classname;
    private Integer year;
    private Teacher teacher;
    private List<Student> studentList = new ArrayList<>();

    public SchoolClass(String classname, Integer year, Teacher teacher) {
        this.classname = classname;
        this.year = year;
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Student student) {
        studentList.add(student);
    }

    public String print(){
        return year + "." + classname + ", " + teacher.getFirstName() + " " + teacher.getSurName();
    }

    @Override
    public String toString() {
        return "Třída: " + year + "." + classname + " (ročník: " + year + ")" +
                "\n" + "Třídní učitel: " + teacher.getFirstName() + " " + teacher.getSurName() +
                "\n" + "Počet studentů " + studentList.size();
    }

    public void exportToFile(String filename) throws SchoolClassException {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(filename))){
            writer.println(SchoolClass.this);
            for (Student student : studentList){
                writer.println(student);
            }
        }catch (FileNotFoundException e){
            throw new SchoolClassException("File" + filename + " was not found" + e.getLocalizedMessage());
        }
    }


}
