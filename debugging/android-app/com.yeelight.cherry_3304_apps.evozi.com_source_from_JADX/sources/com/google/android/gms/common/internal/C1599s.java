package com.google.android.gms.common.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.s */
public final class C1599s {

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.s$a */
    public static final class C1600a {

        /* renamed from: a */
        private final List<String> f3079a;

        /* renamed from: b */
        private final Object f3080b;

        private C1600a(Object obj) {
            C1609u.m4475k(obj);
            this.f3080b = obj;
            this.f3079a = new ArrayList();
        }

        @KeepForSdk
        /* renamed from: a */
        public final C1600a mo11272a(String str, @Nullable Object obj) {
            List<String> list = this.f3079a;
            C1609u.m4475k(str);
            String str2 = str;
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @KeepForSdk
        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3080b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f3079a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f3079a.get(i));
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
    public static boolean m4388a(@Nullable Object obj, @Nullable Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @KeepForSdk
    /* renamed from: b */
    public static int m4389b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @KeepForSdk
    /* renamed from: c */
    public static C1600a m4390c(Object obj) {
        return new C1600a(obj);
    }
}
