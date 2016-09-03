public class OrderedPair<T> {
  private T first, second;

  public void setPair( T firstItem, T secondItem ) {
    first = firstItem;
    second = secondItem;
  }

  public void changeOrder() {
    T temp = first;
    first = second;
    second = temp;
  }

  public String toString() {
    return "( " + first + ", " + second + " )";
  }

  public static void main( String[] args ) {
    OrderedPair<String> fruit = new OrderedPair<String>();
    fruit.setPair( "apples", "oranges" );
    System.out.println( fruit );
    fruit.changeOrder();
    System.out.println( fruit );

    Name tweedleDee = new Name( "Tweedle", "Dee" );
    Name tweedleDum = new Name( "Tweedle", "Dum" );
    OrderedPair<Name> couple = new OrderedPair<Name>();
    couple.setPair( tweedleDum, tweedleDee );
    System.out.println( couple );
    couple.changeOrder();
    System.out.println( couple );

    OrderedPair<Integer> pair = new OrderedPair<Integer>();
    pair.setPair( 42, 314 );
    System.out.println( pair );
    pair.changeOrder();
    System.out.println( pair );
  }
}