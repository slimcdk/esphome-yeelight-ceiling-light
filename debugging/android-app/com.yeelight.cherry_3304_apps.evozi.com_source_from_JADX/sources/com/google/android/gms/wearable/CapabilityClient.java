package com.google.android.gms.wearable;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.wearable.C2527o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p011c.p012a.p019b.p028b.p038e.C0619h;

public abstract class CapabilityClient extends C1396e<C2527o.C2528a> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CapabilityFilterType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NodeFilterType {
    }

    /* renamed from: com.google.android.gms.wearable.CapabilityClient$a */
    public interface C2412a extends C2418a {
    }

    public CapabilityClient(@NonNull Context context, @NonNull C1396e.C1397a aVar) {
        super(context, C2527o.f5023d, null, aVar);
    }

    /* renamed from: n */
    public abstract C0619h<Void> mo13193n(@NonNull C2412a aVar, @NonNull Uri uri, int i);
}
