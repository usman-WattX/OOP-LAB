class Address{
    private int street;
    private int house;
    private String city;
    private int code;

    public Address(){
        street = 0;
        house = 0;
        city = "";
        code = 0;
    }

    public Address(int s, int h, String ct, int c){
        street = s;
        house = h;
        city = ct;
        code = c;
    }
    
    public int getCode() {
        return code;
    }
    public void setCode(int c) {
        code = c;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String ct) {
        city = ct;
    }
    public int getHouse() {
        return house;
    }
    public void setHouse(int h) {
        house = h;
    }
    public int getStreet() {
        return street;
    }
    public void setStreet(int s) {
        street = s;
    }

    public void display(){
        System.out.println("City: " + city);
        System.out.println("House No. " + house);
        System.out.println("Street No. " + street);
        System.out.println("Code: " + code);
    }
}

class Person{
    private String name;
    private int age;
    private Address ad;

    public Person(){
        name = "";
        age = 0;
        ad = new Address();
    }

    public Person(String n, int a, Address add){
        name = n;
        age = a;
        ad = add;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }

    public Address getAd() {
        return ad;
    }
    public void setAd(Address add) {
        ad = add;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        age = a;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: ");
        ad.display();
    }
}

public class Task1{
    public static void main(String[] args) {
        Address A = new Address(5, 17, "MTN", 32400);
        Person P1 = new Person("Wang", 21, A);
        P1.display();
    }
}