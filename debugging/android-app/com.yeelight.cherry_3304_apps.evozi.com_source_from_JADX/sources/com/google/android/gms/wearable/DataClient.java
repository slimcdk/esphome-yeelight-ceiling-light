package com.google.android.gms.wearable;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.wearable.C2527o;
import com.google.android.gms.wearable.DataApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p011c.p012a.p019b.p028b.p038e.C0619h;

public abstract class DataClient extends C1396e<C2527o.C2528a> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilterType {
    }

    /* renamed from: com.google.android.gms.wearable.DataClient$a */
    public interface C2414a extends DataApi.C2413a {
    }

    public DataClient(@NonNull Context context, @NonNull C1396e.C1397a aVar) {
        super(context, C2527o.f5023d, null, aVar);
    }

    /* renamed from: n */
    public abstract C0619h<Void> mo13200n(@NonNull C2414a aVar);

    /* renamed from: o */
    public abstract C0619h<Boolean> mo13201o(@NonNull C2414a aVar);
}
