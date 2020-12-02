package com.halo.iterator;

/**
 * @author lanqilu
 * @date Created in 2020/11/28  21:29
 * @description
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        bookShelf.appendBook(new Book("D"));
        Iterator inerator = bookShelf.inerator();
        while (inerator.hasNeat()) {
            Book book = (Book) inerator.next();
            System.out.println(book.getName());
        }
    }
}
