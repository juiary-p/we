package com.juhee.we.user.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 회원가입 페이지
     * @return
     * @throws Exception
     */
    @RequestMapping("/goJoinPage")
    public String goJoinPage() throws Exception {
        return "user/joinPage";
    }
}
