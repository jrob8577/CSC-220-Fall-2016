import java.util.Iterator;
import java.util.Scanner;

public class FrequencyCounter {
  private DictionaryInterface< String, Integer > wordTable;

  public FrequencyCounter () {
    wordTable = new SortedDictionary< String, Integer >();
  }

  /**
   * Task: Reads a text file of words and counts their frequencies
   * of occurrence.
   * @param data - text scanner for the text file of data
   **/
  public void readFile( Scanner data ) {
    data.useDelimiter( "\\W+" );

    while( data.hasNext() ) {
      String nextWord = data.next();
      nextWord = nextWord.toLowerCase();
      Integer frequency = wordTable.getValue( nextWord );

      if( frequency == null ) {
        wordTable.add( nextWord, new Integer( 1 ));
      } else {
        frequency++;
        wordTable.add( nextWord, frequency );
      }
    }

    data.close ();
  }

  /**
   * Task: Displays words and their frequencies of occurrence.
   **/
  public void display () {
    Iterator< String > keyIterator = wordTable.getKeyIterator();
    Iterator< Integer > valueIterator = wordTable.getValueIterator();

    while( keyIterator.hasNext() ) {
      System.out.println( keyIterator.next() + " " + valueIterator.next() );
    }
  }
}
