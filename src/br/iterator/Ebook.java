package br.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class EBook {
    private String title;
    private String author;

    public EBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class EBookCollection implements Iterable<EBook> {
    private List<EBook> ebooks = new ArrayList<>();

    public void addEBook(EBook ebook) {
        ebooks.add(ebook);
    }

    @Override
    public Iterator<EBook> iterator() {
        return new EBookIterator();
    }

    private class EBookIterator implements Iterator<EBook> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < ebooks.size();
        }

        @Override
        public EBook next() {
            if (this.hasNext()) {
                return ebooks.get(index++);
            }
            return null;
        }
    }
}

