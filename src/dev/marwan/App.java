package dev.marwan;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static final Library library = new Library();
    public static final Scanner scanner = new Scanner(System.in);
    public static boolean didWelcome = false;

    public static void main(String[] args) {
        
        System.out.println("============<<  MENU  >>============");
        
        if (!didWelcome) {
            System.out.println("<**>  Welcome To the Library System...  <**>");
            didWelcome = true;
        }
        diplayMenu();
        int command = scanner.nextInt();
        switch (command) {
            case 1:
                enterBook();
                break;
            case 2:
                searchBook();
                break;
            case 3:
                sortBooks();
                break;
            case 4:
                deleteBook();
                break;
            case 5:
                diplayBooks();
                break;
            case 6:
                exit();
                break;
            default:
                System.out.println("Invalid Command...");
                break;
        }
        main(args);
    }

    public static void enterBook() {
        System.out.println("Enter the book name: ");
        String name = scanner.next();
        System.out.println("Enter the book author: ");
        String author = scanner.next();
        System.out.println("Enter the book id: ");
        long id = scanner.nextLong();
        Book book = new Book(id, name, author);
        library.enter(book);
    }

    public static void searchBook() {
        System.out.println("Enter the book name: ");
        String name = scanner.next();
        List<Book> books = library.search(name);
        System.out.println("Found " + books.size() + " books: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void sortBooks() {
        library.bubbleSortBooks();
        System.out.println("Books sorted successfully.");
    }

    public static void deleteBook() {
        System.out.println("Enter the book id: ");
        long id = scanner.nextLong();
        library.delete(id);
    }

    public static void exit() {
        System.out.println("Goodbye!");
        System.exit(0);
    }

    public static void diplayBooks() {
        List<Book> books = library.getBooks();
        System.out.println("Found " + books.size() + " books: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void diplayMenu() {
        System.out.println("Please enter your command: ");
        System.out.println("1- Enter a book");
        System.out.println("2- Search for a book");
        System.out.println("3_ Sort the books");
        System.out.println("4- Delete a book");
        System.out.println("5- display the books");
        System.out.println("6- Exit");
        System.out.println("");
    }
}
