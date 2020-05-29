package example.resources;

import com.codahale.metrics.annotation.Timed;
import org.jdbi.v3.core.Jdbi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {

    final private Jdbi jdbi;

    public CustomerResource(Jdbi jdbi) {
        this.jdbi = jdbi;
    }


    @GET
    @Timed
    public List<String> getCustomers(){
        return jdbi.withHandle(handle ->
                handle.createQuery("select CustomerName from Customers")
                        .mapTo(String.class)
                        .list());
    }
}
