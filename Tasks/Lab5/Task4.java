class Pizza{
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    public Pizza(){
        size = "";
        cheese = 0;
        pepperoni = 0;
        ham = 0;
    }

    public Pizza(String s, int c, int p, int h){
        size = s;
        cheese = c;
        pepperoni = p;
        ham = h;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String s) {
        size = s;
    }

    public int getCheese() {
        return cheese;
    }
    public void setCheese(int c) {
        cheese = c;
    }

    public int getPepperoni() {
        return pepperoni;
    }
    public void setPepperoni(int p) {
        pepperoni = p;
    }

    public int getHam() {
        return ham;
    }
    public void setHam(int h) {
        ham = h;
    }

    public double calCost(){
        double cost = 0;
        if (size.equalsIgnoreCase("Small")) {
             cost = 10;
            for(int i = 0; i < (cheese + pepperoni + ham); i++){
                cost += 2;  
            }
        }else if (size.equalsIgnoreCase("Medium")) {
             cost = 12;
            for(int i = 0; i < (cheese + pepperoni + ham); i++){
                cost += 2;  
            }
        }else if (size.equalsIgnoreCase("Large")) {
             cost = 14;
            for(int i = 0; i < (cheese + pepperoni + ham); i++){
                cost += 2;  
            }
        }
        return cost;
    }

    public String getDescription(){
        String description = "You ordered a " + size +" Pizza with " + cheese + " Chesse, " + pepperoni +  " Pepperoni and " + ham +" Ham";
        return description;
    }
}

class PizzaOrder{
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;

    public PizzaOrder(){
        pizza1 = new Pizza();
        pizza2 = new Pizza();
        pizza3 = new Pizza();
    }

    public PizzaOrder(Pizza p1, Pizza p2){
        pizza1 = p1;
        pizza2 = p2;
    }

    public PizzaOrder(Pizza p1, Pizza p2, Pizza p3){
        pizza1 = p1;
        pizza2 = p2;
        pizza3 = p3;
    }

    public Pizza getPizza1() {
        return pizza1;
    }
    public void setPizza1(Pizza p1) {
        pizza1 = p1;
    }

    public Pizza getPizza2() {
        return pizza2;
    }
    public void setPizza2(Pizza p2) {
        pizza2 = p2;
    }

    public Pizza getPizza3() {
        return pizza3;
    }
    public void setPizza3(Pizza p3) {
        pizza3 = p3;
    }

    public double calCost(){
        double tcost = 0;
        if (pizza1 != null) {
            tcost += pizza1.calCost();
        }
        if (pizza2 != null) {
            tcost += pizza2.calCost();
        }
        if (pizza3 != null) {
            tcost += pizza3.calCost();
        }
        return tcost;
    }
}

public class Task4 {
    public static void main(String[] args) {
        
        Pizza p1 = new Pizza("Large", 1, 1, 2);
        Pizza p2 = new Pizza("Medium", 3, 0, 4);
        System.out.println("Bill: " + p1.calCost());
        System.out.println("Description: " + p1.getDescription());
        System.out.println("Bill: " + p2.calCost());
        System.out.println("Description: " + p2.getDescription());

        System.out.println();
        PizzaOrder o1 = new PizzaOrder(p1, p2);
        System.out.println("Total Bill is: " + o1.calCost());
    }
}
