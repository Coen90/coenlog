package com.coen.coenlog.config.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.AuditorAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Override
    public Optional<String> getCurrentAuditor() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String updateBy = "";
//        if(authentication instanceof AnonymousAuthenticationToken) {
//            updateBy = httpServletRequest.getRequestURI();
//        } else {
//            updateBy = authentication.getName();
//        }
        return Optional.of(updateBy);
    }
}
