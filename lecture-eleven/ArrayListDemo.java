import java.util.*;

public class ArrayListDemo {

  public static void main( String[] args ) {
    ArrayList<Object> arrayList = new ArrayList<Object>();

    System.out.println( "The content of the arraylist is: " + arrayList );
    System.out.println( "The size of the arraylist is: " + arrayList.size() );

    Integer i1 = new Integer( 10 );
    Integer i2 = new Integer( 20 );
    Integer i3 = new Integer( 30 );
    String st = new String( "hello" );
    arrayList.add( i1 );
    arrayList.add( i2 );
    arrayList.add( st );
    arrayList.add( i2 );
    arrayList.add( i3 );

    System.out.println( "The content of the arraylist is: " + arrayList );
    System.out.println( "The size of the arraylist is: " + arrayList.size() );

    arrayList.remove(3);

    System.out.println( "The content of the arraylist is: " + arrayList );
    System.out.println( "The size of the arraylist is: " + arrayList.size() );

    System.out.println( "Cloning arrayList" );
    Object arrayListTwo = arrayList.clone();

    System.out.println( "The content of the arraylist is: " + arrayList );
    System.out.println( "The size of the arraylist is: " + arrayList.size() );
    System.out.println( "The content of arrayListTwo is: " + arrayListTwo );
  }
}
