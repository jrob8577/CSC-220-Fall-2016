public class CollegeStudent extends Student {
  private int year;
  private String degree;

  public CollegeStudent() {
    // The call to the base class constructor must be first statement
    super();

    year = 0;
    degree = "";
  }

  public CollegeStudent( Name name, String id, int year, String degree ) {
    super( name, id );

    this.year = year;
    this.degree = degree;
  }

  public void setStudent( Name name, String id, int year, String degree ) {
    // Why are we using the mutators, and not setting directly?
    // i.e. fullName = name
    setName( name );
    setId( id );
    this.year = year;
    this.degree = degree;
  }

  public String toString() {
    // Note the usage of super here - why?
    return super.toString() + ", " + this.degree + ", " + this.year
  }
}