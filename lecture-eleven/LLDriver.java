public class LLDriver {
  public static void main( String[] args ) {
    ListInterface<Integer> list = new LList<Integer>();

    for( int i = 0; i < 10; i++ )
      list.add( i );

    System.out.println( "List: " );
    output( list );

    System.out.println( "Adding 100 at position 2: " );
    list.add( 2, 100 );
    output( list );

    System.out.println( "Adding 42 at last position: " );
    boolean succeeded42 = list.add( 12, 42 );
    if( succeeded42 ) {
      output( list );
    } else {
      error();
    }

    System.out.println( "Adding 999 at out of range position: " );
    boolean succeeded999 = list.add( 14, 999 );
    if( ! succeeded999 ) {
      output( list );
    } else {
      error();
    }

    System.out.println( "Removing at position 2: " );
    int result = list.remove( 2 );
    if( result != 100 ) {
      error();
    } else {
      output( list );
    }

    System.out.println( "Removing at position 1: " );
    int resultOne = list.remove( 1 );
    if( resultOne != 0 ) {
      error();
    } else {
      output( list );
    }

    System.out.println( "Removing at out of range position: " );
    if( list.remove( 100 ) != null ) {
      error();
    } else {
      output( list );
    }

    System.out.println( "Removing at last position: " );
    if( list.remove( list.getLength() ) != 42 ) {
      error();
    } else {
      output( list );
    }

    System.out.println( "Replacing at position 5: " );
    if( list.replace( 5, 50 ) && list.getEntry( 5 ) == 50 ) {
      output( list );
    } else {
      error();
    }

    System.out.println( "Replacing at out of range position: " );
    if( list.replace( 1000, 0 ) ) {
      error();
    } else {
      output( list );
    }
  }

  public static void output( ListInterface<Integer> list ) {
    System.out.println( list );
    System.out.println( "Number of entries: " + list.getLength() );
    System.out.println( "---------------------------------------------------" );
  }

  public static void error() {
    System.out.println( "***********************  ERROR  *******************" );
  }
}
