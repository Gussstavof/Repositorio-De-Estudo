package com.introducao.springboot.hi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String helloMessage(@RequestParam(value = "name", defaultValue = "Gustavo")String name){
        return String.format("<h1 style='color: blue; font-size: 50px;'> Hello %s!", name,"</h1>");
    }

}
