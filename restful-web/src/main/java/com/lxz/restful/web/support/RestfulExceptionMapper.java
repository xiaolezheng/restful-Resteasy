package com.lxz.restful.web.support;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import lombok.extern.slf4j.Slf4j;

import com.lxz.restful.service.support.RestfulException;

/**
 * Created by xiaolezheng on 16/3/15.
 */

@Provider
@Slf4j
public class RestfulExceptionMapper implements ExceptionMapper<RestfulException> {

    @Override
    public Response toResponse(RestfulException e) {
        log.info("info response......");
        return Response.status(400).encoding(e.getMessage()).build();
    }
}
