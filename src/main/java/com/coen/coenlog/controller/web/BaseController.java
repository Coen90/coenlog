package com.coen.coenlog.controller.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Slf4j
@RequiredArgsConstructor
public class BaseController {

    @GetMapping
    public String main (HttpServletRequest request, Model model) {
        log.debug("request.getRequestURI()={}", request.getRequestURI());
        model.addAttribute("data", request.getRequestURI());
        return "main";
    }

}
