package com.github.vilmosnagy.springscopedevents;

import org.springframework.context.ApplicationEvent;

public class TestEvent extends ApplicationEvent {

    public TestEvent(Object source) {
        super(source);
    }

}
