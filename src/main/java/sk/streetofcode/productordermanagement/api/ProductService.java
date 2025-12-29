package sk.streetofcode.productordermanagement.api;

import sk.streetofcode.productordermanagement.api.request.AddProductRequest;
import sk.streetofcode.productordermanagement.api.request.ProductAmountRequest;
import sk.streetofcode.productordermanagement.api.request.UpdateProductRequest;
import sk.streetofcode.productordermanagement.api.response.ProductAmountResponse;
import sk.streetofcode.productordermanagement.api.response.ProductResponse;

import java.util.List;

public interface ProductService {

  List<ProductResponse> getAll();

  ProductResponse getById(long id);

  ProductAmountResponse getAmount(long id);

  ProductResponse add(AddProductRequest request);

  ProductAmountResponse addAmount(long id, ProductAmountRequest request);

  ProductResponse changeProduct(long id, UpdateProductRequest request);

  void delete(long id);

}
