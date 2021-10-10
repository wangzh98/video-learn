package com.wzh.server.controller;

import com.wzh.server.domain.Test;
import com.wzh.server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;


    @RequestMapping("/test")
    public List<Test> test() {
        return testService.list();
    }
}
