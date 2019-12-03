package com.github.vilmosnagy.springscopedevents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SchedulerBean {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Scheduled(fixedDelay = 30000)
    public void schedule() {
        log.info("Throwing event");
        applicationEventPublisher.publishEvent(new TestEvent(this));
        log.info("Event thrown successfully");
    }
}
