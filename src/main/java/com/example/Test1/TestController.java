package com.example.Test1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("demo")
    public String getDemo(){
        return "this is demo";
    }
    @GetMapping("demo5")
    public String getDemo2(){
        return "this is demo2";
    }
}
