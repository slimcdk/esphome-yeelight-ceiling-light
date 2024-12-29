package com.google.android.gms.wearable;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.common.api.C0741f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p069n0.C3359e;

@Deprecated
public interface DataApi {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilterType {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.wearable.DataApi$a */
    public interface C1899a {
        /* renamed from: b */
        void mo14796b(@RecentlyNonNull C3359e eVar);
    }

    @RecentlyNonNull
    /* renamed from: a */
    C0741f<Object> mo14795a(@RecentlyNonNull C0736d dVar, @RecentlyNonNull PutDataRequest putDataRequest);
}
