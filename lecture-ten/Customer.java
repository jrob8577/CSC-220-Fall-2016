public class Customer {
  private int arrivalTime;
  private int transactionTime;
  private int id;

  public Customer( int arrivalTime, int transactionTime, int id ) {
    this.id = id;
    this.arrivalTime = arrivalTime;
    this.transactionTime = transactionTime;
  }

  public int getTransactionTime() {
    return this.transactionTime;
  }

  public int getArrivalTime() {
    return this.arrivalTime;
  }

  public int getCustomerNumber() {
    return this.id;
  }
}
