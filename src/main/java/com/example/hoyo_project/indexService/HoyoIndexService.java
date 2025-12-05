package com.example.hoyo_project.indexService;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HoyoIndexService {

    String index(Model model, HttpServletRequest request, HttpServletResponse response);
}
