import java.util.*;

public class ScannerExample {
  public static void main( String[] args ) {
    String str1= "one two   hello   world";

    // create a scanner object Input from str1
    Scanner sc = new Scanner( str1 );
    System.out.println( sc.next() ); // print "one"
    System.out.println( sc.next() ); // print "two"
    System.out.println( sc.next() ); // print "hello"
    System.out.println( sc.next() ); // print "world"
    System.out.println( sc.next() ); // exception :(
  }
}
