package org.slf4j.impl;

import org.slf4j.impl.repository.Slf4jLoggerRepository;
import p168h7.C9097a;

public enum StaticLoggerBinder {
    SINGLETON;
    
    public static String REQUESTED_API_VERSION;
    private static final String loggerFactoryClassStr = null;
    private final C9097a loggerFactory;

    static {
        REQUESTED_API_VERSION = "1.5.11";
        loggerFactoryClassStr = Slf4jLoggerRepository.class.getName();
    }

    public static final StaticLoggerBinder getSingleton() {
        return SINGLETON;
    }

    public C9097a getLoggerFactory() {
        return this.loggerFactory;
    }

    public String getLoggerFactoryClassStr() {
        return loggerFactoryClassStr;
    }
}
