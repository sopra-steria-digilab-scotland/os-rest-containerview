package org.uth.rest.mbeans;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import org.uth.rest.utils.DateFormatter;

@Path("/mbeans/runtime")
public class Runtime
{
  @GET
  @Produces({MediaType.APPLICATION_JSON})
  public String getDetails()
  {
    RuntimeMXBean mxbean = ManagementFactory.getRuntimeMXBean();
    
    String vendor = mxbean.getVmVendor(); 
    String vmName = mxbean.getVmName();
    String vmVersion = mxbean.getVmVersion();
    
    String bootClassPath = mxbean.getBootClassPath();
    String classPath = mxbean.getClassPath();
    String libraryPath = mxbean.getLibraryPath();

    String managementSpecVersion = mxbean.getManagementSpecVersion();
    String specName = mxbean.getSpecName();
    String specVendor = mxbean.getSpecVendor();
    String specVersion = mxbean.getSpecVersion();
    long startTime = mxbean.getStartTime();
    long upTime = mxbean.getUptime();
           
    StringBuilder working = new StringBuilder();
    
    working.append( "{ \"runtime\" : {\n" );
    working.append( "  \"vendor\" : {\n" );
    working.append( "    \"name\" : \"" + vendor + "\",\n" );
    working.append( "    \"vm\" : \"" + vmName + "\",\n" );
    working.append( "    \"version\" : \"" + vmVersion + "\"\n" );
    working.append( "  },\n" );
    working.append( "  \"paths\" : {\n" );
    working.append( "    \"classPath\" : \"" + classPath + "\",\n" );
    working.append( "    \"bootClassPath\" : \"" + bootClassPath + "\",\n" );
    working.append( "    \"libraryPath\" : \"" + libraryPath + "\"\n" );
    working.append( "  },\n" );
    working.append( "  \"specifications\" : {\n" );
    working.append( "    \"managementVersion\" : \"" + managementSpecVersion + "\",\n" );
    working.append( "    \"name\" : \"" + specName + "\",\n" );
    working.append( "    \"vendor\" : \"" + specVendor + "\",\n" );
    working.append( "    \"version\" : \"" + specVersion + "\"\n" );
    working.append( "  },\n" );
    working.append( "  \"timings\" : {\n" );
    working.append( "    \"startTime\" : \"" + DateFormatter.longDateFormat(startTime) + "\",\n" );
    working.append( "    \"upTime\" : " + upTime + "\n" );
    working.append( "  },\n" );    
    working.append( "}}\n" );
    
    return working.toString();
  }
}
