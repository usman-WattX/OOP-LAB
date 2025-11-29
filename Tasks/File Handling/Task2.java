import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        try {
           
            FileInputStream filein = new FileInputStream("BookStore.dat");
            ObjectInputStream reader = new ObjectInputStream(filein);
            FileOutputStream file = new FileOutputStream("BookStore.dat", true);
            ObjectOutputStream writer = new Append(file);

            Book b1 = (Book) reader.readObject();
            Book b2 = (Book) reader.readObject(); 
            Book b3 = (Book) reader.readObject();
            Book b4 = (Book) reader.readObject();
            Book b5 = (Book) reader.readObject();
           
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            System.out.println(b4);
            System.out.println(b5);

            Person p = new Person("DD");
            Book b6 = new Book("Kid6", "CP Publisihers", p);
            writer.writeObject(b6);
            b6 = (Book) reader.readObject();
            System.out.println(b6);
            filein.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
    }
}
