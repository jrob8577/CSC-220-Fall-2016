public class PolynomialTest {
  public static void main( String[] args ) {
    try {
      Polynomial p = new Polynomial();
      System.out.println( p );
      System.out.println( p.evaluate( 3 ) );

      Polynomial q = new Polynomial( 2 );
      q.setTerm( 2, 0 );
      q.setTerm( 0, 1 );
      q.setTerm( 3, 2 );
      System.out.println( q );
      System.out.println( q.evaluate( 3 ) );

      Polynomial z = new Polynomial( 2 );
      z.setTerm( -2, 0 );
      z.setTerm( 1, 1 );
      z.setTerm( 3, 2 );
      System.out.println( z );
      System.out.println( z.evaluate( 3 ) );

      Polynomial t = new Polynomial( 2 );
      t.setTerm( 2, 0 );
      t.setTerm( -1, 1 );
      t.setTerm( -3, 2 );
      System.out.println( t );
      System.out.println( t.evaluate( 3 ) );

      Polynomial r = new Polynomial( 1 );
      r.setTerm( 2, 0 );
      r.setTerm( -1, 1 );
      r.setTerm( -3, 2 );
      System.out.println( r );
      System.out.println( r.evaluate( 3 ) );
    } catch( InvalidPowerException ipe ) {
      System.out.println( "You got an invalid power exception for power " + ipe.getPower() );
    }
  }
}