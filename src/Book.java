import java.util.Date;

public class Book implements Comparable<Book>{
    private String name;
    private int pages;
    private String author;
    private Date relaseDate;

    public Book(String name, int pages, String author, Date relaseDate) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.relaseDate = relaseDate;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getRelaseDate() {
        return relaseDate;
    }
    public void setRelaseDate(Date relaseDate) {
        this.relaseDate = relaseDate;
    }


    @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    }
    
}
