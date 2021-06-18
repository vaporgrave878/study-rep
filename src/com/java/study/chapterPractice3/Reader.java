package com.java.study.chapterPractice3;

public class Reader {
    private String userName;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private long phoneNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Reader() {
    }

    public Reader(String userName, int ticketNumber, String faculty, String birthDate, long phoneNumber){
        this.userName = userName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int number){
        if (number == 1){
            System.out.println(userName + " took 1 book");
        }
        else
            System.out.println(userName + " took " + number + " books");
    }

    public void takeBook(String ... books){
        System.out.println(this.userName + "took: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book ... books){
        System.out.println(this.userName + "took:");
        for (Book book : books) {
            System.out.println(book.getAuthorName() + " " + book.getBookName());
        }
        System.out.println();
    }

    public void returnBook(int number){
        if (number == 1){
            System.out.println(userName + " returned 1 book");
        }
        else
            System.out.println(userName + " returned " + number + " books");
    }

    public void returnBook(String ... books){
        System.out.println(this.userName + "returned: ");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book ... books){
        System.out.println(this.userName + "returned:");
        for (Book book : books) {
            System.out.println(book.getAuthorName() + " " + book.getBookName());
        }
        System.out.println();
    }

}

