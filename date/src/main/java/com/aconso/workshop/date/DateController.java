package com.aconso.workshop.date;

import java.time.LocalDateTime;
import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 */
@Path("/date")
@Singleton
@Produces(MediaType.APPLICATION_JSON)
public class DateController {
  
  @GET
//  @RolesAllowed("admin")
  public LocalDateTime getWorkshopInfo(@HeaderParam("Authorization") String authorization) {
    System.out.println("AUTH: " + authorization);
    return LocalDateTime.of(2020, 12, 24, 14, 00);
  }
}
