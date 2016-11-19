// Statistics.java
// Simple demonstration of HashMap.
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// <K,V> = <Integer, Counter>
public class HashMapExample{
  private static Random rand = new Random();

  public static void main(String[] args) {
    Map<Integer, Counter> hm = new HashMap<Integer, Counter>();

    for( int i = 0; i < 1000; i++ ) {
      // Produce a number between 0 and 20:
      Integer r = new Integer( rand.nextInt( 20 ));
      if( hm.containsKey( r )) // key already in table
        ((Counter) hm.get( r )).i++;
      else // new key
        hm.put(r, new Counter());
    }

    System.out.println( hm );
  }
}

// value class
class Counter {
  int i = 1;
  public String toString() {
    return Integer.toString(i);
  }
}
