package com.infosys.demo_log4j2;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/")
    @ResponseBody
    public String testMethod(){
        logger.trace("This is a trace log example");
        logger.info("This is a info log example");
        logger.debug("This is a debug log example");
        logger.error("This is an error log example");
        logger.warn("This is a warn log example");

        return "check the console log";


    }
}
