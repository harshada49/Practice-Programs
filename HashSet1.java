import java.util.*;
class Book{
  int id;
  String name,author,publisher; 
  int quantity;

  public Book(int id, String name, String author, int quantity){
    this.id = id;
    this.name = name;
    this.author = author;
    this.quantity = quantity;
  }
}
public class HashSet1{
    public static void main(String[] args) {
        HashSet<Book> list = new HashSet<Book>();
        Book b1 = new Book(1,"The Old Man and His God","Sudha Murthy",12);
        Book b2 = new Book(2,"The Room on the Roof","Ruskin Bond",10);
        Book b3 = new Book(3,"Sacred Games","Vikram Chandra",9);
      
        list.add(b1);
        list.add(b2);
        list.add(b3);

        for(Book b: list){
            System.out.println(b.id +" " + b.name + " " + b.author + " " + b.quantity);
        }
    }
}