import java.util.Scanner;

class car{
    String make;
    String model;
    String variant;
    String torque;
    String horsepower;

    public void set(String a, String b, String c, String d, String e){
        make = a;
        model = b;
        variant = c;
        torque = d;
        variant = e;
    }

    public void display(){
        System.out.print("This Car was made by " + make + " in year " + model + " and its variant is " + variant + " and its torque & HP is " + torque + ", " + horsepower + " respectively!" );
    }

}





public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        car c1 = new car();
        System.out.print("Enter Make:");
        String a = in.next();
        System.out.print("Enter Model:");
        String b = in.next();
        System.out.print("Enter Variant:");
        String c = in.next();
        System.out.print("Enter torque:");
        String d = in.next();
        System.out.print("Enter horsepower:");
        String e = in.next();
        c1.set(a, b, c, d, e);
        c1.display();
        in.close();
    }
    
}
