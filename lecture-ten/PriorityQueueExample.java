import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueExample {

  public static void main( String[] args ) {
    PriorityQueue<String> stringQueue = new PriorityQueue<String>();

    stringQueue.offer( "ab" );
    stringQueue.offer( "a" );
    stringQueue.offer( "abcde" );
    stringQueue.offer( "abcd" );
    stringQueue.offer( "abc" );

    //iterator may or may not
    //show the PriorityQueue's order
    System.out.print( "Display PQ using iterator:" );
    Iterator<String> it = stringQueue.iterator();

    while( it.hasNext() ) {
      System.out.print( it.next() + " " );
    }

    System.out.println( "\nDisplay PQ using toString(): " + stringQueue );

    System.out.print( "Display PQ using poll(): " );
    while( stringQueue.size() > 0 ) {
      System.out.print( stringQueue.poll() + " " );
    }

    System.out.println();
} }
