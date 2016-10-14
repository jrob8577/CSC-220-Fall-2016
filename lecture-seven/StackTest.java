public class StackTest {
  public static void main( String[] args ) {
    StackInterface<String> stack = new LinkedStack<String>();
    stack.push( "Jim" );
    stack.push( "Jess" );
    stack.push( "Jill" );
    stack.push( "Jane" );
    stack.push( "Joe" );

    String top = stack.peek();
    System.out.println( top + " is at the top of the stack." );

    top = stack.pop();
    System.out.println( top + " was removed from the stack." );

    top = stack.pop();
    System.out.println( top + " was removed from the stack." );

    top = stack.pop();
    System.out.println( top + " was removed from the stack." );
  }
}
