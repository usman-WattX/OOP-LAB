import java.io.*;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        try {
            FileInputStream file = new FileInputStream("BookStore.dat");
            ObjectInputStream reader = new ObjectInputStream(file);

            Book[] books = new Book[5];

            books[0] = (Book) reader.readObject();
            books[1] = (Book) reader.readObject(); 
            books[2] = (Book) reader.readObject();
            books[3] = (Book) reader.readObject();
            books[4] = (Book) reader.readObject();

            System.out.print("Enter the Book Name:");
            String bookName = in.next();
            boolean found = true;

        while(found){
            for(int i = 0; i < books.length; i++){
                if (books[i].getBook().equalsIgnoreCase(bookName)) {
                    System.out.println("Book Found!");
                    System.out.println(books[i]);
                    found = false;
                    break;
                } else {
                    System.out.println("Book Not Found!");
                }
            }
        }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
