import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Driver
{
  public static void main (String [] args) {
    FrequencyCounter wordCounter = new FrequencyCounter();
    String fileName = "data.txt";

    try {
      Scanner data = new Scanner( new File( fileName ));
      wordCounter.readFile( data );
    } catch( FileNotFoundException e ) {
      System.out.println( "File not found: " + e.getMessage() );
    } catch( IOException e ) {
      System.out.println( "I/O error " + e.getMessage() );
    }

    wordCounter.display();
    System.out.println("Bye!");
  }
}
