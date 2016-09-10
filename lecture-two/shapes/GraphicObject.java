abstract class GraphicObject {
  int x, y;

  void moveTo( int newX, int newY ) {
    x = newX;
    y = newY;
  }

  abstract void draw();
  abstract void resize();
}