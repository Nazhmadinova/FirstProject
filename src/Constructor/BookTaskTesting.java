package Constructor;

import java.awt.print.Book;
import java.util.Scanner;

public class BookTaskTesting {
    public static void main(String[] args) {
        ////Create a program that will ask the user how many books they have.
        //    // Then they will be asked to enter the book’s title, author, and number of pages.
        //    // Create each book object and store them into a Book array.
        //    //Part 2: Loop through your array and print the name of all the books

        Scanner input =new Scanner(System.in);
        System.out.println("How many books:");
        int size=input.nextInt();
        input.nextLine();
        BookObj [] books=new BookObj[size];

        for(int i=0;i<books.length;i++){
            System.out.println("Enter the title of book "+(i+1));
            String title=input.nextLine();

            System.out.println("Enter the author of book "+(i+1));
            String author =input.nextLine();

            System.out.println("Enter the number of pages of book "+(i+1));
            int pages=input.nextInt();
            input.nextLine();

//            BookObj eachBook=new BookObj(title,author,pages);
//            books[i]=eachBook;

            books[i]=new BookObj(title,author,pages);

        }

        for(BookObj book: books){
            System.out.println(book.title);
        }


    }
}
