package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.C0722a;
import com.google.android.gms.common.api.C0733c;
import com.google.android.gms.common.internal.C0914h;
import p076o0.C3419c1;
import p076o0.C3421d;
import p076o0.C3429f;
import p076o0.C3432f2;
import p076o0.C3435g1;
import p076o0.C3440h2;
import p076o0.C3443i1;
import p076o0.C3448j2;
import p076o0.C3453l;
import p076o0.C3460m2;
import p076o0.C3464o;
import p076o0.C3473r;
import p076o0.C3490w1;
import p076o0.C3495y0;
import p076o0.C3499z1;

/* renamed from: com.google.android.gms.wearable.b */
public class C1903b {
    @RecentlyNonNull
    @Deprecated

    /* renamed from: a */
    public static final DataApi f2983a = new C3464o();
    @RecentlyNonNull
    @Deprecated

    /* renamed from: b */
    public static final C0722a<C1904a> f2984b;

    /* renamed from: c */
    private static final C0722a.C0731g<C3432f2> f2985c;

    /* renamed from: d */
    private static final C0722a.C0723a<C3432f2, C1904a> f2986d;

    /* renamed from: com.google.android.gms.wearable.b$a */
    public static final class C1904a implements C0722a.C0726d {

        /* renamed from: a */
        static final C1904a f2987a = new C1904a(new C1905a());

        /* renamed from: com.google.android.gms.wearable.b$a$a */
        public static class C1905a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public Looper f2988a;
        }

        private C1904a(C1905a aVar) {
            Looper unused = aVar.f2988a;
        }

        public boolean equals(@Nullable Object obj) {
            return obj instanceof C1904a;
        }

        public int hashCode() {
            return C0914h.m1403b(C1904a.class);
        }
    }

    static {
        new C3460m2();
        new C3495y0();
        new C3435g1();
        new C3429f();
        new C3448j2();
        new C3499z1();
        new C3453l();
        new C3490w1();
        new C3440h2();
        C0722a.C0731g<C3432f2> gVar = new C0722a.C0731g<>();
        f2985c = gVar;
        C1909f fVar = new C1909f();
        f2986d = fVar;
        f2984b = new C0722a<>("Wearable.API", fVar, gVar);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static CapabilityClient m5046a(@RecentlyNonNull Context context) {
        return new C3421d(context, C0733c.C0734a.f531c);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static DataClient m5047b(@RecentlyNonNull Context context) {
        return new C3473r(context, C0733c.C0734a.f531c);
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static MessageClient m5048c(@RecentlyNonNull Context context) {
        return new C3419c1(context, C0733c.C0734a.f531c);
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static C1902a m5049d(@RecentlyNonNull Context context) {
        return new C3443i1(context, C0733c.C0734a.f531c);
    }
}
