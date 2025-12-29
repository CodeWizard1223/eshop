package sk.streetofcode.productordermanagement.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse {

  private long id;

  private List<ShoppingListItem> shoppingList;

  private boolean paid;

}
