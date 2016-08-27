import javax.swing.JOptionPane;

public class SimpleIO {
  public static void main( String[] args ) {
    String read = JOptionPane.showInputDialog( "Enter something:" );

    JOptionPane.showMessageDialog( null, read );
  }
}