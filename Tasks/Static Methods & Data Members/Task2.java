class TwoDigitCalculator{

    public static int add(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
    public static int sub(int n1, int n2){
        int sum = n1 - n2;
        return sum;
    }
    public static int mult(int n1, int n2){
        int sum = n1 * n2;
        return sum;
    }
    public static int div(int n1, int n2){
        int sum = 0;
        if(n2 != 0 ){
            sum = n1 / n2;
            return sum;
        }else{
            return sum;
        }
        
    }
}

public class Task2 {
    public static void main(String[] args) {
        System.out.println(TwoDigitCalculator.add(1,2));
        System.out.println(TwoDigitCalculator.sub(1,2));
        System.out.println(TwoDigitCalculator.mult(1,2));
        System.out.println(TwoDigitCalculator.add(1,2));
    }
}
