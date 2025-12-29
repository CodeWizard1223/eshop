package sk.streetofcode.productordermanagement.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {

  private String name;

  private String description;

  private int amount;

  private double price;

}
