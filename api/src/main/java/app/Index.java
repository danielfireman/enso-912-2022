package app;

import io.jooby.annotations.*;

@Path("/index")
public class Index {

  @GET
  @Path("/")
  public String index() {
    return "Bem-vindos/as a API calculadora";
  }
}
