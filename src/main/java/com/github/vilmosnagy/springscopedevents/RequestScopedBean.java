package com.github.vilmosnagy.springscopedevents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Slf4j
@Service
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class RequestScopedBean {

    @EventListener(classes = TestEvent.class)
    public void eventListener() {
        log.info("event caught");
    }
}
