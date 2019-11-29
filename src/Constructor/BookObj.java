package Constructor;

public class BookObj {
    //Create a program that will ask the user how many books they have.
    // Then they will be asked to enter the book’s title, author, and number of pages.
    // Create each book object and store them into a Book array.
    //Part 2: Loop through your array and print the name of all the books

    String title;
    String author;
    int pages;

    public BookObj(String title){
        this.title=title;
    }

    public BookObj(String title,String author){
        this(title);
        this.author=author;
    }

    public BookObj(String title, String author, int pages){
        this(title,author);
        this.pages=pages;
    }

    public void info(){
        System.out.println("Name "+this.title);
        System.out.println("Author "+this.author);
        System.out.println("Pages  "+this.pages);
        System.out.println();
    }




}
