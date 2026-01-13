package com.test;

import java.io.PrintWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class HelloService {

	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public String simpleHelloPlainTextResponse() {
		return "this is rest api simple plain txt response";
	}

	@GET
	@Path("/{db}")
	@Produces(MediaType.TEXT_HTML)
	public String simpleHTMLResponse(@PathParam("db") String num) {
		return "<html><body><h2> Simple HTML Data Response :: " + num + " </h2></body></html>";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUser(@QueryParam("msg") String msg, HttpServletResponse response) {
		try {
			PrintWriter out = response.getWriter();
			out.println("from hello service" + msg);
		}

		catch (Exception e) {

		}

		return msg;

	}

	@GET
	@Path("/items")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item1> listDataResponse() {
		return List.of(new Item1(1,"pen"),new Item1(2,"pencil"),new Item1(3,"sketch"),new Item1(4,"paper"),new Item1(5,"crayon"));
	}

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createItemsData(Item1 item)
	{
		ObjectMapper mapper= new ObjectMapper();
		
		ObjectNode json=mapper.createObjectNode();
		
		json.put("result","jersey json example using jackson 3.x");
		
		json.put("success", "ok");
		
		return Response.status(Response.Status.CREATED).entity(json).build();
	}
}

class Item1{
	
	private int id;
	
	private String name;
	
	public Item1()
	{
		
}

	public Item1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item1 [id=" + id + ", name=" + name + "]";
	}
	
}
