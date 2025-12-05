package com.example.hoyo_project.indexService;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service("hoyoIndexHttpService")
public class HoyoIndexHttpService extends DefaultHoyoIndexHttpService {

    @Resource(name = "${bean.hoyo.index.http.service:defaultHoyoIndexHttpService}")
    protected HoyoIndexService hoyoIndexService;

    @Override
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
        return hoyoIndexService.index(model,request,response);
    }
}
