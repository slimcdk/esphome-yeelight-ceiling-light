package p028e0;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
/* renamed from: e0.c */
public class C3144c {

    /* renamed from: b */
    private static C3144c f5039b = new C3144c();
    @Nullable

    /* renamed from: a */
    private C3143b f5040a = null;

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public static C3143b m8403a(@NonNull Context context) {
        return f5039b.mo23632b(context);
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: b */
    public final synchronized C3143b mo23632b(@NonNull Context context) {
        if (this.f5040a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f5040a = new C3143b(context);
        }
        return this.f5040a;
    }
}
