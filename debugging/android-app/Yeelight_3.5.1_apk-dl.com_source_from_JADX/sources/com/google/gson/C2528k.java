package com.google.gson;

import com.google.gson.internal.C2519i;
import com.google.gson.stream.C2537a;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.gson.k */
public abstract class C2528k {
    /* renamed from: b */
    public C2478h mo19383b() {
        if (mo19386j()) {
            return (C2478h) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: e */
    public C2530m mo19384e() {
        if (mo19388m()) {
            return (C2530m) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: g */
    public C2531n mo19385g() {
        if (mo19389n()) {
            return (C2531n) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: j */
    public boolean mo19386j() {
        return this instanceof C2478h;
    }

    /* renamed from: l */
    public boolean mo19387l() {
        return this instanceof C2529l;
    }

    /* renamed from: m */
    public boolean mo19388m() {
        return this instanceof C2530m;
    }

    /* renamed from: n */
    public boolean mo19389n() {
        return this instanceof C2531n;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C2537a aVar = new C2537a(stringWriter);
            aVar.mo19417G(true);
            C2519i.m6799b(this, aVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
