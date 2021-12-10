package com.juhee.we.main.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping("")
    public String main() throws Exception {
        return "user/main";
    }
}
