public interface StackInterface<T> {
  /**
   * Adds a new entry to the top of the stack
   * @param entry an object to be added to the stack
   **/
  public void push( T entry );

  /**
   * Removes and returns the stack's top entry
   * @return the object at the top of the stack, or null if the stack is empty
   **/
  public T pop();

  /**
   * Retrieves the stack's top entry
   * @return the object at the top of the stack, or null if the stack is empty
   **/
  public T peek();

  /**
   * Detects whether the stack is empty
   * @return true if the stack is empty
   **/
  public boolean isEmpty();

  /**
   * Removes all entries from the stack
   **/
  public void clear();
}
