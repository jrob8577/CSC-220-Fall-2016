public class Item {
  private String name;
  private int price;

  public Item( String name, int price ) {
    this.name = name;
    this.price = price;
  }

  public int getPrice() {
    return this.price;
  }

  public String toString() {
    return this.name + "\t$" + this.price / 100 + "." + this.price % 100;
  }
}