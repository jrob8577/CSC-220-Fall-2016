public class LinkedStack<T> implements StackInterface<T> {
  private Node<T> top;

  public LinkedStack() {
    this.top = null;
  }

  public void push( T entry ) {
    Node<T> temp = new Node<T>( entry );

    temp.next = top;

    top = temp;

    // top = new Node<T>( entry, top );
  }

  public T pop() {
    if( isEmpty() ) {
      return null;
    }

    Node<T> temp = top;

    top = temp.next;

    return temp.data;
  }

  public T peek() {
    if( isEmpty() ) {
      return null;
    }

    return this.top.data;
  }

  public boolean isEmpty() {
    return this.top == null;
  }

  public void clear() {
    this.top = null;
  }
}
