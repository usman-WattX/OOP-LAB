class Distance{
    private int inches;
    private int feet;

    public Distance(){
        inches = 0;
        feet = 0;
    }
    public Distance(int i, int f){
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
    public void setFeet(int f) {
        feet = f;
    }

    public int getInches() {
        return inches;
    }
    public int getFeet() {
        return feet;
    }

    public Distance add(Distance newD){
        Distance temp = new Distance();
        temp.inches = this.inches + newD.inches;
        temp.feet = this.feet + newD.feet;

        if (temp.inches >= 12) {
            temp.feet += temp.inches / 12;
            temp.inches = temp.inches % 12;
        }

        return temp;
    }

    public void display(){
        System.out.println("Distance is " + feet + "ft" + " and " + inches + "in");
    }

}

public class L4T1   {
    public static void main(String[] args) {
        Distance d1 = new Distance(7,9);
        Distance d2 = new Distance(6,23);
        Distance d3 = new Distance();
        d3 = d1.add(d2);
        d3.display();
    }
}
