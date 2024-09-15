package br.iterator;

public class Main {

        public static void main(String[] args) {
            EBookCollection collection = new EBookCollection();
            collection.addEBook(new EBook("Book A", "Author A"));
            collection.addEBook(new EBook("Book B", "Author B"));

            for (EBook ebook : collection) {
                System.out.println(ebook);
            }
        }

}