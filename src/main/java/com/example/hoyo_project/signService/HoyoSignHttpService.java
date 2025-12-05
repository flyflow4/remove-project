package com.example.hoyo_project.signService;

import com.example.hoyo_project.loginService.HoyoLoginService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service("hoyoSignHttpService")
public class HoyoSignHttpService extends DefaultHoyoSignHttpService {

    @Resource(name = "${bean.hoyo.sign.http.service:defaultHoyoSignHttpService}")
    protected HoyoSignService hoyoSignService;

    @Override
    public String sign(Model model, HttpServletRequest request, HttpServletResponse response) {
        return hoyoSignService.sign(model, request, response);
    }
}
