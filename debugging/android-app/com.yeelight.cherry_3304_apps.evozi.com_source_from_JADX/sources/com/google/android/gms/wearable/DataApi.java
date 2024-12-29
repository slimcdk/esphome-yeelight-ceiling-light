package com.google.android.gms.wearable;

import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1403g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
public interface DataApi {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilterType {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.wearable.DataApi$a */
    public interface C2413a {
        /* renamed from: b */
        void mo13199b(C2422e eVar);
    }

    /* renamed from: a */
    C1403g<Object> mo13198a(C1399f fVar, PutDataRequest putDataRequest);
}
