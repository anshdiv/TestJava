package example.db;

import example.core.models.Customer;
import org.jdbi.v3.core.mapper.RowMapper;
import org.jdbi.v3.core.statement.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerMapper implements RowMapper<Customer> {
    @Override
    public Customer map(ResultSet rs, StatementContext ctx) throws SQLException {
         return new Customer(rs.getLong("CustomerId"), rs.getString("CustomerName"),rs.getString("City"));
    }
}
