class HotDogsStand{
private int Id;
private int sold;

public HotDogsStand(){
    Id = 0;
    sold = 0;
}
public HotDogsStand(int i, int s){
    Id = i;
    sold = s;
}

public int incre(){
    return sold++;
}

public void setId(int i){
    Id = i;
}
public void setSold(int s){
    sold = s;
}

public int getId(){
    return Id;
}
public int getSold(){
    return sold;
}

}

public class Task4 {
    public static void main(String[] args) {
        HotDogsStand h1 = new HotDogsStand(1, 36);
        h1.incre();
        System.out.println("H1, ID: " + h1.getId() + " has sold " + h1.getSold());
        HotDogsStand h2 = new HotDogsStand(2,28);
        h2.incre();
        System.out.println("H2, ID: " + h2.getId() + " has sold " + h2.getSold());
        HotDogsStand h3 = new HotDogsStand(3, 12);
        h3.incre();
        System.out.println("H3, ID: " + h3.getId() + " has sold " + h3.getSold());


    }
    
}
