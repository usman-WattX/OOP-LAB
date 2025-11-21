class Pointer{
    private int xcord;
    private int ycord;

    public Pointer(){
        xcord = 0;
        ycord = 0;
    }

    public Pointer(int x, int y){
        xcord = x;
        ycord = y;
    }

    public int getXcord() {
        return xcord;
    }
    public int getYcord() {
        return ycord;
    }
    public void setYcord(int y) {
        ycord = y;
    }
    public void setXcord(int x) {
        xcord = x;
    }

    public void display(){
        System.out.println("X-Cord is " + xcord);
        System.out.println("Y-Cord is " + ycord);
    }
}

class Line{
    private Pointer startPoint;
    private Pointer endPoint;

    public Line(){
        startPoint = new Pointer();
        endPoint = new Pointer();
    }
    public Line(Pointer sp, Pointer ep){
        startPoint = sp;
        endPoint = ep;
    }

    public Pointer getStartPoint() {
        return startPoint;
    }
    public Pointer getEndPoint() {
        return endPoint;
    }
    public void setEndPoint(Pointer ep) {
        endPoint = ep;
    }
    public void setStartPoint(Pointer sp) {
        startPoint = sp;
    }

    public double findLength(){
        return Math.sqrt((Math.pow((endPoint.getXcord() - startPoint.getXcord()), 2) + Math.pow((endPoint.getYcord() - startPoint.getYcord()), 2)));
    }

    public void display(){
        System.out.println("The Starting Point of the line is ");
        startPoint.display();
        System.out.println("The Ending Point of the line is ");
        endPoint.display();
    }
}

public class Task3 {
    public static void main(String[] args) {

        Pointer P1 = new Pointer(2, 3);
        Pointer P2 = new Pointer(3, 2);
        Line l1 = new Line(P1, P2);
        System.out.println("The length of the line 1 is " + l1.findLength());

        System.out.println();
        Pointer P3 = new Pointer(7, 15);
        Pointer P4 = new Pointer(9, 3);
        Line l2 = new Line(P3, P4);
        System.out.println("The length of the line 2 is " + l2.findLength());
    }
}
