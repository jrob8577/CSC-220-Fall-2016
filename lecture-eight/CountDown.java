// java CountDown 10 - example run

public class CountDown {
  public static void main( String[] args ) {
    countDown( Integer.parseInt( args[ 0 ] ));
  }

  public static void countDown( int integer ) {
    System.out.println( integer );

    if( integer > 1 ) {
      countDown( integer - 1 );
    }
  }
}
