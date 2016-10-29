public class WaitLineExample {
  public static void main( String[] args ) {
    WaitLine customerLine = new WaitLine();
    customerLine.simulate( 20, 0.5, 5) ; 
    customerLine.displayResults();
  }
}
