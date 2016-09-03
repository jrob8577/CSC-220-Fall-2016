/*
 * This class demonstrates a common approach to organizing a class' code
 */

public class Name {
  /*
   * We start with the data fields (usually private)
   */
  private String first;
  private String last;

  /*
   * Constructors are typically next, beginning with the default constructor
   */
  public Name() {
  }

  // Notice *how* I'm using the parameters here - why?
  public Name( String firstName, String lastName ) {
    setName( firstName, lastName );
  }

  /*
   * Accessor and mutators appear together in the file
   */
  public String getName() {
    return toString();
  }

  // Notice *how* I'm setting the fields here - why?
  public void setName( String firstName, String lastName ) {
    setFirst( firstName );
    setLast( lastName );
  }

  public String getLast() {
    return last;
  }

  public void setLast( String lastName ) {
    last = lastName;
  }

  public String getFirst() {
    return first;
  }

  public void setFirst( String firstName ) {
    first = firstName;
  }

  public String toString() {
    return first + " " + last;
  }

  public static void main( String[] args ) {
    Name john = new Name( "John", "Roberts" );
    // Notice that I'm not calling toString()
    System.out.println( john );
  }
}