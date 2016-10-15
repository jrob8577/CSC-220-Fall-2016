public class Node<T> {
  public T data;
  public Node<T> next;

  public Node( T entry ) {
    this( entry, null );
  }

  public Node( T entry, Node<T> next ) {
    this.data = entry;
    this.next = next;
  }
}
