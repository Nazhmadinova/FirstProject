package Constructor;

import AccessModifiers.Encapsulation.App;
import MutableImmutable.A;

import java.awt.print.Book;

public class BookTest {
    public static void main(String[] args) {
        BookObj book1= new BookObj("java","cybertek",200);
        BookObj book2= new BookObj("automation","cybertek",100);
        BookObj book3= new BookObj("auto","cybertek",300);

        BookObj [] myBook=new BookObj[3];
        myBook[0]=book1;
        myBook[1]=book2;
        myBook[2]=book3;
        myBook[0].pages=50;

        for(int i=0, j=50; i< myBook.length;i++,j+=100){
            myBook[i].pages=j;
        }

        for(BookObj eachBook: myBook){
           // System.out.println(eachBook.name);
           // System.out.println(eachBook.name+" has "+eachBook.pages +" pages");
            eachBook.info();
        }


    }
}
