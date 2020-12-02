package com.halo.iterator;

/**
 * @author lanqilu
 * @date Created in 2020/11/28  21:19
 * @description
 */
public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }


    @Override
    public Iterator inerator() {
        return new BookShelfIterator(this);
    }
}
