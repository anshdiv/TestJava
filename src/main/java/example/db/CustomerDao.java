package example.db;

import example.core.models.Customer;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.util.List;

public interface CustomerDao {

    @SqlQuery("Select * from Customers")
    @RegisterBeanMapper(Customer.class)
    List<Customer> getCustomers();

    @SqlQuery("Select * from Customers Where CustomerId = :customerId")
    @RegisterBeanMapper(Customer.class)
    List<Customer> getCustomerById(@Bind("customerId") long customerId);

    @SqlUpdate("INSERT INTO Customers(CustomerName,City) VALUES (:customerName, :city)")
    void addCustomer(@BindBean Customer customer);

    @SqlUpdate("UPDATE Customers set CustomerName = :customerName, City=:city where CustomerId = :customerId")
    void update(@BindBean Customer customer);

    @SqlUpdate("DELETE FROM Customers WHERE CustomerId = :customerId")
    void deleteCustomer(@Bind("customerId") long customerId);
}
