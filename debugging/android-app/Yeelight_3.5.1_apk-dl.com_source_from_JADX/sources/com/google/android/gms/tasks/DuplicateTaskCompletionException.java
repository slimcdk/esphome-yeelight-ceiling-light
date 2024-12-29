package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p065m0.C3339g;

public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, @Nullable Throwable th) {
        super(str, th);
    }

    @NonNull
    /* renamed from: of */
    public static IllegalStateException m4941of(@NonNull C3339g<?> gVar) {
        if (!gVar.mo14770m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception j = gVar.mo14767j();
        return new DuplicateTaskCompletionException("Complete with: ".concat(j != null ? "failure" : gVar.mo14771n() ? "result ".concat(String.valueOf(gVar.mo14768k())) : gVar.mo14769l() ? "cancellation" : "unknown issue"), j);
    }
}
