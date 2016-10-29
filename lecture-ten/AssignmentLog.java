import java.sql.Date;
import java.util.PriorityQueue;

public class AssignmentLog {

  private PriorityQueue<Assignment> log;

  public AssignmentLog() {
    log = new PriorityQueue<Assignment>();
  }

  public void addProject( Assignment newAssignment ) {
    log.add( newAssignment );
  }

  public void addProject( String courseCode, String task, Date dueDate ) {
    Assignment newAssignment = new Assignment( courseCode, task, dueDate );
    addProject( newAssignment );
  }

  public Assignment getNextProject() {
    return log.peek();
  }

  public Assignment removeNextProject() {
    return log.remove();
  }
}
