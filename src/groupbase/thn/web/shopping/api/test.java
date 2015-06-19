package groupbase.thn.web.shopping.api;

import groupbase.thn.web.shopping.api.result.json.OriginEntryJson;
import groupbase.thn.web.shopping.common.database.MysqlConnect;
import groupbase.thn.web.shopping.entry.Origin;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/test")
public class test {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String testws(){
		MysqlConnect connect = new MysqlConnect();
		connect.open();
		ArrayList<Origin> genders = connect.executeQueryEntry(Origin.class, null);
		connect.close();
		OriginEntryJson resultJson = new OriginEntryJson();
		resultJson.origin_list = genders;
		String json = new Gson().toJson(resultJson);
		return json;
	}
}
