import java.io.*;

class Append extends ObjectOutputStream{

    public Append(OutputStream out) throws IOException{
        super(out);
    }

    @Override
    public void writeStreamHeader() throws IOException{
        reset();
    }
}

class Person implements Serializable{
    private String name;

    public Person() {
        this("");
    }

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}

class Book implements Serializable { 
    private String book;
    private String publisher;
    private Person author;

    public Book() {
        this("", "", new Person());
    }
    
    public Book(String book, String publisher, Person author) {
        setBook(book);
        setPublisher(publisher);
        setPerson(author);
    }

    public String getBook() {
        return book;
    }
    public Person getPerson() {
        return author;
    }
    public void setPerson(Person author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setBook(String book) {
        this.book = book;
    }

    public String toString() {
        return "Book [author= " + author + ", book= " + getBook() + ", publisher= " + getPublisher() + "]";
    }
}


public class Task1 {
    public static void main(String[] args) {


        Person p = new Person("DD");
        Book b1 = new Book("Kid1", "CP Publisihers", p);
        Book b2 = new Book("Kid2", "CP Publisihers", p);
        Book b3 = new Book("Kid3", "CP Publisihers", p);
        Book b4 = new Book("Kid4", "CP Publisihers", p);
        Book b5 = new Book("Kid5", "CP Publisihers", p);
        
        try {
            FileOutputStream file = new FileOutputStream("BookStore.dat", true);
            ObjectOutputStream writer = new ObjectOutputStream(file);
            writer.writeObject(b1);
            writer.writeObject(b2);
            writer.writeObject(b3);    
            writer.writeObject(b4);
            writer.writeObject(b5);
            System.out.println("Successfully Written!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}