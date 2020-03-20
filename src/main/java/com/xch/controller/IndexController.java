package com.xch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiech
 * @create 2020-01-14 11:07
 */
@Controller
public class IndexController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }

}
