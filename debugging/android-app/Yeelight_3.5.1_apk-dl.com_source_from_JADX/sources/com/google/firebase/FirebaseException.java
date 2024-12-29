package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0917i;

public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(@NonNull String str) {
        super(str);
        C0917i.m1416g(str, "Detail message must not be empty");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(@NonNull String str, @NonNull Throwable th) {
        super(str, th);
        C0917i.m1416g(str, "Detail message must not be empty");
    }
}
