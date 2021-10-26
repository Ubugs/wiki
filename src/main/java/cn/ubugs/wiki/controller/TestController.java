package cn.ubugs.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    /**
     * Restful风格常用请求类型
     * Get Post Put Delete
     *
     * @return hello world
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
