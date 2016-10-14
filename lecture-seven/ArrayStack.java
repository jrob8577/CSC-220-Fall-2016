public class ArrayStack<T> implements StackInterface<T> {
  private T [] stack;
  private int topIndex;
  private static final int DEFAULT_INITIAL_CAPACITY = 50;

  public ArrayStack() {
    this( DEFAULT_INITIAL_CAPACITY );
  }

  public ArrayStack( int initialCapacity ) {
    // the cast is safe because the new array contains null entries @SuppressWarnings("unchecked")
    T[] tempStack = (T[]) new Object[ initialCapacity ];
    stack = tempStack;
    topIndex = -1;
  }

  public void push( T newEntry ) {
    topIndex++;

    if( topIndex >= stack.length ) {
      doubleArray();
    }

    stack[ topIndex ] = newEntry;
  }

  public T peek() {
    T top = null;

    if( ! isEmpty() ) {
      top = stack [topIndex];
    }

    return top;
  }

  public T pop() {
    T top = null;

    if( ! isEmpty() ) {
      top = stack[ topIndex ];
      stack[ topIndex ] = null;
      topIndex--;
    }

    return top;
  }

  public boolean isEmpty() {
    return topIndex < 0;
  }

  public void clear() {
    topIndex = -1;
  }

  private void doubleArray() {
    T[] tempStack = (T[]) new Object[ stack.length * 2 ];

    System.arraycopy( stack, 0, tempStack, 0, stack.length );

    stack = tempStack;
  }
}
