package com.aconso.workshop.demo;

import java.time.LocalDateTime;

public class WorkshopData {

  private LocalDateTime date;
  private String location;
  
  public WorkshopData(String location, LocalDateTime date) {
    this.location = location;
    this.date = date;
  }

  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
  
}
