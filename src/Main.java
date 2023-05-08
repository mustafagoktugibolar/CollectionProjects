import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("sivastopol", 184, "Tolstoy", new Date(1855));
        Book book2 = new Book("Romeo and Julliet", 134, "Shakespeare", new Date(1597));
        Book book3 = new Book("Donusum", 125, "Franz Kafka", new Date(1915));
        Book book4 = new Book("Hayvan Ciftligi", 100, "George Orwell", new Date(1945));

        TreeSet<Book> bsName = new TreeSet<>();
        bsName.add(book3);
        bsName.add(book2);
        bsName.add(book1);
        bsName.add(book4);

        for (Book book : bsName) {
            System.out.println(book.getName());
        }
        System.out.println("");
        TreeSet<Book> bsPages = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book b1, Book b2) {
                if(b1.getPages() > b2.getPages()){
                    return 1;
                }
                else if(b1.getPages() < b2.getPages()){
                    return -1;
                }
                else{ 
                    return b1.compareTo(b2);
                }

            }
            
        });

        bsPages.add(book1);
        bsPages.add(book3);
        bsPages.add(book4);
        bsPages.add(book2);


        for (Book book : bsPages) {
            System.out.println(book.getName() + " page num : " + book.getPages());
        }



    }
}
