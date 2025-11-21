class Time{
    private int hrs;
    private int min;
    private int sec;

    public Time(){
        hrs = 0;
        min = 0;
        sec = 0;
    }

        public Time(int h, int m, int s){
        if(h >= 0 && h < 24 && m >= 0 && s >= 0){
            if(s >= 60){
                min = m + s / 60;
                sec = s % 60;
            } else{
                min = m;
                sec = s;
            }

            if(min >= 60){
                hrs = h + min / 60;
                min = min % 60;
            } else{
                hrs = h;
            }

            if(hrs >= 24){
                hrs = hrs % 24;
            }

        } else{
            System.out.println("It should not be less than zero or more than 60!");
            hrs = 0;
            min = 0;
            sec = 0;
        }
    }


    public void setH(int h){
        if (h >= 0 && h < 24) {
            hrs = h;
        } else {
            System.out.println("Invalid hours! Must be 0–23.");
        }
    }
    public void setM(int m){
        if (m >= 0 && m < 60) {
            min = m;
        } else {
            System.out.println("Invalid minutes! Must be 0–59.");
        }
    }
    public void setS(int s){
         if (s >= 0 && s < 60) {
            sec = s;
        } else {
            System.out.println("Invalid seconds! Must be 0–59.");
        }
    }


    public int getH(){
        return hrs;
    }
    public int getM(){
        return min;
    }
    public int getS(){
        return sec;
    }
    
    public void display(){
        System.out.println("Current time is " + hrs + ":" + min + ":" + sec);
    }
}

public class Task5 {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.display();

        Time t2 = new Time(18, 65, 61);
        t2.display();


    }
    
}
