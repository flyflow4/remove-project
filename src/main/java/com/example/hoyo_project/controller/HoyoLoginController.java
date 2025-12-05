package com.example.hoyo_project.controller;

import com.example.hoyo_project.loginService.HoyoLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HoyoLoginController {

    @Resource(name = "${bean.hoyo.login.http.service:defaultHoyoLoginHttpService}")
    protected HoyoLoginService hoyoLoginService;

    @GetMapping(value="${url.hoyo.login.page:}")
    public String login(Model model, HttpServletRequest request, HttpServletResponse response) {
        return hoyoLoginService.login(model, request, response);
    }
}
