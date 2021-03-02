package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class zHelloWorldController {

    private Logger log = LoggerFactory.getLogger(zHelloWorldController.class);

    @Value("${avatarPath}")
    private String name;

    @GetMapping("index")
    public String index(){
        log.info("zHelloWorldController-index用于测试info日志");
        log.debug("一般用于调试{zHelloWorldController-index用于测试debug日志}");
        log.error("用于一般的异常处理，try、catch{zHelloWorldController-index用于测试error日志}");
        return name;
    }
}
