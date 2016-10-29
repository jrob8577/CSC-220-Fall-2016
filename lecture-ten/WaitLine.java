public class WaitLine {
  private QueueInterface<Customer> line;
  private int numberOfArrivals;
  private int numberServed;
  private int totalTimeWaited;

  public WaitLine() {
    line = new LinkedQueue<Customer>();
    reset();
  }

  public void simulate( int duration, double arrivalProbability, int maxTransactionTime) {
    int transactionTimeLeft = 0;

    for( int clock = 0; clock < duration; clock++ ) {
      // if there is new customer
      if( Math.random() < arrivalProbability ) {
        numberOfArrivals++;
        int transactionTime = (int)( Math.random() * maxTransactionTime + 1 );

        Customer nextArrival = new Customer( clock, transactionTime, numberOfArrivals );
        line.enqueue(nextArrival);

        System.out.println(
          "Customer " + numberOfArrivals + " enters line at time " + clock +
          ". Transaction time is " + transactionTime
        );
      }

      if( transactionTimeLeft > 0 ) {
        transactionTimeLeft--;
      } else if( ! line.isEmpty() ) {
        Customer nextCustomer = line.dequeue();

        transactionTimeLeft = nextCustomer.getTransactionTime() - 1;
        int timeWaited = clock - nextCustomer.getArrivalTime();
        totalTimeWaited = totalTimeWaited + timeWaited;

        numberServed++;

        System.out.println(
          "Customer " + nextCustomer.getCustomerNumber() + " begins service at time "
          + clock+ ". Time waited is " + timeWaited
        );
      } 
    }
  }

  public void displayResults() {
    System.out.println();
    System.out.println( "Number served = " + numberServed );
    System.out.println( "Total time waited = " + totalTimeWaited );

    double averageTimeWaited = ((double) totalTimeWaited ) / numberServed;
    System.out.println( "Average time waited = " + averageTimeWaited );

    int leftInLine = numberOfArrivals - numberServed;
    System.out.println( "Number left in line = " + leftInLine) ;
  }

  public final void reset() {
    line.clear();

    numberOfArrivals = 0;
    numberServed = 0;
    totalTimeWaited = 0;
  }
}
