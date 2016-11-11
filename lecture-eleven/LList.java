
public class LList< T > implements ListInterface< T > {
  private Node firstNode;
  private int numberOfEntries;

  public LList() {
    clear();
  }

  public boolean add( int newPosition, T newEntry ) {

  }

  public T remove( int givenPosition ) {

  }

  public void clear() {
    this.firstNode = null;
    this.numberOfEntries = 0;
  }

  public boolean replace( int givenPosition, T newEntry ) {

  }

  public T getEntry( int givenPosition ) {

  }

  public boolean contains( T anEntry ) {

  }

  public int getLength() {

  }

  public boolean isEmpty() {

  }

  public T [] toArray() {

  }

  public String toString() {
    StringBuffer buffer = new StringBuffer();
    buffer.append( "--> " );

    Node walker = firstNode;
    while( walker != null ) {
      buffer.append( walker.data + " --> " );

      walker = walker.next;
    }

    buffer.append( "null" );
    return buffer.toString();
  }

  private class Node {
    public T data;
    public Node next;
  }
}
