class TwoDigitCalculator{

    private static int n1 = 0;
    private static int n2 = 0;

    public static void setn1(int num1){
        n1 = num1;
    }

    public static void setn2(int num2){
        n2 = num2;
    }
   


    public static int add(){
        int sum = n1 + n2;
        return sum;
    }
    public static int sub(){
        int sum = n1 - n2;
        return sum;
    }
    public static int mult(){
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
        TwoDigitCalculator.setn1(2);
        TwoDigitCalculator.setn2(4);
        System.out.println(TwoDigitCalculator.add());
        System.out.println(TwoDigitCalculator.sub());
        System.out.println(TwoDigitCalculator.mult());
        System.out.println(TwoDigitCalculator.add());
    }
}
