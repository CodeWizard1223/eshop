package sk.streetofcode.productordermanagement.implementation.jdbc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sk.streetofcode.productordermanagement.api.exception.InternalErrorException;
import sk.streetofcode.productordermanagement.api.exception.ResourceNotFoundException;
import sk.streetofcode.productordermanagement.domain.Product;
import sk.streetofcode.productordermanagement.implementation.jdbc.mapper.ProductRowMapper;

import java.util.List;

@Repository
public class ProductJdbcRepository {

  private final ProductRowMapper productRowMapper;

  private final JdbcTemplate jdbcTemplate;

  private static final Logger logger;

  private static final String GET_ALL;

  private static final String GET_BY_ID;

  private static final String GET_BY_AMOUNT;

  static {
    logger = LoggerFactory.getLogger(ProductJdbcRepository.class);
    GET_ALL = "SELECT * FROM product";
    GET_BY_ID = "SELECT * FROM product WHERE id = ?";
    GET_BY_AMOUNT = "SELECT amount FROM product WHERE id = ?";
  }

  public ProductJdbcRepository(ProductRowMapper productRowMapper, JdbcTemplate jdbcTemplate) {
    this.productRowMapper = productRowMapper;
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Product> getAll() {
    return jdbcTemplate.query(GET_ALL, productRowMapper);
  }

  public Product getById(long id) {
    try {
      return jdbcTemplate.queryForObject(GET_BY_ID, productRowMapper, id);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException("Product with id " + id + " was not found.");
    } catch (DataAccessException e) {
      logger.error("Error while getting product", e);
      throw new InternalErrorException("Error while getting product by id.");
    }
  }

  public Integer getAmount(long id) {
    try {
      return jdbcTemplate.queryForObject(GET_BY_AMOUNT, Integer.class, id);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException("Product with id " + id + " was not found.");
    } catch (DataAccessException e) {
      logger.error("Error while getting product", e);
      throw new InternalErrorException("Error while getting product by id.");
    }
  }
}
