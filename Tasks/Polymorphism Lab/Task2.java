abstract class Person{
    protected String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public boolean isOutstanding();


    public String toString() {
        return "Person [name=" + name + "]";
    }
}

class Student extends Person{
    private double CGPA;

    public Student() {
        super();
        CGPA = 0.0;
    }

    public Student(String name, double cGPA) {
        super(name);
        CGPA = cGPA;
    }
    public boolean isOutstanding(){
        if(CGPA >= 3.5){
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        return (super.toString() + "Student [CGPA=" + CGPA + "]");
    }

}

class Professor extends Person{
    private int numOfPub;

    public int getNumOfPub() {
        return numOfPub;
    }

    public void setNumOfPub(int numOfPub) {
        this.numOfPub = numOfPub;
    }

    public Professor() {
        super();
        numOfPub = 0;
    }

    public Professor(String name, int numOfPub) {
        super(name);
        this.numOfPub = numOfPub;
    }

    public boolean isOutstanding(){
        if(numOfPub > 50){
            return true;
        }else{
            return false;
        }
    }

    public String toString() {
        return (super.toString() + "Professor [numOfPub=" + numOfPub + "]");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Person[] persons = new Person[2];

        persons[0] = new Student("DD",2.00);
        persons[1] = new Professor("JJ", 800);

        for(int i = 0; i < persons.length; i++){
            System.out.println(persons[0]);
        }

        if(persons[0].isOutstanding()){
            System.out.println("This Student is Outstanding!");
        }else{
            System.out.println("SHAHHHAHHAHA");
        }

        if(persons[1].isOutstanding()){
            System.out.println("This Professor is Outstanding!");
        }else{
            System.out.println("PHAHHHAHHAHA");
        }
    }
    
}
