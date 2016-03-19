package com.lxz.restful.service.support;

/**
 * Created by xiaolezheng on 16/3/15.
 */
public class RestfulException extends RuntimeException{
    public RestfulException(String message) {
        super(message);
    }

    public RestfulException() {
        super();
    }

    public RestfulException(String message, Throwable cause) {
        super(message, cause);
    }

    public RestfulException(Throwable cause) {
        super(cause);
    }
}
