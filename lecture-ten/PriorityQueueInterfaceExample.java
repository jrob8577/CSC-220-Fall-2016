
public class PriorityQueueInterfaceExample {
  public static void main( String[] args ) {
    PriorityQueueInterface<String> myPriorityQueue = new LinkedPriorityQueue<String>();
    myPriorityQueue.add( "Jane" );
    myPriorityQueue.add( "Jim" );
    myPriorityQueue.add( "Jill" );

    String name = myPriorityQueue.remove(); // remove: Jim
    myPriorityQueue.add( name ); // add: Jim
    myPriorityQueue.add("Jess"); // add: Jess
    String name = myPriorityQueue.peek(); // still get Jim
  }
}
