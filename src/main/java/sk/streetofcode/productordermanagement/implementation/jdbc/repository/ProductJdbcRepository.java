package sk.streetofcode.productordermanagement.implementation.jdbc.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sk.streetofcode.productordermanagement.api.response.ProductResponse;
import sk.streetofcode.productordermanagement.domain.Product;
import sk.streetofcode.productordermanagement.implementation.jdbc.mapper.ProductRowMapper;

import java.util.List;

@Repository
public class ProductJdbcRepository {

  private final ProductRowMapper productRowMapper;

  private final JdbcTemplate jdbcTemplate;

  private static final String GET_ALL;

  static {
    GET_ALL = "SELECT * FROM product";
  }

  public ProductJdbcRepository(ProductRowMapper productRowMapper, JdbcTemplate jdbcTemplate) {
    this.productRowMapper = productRowMapper;
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Product> getAll() {
    return jdbcTemplate.query(GET_ALL, productRowMapper);
  }
}
