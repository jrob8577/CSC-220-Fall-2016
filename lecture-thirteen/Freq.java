import java.util.*;

public class Freq {
  public static void main( String[] args ) {
    Map< String, Integer > m = new HashMap< String, Integer >();

    // Initialize frequency table from command line
    for( String a : args ) {
      Integer freq = m.get( a );
      m.put( a, ( freq == null ) ? 1 : freq + 1 );
    }

    System.out.println( m.size() + " distinct words:" );
    System.out.println( m );
  }
}
