public interface ListInterface < T > {
  /**
   * Adds a new entry to the end of this list.
   **/
  public void add( T newEntry );

  /**
   * Adds a new entry at a specified position within this list.
   **/
  public boolean add( int newPosition, T newEntry );

  /**
   * Removes the entry at a given position from this list.
   **/
  public T remove( int givenPosition );

  /**
   * Removes all entries from this list.
   **/
  public void clear();

  /**
   * Replaces the entry at a given position in this list.
   **/
  public boolean replace( int givenPosition, T newEntry );

  /**
   * Retrieves the entry at a given position in this list.
   **/
  public T getEntry( int givenPosition );

  /**
   * Sees whether this list contains a given entry.
   **/
  public boolean contains( T anEntry );

  /**
   * Gets the length of this list.
   **/
  public int getLength();

  /**
   * Sees whether this list is empty.
   **/
  public boolean isEmpty();

  /**
   * Retrieves all entries that are in this list in the order in which
   * they occur in the list.
   **/
  public T [] toArray();
}
