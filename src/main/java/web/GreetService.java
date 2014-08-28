package web;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import web.msg.Greeting;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/greet") @Produces(MediaType.APPLICATION_JSON)
public class GreetService {

    @GET @Timed
    public Greeting greet(@QueryParam("hacker") Optional<String> target) {
        return new Greeting("Hello, " + target.or("hacker") + "!");
    }
}
