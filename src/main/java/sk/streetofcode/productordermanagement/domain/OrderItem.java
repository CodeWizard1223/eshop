package sk.streetofcode.productordermanagement.domain;

public class OrderItem {

  private final long productId;

  private final int amount;

  public OrderItem(long productId, int amount) {
    this.productId = productId;
    this.amount = amount;
  }

  public long getProductId() {
    return productId;
  }

  public int getAmount() {
    return amount;
  }
}
