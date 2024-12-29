package com.google.android.gms.common.server.response;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
@KeepForSdk
public class FastParser$ParseException extends Exception {
    public FastParser$ParseException(@NonNull String str) {
        super(str);
    }

    public FastParser$ParseException(@NonNull String str, @NonNull Throwable th) {
        super("Error instantiating inner object", th);
    }

    public FastParser$ParseException(@NonNull Throwable th) {
        super(th);
    }
}
