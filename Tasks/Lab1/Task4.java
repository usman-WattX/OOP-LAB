class rectangle{
    double length;
    double width;
    double Area;

    public void Dis(){
        System.out.println("The Length is " + length);
        System.out.println("The width is " + length);
        System.out.println("The Area is " + length);
    }
}





public class Task4 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.length = 5.8;
        r1.width = 12.3;
        r1.Area = 71.34;
        r1.Dis();
    }
    
}
