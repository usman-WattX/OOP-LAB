import java.util.Scanner;

class Publication{
    protected String title;
    protected double price;

    public Publication(){
        title = "";
        price = 0.0;
    }

    public Publication(String tl, double p){
        title = tl;
        price = p;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String tl) {
        title = tl;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double p) {
        price = p;
    }

    public void display(){
        System.out.println("Book Title: " + title + " , Price: " + price);
    }
}

class Book extends Publication{
    private int pgCount;

    public Book(){
        pgCount = 0;
    }

    public Book(String tl, double p, int pgC){
        super(tl, p);
        pgCount = pgC;
    }



    public int getPgCount() {
        return pgCount;
    }

    public void setPgCount(int pgC) {
        pgCount = pgC;
    }

    public void display(){
        super.display();
        System.out.println("Page Count: " + pgCount);
    }
}

class Tape extends Publication{
    private double playTime;

    public Tape(){
        playTime = 0.0;
    }

    public Tape(String tl, double p, double t){
        super(tl, p);
        playTime = t;
    }

    public double getTime() {
        return playTime;
    }

    public void setTime(double t) {
        playTime = t;
    }

    public void display(){
        super.display();
        System.out.println("Playing Time is " + playTime + " minutes.");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = input.nextLine();
        System.out.print("Enter book price: ");
        double price = input.nextDouble();
        System.out.print("Enter page count: ");
        int pages = input.nextInt();

        Book b1 = new Book(title, price, pages);
        b1.display();

        System.out.println();
        System.out.print("Enter tape title: ");
        input.nextLine();
        String tapeTitle = input.nextLine();
        System.out.print("Enter tape price: ");
        double tapePrice = input.nextDouble();
        System.out.print("Enter playing time (minutes): ");
        double time = input.nextDouble();

        Tape t1 = new Tape(tapeTitle, tapePrice, time);
        t1.display();

        input.close();
    }
}
