class Books{
    private String author;
    private String[] chapterNames;

    public Books(){
        author = "";
        chapterNames = new String[100];
    }
    public Books(String a, String[] ch){
        author = a;
        chapterNames = ch;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setChapterNames(String[] ch) {
        chapterNames = ch;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getChapterNames() {
        return chapterNames;
    }

    public boolean compareBooks(Books b1){
        if (this.author.equalsIgnoreCase(b1.author)){
            return true;
        }else {
            return false;
        }
    }

    public Books compareChapterNames(Books b) {
        int thisCount = this.countChapters();
        int otherCount = b.countChapters();

        if (thisCount > otherCount) {
            return this;
        }
        if (thisCount < otherCount) {
            return b;
        }
        return null;
    }

    public int countChapters(){
        int count = 0;
        for (int i = 0; i < this.chapterNames.length ; i++){
            if (this.chapterNames[i] != null && !this.chapterNames[i].isEmpty()){
                count++;
            }
        }
        return count;
    }

}



public class L4T2 {
    public static void main(String[] args) {
        Books b1 = new Books();
        b1.setAuthor("CAR");
        String[] ch1 = {"Tyre", "Oil", "Brakes"};
        b1.setChapterNames(ch1);

        String[] ch2 = {"Bed", "Window", "Fan", "Door"};
        Books b2 = new Books("ROOM", ch2);

        if(b1.compareBooks(b2)) {
            System.out.println("Yes, Both books have the same Author!");
        }else {
            System.out.println("No, Both books do not have the same Author!");
        }

        Books larger = b1.compareChapterNames(b2);
        if (larger != null) {
            System.out.println("The book with more chapters is by: " + larger.getAuthor());
        } else {
            System.out.println("Both books have the same number of chapters.");
        }

    }
}
