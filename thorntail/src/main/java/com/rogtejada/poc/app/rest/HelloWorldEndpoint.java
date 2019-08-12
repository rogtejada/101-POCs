package com.rogtejada.poc.app.rest;


import com.rogtejada.poc.app.dao.ClientDao;
import com.rogtejada.poc.app.entity.Client;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/client")
public class HelloWorldEndpoint {

	@GET
	@Path("/list")
	@Produces("text/plain")
	public Response getAllClients() {
		ClientDao clientDao = new ClientDao();
		return Response.ok(clientDao.findAll()).build();
	}

	@GET
	@Path("/save/{name}/{lastName}/{cpf}")
	@Produces("text/plain")
	public Response saveClient(@PathParam("name")String name,
							   @PathParam("lastName")String lastName,
							   @PathParam("cpf")String cpf) {
		ClientDao clientDao = new ClientDao();
		Client client = new Client(name, lastName, cpf);
		clientDao.saveClient(client);
		return Response.ok(String.format("Client \"%s\" successfully saved", client.getName())).build();
	}

	@GET
	@Path("/delete/{id}")
	@Produces("text/plain")
	public Response deleteClient(@PathParam("id")String id) {
		ClientDao clientDao = new ClientDao();
		clientDao.deleteClientById(Integer.parseInt(id));
		return Response.ok("successfully deleted client: " + id).build();
	}


}
