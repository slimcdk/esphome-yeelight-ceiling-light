package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

public class RuntimeExecutionException extends RuntimeException {
    public RuntimeExecutionException(@NonNull Throwable th) {
        super(th);
    }
}
