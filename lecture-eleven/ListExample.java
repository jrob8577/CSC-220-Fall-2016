public class ListExample {
  public static void main( String[] args ) {
    ListInterface< String > list = new AList< String >();

    list.add( "a" );
    System.out.println( "After adding a: " + list );

    list.add( "b" );
    System.out.println( "After adding b: " + list );

    list.add( "c" );
    System.out.println( "After adding c: " + list );

    list.add( 2, "d" );
    System.out.println( "After adding d at 2: " + list );

    list.add( 1, "e" );
    System.out.println( "After adding e at 1: " + list );

    list.remove( 3 );
    System.out.println( "After removing element at 3: " + list );
  }
}
