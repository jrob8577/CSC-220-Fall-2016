class X {}
class Y extends X {}
class Z extends X {}

public class RunTimeCastDemo {
  public static void main( String[] args ) {
    X x = new X();
    Y y = new Y();
    Z z = new Z();

    X xy = new Y();
    X xz = new Z();
    Y yz = new Z(); // incompatible type (siblings)

    Y y1 = new X(); // X is not a Y, error
    Z z1 = new X(); // X is not a Z, error

    X x1 = y; // upcast, y is a subclass of X
    X x2 = z; // upcast, z is a subclass of X

    Y y1 = (Y) x; // compiles, but runtime error
    Z z1 = (X) c; // compiles, but runtime error
    Y y2 = (Y) x1; // x1 is type Y, downcast
    Z z2 = (Z) x2; // x2 is type Z, downcase
    Y y3 = (Y) z; // siblings, error
    Z z3 = (Z) y; // siblings, error

    Object o = z; // upcast, z (and everything else) is a subclass of Object
    Y o1 = (Y) o; // runtime error
  }
}