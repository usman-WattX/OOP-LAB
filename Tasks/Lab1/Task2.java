class time{
    int hrs;
    int min;
    int sec;

    public void display(){
        System.out.println("At Preset the time is " + hrs + ":" + min + ":" + sec);
    }
}



public class Task2 {
    public static void main(String[] args) {
        time c1 = new time();
        c1.hrs = 03;
        c1.min = 35;
        c1.sec = 58;
        c1.display();
    }
    
}
