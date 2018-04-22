package com.firstdemo.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * date:2018/04/18
 * author:bridge
 * function:Hello
 */


@RestController
public class Hello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String home(){
        return "Hello Java!";
    }

}
