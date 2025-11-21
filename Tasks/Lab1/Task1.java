import java.util.Scanner;

class student{
    String name;
    String program;
    String regNum;
    String semester;
    String fatherName;

    public void bioData(){
        System.out.println("Name = " + name);
        System.out.println("Father Name = " + name);
        System.out.println("Registration Number= " + regNum);
        System.out.println("Program = " + program);
        System.out.println("Semester = " + semester);
    }

}
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        student s1 = new student();
        System.out.print("Enter Student Name = ");
        s1.name = in.next();
        System.out.print("Enter Father Name = ");
        s1.fatherName = in.next();
        System.out.print("Enter Registration Number = ");
        s1.regNum = in.next();
        System.out.print("Enter Program = ");
        s1.program = in.next();
        System.out.print("Enter Semester = ");
        s1.semester = in.next();
        s1.bioData();
        in.close();
    }
}
