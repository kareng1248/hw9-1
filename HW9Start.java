import tester.*; 
import java.util.ArrayList; 
import.java.util.Iterator;

public class HW9Start{ 
  public static Examples E = new Examples(); 
  public static void main(String[] args) { 
    Tester.run(E); 
  }
  
}

class Book { 
  String title; 
  int price; 
  Book (String title, int price) { 
    this.title = title; 
    this.price = price; 
  }
  int compareTo(Book b) { 
    
    return this.title.compareTo(b.title); 
  }
}
class Examples { 
  Examples (){}
  Book b1 = new Book("Romeo and Juliet", 20); 
  Book b2 = new Book("Tom Soyer", 12); 
  Book b3 = new Book("The Bad Girl", 18); 
  BookStore store1 = new BookStore("Pearl place"); 
  ArrayList<Book> books2;
  ArrayList<Book> sortedBooks;
  
   void testIncreasePrice(Tester t) {
    
    t.checkExpect(b1.price, 20);
    b1.increasePrice();
    t.checkExpect(b1.price, 21);
    b1.increasePrice();
    t.checkExpect(b1.price, 22);
    
  }
   
  void reset(){ 
    b1 = new Book("Romeo and Juliet", 20); 
    b2 = new Book("Tom Soyer", 12); 
    b3 = new Book("The Bad Girl", 18); 
    store1 = new BookStore("Pearl place");
    books2 = new ArrayList<Book>(); 
    books2.add(b1); 
    books2.add(b2);
    sortedBooks = new ArrayList<Book> (); 
    sortedBooks.add(b1); 
    sortedBooks.add(b3); 
    sortedBooks.add(b2);
  }
  
 
  /*
  void testSort(Tester t) { 
    reset(); 
    store1.addBook(b1); 
    store1.addBook(b2);
    store1.addBook(b3); 
    store1.sort();
    t.checkExpect( store1.books, sortedBooks);
  }
  void testAddRemoveBook(Tester t) { 
    reset(); 
    store1.addBook(b1); 
    store1.addBook(b2); 
    
    t.checkExpect(store1.books, books2); 
    store1.removeBook(b1); 
    books2.remove(b1); 
    t.checkExpect(store1.books, books2); 
  }
  void testTotalValue(Tester t) { 
    reset(); 
    store1.addBook(b1); 
    store1.addBook(b2); 
    
    t.checkExpect(store1.totalValue(), 32);
  }
   void testTotal(Tester t) { 
    reset(); 
    store1.addBook(b1); 
    store1.addBook(b2); 
    
    t.checkExpect(store1.total(), 32);
  }
   
   void testIncreasePrices(Tester t) { 
     reset(); 
    store1.addBook(b1); 
    store1.addBook(b2); 
    
    t.checkExpect(store1.total(), 32);
    store1.increasePrices(); 
    t.checkExpect(store1.total(), 36);
   }
   */
}
  
class BookStore { 
  String name; 
  ArrayList<Book> books = new ArrayList<Book> (); 
  BookStore(String name){ 
    this.name = name;
  }
  void addBook(Book b) { 
    books.add(b);
  }
  void removeBook(Book b){ 
    books.remove(b);// What happens if the book is not in the store?!? 
  }
  int totalValue() { 
    return totalValueHelp(0,0); 
  }
  int totalValueHelp(int acc, int k){ 
    if ( k < this.books.size())
     
        return totalValueHelp(acc + this.books.get(k).price, k+1);
      
    else 
      // base case - no more elements to be considered in the ArrayList<Book>
      return acc; 
    
  }
  
  int total(){ 
    int acc = 0;
    for (Book b : this.books) 
      acc = acc + b.price;
    
    return acc;
  }
  void increasePrices(){ 
    /*
     * this.name: String
     * this.books : ArrayList<Book>
     * this.books.get(int) : Book
     *  use loops for accessing each and every book in the ArrayList<Book>
     * for (Book b : this.books){
     *    access to b: Book 
     *    helping method :
     *    b.increasePrice() : void EFFECT
     * }for (int i = 0; i , this.books.size(); i++){
     *      access each book? this.books.get(i) : Book 
     * }
     * 
     * Iterator <Book> iter = this.books.iterator();
     * 
     * while(iter.hasNext()){
     *   access each and every Book
     *   iter.next() : Book
     *   iter.next().increasePrice();
     * }
     * 
     * -------------
     * ILoB
     * void increasePrices(){
     *   this.fst.increasePrice();
     *   this.rst.increasePrices();
     *  }
     * 
     */
  }
  // swap Books at positions i and j 
  void swap(int i, int j){ 
   // add code
  }
  
  void sort() { 
    
   // add code 
     }
}