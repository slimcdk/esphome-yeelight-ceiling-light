package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.datatransport.runtime.time.C1354a;

/* renamed from: com.google.android.datatransport.runtime.backends.c */
final class C1314c extends C1322i {

    /* renamed from: a */
    private final Context f2404a;

    /* renamed from: b */
    private final C1354a f2405b;

    /* renamed from: c */
    private final C1354a f2406c;

    /* renamed from: d */
    private final String f2407d;

    C1314c(Context context, C1354a aVar, C1354a aVar2, String str) {
        if (context != null) {
            this.f2404a = context;
            if (aVar != null) {
                this.f2405b = aVar;
                if (aVar2 != null) {
                    this.f2406c = aVar2;
                    if (str != null) {
                        this.f2407d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: b */
    public Context mo10219b() {
        return this.f2404a;
    }

    @NonNull
    /* renamed from: c */
    public String mo10220c() {
        return this.f2407d;
    }

    /* renamed from: d */
    public C1354a mo10221d() {
        return this.f2406c;
    }

    /* renamed from: e */
    public C1354a mo10222e() {
        return this.f2405b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1322i)) {
            return false;
        }
        C1322i iVar = (C1322i) obj;
        return this.f2404a.equals(iVar.mo10219b()) && this.f2405b.equals(iVar.mo10222e()) && this.f2406c.equals(iVar.mo10221d()) && this.f2407d.equals(iVar.mo10220c());
    }

    public int hashCode() {
        return ((((((this.f2404a.hashCode() ^ 1000003) * 1000003) ^ this.f2405b.hashCode()) * 1000003) ^ this.f2406c.hashCode()) * 1000003) ^ this.f2407d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f2404a + ", wallClock=" + this.f2405b + ", monotonicClock=" + this.f2406c + ", backendName=" + this.f2407d + "}";
    }
}
