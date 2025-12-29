package sk.streetofcode.productordermanagement.domain;

public class Product {

  private final long id;

  private final String name;

  private final String description;

  private final int amount;

  private final double price;

  public Product(long id, String name, String description, int amount, double price) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.amount = amount;
    this.price = price;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getAmount() {
    return amount;
  }

  public double getPrice() {
    return price;
  }
}
