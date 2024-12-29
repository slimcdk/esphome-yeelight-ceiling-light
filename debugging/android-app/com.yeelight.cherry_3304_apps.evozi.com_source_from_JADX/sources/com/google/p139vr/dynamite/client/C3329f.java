package com.google.p139vr.dynamite.client;

import java.util.Objects;

/* renamed from: com.google.vr.dynamite.client.f */
public final class C3329f {

    /* renamed from: a */
    private final int f6434a;

    /* renamed from: b */
    private final int f6435b;

    /* renamed from: c */
    private final int f6436c;

    public C3329f(int i, int i2, int i3) {
        this.f6434a = i;
        this.f6435b = i2;
        this.f6436c = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3329f)) {
            return false;
        }
        C3329f fVar = (C3329f) obj;
        return this.f6434a == fVar.f6434a && this.f6435b == fVar.f6435b && this.f6436c == fVar.f6436c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f6434a), Integer.valueOf(this.f6435b), Integer.valueOf(this.f6436c)});
    }

    public final String toString() {
        return String.format("%d.%d.%d", new Object[]{Integer.valueOf(this.f6434a), Integer.valueOf(this.f6435b), Integer.valueOf(this.f6436c)});
    }
}
