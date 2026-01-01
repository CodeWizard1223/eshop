package sk.streetofcode.productordermanagement.implementation.jdbc.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import sk.streetofcode.productordermanagement.domain.OrderItem;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class OrderItemRowMapper implements RowMapper<OrderItem> {

  @Override
  public OrderItem mapRow(ResultSet rs, int rowNum) throws SQLException {
    return new OrderItem(
        rs.getLong("productId"),
        rs.getInt("amount")
    );
  }
}
