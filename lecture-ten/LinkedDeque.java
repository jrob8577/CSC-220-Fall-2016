
public class LinkedDeque< T > implements DequeInterface< T > {

  private DequeNode firstNode;
  private DequeNode lastNode;

  public LinkedDeque() {
    this.firstNode = null;
    this.lastNode = null;
  }

  public void addToFront( T newEntry ) {
    DequeNode node = new DequeNode( null, newEntry, this.firstNode );

    if( isEmpty() ) {
      this.lastNode = node;
    } else {
      this.firstNode.setPrevious( node );
    }

    this.firstNode = node;
  }

  public void addToBack( T newEntry ) {
    DequeNode node = new DequeNode( this.lastNode, newEntry, null );

    if( isEmpty() ) {
      this.firstNode = node;
    } else {
      this.lastNode.setNext( node );
      node.setPrevious( this.lastNode );
    }

    this.lastNode = node;
  }

  public T removeFront() {
    T front = null;

    if( ! isEmpty() ) {
      front = this.firstNode.getData();
      this.firstNode = this.firstNode.getNext();

      if( this.firstNode == null ) {
        this.lastNode = null;
      } else {
        this.firstNode.setPrevious( null );
      }
    }

    return front;
  }

  public T removeBack() {
    T back = null;

    if( ! isEmpty() ) {
      back = this.lastNode.getData();
      this.lastNode = this.lastNode.getPrevious();

      if( this.lastNode == null ) {
        this.firstNode = null;
      } else {
        this.lastNode.setNext( null );
      }
    }

    return back;
  }

  public T getFront() {
    T front = null;

    if( ! isEmpty() ) {
      front = this.firstNode.getData();
    }

    return front;
  }

  public T getBack() {
    T back = null;

    if( ! isEmpty() ) {
      back = this.lastNode.getData();
    }

    return back;
  }

  public boolean isEmpty() {
    return this.firstNode == null;
  }

  public void clear() {
    this.firstNode = null;
    this.lastNode = null;
  }

  private class DequeNode {
    private T data;
    private DequeNode previous;
    private DequeNode next;

    public DequeNode( DequeNode previous, T data, DequeNode next ) {
      this.data = data;
      this.previous = previous;
      this.next = next;
    }

    public void setPrevious( DequeNode node ) {
      this.previous = node;
    }

    public DequeNode getPrevious() {
      return this.previous;
    }

    public void setNext( DequeNode node ) {
      this.next = node;
    }

    public DequeNode getNext() {
      return this.next;
    }

    public T getData() {
      return this.data;
    }
  }
}
