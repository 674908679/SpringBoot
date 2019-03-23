package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

//@RestController// 该注解是 @Controller 和 @ResponseBody 注解的合体版
@Controller
public class FirstController {
    @RequestMapping("/first")
    public String first(Model model) {
        model.addAttribute("time", DateFormat.getDateTimeInstance().format(new Date()));
        return "timeNow";
    }
}
