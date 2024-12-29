package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import p049j1.C3265b;
import p049j1.C3271f;

/* renamed from: com.google.firebase.encoders.proto.g */
class C2421g implements C3271f {

    /* renamed from: a */
    private boolean f4066a = false;

    /* renamed from: b */
    private boolean f4067b = false;

    /* renamed from: c */
    private C3265b f4068c;

    /* renamed from: d */
    private final C2416d f4069d;

    C2421g(C2416d dVar) {
        this.f4069d = dVar;
    }

    /* renamed from: a */
    private void m6458a() {
        if (!this.f4066a) {
            this.f4066a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @NonNull
    /* renamed from: b */
    public C3271f mo19029b(@Nullable String str) {
        m6458a();
        this.f4069d.mo19021n(this.f4068c, str, this.f4067b);
        return this;
    }

    @NonNull
    /* renamed from: c */
    public C3271f mo19030c(boolean z) {
        m6458a();
        this.f4069d.mo19018k(this.f4068c, z, this.f4067b);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo19031d(C3265b bVar, boolean z) {
        this.f4066a = false;
        this.f4068c = bVar;
        this.f4067b = z;
    }
}
