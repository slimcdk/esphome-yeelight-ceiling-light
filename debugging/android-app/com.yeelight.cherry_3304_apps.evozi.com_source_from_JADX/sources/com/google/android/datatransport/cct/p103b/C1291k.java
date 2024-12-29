package com.google.android.datatransport.cct.p103b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1277e;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.b.k */
public abstract class C1291k {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.b.k$a */
    public static abstract class C1292a {
        @NonNull
        /* renamed from: a */
        public abstract C1292a mo10147a(@Nullable C1264a aVar);

        @NonNull
        /* renamed from: b */
        public abstract C1292a mo10148b(@Nullable C1293b bVar);

        @NonNull
        /* renamed from: c */
        public abstract C1291k mo10149c();
    }

    /* renamed from: com.google.android.datatransport.cct.b.k$b */
    public enum C1293b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);

        static {
            UNKNOWN = new C1293b("UNKNOWN", 0, 0);
            ANDROID_FIREBASE = new C1293b("ANDROID_FIREBASE", 1, 23);
        }

        private C1293b(int i) {
        }
    }

    @NonNull
    /* renamed from: a */
    public static C1292a m3389a() {
        return new C1277e.C1279b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C1264a mo10142b();

    @Nullable
    /* renamed from: c */
    public abstract C1293b mo10143c();
}
