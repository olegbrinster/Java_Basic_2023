package practice.book.controller;

import practice.book.model.Book ;

public class BookAppl {

    public static void main(String[] args) {

        //  создаем объектные переменные book1, book2, book3

        Book book1 = new Book("Сердце дракона", "Кирилл Клеванский", 2016, 1000000000L );
        Book book2 = new Book("Code Da Vinci", "Den Brown", 2003, 1000000001L) ;
        Book book3 = new Book("Jack London", "White....", 1900, 100000201L) ;

        book1.display() ;
        book2 .display() ;
        book3 .display() ;
        Book book4 = new Book("Two captains", "Kaverin", 950, 1000000202L);
        book4.display();
    }
}
