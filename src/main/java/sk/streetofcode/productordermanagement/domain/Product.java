package sk.streetofcode.productordermanagement.domain;

import java.math.BigDecimal;

public class Product {

  private final long id;

  private String name;

  private String description;

  private int amount;

  private BigDecimal price;

  public Product(long id, String name, String description, int amount, BigDecimal price) {
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

  public BigDecimal getPrice() {
    return price;
  }
}
