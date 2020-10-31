package com.pablo.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.ResponseWrapper;

/**
 * @program: pb-spark
 * @description:
 * @author: pablo
 * @create: 2020-10-25 20:52
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello() {
        return "hello:PK...";
    }
}