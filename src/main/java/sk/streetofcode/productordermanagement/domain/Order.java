package sk.streetofcode.productordermanagement.domain;

import java.util.List;

public class Order {

  private final long id;

  private final List<OrderItem> items;

  private final boolean paid;

  public Order(long id, List<OrderItem> items, boolean paid) {
    this.id = id;
    this.items = items;
    this.paid = paid;
  }

  public long getId() {
    return id;
  }

  public List<OrderItem> getItems() {
    return items;
  }

  public boolean isPaid() {
    return paid;
  }
}
