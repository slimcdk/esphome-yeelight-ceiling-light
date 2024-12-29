package com.google.android.gms.wearable;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.wearable.C1903b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p065m0.C3339g;
import p069n0.C3364j;

public abstract class MessageClient extends C0733c<C1903b.C1904a> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilterType {
    }

    /* renamed from: com.google.android.gms.wearable.MessageClient$a */
    public interface C1901a extends C3364j {
    }

    public MessageClient(@RecentlyNonNull Context context, @RecentlyNonNull C0733c.C0734a aVar) {
        super(context, C1903b.f2984b, C1903b.C1904a.f2987a, aVar);
    }

    @RecentlyNonNull
    /* renamed from: q */
    public abstract C3339g<Void> mo14799q(@RecentlyNonNull C1901a aVar);

    @RecentlyNonNull
    /* renamed from: r */
    public abstract C3339g<Boolean> mo14800r(@RecentlyNonNull C1901a aVar);

    @RecentlyNonNull
    /* renamed from: s */
    public abstract C3339g<Integer> mo14801s(@RecentlyNonNull String str, @RecentlyNonNull String str2, @Nullable byte[] bArr);
}
