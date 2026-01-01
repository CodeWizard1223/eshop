package sk.streetofcode.productordermanagement.implementation.jdbc.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import sk.streetofcode.productordermanagement.domain.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ProductRowMapper implements RowMapper<Product> {

  @Override
  public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
    return new Product(
        rs.getLong("id"),
        rs.getString("name"),
        rs.getString("description"),
        rs.getInt("amount"),
        rs.getDouble("price")
    );
  }
}
