package com.cheng.resteasy.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by niecheng on 2018/10/8.
 */
@Path("/path1")
public class restTest {

    @GET
    @Path("subpath/{id}")
    @Produces("application/json")
    public String get(@PathParam("id") String id){
        String result = "Hello "+id;
        return result;
    }

}
