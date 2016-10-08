public class LinkedListBag<T> implements BagInterface<T> {
  public static void main( String[] args ) {
    LinkedListBag<String> bag = new LinkedListBag<String>();

    bag.add( "Hi world" );
    bag.add( "Next Thing 2" );
    bag.add( "Next Thing 3" );

    System.out.println( bag );

    bag.remove( "Next Thing 2" );

    System.out.println( bag );

    bag.remove( "slartibartfast" );

    System.out.println( bag );

    while( ! bag.isEmpty() ) {
      String thing = bag.remove();

      System.out.println( "Got: " + thing );
      System.out.println( bag );
    }

    System.out.println( "After loop: " + bag );
  }

  private Node<T> first;
  private int currentSize;

  public LinkedListBag() {
    first = null;
    currentSize = 0;
  }

  public boolean add( T newEntry ) {
    Node<T> node = new Node<T>( newEntry );

    if( isEmpty() ) {
      first = node;
    } else {
      node.next = first;
      first = node;
    }

    currentSize++;

    return true;
  }

  public boolean isEmpty() {
    return first == null;
  }

  public T remove() {
    if( isEmpty() ) {
      return null;
    }

    T temp = first.data;
    first = first.next;

    currentSize--;

    return temp;
  }

  public boolean remove( T anEntry ) {
    Node<T> temp = getReferenceTo( anEntry );

    if( temp != null ) {
      temp.data = first.data;
      remove();
    }

    return temp != null;
  }

  private Node<T> getReferenceTo( T anEntry ) {
    Node<T> walker = first;

    while( walker != null && ! walker.data.equals( anEntry )) {
      walker = walker.next;
    }

    return walker;
  }

  public int getCurrentSize() {
    return currentSize;
  }

  public boolean isFull() {
    return false;
  }

  public void clear() {
    first = null;
  }

  public int getFrequencyOf( T anEntry ) {
    Node<T> walker = first;
    int counter = 0;

    while( walker != null ) {
      if( walker.data.equals( anEntry ) ) {
        counter++;
      }

      walker = walker.next;
    }

    return counter;
  }

  public boolean contains( T anEntry ) {
    return getReferenceTo( anEntry ) != null;
  }

  public T[] toArray() {
    T[] result = (T[])new Object[ getCurrentSize() ];

    Node<T> walker = first;
    int index = 0;

    while( walker != null ) {
      result[ index++ ] = walker.data;

      walker = walker.next;
    }

    return result;
  }

  public String toString() {
    StringBuilder result = new StringBuilder();

    Node<T> walker = first;

    while( walker != null ) {
      result.append( "'" + walker.data + "' " + "->" + " " );
      walker = walker.next;
    }

    result.append( "null" );

    return result.toString();
  }

  private class Node<T> {
    private T data;
    private Node<T> next;

    public Node( T data ) {
      this.data = data;
      this.next = null;
    }

    public Node( T data, Node<T> next ) {
      this.data = data;
      this.next = next;
    }
  }
}
