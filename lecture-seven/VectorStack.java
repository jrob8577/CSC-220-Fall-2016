import java.util.Vector;

public class VectorStack<T> implements StackInterface<T> {
  private Vector<T> stack;

  public VectorStack() {
    stack = new Vector<T>();
  }

  public VectorStack( int initialCapacity ) {
    stack = new Vector<T>( initialCapacity );
  }

  public void push( T entry ) {
    stack.add( entry );
  }

  public T peek() {
    T top = null;

    if( ! isEmpty() ) {
      top = stack.lastElement();
    }

    return top;
  }

  public T pop() {
    T top = null;

    if( ! isEmpty() ) {
      top = stack.lastElement();
      stack.remove( stack.size() - 1 );
    }

    return top;
  }

  public boolean isEmpty() {
    return stack.isEmpty();
  }

  public void clear() {
    stack.clear();
  }
}
