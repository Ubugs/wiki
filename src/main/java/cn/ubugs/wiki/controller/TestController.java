package cn.ubugs.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * 取配置项@Value("${配置名:默认值}")
     */
    @Value("${test.hello:TEST}")
    private String testHello;

    /**
     * Restful风格常用请求类型
     * Get Post Put Delete
     *
     * @return hello world
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World, testHello:" + testHello;
    }

    @PostMapping("hello/post")
    public String helloPost(String name) {
        return "hello world, Post:" + name;
    }
}
