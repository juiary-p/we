package com.juhee.we.admin.web;

import com.juhee.we.util.ObjUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RequiredArgsConstructor
@Controller
@RequestMapping("/admin")
public class AdminController {
    /**
     * admin login page
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("")
    public String goLoginPage() throws Exception {
        return "admin/login";
    }

    /**
     * admin login 성공 시 main
     * @param request
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model) throws Exception {
        HashMap<String, Object> params = ObjUtil.convertRequestToMap(request);

        // 로그인 성공하면
        return "admin/main";
    }
}
