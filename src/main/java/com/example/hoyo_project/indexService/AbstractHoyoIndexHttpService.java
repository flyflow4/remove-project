package com.example.hoyo_project.indexService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AbstractHoyoIndexHttpService implements HoyoIndexService {

    @Value("${url.hoyo.index.html:}")
    private String indexHtml;

    @Value("${url.hoyo.login.page:}")
    private String loginUrl;

    @Override
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("actionUrl", loginUrl);
        return indexHtml;
    }
}
