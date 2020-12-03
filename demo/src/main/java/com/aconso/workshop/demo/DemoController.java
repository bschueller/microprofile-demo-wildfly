package com.aconso.workshop.demo;

import java.time.LocalDateTime;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RestClient;

/**
 *
 */
@Path("/workshop")
@Singleton
@Produces(MediaType.APPLICATION_JSON)
public class DemoController {

  @Inject
  @RestClient
  DateService dateService;
  
  @Inject
  DemoService demoService;

  @GET
  @RolesAllowed("user")
  public WorkshopData getWorkshopInfo() {
    LocalDateTime localDateTime = dateService.getWorkshopDate();
    String location = demoService.getWorkshopLocation();
    return new WorkshopData(location, localDateTime);
  }
  
}
