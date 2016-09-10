public class Circle extends GraphicObject implements Comparable<Circle> {
  private double radius;

  public int compareTo( Circle other ) {
    int result;

    if( this.equals( other ) ) {
      result = 0;
    } else if( radius < other.radius ) {
      result = -1;
    } else {
      result = 1;
    }

    return result;
  }

  void draw() {
    // Implementation
  }

  void resize() {
    // Implementation
  }
}