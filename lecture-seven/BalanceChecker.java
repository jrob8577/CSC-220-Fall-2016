public class BalanceChecker {
  public static boolean checkBalance( String expression ) {
    StackInterface<Character> openDelimiterStack = new LinkedStack<Character>();

    int characterCount = expression.length();
    boolean isBalanced = true;
    char nextCharacter = '';

    for( int index = 0; isBalanced && ( index < characterCount ); index++ ) {
      nextCharacter = expression.charAt( index );

      switch( nextCharacter ) {
        case '(':
        case '[':
        case '{':
          openDelimiterStack.push( nextCharacter );
          break;
        case ')':
        case ']':
        case '}':
          if( openDelimiterStack.isEmpty() ) {
            isBalanced = false;
          } else {
            char openDelimiter = openDelimiterStack.pop();
            isBalanced = isPaired( openDelimiter, nextCharacter );
          }
          break;
      }
    }

    if( ! openDelimiterStack.isEmpty() ) {
      isBalanced = false;
    }

    return isBalanced;
  }

  private static boolean isPaired( char open, char close ) {
    return ( open == '(' && close == ')' ) ||
      ( open == '[' && close == ']' ) ||
      ( open == '{' && close == '}' )
  }

  public static void main( String[] args ) {
    String expression = "a {b [c (d + e)/2 - f] + 1}";

    if( checkBalance( expression ) ) {
      System.out.println( expession + " is balanced." );
    } else {
      System.out.println( expession + " is not balanced." );
    }
  }
}
