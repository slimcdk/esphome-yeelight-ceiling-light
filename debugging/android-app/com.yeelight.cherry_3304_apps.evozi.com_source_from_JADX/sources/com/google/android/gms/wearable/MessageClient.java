package com.google.android.gms.wearable;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.wearable.C2527o;
import com.google.android.gms.wearable.MessageApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p011c.p012a.p019b.p028b.p038e.C0619h;

public abstract class MessageClient extends C1396e<C2527o.C2528a> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilterType {
    }

    /* renamed from: com.google.android.gms.wearable.MessageClient$a */
    public interface C2417a extends MessageApi.C2415a {
    }

    public MessageClient(@NonNull Context context, @NonNull C1396e.C1397a aVar) {
        super(context, C2527o.f5023d, null, aVar);
    }

    /* renamed from: n */
    public abstract C0619h<Void> mo13205n(@NonNull C2417a aVar);

    /* renamed from: o */
    public abstract C0619h<Boolean> mo13206o(@NonNull C2417a aVar);

    /* renamed from: p */
    public abstract C0619h<Integer> mo13207p(@NonNull String str, @NonNull String str2, @Nullable byte[] bArr);
}
