public class Animal {
  public int i = 10;

  public static void testClassMethod() {
    System.out.println( "The class method in Animal." );
  }

  public void testInstanceMethod() {
    System.out.println( "The instance method in Animal." );
  }

  public static void main( String[] args ) {
    Cat myCat = new Cat();
    Animal myAnimal = myCat;

    Animal.testClassMethod();
    myAnimal.testInstanceMethod();
    myAnimal.testClassMethod();

    myCat.testClassMethod();

    System.out.println( "myCat.i: " + myCat.i );
    System.out.println( "myAnimal.i: " + myAnimal.i );
  }
}

class Cat extends Animal {
  public int i = 20;

  public static void testClassMethod() {
    System.out.println( "The class method in Cat." );
  }

  public void testInstanceMethod() {
    System.out.println( "The instance method in Cat." );
  }
}