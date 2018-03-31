package br.vandersoncamp.resources;import br.vandersoncamp.simples.business.ClienteBusiness;import br.vandersoncamp.simples.model.Cliente;import javax.enterprise.context.RequestScoped;import javax.inject.Inject;import javax.ws.rs.*;import javax.ws.rs.core.MediaType;import javax.ws.rs.core.Response;@Path("/clientes")@RequestScopedpublic class ClienteResource {    @Inject    private ClienteBusiness business;    @GET    @Path("{id}")    @Produces(MediaType.APPLICATION_JSON)    public Response buscar(@PathParam("id") Long id) {        Cliente cliente = business.buscar(id);        if (cliente == null) {            return Response.status(Response.Status.NOT_FOUND).build();        }        return Response.ok(cliente).build();    }    @GET    @Path("all")    @Produces(MediaType.APPLICATION_JSON)    public Response pesquisar(            @QueryParam("filterField") String filterField,            @QueryParam("filterValue") String filterValue,            @QueryParam("order") String order) {        return Response.ok(business.pesquisar(filterField, filterValue, order)).build();    }    @POST    @Produces(MediaType.APPLICATION_JSON)    @Consumes(MediaType.APPLICATION_JSON)    public Response criar(Cliente cliente) {        business.criar(cliente);        return Response.status(Response.Status.CREATED).entity(cliente).build();    }    @PUT    @Path("{id}")    @Produces(MediaType.APPLICATION_JSON)    @Consumes(MediaType.APPLICATION_JSON)    public Response atualizar(Cliente cliente, @PathParam("id") Long id) {        if (!id.equals(cliente.getId())) {            return Response.status(Response.Status.BAD_REQUEST).entity("ID do objeto difere do ID da URL").build();        }        business.atualizar(cliente);        return Response.status(Response.Status.OK).entity(cliente).build();    }    @DELETE    @Path("{id}")    public Response excluir(@PathParam("id") Long id) {        business.excluir(id);        return Response.status(Response.Status.NO_CONTENT).build();    }}