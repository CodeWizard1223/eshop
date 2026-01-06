package sk.streetofcode.productordermanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.streetofcode.productordermanagement.api.ProductService;
import sk.streetofcode.productordermanagement.domain.Product;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping
  public ResponseEntity<List<Product>> getAll() {
    return ResponseEntity.ok().body(productService.getAll());
  }
}
