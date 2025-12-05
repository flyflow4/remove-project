package com.example.hoyo_project.controller;

import com.example.hoyo_project.indexService.HoyoIndexHttpService;
import com.example.hoyo_project.indexService.HoyoIndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HoyoIndexController {

    @Resource(name = "defaultHoyoIndexHttpService")
    protected HoyoIndexService hoyoIndexService;

    @GetMapping(value="${url.hoyo.index.page:}")
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
        return hoyoIndexService.index(model,request,response);
    }

}
