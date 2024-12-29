package com.google.gson;

import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p107v1.C3746f;
import p122z1.C3929a;

/* renamed from: com.google.gson.q */
public abstract class C2534q<T> {

    /* renamed from: com.google.gson.q$a */
    class C2535a extends C2534q<T> {
        C2535a() {
        }

        /* renamed from: b */
        public T mo19209b(C3929a aVar) {
            if (aVar.mo26169N() != JsonToken.NULL) {
                return C2534q.this.mo19209b(aVar);
            }
            aVar.mo26167G();
            return null;
        }

        /* renamed from: d */
        public void mo19210d(C2537a aVar, T t) {
            if (t == null) {
                aVar.mo19434s();
            } else {
                C2534q.this.mo19210d(aVar, t);
            }
        }
    }

    /* renamed from: a */
    public final C2534q<T> mo19413a() {
        return new C2535a();
    }

    /* renamed from: b */
    public abstract T mo19209b(C3929a aVar);

    /* renamed from: c */
    public final C2528k mo19414c(T t) {
        try {
            C3746f fVar = new C3746f();
            mo19210d(fVar, t);
            return fVar.mo26184c0();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: d */
    public abstract void mo19210d(C2537a aVar, T t);
}
