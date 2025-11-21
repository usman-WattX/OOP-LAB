//im not feeing well today!
class Marks{
    private int m1;
    private int m2;
    private int m3;

    public Marks(){
        m1 = 0;
        m2 = 0;
        m3 = 0;
    }

    public Marks(int a, int b, int c){
        if(a <= 25 && a >= 0 && b <= 25 && b >= 0 && c <= 25 && c >= 0){
            m1 = a;
            m2 = b;
            m3 = c;    
        }else{
            System.out.println("Marks Should not be less than Zero or Greater than 25.");
        }
        
    }

    public void display(){
        System.out.println("Marks 1 are " + m1);
        System.out.println("Marks 2 are " + m2);
        System.out.println("Marks 3 are " + m3);
    }
    
    public void setm1(int a){
        if(a <= 25 && a >= 0){
            m1 = a;
        }else{
            System.out.println("Marks Should not be less than Zero or Greater than 25.");
        }
    }
    public void setm2(int b){
        if(b <= 25 && b >= 0){
            m2 = b;
        }else{
            System.out.println("Marks Should not be less than Zero or Greater than 25.");
        }
    }
    public void setm3(int c){
        if(c <= 25 && c >= 0){
            m3 = c;
        }else{
            System.out.println("Marks Should not be less than Zero or Greater than 25.");
        }
    }

    public int getm1(){
        return m1;
    }
    public int getm2(){
        return m2;
    }
    public int getm3(){
        return m3;
    }
}

public class Task1{
    public static void main(String[] args) {
        Marks c1 = new Marks();
        c1.display();
        System.out.println();
        Marks c2 = new Marks(23, 21, 24);
        c2.display();
        System.out.println();
        Marks c3 = new Marks(23, -21, 24);
        c3.display();
    }
}