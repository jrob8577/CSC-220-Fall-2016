/**
 * A dictionary with distinct search keys.
 **/
import java.util.Iterator;

public interface DictionaryInterface<K, V> {
  /**
   * Task: Adds a new entry to the dictionary. If the given search
   *   key already exists in the dictionary, replaces the
   *   corresponding value.
   * @param key an object search key of the new entry
   * @param value an object associated with the search key
   * @return either null if the new entry was added to the dictionary
   *   or the value that was associated with key if that value was replaced
   **/
  public V add(K key, V value);

  /**
   * Task: Removes a specific entry from the dictionary.
   * @param key an object search key of the entry to be removed
   * @return either the value that was associated with the search key
   *   or null if no such object exists
   **/
  public V remove(K key);

  /**
   * Task: Retrieves the value associated with a given search key.
   * @param key an object search key of the entry to be retrieved
   * @return either the value that is associated with the search key
   *   or null if no such object exists
   **/
  public V getValue(K key);

  /**
   * Task: Sees whether a specific entry is in the dictionary.
   * @param key an object search key of the desired entry
   * @return true if key is associated with an entry in the dictionary
   **/
  public boolean contains(K key);

  /**
   * Task: Creates an iterator that traverses all search keys in the
   *   dictionary.
   * @return an iterator that provides sequential access to the search
   *   keys in the dictionary
   **/
  public Iterator<K> getKeyIterator();

  /**
   * Task: Creates an iterator that traverses all values in the
   *   dictionary.
   * @return an iterator that provides sequential access to the values
   *   in the dictionary
   **/
  public Iterator<V> getValueIterator();

  /**
   * Task: Sees whether the dictionary is empty.
   * @return true if the dictionary is empty
   **/
  public boolean isEmpty();

  /**
   * Task: Gets the size of the dictionary.
   * @return the number of entries (key-value pairs) currently in the dictionary
   **/
  public int getSize();

  /**
   * Task: Removes all entries from the dictionary.
   **/
  public void clear();
}
