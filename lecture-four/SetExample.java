import java.util.*;

public class SetExample {
  public static void main( String[] args ) {
    Set<String> s = new TreeSet<String>();

    // add data
    s.add("bbbb");
    s.add("aaaa");
    s.add("ddddd");
    s.add("cc");

    System.out.println( "Number of Set data:" + s.size() );

    // use for each loop
    for( String item: s ) {
      System.out.print( item + " " );
    }

    System.out.println();
    System.out.println();

    // remove data
    s.remove( "aaaa" );
    s.remove( "cc" );

    System.out.println( "Number of Set data:" + s.size() );

    for( String item: s ) {
      System.out.print( item + " " );
    }

    System.out.println();
  }
}