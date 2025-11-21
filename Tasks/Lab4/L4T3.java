class Fraction{
    private int nume;
    private int denome;

    public Fraction(){
        nume = 0;
        denome = 0;
    }
    public Fraction(int a, int b){
        if (b == 0){
            System.out.println("Denominator Can't be Zero!");
        }else {
            nume = a;
            denome = b;
        }
    }

    public void setNume(int a) {
        nume = a;
    }
    public int getNume() {
        return nume;
    }

    public void setDenome(int b) {
        if (b == 0){
            System.out.println("Denominator Can't be Zero!");
        }else {
            denome = b;
        }
    }
    public int getDenome() {
        return denome;
    }

    public boolean equals(Fraction f){
        if (this.nume * f.denome == f.nume * this.denome){
            return true;
        }else {
            return false;
        }
    }

    public void display(){
        double ratio = (double) nume / denome;
        System.out.println(nume + "/" + denome + " = " + ratio);
    }

}

public class L4T3 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,8);
        Fraction f2 = new Fraction(1,4);

        f1.display();
        f2.display();

        if (f1.equals(f2)){
            System.out.println("Fractions are Equal!");
        }else {
            System.out.println("Fractions are not Equal!");
        }

        System.out.println();

        Fraction f3 = new Fraction(6,18);
        Fraction f4 = new Fraction(2,4);

        f3.display();
        f4.display();

        if (f3.equals(f4)){
            System.out.println("Fractions are Equal!");
        }else {
            System.out.println("Fractions are not Equal!");
        }
    }
}
