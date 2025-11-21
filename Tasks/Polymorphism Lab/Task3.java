abstract class Converter{
    protected double val1;
    protected double val2;

    public Converter() {
    }

    public Converter(double val1) {
        this.val1 = val1;
    }

    public double getVal1() {
        return val1;
    }

    public void setVal1(double val1) {
        this.val1 = val1;
    }

    abstract public double compute();
}

class L_to_G extends Converter{

    public L_to_G(double val1) {
       super(val1);
    }

    public double compute(){
        double val2 = val1 / 3.785 ;
        return val2;
    }
}

class F_to_C  extends Converter{

    public F_to_C(double val1) {
       super(val1);
    }

    public double compute(){
        double val2 = ((val1 - 32.0) * (5.0/9.0));
        return val2;
    }
}

class Ft_to_Mt  extends Converter{

    public Ft_to_Mt(double val1) {
       super(val1);
    }

    public double compute(){
        double val2 = val1 / 3.281;
        return val2;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Converter[] conversions = new Converter[3];

        conversions[0] = new L_to_G(25.5);
        conversions[1] = new F_to_C(25.5);
        conversions[2] = new Ft_to_Mt(25.5);

        for(int i = 0; i < conversions.length; i++){
            if (conversions[i] instanceof L_to_G) {
                System.out.println("L to G is " + conversions[i].compute());
            }else if(conversions[i] instanceof F_to_C){
                System.out.println("F to C is " + conversions[i].compute());
            }else if(conversions[i] instanceof Ft_to_Mt){
                System.out.println("Ft to Mt is " + conversions[i].compute());
            }
        }
    }
    
}
