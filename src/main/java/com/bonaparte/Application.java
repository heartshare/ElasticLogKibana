package com.bonaparte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by yangmingquan on 2018/9/13.
 */
@SpringBootApplication
public class Application {
    private final static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args){
        log.info("aaaa");
        log.info("bbbb");
        log.debug("cccc");
        log.error("dddd");
        log.warn("eeee");
        SpringApplication.run(Application.class, args);
    }
}
