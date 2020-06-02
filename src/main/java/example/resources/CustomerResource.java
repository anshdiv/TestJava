package example.resources;

import com.codahale.metrics.annotation.Timed;
import example.core.models.Customer;
import example.core.models.User;
import example.db.CustomerDao;
import io.dropwizard.auth.Auth;
import org.jdbi.v3.core.Jdbi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Optional;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    final private Jdbi jdbi;

    public CustomerResource(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    @GET
    @Timed
    public List<Customer> getCustomers(@Auth User user,@QueryParam("customerId") Optional<Long> customerId){
        final CustomerDao dao = jdbi.onDemand(CustomerDao.class);
        if (customerId.isPresent()){
            return dao.getCustomerById(customerId.get());
        }else {
            return dao.getCustomers();
        }
    }

    @POST
    @Timed
    public void addCustomer(@Auth User user,Customer customer){
        final CustomerDao dao = jdbi.onDemand(CustomerDao.class);
        dao.addCustomer(customer);
    }

    @PUT
    @Timed
    public void updateCustomer(@Auth User user,Customer customer){
        final CustomerDao dao = jdbi.onDemand(CustomerDao.class);
        dao.update(customer);
    }

    @DELETE
    @Path("/{customerId}")
    @Timed
    public void deleteCustomer(@Auth User user,@PathParam("customerId") long customerId){
        System.out.println("CustomerId "+customerId);
        final CustomerDao dao = jdbi.onDemand(CustomerDao.class);
        dao.deleteCustomer(customerId);
    }
}
