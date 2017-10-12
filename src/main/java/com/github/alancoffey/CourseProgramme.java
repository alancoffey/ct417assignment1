package com.github.alancoffey;
import java.util.ArrayList;
import org.joda.time.*;

public class CourseProgramme{
  private String name;
  private ArrayList<Module>  modules;
  private DateTime startDate;
  private DateTime endDate;

  public CourseProgramme(String name, ArrayList<Module> mod, DateTime startDate, DateTime endDate)
  {
        this.name = name;
        this.modules = mod;
        this.startDate = startDate;
        this.endDate = endDate;
  }
  
  public String getName() {
        return this.name;
  }

  public void setName(String name){
        this .name = name;
  }

  public ArrayList<Module> getModules() {
        return this.modules;
  }

  public void setModules(ArrayList<Module>  modules){
        this.modules = modules;
  }

  public DateTime getStartDate() {
        return this.startDate;
  }
  public DateTime getEndDate() {
        return this.endDate;
  }

  public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
  }
  public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
  }
}