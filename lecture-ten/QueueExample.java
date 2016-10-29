public class QueueExample {

  public static void main( String[] args ) {
    QueueInterface<String> myQueue = new LinkedQueue<String>();

    myQueue.enqueue("Jim");
    System.out.println( "Enqueued Jim" );

    myQueue.enqueue("Jess");
    System.out.println( "Enqueued Jess" );

    myQueue.enqueue("Jill");
    System.out.println( "Enqueued Jill" );

    myQueue.enqueue("Jane");
    System.out.println( "Enqueued Jane" );

    myQueue.enqueue("Joe");
    System.out.println( "Enqueued Joe" );

    String front = myQueue.getFront();
    System.out.println( "Front is now: " + front );

    front = myQueue.dequeue();

    myQueue.enqueue("Jerry");
    System.out.println( "Enqueued Jerry" );

    front = myQueue.getFront();
    System.out.println( "Front is now: " + front );

    front = myQueue.dequeue();
    System.out.println( "After dequeue, front is now: " + myQueue.getFront() );
  }
}
