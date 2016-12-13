package org.uth.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/quotas")
public class Quotas
{
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public String getVisibleQuotas()
  {
    StringBuilder working = new StringBuilder(); 
   
    Runtime runtime = Runtime.getRuntime();
    
    int processors = runtime.availableProcessors();
    long freeMem = runtime.freeMemory();
    long maxMem = runtime.maxMemory();
    long totalMem = runtime.totalMemory();
    
    working.append( "{\"stats\" : {\n");
    working.append( "  \"processors\" : " + processors + ",\n" );
    working.append( "  \"free_memory\" : " + freeMem + ",\n" );
    working.append( "  \"max_memory\" : " + maxMem + ",\n" );
    working.append( "  \"total_memory\" : " + totalMem + "\n"  );
    working.append( "}}\n");
    
    return working.toString();
  }
}
