package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.j */
public abstract class C1577j {

    /* renamed from: a */
    private static final Object f3047a = new Object();

    /* renamed from: b */
    private static C1577j f3048b;

    /* renamed from: com.google.android.gms.common.internal.j$a */
    protected static final class C1578a {

        /* renamed from: a */
        private final String f3049a;

        /* renamed from: b */
        private final String f3050b;

        /* renamed from: c */
        private final ComponentName f3051c = null;

        /* renamed from: d */
        private final int f3052d;

        public C1578a(String str, String str2, int i) {
            C1609u.m4471g(str);
            this.f3049a = str;
            C1609u.m4471g(str2);
            this.f3050b = str2;
            this.f3052d = i;
        }

        /* renamed from: a */
        public final ComponentName mo11232a() {
            return this.f3051c;
        }

        /* renamed from: b */
        public final String mo11233b() {
            return this.f3050b;
        }

        /* renamed from: c */
        public final Intent mo11234c(Context context) {
            return this.f3049a != null ? new Intent(this.f3049a).setPackage(this.f3050b) : new Intent().setComponent(this.f3051c);
        }

        /* renamed from: d */
        public final int mo11235d() {
            return this.f3052d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1578a)) {
                return false;
            }
            C1578a aVar = (C1578a) obj;
            return C1599s.m4388a(this.f3049a, aVar.f3049a) && C1599s.m4388a(this.f3050b, aVar.f3050b) && C1599s.m4388a(this.f3051c, aVar.f3051c) && this.f3052d == aVar.f3052d;
        }

        public final int hashCode() {
            return C1599s.m4389b(this.f3049a, this.f3050b, this.f3051c, Integer.valueOf(this.f3052d));
        }

        public final String toString() {
            String str = this.f3049a;
            return str == null ? this.f3051c.flattenToString() : str;
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public static C1577j m4331a(Context context) {
        synchronized (f3047a) {
            if (f3048b == null) {
                f3048b = new C1581k0(context.getApplicationContext());
            }
        }
        return f3048b;
    }

    /* renamed from: b */
    public final void mo11229b(String str, String str2, int i, ServiceConnection serviceConnection, String str3) {
        mo11231d(new C1578a(str, str2, i), serviceConnection, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo11230c(C1578a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo11231d(C1578a aVar, ServiceConnection serviceConnection, String str);
}
