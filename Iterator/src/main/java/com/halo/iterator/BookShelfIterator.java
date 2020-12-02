package com.halo.iterator;

/**
 * @author lanqilu
 * @date Created in 2020/11/28  21:25
 * @description
 */
public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;


    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNeat() {
        if (index < bookShelf.getLength()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }



}
