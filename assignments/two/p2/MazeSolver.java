package p2;

import java.io.FileNotFoundException;

public class MazeSolver {
  private Maze maze;
  private LinkedStack<Coordinate> path;

  public MazeSolver( Maze maze ) {
    // ADD STATEMENTS HERE
  }

  public void solve() {
    // ADD STATEMENTS HERE
    // Add the starting Coordinate to the maze, and while the Stack has
    // entries, and the top of the Stack is not the end, continue searching
    // for the path
  }

  public static void main( String[] args ) throws FileNotFoundException {
    MazeReader reader = new MazeReader( "sampleMaze.txt" );
    Maze maze = reader.open();
    MazeSolver solver = new MazeSolver( maze );

    System.out.println( "Before solving" );
    System.out.println( maze );
    System.out.println( "Start is " + maze.start() );
    System.out.println( "End is " + maze.end() );

    solver.solve();
    System.out.println( "After solving (. shows solution, o shows visited)" );
    System.out.println( maze );
  }
}
