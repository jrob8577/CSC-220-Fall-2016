import java.util.Arrays;
/**
 * A class that implements a list of objects by using an array. The list
 * is never full.
 * @author Frank M. Carrano
 **/
public class AList < T > implements ListInterface < T > {
  private T[] list;
  private int numberOfEntries;
  private static final int DEFAULT_INITIAL_CAPACITY = 25;

  public AList() {
    this (DEFAULT_INITIAL_CAPACITY);
  }

  public AList( int initialCapacity ) {
    numberOfEntries = 0;

    T [] tempList = (T []) new Object[ initialCapacity ];
    list = tempList;
  }

  public void add( T newEntry )
  {
    if( ! isFull() ) {
      list[ numberOfEntries ] = newEntry;
      numberOfEntries++;
    }
  }

  public boolean add( int newPosition, T newEntry ) {
    boolean isSuccessful = true;

    if(( newPosition >= 1 ) && ( newPosition <= numberOfEntries + 1 )) {
      ensureCapacity ();
      makeRoom( newPosition );
      list [newPosition - 1] = newEntry;
      numberOfEntries++;
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
  }

  private void makeRoom( int newPosition ) {
    assert ( newPosition >= 1 ) && ( newPosition <= numberOfEntries + 1 );
    int newIndex = newPosition - 1;
    int lastIndex = numberOfEntries - 1;

    for( int index = lastIndex ; index >= newIndex ; index-- ) {
      list[ index + 1 ] = list[ index ];
    }
  }

  public T remove( int givenPosition ) {
    T result = null;

    if(( givenPosition >= 1 ) && ( givenPosition <= numberOfEntries )) {
      assert( ! isEmpty() );
      result = list[ givenPosition - 1 ];

      if( givenPosition < numberOfEntries ) {
        removeGap (givenPosition);
      }

      numberOfEntries--;
    }

    return result;
}

  private void removeGap( int givenPosition ) {
    assert( givenPosition >= 1 ) && ( givenPosition < numberOfEntries );
    int removedIndex = givenPosition - 1;
    int lastIndex = numberOfEntries - 1;

    for( int index = removedIndex ; index < lastIndex ; index++ ) {
      list[ index ] = list[ index + 1 ];
    }
  }

  public void clear () {
    numberOfEntries = 0;
  }

  public boolean contains( T anEntry ) {
    return findIndex( anEntry ) != -1;
  }

  private int findIndex( T anEntry ) {
    int entryIndex = -1;

    for( int index = 0; entryIndex == -1 && index < numberOfEntries; index++ ) {
      if( anEntry.equals( list[ index ] )) {
        entryIndex = index;
      }
    }

    return entryIndex;
  }

  public int getLength () {
    return numberOfEntries;
  }

  public boolean replace( int givenPosition, T newEntry ) {
    boolean isSuccessful = true;

    if(( givenPosition >= 1 ) && ( givenPosition <= numberOfEntries )) {
      assert !isEmpty();

      list[ givenPosition - 1 ] = newEntry;
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
  }

  public T getEntry( int givenPosition ) {
    T result = null;

    if(( givenPosition >= 1 ) && ( givenPosition <= numberOfEntries )) {
      assert !isEmpty();
      result = list[ givenPosition - 1 ];
    }

    return result;
  }

  public boolean isEmpty() {
    return numberOfEntries == 0;
  }

  public boolean isFull() {
    return numberOfEntries == list.length;
  }

  public T[] toArray() {
    T[] copy = (T[]) new Object[ numberOfEntries ];

    for( int index = 0; index < numberOfEntries; index++ ) {
      copy[ index ] = list[ index ];
    }

    return copy;
  }

  private void ensureCapacity() {
    if( numberOfEntries == list.length ) {
      list = Arrays.copyOf( list, 2 * list.length );
    }
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();

    for( int index = 0; index < numberOfEntries; index++ ) {
      builder.append( list[ index ] + " " );
    }

    return builder.toString();
  }
}
