package sk.streetofcode.productordermanagement.api;

import sk.streetofcode.productordermanagement.api.request.AddToOrderRequest;
import sk.streetofcode.productordermanagement.api.response.OrderResponse;

public interface OrderService {

  OrderResponse getById(long id);

  OrderResponse add();

  OrderResponse addProductById(long id, AddToOrderRequest item);

  String pay(long id);

  void delete(long id);

}
