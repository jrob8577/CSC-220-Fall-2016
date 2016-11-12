import java.util.*;

class MapExample {
  public static void main( String[] args ) {
    Map< String, String > accounts = new HashMap<String, String>();

    accounts.put( "home loan", "Citibank" );
    accounts.put( "personal loan", "Wells Fargo" );
    accounts.put( "saving account", "Chase" );

    System.out.println( "Print map:" );
    System.out.println( accounts );
    System.out.println( "------------------------------------------------" );
    System.out.println( "Iterating or looping map using foreach loop & keySet()" );

    // return a set of all keys: Set<K> keySet()
    for( String key : accounts.keySet() ) {
      System.out.println( "key: " + key + " value: " + accounts.get( key ));
    }

    System.out.println( "------------------------------------------------" );
    System.out.println( "Iterating or looping map using foreach loop & entrySet()" );

    // return a set of all entries Set<Map.Entry<K,V>> entrySet()
    Set< Map.Entry<String, String> > entrySet = accounts.entrySet();

    for( Map.Entry< String, String > entry : entrySet ) {
      System.out.println( "key: " + entry.getKey() + " value: " + entry.getValue() );
    }
}}
