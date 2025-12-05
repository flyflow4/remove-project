package com.example.hoyo_project.loginService;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service("hoyoLoginHttpService")
public class HoyoLoginHttpService extends DefaultHoyoLoginService {

    @Resource(name = "${bean.hoyo.login.http.service:defaultHoyoLoginHttpService}")
    protected HoyoLoginService hoyoLoginService;

    @Override
    public String login(Model model, HttpServletRequest request, HttpServletResponse response) {
        return hoyoLoginService.login(model, request, response);
    }
}
