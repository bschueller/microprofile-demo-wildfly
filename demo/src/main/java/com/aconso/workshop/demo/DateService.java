package com.aconso.workshop.demo;

import java.time.LocalDateTime;
import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient
@RegisterClientHeaders
@Path("date")
@Dependent
public interface DateService {

  @GET
  @Timeout(500)
  @Fallback(fallbackMethod = "defaultWorkshopDate")
  LocalDateTime getWorkshopDate();
  
  default LocalDateTime defaultWorkshopDate() {
    return LocalDateTime.now();
  }
}
