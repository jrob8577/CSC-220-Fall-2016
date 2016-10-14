import java.util.Stack;

public class StackDemo {
  public static void main( String[] args ) {
    Stack<Object> stack = new Stack<Object>();

    stack.push( new Integer( 10 ));
    stack.push( "Hello world" );

    System.out.println( "======================================================" );
    System.out.println( "The contents of the Stack are: " + stack );
    System.out.println( "The size of the Stack is: " + stack.size() );
    System.out.println( "Check if stack is empty: " + stack.empty() );
    System.out.println( "Peek at top of the Stack: " + stack.peek() );
    System.out.println( "Search for 10 in Stack: " + stack.search( new Integer( 10 )));

    System.out.println( "======================================================" );
    System.out.println( "Popping item: " + stack.pop() );
    System.out.println( "Popping item: " + stack.pop() );
    System.out.println( "======================================================" );

    System.out.println( "The contents of the Stack are: " + stack );
    System.out.println( "The size of the Stack is: " + stack.size() );
    System.out.println( "Check if stack is empty: " + stack.empty() );
    System.out.println( "Search for 10 in Stack: " + stack.search( new Integer( 10 )));
    System.out.println( "======================================================" );
  }
}
