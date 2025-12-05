package com.example.hoyo_project.loginService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AbstractHoyoLoginService implements HoyoLoginService {

    @Value("${url.hoyo.login.html}")
    private String loginForm;

    @Override
    public String login(Model model, HttpServletRequest request, HttpServletResponse response) {
        return loginForm;
    }
}
