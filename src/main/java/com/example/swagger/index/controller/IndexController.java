package com.example.swagger.index.controller;


import com.example.swagger.index.model.IndexVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
    @PostMapping(name = "首页", value = "/detail")
    public IndexVO detail(@RequestBody IndexVO model) {
        return model;
    }
}
