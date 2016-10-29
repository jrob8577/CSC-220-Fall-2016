public class LinkedQueue < T > implements QueueInterface < T > {
  private Node firstNode;
  private Node lastNode;

  public LinkedQueue() {
    firstNode = null;
    lastNode = null;
  }

  public void enqueue( T newEntry ) {
    Node newNode = new Node (newEntry, null);

    if( isEmpty() ) {
      firstNode = newNode;
    } else {
      lastNode.setNextNode( newNode );
    }

    lastNode = newNode;
  }

  public T getFront() {
    T front = null;

    if( ! isEmpty() ) {
      front = firstNode.getData();
    }

    return front;
  }

  public T dequeue() {
    T front = null;

    if( ! isEmpty() ) {
      front = firstNode.getData();
      firstNode = firstNode.getNextNode();
    }

    if( firstNode == null ) {
      lastNode = null;
    }

    return front;
  }

  public boolean isEmpty() {
    return firstNode == null && lastNode == null;
  }

  public void clear () {
    firstNode = null;
    lastNode = null;
  }

  private class Node
  {
    // entry in queue
    private T data;
    // link to next node
    private Node next;

    public Node( T data ) {
      this( data, null );
    }

    public Node( T data, Node next ) {
      this.data = data;
      this.next = next;
    }

    public T getData() {
      return this.data;
    }

    public Node getNextNode() {
      return this.next;
    }

    public void setNextNode( Node next ) {
      this.next = next;
    }
  }
}
