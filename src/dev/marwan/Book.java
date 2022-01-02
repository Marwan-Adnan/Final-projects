package dev.marwan;

public class Book implements Comparable<Book> {
    private String name;
    private long id;
    private String author;

    public Book() {}

    public Book(long id, String name, String author) {
        this.name = name;
        this.id = id;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }    

}
