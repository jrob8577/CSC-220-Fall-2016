public class Node<T> {
  private T data;
  private Node next;

  private Node( T data ) {
    this.data = data;
    this.next = null;
  }

  private Node( T data, Node next ) {
    this.data = data;
    this.next = next;
  }
}
