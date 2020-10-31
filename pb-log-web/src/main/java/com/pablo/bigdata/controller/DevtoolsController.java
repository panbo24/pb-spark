package com.pablo.bigdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: pb-spark
 * @description:
 * @author: pablo
 * @create: 2020-10-25 21:02
 */
@Controller
public class DevtoolsController {

    @ResponseBody
    @RequestMapping("/test01")
    public String test01(){
        return "test01";
    }
}