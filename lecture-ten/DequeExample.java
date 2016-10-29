
public class DequeExample {
  public static void main( String[] args ) {
    DequeInterface<String> myDeque = new LinkedDeque<String>();

    myDeque.addToFront( "Jim" );
    System.out.println( "addToFront Jim" );

    myDeque.addToBack( "Jess" );
    System.out.println( "addToBack Jess" );

    myDeque.addToFront( "Jill" );
    System.out.println( "addToFront Jill" );

    myDeque.addToBack( "Jane" );
    System.out.println( "addToBack Jane" );

    String name = myDeque.getFront();
    System.out.println( "Front is " + name );

    myDeque.addToBack( name );
    System.out.println( "addToBack " + name );

    myDeque.removeFront();
    System.out.println( "removeFront" );

    String back = myDeque.removeBack();
    System.out.println( "removeBack returned " + back );

    myDeque.addToFront( back );
    System.out.println( "addToFront " + back );

    System.out.println( "Contents of Deque:" );

    System.out.print( "null <-> " );
    while( ! myDeque.isEmpty() ) {
      System.out.print( myDeque.removeFront() + " <-> " );
    }
    System.out.println( "null" );
  }
}
