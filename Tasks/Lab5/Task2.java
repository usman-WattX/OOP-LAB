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

class Book{
    private String name;
    private String publisher;
    private Person author;

    public Book(){
        name = "";
        publisher = "";
        author = new Person();
    }

    public Book(String n, String pb, Person ath){
        name = n;
        publisher = pb;
        author = ath;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String pb) {
        publisher = pb;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person ath) {
        author = ath;
    }

    public void display(){
        System.out.println("The author of the book name " + name + " by publisher " + publisher + " is ");
        author.display();
    }
}

public  class Task2 {
    public static void main(String[] args) {

        System.out.println("Before Updating Address,");
        Address A1 = new Address(5, 17, "MTN", 32400);
        Person ath1 = new Person("Honda", 24, A1);
        Book B1 = new Book("CAR", "Printer" ,ath1);
        B1.display();

        System.out.println();
        System.out.println("After Updating Address,");
        Address A2 = new Address(10, 27, "BWP", 32200);
        B1.getAuthor().setAd(A2);
        B1.display();
    }
}
