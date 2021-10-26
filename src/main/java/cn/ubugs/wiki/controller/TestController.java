package cn.ubugs.wiki.controller;

import cn.ubugs.wiki.domain.Test;
import cn.ubugs.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    /**
     * 取配置项@Value("${配置名:默认值}")
     */
    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

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

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
