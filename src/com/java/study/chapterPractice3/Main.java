package com.java.study.chapterPractice3;

public class Main {
    public static void main(String[] args) {
        Reader r1 = new Reader("Tkachuk O.O.", 1, "FCSA", "30.03.2002", 967977745);
        Reader r2 = new Reader("Petrov V.V", 2, "FIITKI", "27.01.2002", 991234567);
        Reader r3 = new Reader("Vasiliev A.P.", 3, "FIMT", "05.04.2001", 55668441);
        Reader[] readers = {r1, r2, r3};

        Book b1 = new Book("Author1", "Book1");
        Book b2 = new  Book("Author2", "Book2");
        Book[] books = {b1, b2};

        r1.takeBook("Witcher", "Game of Thrones");
        r1.returnBook(5);
        r1.takeBook(b1);

    }
}
