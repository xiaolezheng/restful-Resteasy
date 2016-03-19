package com.lxz.restful.web.support;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by xiaolezheng on 16/3/16.
 */
@PreMatching
@Slf4j
public class RestfulRequestFilter implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        log.info("request filter........");
    }
}
