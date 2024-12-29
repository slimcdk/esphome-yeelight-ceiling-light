package com.google.android.gms.wearable;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.wearable.C1903b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p065m0.C3339g;
import p069n0.C3355a;

public abstract class CapabilityClient extends C0733c<C1903b.C1904a> {

    @Retention(RetentionPolicy.SOURCE)
    public @interface CapabilityFilterType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NodeFilterType {
    }

    /* renamed from: com.google.android.gms.wearable.CapabilityClient$a */
    public interface C1898a extends C3355a {
    }

    public CapabilityClient(@RecentlyNonNull Context context, @RecentlyNonNull C0733c.C0734a aVar) {
        super(context, C1903b.f2984b, C1903b.C1904a.f2987a, aVar);
    }

    @RecentlyNonNull
    /* renamed from: q */
    public abstract C3339g<Void> mo14788q(@RecentlyNonNull C1898a aVar, @RecentlyNonNull Uri uri, int i);
}
