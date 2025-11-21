class distance{
    private int inches;
    private int feet;
    
    public distance(){
        inches = 0;
        feet = 0;
    }

    public distance(int i, int f){
        if(i >= 12){
            feet = f + (i / 12);
            inches = i % 12; 
        }else{
            feet = f;
            inches = i;
        }
    }

    public void setInch(int i){
         if(i >= 12) {
            feet += (i / 12);
            inches = i % 12;
        } else {
            inches = i;
        }
    }

    public void setFeet(int f){
        feet = f;
    }

    public int getInch(){
        return inches;
    }

    public int getFeet(){
        return feet;
    }

    public void display(){
        System.out.println("The Distance is " + feet + " feet and " + inches + " inches");
    }
    
}


public class Task3 {
    public static void main(String[] args) {
        distance d1 = new distance();
        d1.display();

        distance d2 = new distance(30, 4);
        d2.display();
    }
    
}
