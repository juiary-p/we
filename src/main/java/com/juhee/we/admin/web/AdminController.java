package com.juhee.we.admin.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("")
    public String main() throws Exception {
        return "admin/main";
    }
}
