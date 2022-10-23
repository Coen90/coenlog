package com.coen.coenlog.controller.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class BaseApiController {

    @GetMapping("/")
    public String apiMain(HttpServletRequest request, Model model) {
        log.debug("request.getRequestURI()={}", request.getRequestURI());
        return "apiMain";
    }
}
