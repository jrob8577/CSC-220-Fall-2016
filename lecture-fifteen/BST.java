
public class BST< T extends Comparable< T >> {

  private Node< T > root;

  public BST() {
    this.root = null;
  }

  public int height() {
    return height( this.root );
  }

  private int height( Node subtree ) {
    if( subtree == null ) {
      return 0;
    } else {
      return 1 + Math.max( height( subtree.left ), height( subtree.right ) );
    }
  }

  public void insert( T data ) {
    if( this.root == null ) {
      this.root = new Node( data );
    } else {
      insert( this.root, data );
    }
  }

  private void insert( Node< T > subtree, T data ) {
    if( data.compareTo( subtree.data ) < 0 ) {
      if( subtree.left == null ) {
        subtree.left = new Node( data );
      } else {
        insert( subtree.left, data );
      }
    } else {
      if( subtree.right == null ) {
        subtree.right = new Node( data );
      } else {
        insert( subtree.right, data );
      }
    }
  }

  public boolean delete( T data ) {
    return false;
  }

  public boolean search( T key ) {
    return search( this.root, key );
  }

  private boolean search( Node subtree, T key ) {
    /* YOU IMPLEMENT THIS */
    return false;
  }

  public void inorder() {
    inorder( this.root );
  }

  private void inorder( Node subtree ) {
    /* YOU IMPLEMENT THIS
      inorder traversal of subtree->left
      print out subtree->data
      inorder traversal of subtree->right
    */
  }

  public void preorder() {
    preorder( this.root );
  }

  private void preorder( Node subtree ) {
    /* YOU IMPLEMENT THIS */
  }

  public void postorder() {
    postorder( this.root );
  }

  private void postorder( Node subtree ) {
    /* YOU IMPLEMENT THIS */
  }

  // public String toString() {
  //   StringBuilder builder = new StringBuilder();
  //
  //
  //
  //   return builder.toString();
  // }

  public static void main( String[] args ) {
    BST<Integer> tree = new BST<Integer>();

    tree.insert( 29 );
    tree.insert( 17 );
    tree.insert( 50 );
    tree.insert( 5 );
    tree.insert( 20 );
    tree.insert( 30 );
    tree.insert( 100 );

    System.out.println( "Tree height is: " + tree.height() );

    System.out.println( "Inorder traversal:" );
    tree.inorder();

    System.out.println( "Preorder traversal:" );
    tree.preorder();

    System.out.println( "Postorder traversal:" );
    tree.postorder();
  }

  private class Node< T > {
    private T data;
    private Node left;
    private Node right;

    public Node( T data ) {
      this( data, null, null );
    }

    public Node( T data, Node left, Node right ) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }
}
