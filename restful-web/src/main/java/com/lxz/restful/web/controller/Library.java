package com.lxz.restful.web.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import lombok.extern.slf4j.Slf4j;

import org.jboss.resteasy.annotations.GZIP;

import com.google.common.collect.Lists;
import com.lxz.restful.service.support.RestfulException;

/**
 * Created by xiaolezheng on 16/3/14.
 */
@Path("/library")
@Produces("application/json")
@Slf4j
public class Library {

    @GET
    @Path("/books")
    @GZIP
    public Object getBooks() {
        return Lists.newArrayList("1", "2", "3");
    }

    @GET
    @Path("/book/{isbn}")
    public Object getBook(@PathParam("isbn") String id) {
        return id;
    }

    @GET
    @Path("/books/isbn")
    public Object getBookIsbn() {
        return new RestfulException("测试异常");
    }

    /*@GET
    @Path("/basic")
    @Produces("text/plain")
    public void getBasic(@Suspended final AsyncResponse response) throws Exception {
        Thread t = new Thread() {
            @Override
            public void run() {

                try {
                    Response jaxrs = Response.ok("basic").type(MediaType.TEXT_PLAIN).build();
                    response.resume(jaxrs);
                } catch (Exception e) {
                    log.error("", e);
                }
            }
        };
        t.start();
    }*/


}
