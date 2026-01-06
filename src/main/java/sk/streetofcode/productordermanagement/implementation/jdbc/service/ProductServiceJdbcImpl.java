package sk.streetofcode.productordermanagement.implementation.jdbc.service;

import org.springframework.stereotype.Service;
import sk.streetofcode.productordermanagement.api.ProductService;
import sk.streetofcode.productordermanagement.api.request.AddProductRequest;
import sk.streetofcode.productordermanagement.api.request.ProductAmountRequest;
import sk.streetofcode.productordermanagement.api.request.UpdateProductRequest;
import sk.streetofcode.productordermanagement.api.response.ProductAmountResponse;
import sk.streetofcode.productordermanagement.api.response.ProductResponse;
import sk.streetofcode.productordermanagement.domain.Product;
import sk.streetofcode.productordermanagement.implementation.jdbc.repository.ProductJdbcRepository;

import java.util.List;

@Service
public class ProductServiceJdbcImpl implements ProductService {

  private final ProductJdbcRepository productJdbcRepository;

  public ProductServiceJdbcImpl(ProductJdbcRepository productJdbcRepository) {
    this.productJdbcRepository = productJdbcRepository;
  }

  @Override
  public List<Product> getAll() {
    return productJdbcRepository.getAll();
  }

  @Override
  public ProductResponse getById(long id) {
    return null;
  }

  @Override
  public ProductAmountResponse getAmount(long id) {
    return null;
  }

  @Override
  public ProductResponse add(AddProductRequest request) {
    return null;
  }

  @Override
  public ProductAmountResponse addAmount(long id, ProductAmountRequest request) {
    return null;
  }

  @Override
  public ProductResponse updateProduct(long id, UpdateProductRequest request) {
    return null;
  }

  @Override
  public void delete(long id) {

  }
}
