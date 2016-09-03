public class A {
  int a;
  public int b;
  private int c;
  static public int d;
  static private int e;

  public void f1() { }
  private void f2() { }
  void f3() { }
  static public f4() { }

  void f5() {
    // List all fields and methods in A that can be accessed here
  }

  static void f6() {
    // List all fields and methods in A that can be accessed here
  }
}

class B {
  void g() {
    A objA = new A();
    System.out.println( objA.a );
    objA.f1();

    // List all fields/methods in objA that can be accessed here
}