class Marks{
    private int subject1;
    private int subject2;
    private int subject3;



    public Marks(){
        subject1 = 0;
        subject2 = 0;
        subject3 = 0;
    }

    public Marks(int s1, int s2, int s3){
        if(s1 >= 0 && s1 <= 25 && s2 >= 0 && s2 <= 25 && s3 >= 0 && s3 <= 25){
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        }else{
        System.out.println("Marks Should not be less than Zero or Greater than 25");
        }
    }

    public void sets1(int s1){
        subject1 = s1;
    }
    public void sets2(int s2){
        subject2 = s2;
    }
    public void sets3(int s3){
        subject3 = s3;
    }

    public int gets1(){
        return subject1;
    }
    public int gets2(){
        return subject2;
    }
    public int gets3(){
        return subject3;
    }



    public int sum(){
        return subject1 + subject2 + subject3;
    }

    public void display(){
        System.out.println("Total Marks are " + sum());
    }

}




public class Task4 {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.display();

        Marks m2 = new Marks(24, 23, 21);
        m2.display();

        
    }
    
}
