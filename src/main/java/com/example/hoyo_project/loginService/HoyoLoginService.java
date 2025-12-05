package com.example.hoyo_project.loginService;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HoyoLoginService {

    String login(Model model, HttpServletRequest request, HttpServletResponse response);

}
