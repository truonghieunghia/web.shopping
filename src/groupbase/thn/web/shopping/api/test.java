package groupbase.thn.web.shopping.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public class test {

	@GET
	@Produces("application/json")
	public String testws(){
		return "hello";
	}
}
