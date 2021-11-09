package com.app.cs.business.impl;

import com.app.cs.business.ICookieStealerBusiness;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CookieStealerBusinessImpl implements ICookieStealerBusiness {

    @Override
    public void extractCookie(String data) {
        log.info("----======== USER HACKED xD ========----");
        log.info(data);
    }

}
