import java.util.Arrays;

class Student{
    private String name;
    private int[] marks;
    
    
    public Student(){
        name = "";
    }

    public Student(String n, int[] m){
        name = n;
        marks = m;
    }

    public double avg(){
        double sum = 0;
        for (int i = 0; i < 5; i++){
            sum += marks[i];
        }
        return sum / 5;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public int[] getMarks(){
        return marks;
    }



}

public class Task3 {
    public static void main(String[] args) {
        Student s1 = new Student("TRASH", new int[]{21,20,18,22,24});
        Student s2 = new Student("DD", new int[]{15,20,18,21,16});
        
        if(s1.avg() > s2.avg()){
            System.out.println("S1 has Higher average which is " + s1.avg() + " while S2 has " + s2.avg());
        }else{
            System.out.println("S2 has Higher average which is " + s2.avg() + " while S1 has " + s1.avg());
        }

        Student s3 = new Student(s1.getName(), s2.getMarks());
        System.out.println("S3, his name is " + s3.getName() + " and his marks are " + Arrays.toString(s3.getMarks()));
    }
}
