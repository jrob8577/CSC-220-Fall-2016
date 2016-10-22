public class SortArray {

  /**
   * Task: Sorts the first n object in an array into ascending order.
   * @param array an array of Comparable objects
   * @param n an integer > 0
   **/
  public static <T extends Comparable<? super T>>
  void selectionSort( T[] array, int n ) {
    for( int index = 0; index < n - 1; index++ ) {
      int indexOfNextSmallest = getIndexOfSmallest( array, index, n - 1 );

      swap( array, index, indexOfNextSmallest );
    }
  }

  /**
   * Task: Finds the index of the smallest value in a portion of an array.
   * @param array an array of Comparable objects
   * @param first an integer >= 0 and < array.length that is the index of the
   *              first array element to consider
   * @param last  an integer >= first and < array.length that is the index
   *              of the last array element to consider
   * @return the index of the smallest value among
   **/
   private static <T extends Comparable<? super T>>
   int getIndexOfSmallest( T[] array, int first, int last ) {
     T min = a[ first ];
     int indexOfMin = first;

     for( int index = first + 1; index <= last; index++ ) {
       if( a[ index ].compareTo( min ) < 0 ) {
         min = a[ index ];
         indexOfMin = index;
       }
     }

     return indexOfMin;
   }

   /**
    * Task: Swaps the array elements array[ begin ] and array[ end ]
    * @param array an array of objects
    * @param begin an integer >= 0 and < array.length
    * @param end an integer >= 0 and < array.length
    **/
   private static void swap( Object[] array, int begin, int end ) {
     Object temp = array[ begin ];
     array[ begin ] = array[ end ];
     array[ end ] = temp;
   }
}
