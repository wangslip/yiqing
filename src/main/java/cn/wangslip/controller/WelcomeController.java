package cn.wangslip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @GetMapping("/manage/{path}")
    public String level1(@PathVariable("path") String path) {
        return "manage/" + path;
    }

    @GetMapping("/admin/{path}")
    public String level2(@PathVariable("path") String path) {
        return "admin/" + path;
    }

    @GetMapping("/vip/{path}")
    public String level3(@PathVariable("path") String path) {
        return "vip/" + path;
    }
}
