package com.google.code.microlog4android.factory;

import com.google.code.microlog4android.repository.C2188c;
import com.google.code.microlog4android.repository.DefaultLoggerRepository;

public enum DefaultRepositoryFactory {
    ;

    public static C2188c getDefaultLoggerRepository() {
        return DefaultLoggerRepository.INSTANCE;
    }
}
