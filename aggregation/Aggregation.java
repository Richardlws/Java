package aggregation;

public class Aggregation {
    public static void main(String[] args){
        Book book1 = new Book("The Fellow of the Ring",423);
        Book book2 = new Book("The Two Towers",352);
        Book book3 = new Book("The Return of the King",416);

        Book[] books={book1,book2,book3};

        //System.out.println(book1.displayInfo());

        /*for(Book book : books){
            System.out.println(book.displayInfo());
        }*/

        Libaray libaray = new Libaray("NYC Public library",1897,books);

        libaray.displayInfo();

    }
}
