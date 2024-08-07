package org.meotppo.webti;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import static org.meotppo.webti.config.TransactionManagerConfig.DOMAIN_TRANSACTION_MANAGER;

@Component
@RequiredArgsConstructor
@Profile("local")
@Slf4j
public class InitData {

    @EventListener(ApplicationReadyEvent.class)
    @Transactional(transactionManager = DOMAIN_TRANSACTION_MANAGER)
    public void initData() {

    }
}
