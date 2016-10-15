package p2;

public class Coordinate {
  public int x;
  public int y;

  public Coordinate( int x, int y ) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }

  @Override
  public boolean equals( Object object ) {
    if( object == null ) {
      return false;
    }

    if( ! Coordinate.class.isAssignableFrom( object.getClass() )) {
      return false;
    }

    final Coordinate other = (Coordinate) object;

    return this.x == other.x && this.y == other.y;
  }
}
