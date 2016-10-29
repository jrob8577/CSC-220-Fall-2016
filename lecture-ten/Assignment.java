import java.sql.Date;

public class Assignment implements Comparable {

  private String courseCode;
  private String description;
  private Date dueDate;

  public Assignment( String courseCode, String description, Date dueDate ) {
    this.courseCode = courseCode;
    this.description = description;
    this.dueDate = dueDate;
  }

  public int compareTo( Object other ) {
    // Note that this is not the recommended approach to implementing
    // compareTo, but I was in a hurry :)
    return - this.dueDate.compareTo( ((Assignment) other).dueDate );
  }

  public String toString() {
    return "[" + this.courseCode + "] Due: " + this.dueDate + "\n" +
      this.description;
  }
}
