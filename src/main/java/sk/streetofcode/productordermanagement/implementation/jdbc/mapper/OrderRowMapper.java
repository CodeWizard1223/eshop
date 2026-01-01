package sk.streetofcode.productordermanagement.implementation.jdbc.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import sk.streetofcode.productordermanagement.domain.Order;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class OrderRowMapper {

  public class ProductRowMapper implements RowMapper<Order> {

    @Override
    public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
      return new Order(
          rs.getLong("id"),
          new ArrayList<>(),
          rs.getBoolean("paid")
      );
    }
  }

}
