package com.google.android.gms.wearable;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.wearable.C1903b;
import com.google.android.gms.wearable.DataApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p065m0.C3339g;

public abstract class DataClient extends C0733c<C1903b.C1904a> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface FilterType {
    }

    /* renamed from: com.google.android.gms.wearable.DataClient$a */
    public interface C1900a extends DataApi.C1899a {
    }

    public DataClient(@RecentlyNonNull Context context, @RecentlyNonNull C0733c.C0734a aVar) {
        super(context, C1903b.f2984b, C1903b.C1904a.f2987a, aVar);
    }

    @RecentlyNonNull
    /* renamed from: q */
    public abstract C3339g<Void> mo14797q(@RecentlyNonNull C1900a aVar);

    @RecentlyNonNull
    /* renamed from: r */
    public abstract C3339g<Boolean> mo14798r(@RecentlyNonNull C1900a aVar);
}
