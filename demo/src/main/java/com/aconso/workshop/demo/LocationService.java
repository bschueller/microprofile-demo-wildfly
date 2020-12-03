package com.aconso.workshop.demo;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@RegisterClientHeaders
@Path("location")
@Dependent
public interface LocationService {

  @GET
  String getWorkshopLocation();
  
}
