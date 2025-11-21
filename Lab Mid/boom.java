public class boom{
    public static void main(String[] args){
        m(new GoldenDelicious());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}
public class GoldenDelicious extends Apple{

}

public class Apple extends Fruit{
    public String toString(){
        return "Apple";
    }
}

public class Fruit extends Object(){
    public String toString(){
        return "Fruit";
    }
}
