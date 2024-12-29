package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p109w.C3830b0;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.h */
public final class C0914h {

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.h$a */
    public static final class C0915a {

        /* renamed from: a */
        private final List f1038a = new ArrayList();

        /* renamed from: b */
        private final Object f1039b;

        /* synthetic */ C0915a(Object obj, C3830b0 b0Var) {
            C0917i.m1419j(obj);
            this.f1039b = obj;
        }

        @NonNull
        @KeepForSdk
        @CanIgnoreReturnValue
        /* renamed from: a */
        public C0915a mo12279a(@NonNull String str, @Nullable Object obj) {
            List list = this.f1038a;
            C0917i.m1419j(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        @NonNull
        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f1039b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f1038a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f1038a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m1402a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @KeepForSdk
    /* renamed from: b */
    public static int m1403b(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static C0915a m1404c(@NonNull Object obj) {
        return new C0915a(obj, (C3830b0) null);
    }
}
