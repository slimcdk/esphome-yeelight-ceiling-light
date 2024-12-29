package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C1382a;
import com.google.android.gms.common.api.C1396e;
import com.google.android.gms.wearable.internal.C2431b;
import com.google.android.gms.wearable.internal.C2437c1;
import com.google.android.gms.wearable.internal.C2450f2;
import com.google.android.gms.wearable.internal.C2471l;
import com.google.android.gms.wearable.internal.C2473l1;
import com.google.android.gms.wearable.internal.C2483o;

/* renamed from: com.google.android.gms.wearable.o */
public class C2527o {
    @Deprecated

    /* renamed from: a */
    public static final DataApi f5020a = new C2471l();

    /* renamed from: b */
    private static final C1382a.C1391g<C2450f2> f5021b = new C1382a.C1391g<>();

    /* renamed from: c */
    private static final C1382a.C1383a<C2450f2, C2528a> f5022c;
    @Deprecated

    /* renamed from: d */
    public static final C1382a<C2528a> f5023d;

    /* renamed from: com.google.android.gms.wearable.o$a */
    public static final class C2528a implements C1382a.C1386d {

        /* renamed from: com.google.android.gms.wearable.o$a$a */
        public static class C2529a {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public Looper f5024a;
        }

        private C2528a(C2529a aVar) {
            Looper unused = aVar.f5024a;
        }

        /* synthetic */ C2528a(C2529a aVar, C2534t tVar) {
            this(aVar);
        }
    }

    static {
        C2534t tVar = new C2534t();
        f5022c = tVar;
        f5023d = new C1382a<>("Wearable.API", tVar, f5021b);
    }

    /* renamed from: a */
    public static CapabilityClient m8129a(@NonNull Context context) {
        return new C2431b(context, C1396e.C1397a.f2565c);
    }

    /* renamed from: b */
    public static DataClient m8130b(@NonNull Context context) {
        return new C2483o(context, C1396e.C1397a.f2565c);
    }

    /* renamed from: c */
    public static MessageClient m8131c(@NonNull Context context) {
        return new C2437c1(context, C1396e.C1397a.f2565c);
    }

    /* renamed from: d */
    public static C2525m m8132d(@NonNull Context context) {
        return new C2473l1(context, C1396e.C1397a.f2565c);
    }
}
