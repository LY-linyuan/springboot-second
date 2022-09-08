package com.tang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author 临渊
 * @Date 2022-09-08 19:29
 */

// 在templates目录下的资源只能通过Controller来跳转!
// 需要模板引擎的支持  thymeleaf
@Controller
public class IndexController {

    @RequestMapping("/test")
    public String index(Model model) {
        model.addAttribute("msg", "hello, springboot");
        model.addAttribute("msg1", "<h1>hello, springboot</h1>");
        model.addAttribute("users", Arrays.asList("T", "C"));
        return "test";
    }
}
