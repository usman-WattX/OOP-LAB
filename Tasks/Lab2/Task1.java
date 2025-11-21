class radius{
    double radius;

    public radius(){
        radius = 0.0;
    }

    public radius(double r){
        if(r > 0){
            radius = r;
        }else{
            System.out.println("Radius should not be less than zero!");
        }
    }

    public double calcircum(){
        return 2 * Math.PI * radius;
    }

    public void set(double r){
        if(r > 0){
            radius = r;
        }else{
            System.out.println("Radius should not be less than zero!");
        }
    }

    public double get(){
        return radius;
}
}


public class Task1{
    public static void main(String[] args) {
        radius r1 = new radius();
        System.out.println("Default Circumference is " + r1.calcircum());

        radius r2 = new radius(7.5);
        System.out.println("Calculated Circumference is " + r2.calcircum());
    }
}