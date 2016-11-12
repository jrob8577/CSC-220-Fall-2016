package java.util;

public interface Iterator<T> {
  /**
   * Task: Detects whether the iterator has completed its traversal
   *   and gone beyond the last entry in the collection of data.
   *
   * @return true if the iterator has another entry to return
   **/
  public boolean hasNext();

  /** Task: Retrieves the next entry in the collection and
   *    advances the iterator by one position.
   *
   * @return a reference to the next entry in the iteration,
   *   if one exists
   * @throws NoSuchElementException if the iterator had reached the
   *   end already, that is, if hasNext() is false
   **/
  public T next();

  /**
   * Task: Removes from the collection of data the last entry that
   *   next() returned. A subsequent call to next() will behave
   *   as it would have before the removal.
   * Precondition: next() has been called, and remove() has not been
   *   called since then. The collection has not been altered
   *   during the iteration except by calls to this method.
   *
   * @throws IllegalStateException if next() has not been called, or
   *   if remove() was called already after the last call to next().
   * @throws UnsupportedOperationException if this iterator does
   *   not permit a remove operation.
   **/
   public void remove(); // Optional method
}
