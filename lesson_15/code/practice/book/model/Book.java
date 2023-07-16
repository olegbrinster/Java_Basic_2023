package practice.book.model;

public class Book {
   //поля класса Book

   private  String title; // название - title
   private  String author; // автор - author
   private  int  year; //  год - year
   private  long isbn; // уникальный номер - ISBN

    // методы класса Book
    // конструкторы

    // 1. конструктор для инициализации всех полей
    public Book(String title, String author, int year, long isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    // 2. конструктор для инициализации полей при отсутствии автора
    public Book(String title, int year, long isbn) {
        this.title = title;
        this.year = year;
        this.isbn = isbn;
    }
    // 3. конструктор при отсутствии года
    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void display()
   {
    System.out.println("Title " + title );
    System.out.println("Author " + author  );
    System.out.println("Year" + year );
    System.out.println("ISBN " + isbn );
       System.out.println();
}

    // геттеры и сеттеры
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {

        this.title = title;
    }
    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1450 || year > 2023) {
            System.out.println("Wrong year of publishing");
            this.year = -1;
        } else {

            this.year = year;
        }
    }

    public long getIsbn() {

        return isbn;
    }

    public void setIsbn(long isbn) {

        this.isbn = isbn;
    }
}

//--------------------------------
