package com.lxz.restful.web.support;


import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.google.common.collect.Sets;
import com.lxz.restful.web.controller.Library;

@ApplicationPath("api")
public class RestfulApplication extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = Sets.newHashSet();
        //classes.add(RestfulRequestFilter.class);
        classes.add(Library.class);
        //classes.add(RestfulExceptionMapper.class);

        //classes.add(RestfulResponseFilter.class);
        return classes;
    }
    @Override
    public Set<Object> getSingletons() {
        Set<Object> singletons = Sets.newHashSet();
        singletons.add(new RestfulRequestFilter());
        singletons.add(new RestfulResponseFilter());
        singletons.add(new RestfulExceptionMapper());

        return singletons;
    }
}