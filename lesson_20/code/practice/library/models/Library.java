package practice.library.models;
       // добавление, удаление, поиск книги
public class Library {
           private Book[] books; // массив типа Book, куда попадут все книги в библиотеке
           private int size; // количество книг в библиотеке

           // метод класса, который задает размер библиотеки, т. е. длину массива Book
           public Library(int capacity) {
               books = new Book[capacity];
           }

           // метод добавление книги

           public boolean addBook(Book book) {
               if ((size == books.length) || findBook(book.getIsbn()) != null) {
                   return false; // не можем добавить книгу, так как нет места или такая книга уже есть
               }
               books[size] = book; // помещаем книгу в массив
               size++;
               return true;
           }

           // метод поиска книги по ISBN
           public Book findBook(long isbn) {
               for (int i = 0; i < size; i++) { // пробегаем по массиву
                   if (books[i].getIsbn() == isbn) { //  проверяем совпадение ISBN
                       return books[i]; // возвращаем элемент массива типа Book
                   }
               }
               return null;
           }

           // метод поиска книги по названию
           public Book findBookTitle(String author) {
               for (int i = 0; i < size; i++) { // пробегаем по массиву
                   if (author.equals(books[i].getTitle())) { // проверяем совпадение строк в поле author
                       return books[i]; // возвращаем элемент массива типа Book
                   }
               }
               return null;
           }

           // метод поиска книг по автору
           public Book[] findBookAuthor(String author, Book[] books) {
               // count how many books of author
               int count = 0;
               for (int i = 0; i < books.length ; i++) { // пробегаем по массиву
                   if (author.equals(books[i].getAuthor())) { // проверяем совпадение строк в поле author
                       count++; // возвращаем элемент массива типа Book
                   }
               }
               System.out.println("Number of books: " + count );
               // заполним массив результатами поиска

               Book[] booksf = new Book[count]; // определил массив размером по кол-ву найденных
               count = 0;
               for (int i = 0; i < books.length ; i++) {// пробегаем по массиву

                       if (author.equals(books[i].getAuthor())) { // проверяем совпадение строк в поле author
                           booksf[count ] = books[i]; // заполняем массив bookcf
                           count ++;

                       }
                   }

               return booksf;

           }

           // метод возвращает размер библиотеки
           public int getSize() {
               return size;
           }

           // метод удаления книги из библиотеки
           // надо найти книгу, количество книг и библиотеке -1
           // последнюю книгу поставим на место удаленной

           public Book removeBook(long isbn, Book[] books ) {
               Book victim = null;

               for (int i = 0; i < size; i++) {
                   if (books[i].getIsbn() == isbn) {
                       victim = books[i];
                       books [i] = books [size -1]; // на место удаляемой ставим последнюю книжку
                       books [size -1] = null ; // последнюю книгу стираем, т.к. она теперь стоит на месте удаленной
                       size --;
                       break;

                   }
               }
               return victim ;

           }
       }
