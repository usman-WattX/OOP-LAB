class Computer{
    protected int word;
    protected double memory;
    protected double storage;
    protected double speed;

    public Computer(){
        word = 0;
        memory = 0.0;
        storage = 0.0;
        speed = 0.0;
    }

    public Computer(int wrd, double mry, double strg, double spd){
        word = wrd;
        memory = mry;
        storage = strg;
        speed = spd;
    }

    public int getWord() {
        return word;
    }
    public void setWord(int wrd) {
        word = wrd;
    }
    public double getMemory() {
        return memory;
    }
    public void setMemory(double mry) {
        memory = mry;
    }
    public double getStorage() {
        return storage;
    }
    public void setStorage(double strg) {
        storage = strg;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double spd) {
        speed = spd;
    }

    public void display(){
        System.out.println("The Computer has  word size " + word + "Bits, Memory size " + memory + "MB, Storage size " + storage + "MB, Speed " + speed + "MHz");
    }
}

class Laptop extends Computer{
    private double length;
    private double width;
    private double height;
    private double weight;

    public Laptop(){
        length = 0.0;
        width = 0.0;
        height = 0.0;
        weight = 0.0;
    }

    public Laptop(int wrd, double mry, double strg, double spd, double len, double wdth, double hgt, double wght){
        super(wrd, mry, strg, spd);
        length =  len;
        width = wdth;
        height = hgt;
        weight = wdth;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double len) {
        length = len;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double wdth) {
        width = wdth;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double hgt) {
        height = hgt;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double wght) {
        weight = wght;
    }
    public void display(){
        super.display();
        System.out.println("Dimensions are,");
        System.out.println("length:" + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Computer,");
        Computer c1 = new Computer(2,2.0,2.0,2.0);
        c1.display();
        System.out.println();
        System.out.println("Laptop,");
        Laptop l1 = new Laptop(2,2.0,2.0,2.0,2.0,2.0,2.0,2.0);
        l1.display();
    }
    
}
