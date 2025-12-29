package sk.streetofcode.productordermanagement.api.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddToOrderRequest {

  private long productId;

  private long amount;

}
