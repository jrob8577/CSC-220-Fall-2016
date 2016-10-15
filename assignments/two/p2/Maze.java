package p2;

import java.util.Vector;

public class Maze {
  private char[][] maze;
  private int height;
  private int width;

  /**
   * Create a new Maze of the specified height and width, initializing every
   * location as empty, with a ' '.
   **/
  public Maze( int width, int height ) {
    // ADD STATEMENTS HERE
  }

  /**
   * Mutator to allow us to set the specified Coordinate as blocked,
   * marking it with a 'X'
   **/
  public void setBlocked( Coordinate coord ) {
    // ADD STATEMENTS HERE
  }

  /**
   * Mutator to allow us to set the specified Coordinate as having been visited,
   * marking it with a '*'
   **/
  public void setVisited( Coordinate coord ) {
    // ADD STATEMENTS HERE
  }

  /**
   * Mutator to allow us to set the specified Coordinate as part of the path solution,
   * marking it with a '.'
   **/
  public void setPath( Coordinate coord ) {
    // ADD STATEMENTS HERE
  }

  /**
   * Returns the character at the locatio specified by the Coordinate
   **/
  public char at( Coordinate coord ) {
    // ADD STATEMENTS HERE
  }

  /**
   * Returns a Coordinate array containing all Coordinates that are clear around
   * the specified coordinate.
   **/
  public Coordinate[] clearAround( Coordinate coord ) {
    Vector<Coordinate> vector = new Vector<Coordinate>();

    // ADD STATEMENTS HERE
    // Look at each of the locations around the specified Coordinate, and add it
    // to the vector if it is clear (i.e. a space)

    return vector.toArray( new Coordinate[0] );
  }

  /**
   * Returns a Coordinate that provides the entrance location in this maze.
   **/
  public Coordinate start() {
    return new Coordinate( 0, 1 );
  }

  /**
   * Returns a Coordinate that provides the exit location from this maze.
   **/
  public Coordinate end() {
    // ADD STATEMENTS HERE
  }

  /**
   * The toString() method is responsible for creating a String representation
   * of the Maze.  See the project specification for sample output.  Note that
   * the String representation adds numbers across the top and side of the Maze
   * to show the Coordinates of each cell in the maze.
   **/
  public String toString() {
    StringBuilder buffer = new StringBuilder();

    // ADD STATEMENTS HERE
    // First, print out the column headings

    // Next, print out each row in the maze - note the spaces between
    // cells to facilitate reading.  Each row should include its row number.

    return buffer.toString();
  }
}
