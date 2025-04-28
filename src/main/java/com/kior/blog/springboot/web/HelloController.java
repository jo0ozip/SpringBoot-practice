package com.kior.blog.springboot.web;

import com.kior.blog.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //practice 01
    @GetMapping("/hello")
    public String hello() {
        return "HELLO KIOR BLOG";
    }

    //practice 02
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDot(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }

}
