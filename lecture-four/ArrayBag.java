public class ArrayBag<T> implements BagInterface<T> {
  private final T[] bag;
  private static final int DEFAULT_CAPACITY = 25;
  private int nextAvailableIndex;

  public ArrayBag() {
    this( DEFAULT_CAPACITY );
  }

  public ArrayBag( int size ) {
    bag = (T[]) new Object[ size ];
    nextAvailableIndex = 0;
  }

  public int getCurrentSize() {
    return nextAvailableIndex;
  }

  public boolean isEmpty() {
    return nextAvailableIndex == 0;
  }

  public boolean isFull() {
    return nextAvailableIndex == bag.length;
  }

  public boolean add( T newEntry ) {
    if( ! isFull() ) {
      bag[ nextAvailableIndex ] = newEntry;
      nextAvailableIndex++;

      return true;
    }

    return false;
  }

  public T remove() {
    if( ! isEmpty() ) {
      nextAvailableIndex--;

      return bag[ nextAvailableIndex + 1 ];
    }

    return null;
  }

  public boolean remove( T anEntry ) {
    int index = findIndex( anEntry );

    if( index != -1 ) {
      bag[ index ] = bag[ --nextAvailableIndex ];

      return true;
    }

    return false;
  }

  private int findIndex( T anEntry ) {
    int entryIndex = -1;

    for( int index = 0; entryIndex == -1 && index < nextAvailableIndex; index++ ) {
      if( anEntry.equals( bag[ index ] )) {
        entryIndex = index;
      }
    }

    return entryIndex;
  }

  public void clear() {
    nextAvailableIndex = 0;
  }

  public int getFrequencyOf( T anEntry ) {
    int counter = 0;

    for( int index = 0; index < nextAvailableIndex; index++ ) {
      if( anEntry.equals( bag[ index ] )) {
        counter++;
      }
    }

    return counter;
  }

  public boolean contains( T anEntry ) {
    return findIndex( anEntry ) != -1;
  }

  public T[] toArray() {
    T[] copy = (T[]) new Object[ nextAvailableIndex ];

    for( int index = 0; index < nextAvailableIndex; index++ ) {
      copy[ index ] = bag[ index ];
    }

    return copy;
  }
}