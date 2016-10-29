import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeInterfaceExample {
  public static void main( String args[] ) {
    ArrayDeque<String> adObj = new ArrayDeque<String>();

    //Insertion by using various methods
    adObj.add( "Oracle" );
    adObj.addFirst( "DB2" );
    adObj.offerFirst( "MySQL" ); //returns boolean - true or false
    adObj.offerLast( "Postgres" ); //returns boolean - true or false

    //Retrievals
    System.out.println( "Retrieving First Element: " + adObj.peekFirst() );
    System.out.println( "Retrieving Last Element: " + adObj.peekLast() );

    //Removals
    System.out.println( "Removing First Element :" + adObj.pollFirst() );
    System.out.println( "Removing Last Element: " + adObj.pollLast() );

    //Reverse traversal
    System.out.println( "Remaining Elements:" );
    Iterator<String> it = adObj.descendingIterator();
    while( it.hasNext() ) {
      System.out.println( it.next() );
    }
  }
}
