public class Student {
  private Name fullName;
  private String id;

  public void setName( Name name ) {
    this.fullName = name;
  }

  public void setId( String id ) {
    this.id = id;
  }

  public String toString() {
    return "[" + this.id + "] " + this.fullName.toString();
  }
}