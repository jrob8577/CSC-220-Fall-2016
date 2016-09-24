/**
 * A class that maintains a shopping cart for an online store.
 * @author Frank M. Carrano
 */
public class OnlineShopper
{
  public static void main( String [] args ) {
    Item [] items = {
      new Item( "Bird feeder", 2050 ),
      new Item( "Squirrel guard", 1547 ),
      new Item( "Bird bath", 4499 ),
      new Item( "Sunflower seeds", 1295 )
    };

    BagInterface< Item > shoppingCart = new ArrayBag< Item >();
    int totalCost = 0;

    // statements that add selected items to the shopping cart:
    for( int index = 0 ; index < items.length ; index++ ) {
      shoppingCart.add( items[ index ] );
    }

    // simulate checkout
    while ( !shoppingCart.isEmpty() ) {
      Item nextItem = shoppingCart.remove();
      totalCost += nextItem.getPrice();

      System.out.println( nextItem );
    }

    System.out.println(
      "Total cost: " + "\t$" + totalCost / 100 + "." + totalCost % 100
    );
  } // end main
} // end OnlineShopper
