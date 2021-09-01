package engeto;

import java.time.LocalDate;

public class Main {

    public static final String ROW_SEPARATOR = "########################################";

    public static void main(String[] args) {
        SchoolClass schoolClass4C = new SchoolClass("C",4,new Teacher("Jan","Novák"));

        schoolClass4C.setStudentList(new Student("Petr","Svoboda", 2011,"001"));
        schoolClass4C.setStudentList(new Student("Milan","Říha", 2010,"123"));
        schoolClass4C.setStudentList(new Student("Jindřich","Nový", 2012,"345"));

        System.out.println(ROW_SEPARATOR);
        System.out.println(schoolClass4C);

        System.out.println(ROW_SEPARATOR);
        int i = 0;
        for (Student student : schoolClass4C.getStudentList()) {
            i++;
            System.out.println("# " + i + student);
        }
        System.out.println(ROW_SEPARATOR);
        System.out.println(schoolClass4C.print());
        for (Student student : schoolClass4C.getStudentList())
        System.out.println(student.print());

        try{
            schoolClass4C.exportToFile("class-4C.csv");
        }catch (SchoolClassException e){
            e.printStackTrace();
        }




    }
}
