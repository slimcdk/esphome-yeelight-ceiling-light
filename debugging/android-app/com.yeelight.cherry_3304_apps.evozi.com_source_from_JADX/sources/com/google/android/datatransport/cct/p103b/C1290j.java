package com.google.android.datatransport.cct.p103b;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

@AutoValue
@Encodable
/* renamed from: com.google.android.datatransport.cct.b.j */
public abstract class C1290j {
    @NonNull
    /* renamed from: a */
    public static C1290j m3387a(@NonNull List<C1296m> list) {
        return new C1276d(list);
    }

    @NonNull
    @Encodable.Field(name = "logRequest")
    /* renamed from: b */
    public abstract List<C1296m> mo10138b();
}
