package com.lxz.restful.web.support;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Date;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.NewCookie;

/**
 * Created by xiaolezheng on 16/3/16.
 */
@PreMatching
@Slf4j
public class RestfulResponseFilter implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        containerResponseContext.getCookies().put("res_index", new NewCookie("res_index",new Date().toString()));
        log.info("response filter........");

    }
}
