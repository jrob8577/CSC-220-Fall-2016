package p2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MazeReader {
  private String fileName;
  private Maze maze;

  public MazeReader( String fileName ) {
    this.fileName = fileName;
    this.maze = null;
  }

  public Maze open() throws FileNotFoundException {
    Scanner scanner = new Scanner( new File( this.fileName ));

    int width = scanner.nextInt();
    int height = scanner.nextInt();

    this.maze = new Maze( width, height );

    // Remove new line after int
    scanner.nextLine();

    // ADD STATEMENTS HERE
    // You will need to read in each line using the Scanner, and provide
    // the row number and the line to the addLine method to add it to the Maze

    return this.maze;
  }

  private void addLine( int row, String line ) {
    // ADD STATEMENTS HERE
  }

  public static void main( String[] args ) throws FileNotFoundException {
    MazeReader reader = new MazeReader( "sampleMaze.txt" );
    Maze maze = reader.open();

    System.out.println( maze );
    System.out.println( maze.at( new Coordinate( 0, 0 )));
    System.out.println( maze.at( new Coordinate( 0, 1 )));
  }
}
