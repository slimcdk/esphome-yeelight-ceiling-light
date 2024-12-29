package com.google.android.gms.wearable;

import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.common.api.C1403g;
import com.google.android.gms.common.api.C1507j;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
public interface MessageApi {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilterType {
    }

    @Deprecated
    /* renamed from: com.google.android.gms.wearable.MessageApi$a */
    public interface C2415a {
        /* renamed from: h */
        void mo13203h(C2521j jVar);
    }

    @Deprecated
    /* renamed from: com.google.android.gms.wearable.MessageApi$b */
    public interface C2416b extends C1507j {
        /* renamed from: g */
        int mo13204g();
    }

    /* renamed from: a */
    C1403g<C2416b> mo13202a(C1399f fVar, String str, String str2, byte[] bArr);
}
