package dev.marwan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private final List<Book> books = new ArrayList<>();

    public void enter(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void delete(long id) {
        for (Book book : books) {
            if(book.getId() == id) {
                books.remove(book);
                break;
            }
        }
    }

    public List<Book> search(String name) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if(book.getName().contains(name)) {
                result.add(book);
            }
        }
        return result;
    }

    public void sort() {
        books.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    public void bubbleSortBooks() {
        for (int i = 0; i < books.size(); i++) {
            for (int j = 0; j < books.size() - 1; j++) {
                if(books.get(j).compareTo(books.get(j + 1)) > 0) {
                    Book temp = books.get(j);
                    books.set(j, books.get(j + 1));
                    books.set(j + 1, temp);
                }
            }
        }        
    }

}
