package com.aconso.workshop.demo;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class DemoService {

  @Inject
  @RestClient
  LocationService locationService;
  
  @Timeout(500)
  @Fallback(fallbackMethod = "defaultWorkshopLocation")
  public String getWorkshopLocation() {
    return locationService.getWorkshopLocation();
  }
  
  String defaultWorkshopLocation() {
    return "Bielefeld";
  }
  
}
