package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import p049j1.C3268c;
import p049j1.C3269d;
import p049j1.C3270e;
import p054k1.C3293a;
import p054k1.C3294b;

/* renamed from: com.google.firebase.encoders.proto.f */
public class C2419f {

    /* renamed from: a */
    private final Map<Class<?>, C3268c<?>> f4059a;

    /* renamed from: b */
    private final Map<Class<?>, C3270e<?>> f4060b;

    /* renamed from: c */
    private final C3268c<Object> f4061c;

    /* renamed from: com.google.firebase.encoders.proto.f$a */
    public static final class C2420a implements C3294b<C2420a> {

        /* renamed from: d */
        private static final C3268c<Object> f4062d = C2418e.f4058a;

        /* renamed from: a */
        private final Map<Class<?>, C3268c<?>> f4063a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, C3270e<?>> f4064b = new HashMap();

        /* renamed from: c */
        private C3268c<Object> f4065c = f4062d;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m6453e(Object obj, C3269d dVar) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: c */
        public C2419f mo19026c() {
            return new C2419f(new HashMap(this.f4063a), new HashMap(this.f4064b), this.f4065c);
        }

        @NonNull
        /* renamed from: d */
        public C2420a mo19027d(@NonNull C3293a aVar) {
            aVar.mo11146a(this);
            return this;
        }

        @NonNull
        /* renamed from: f */
        public <U> C2420a mo19025a(@NonNull Class<U> cls, @NonNull C3268c<? super U> cVar) {
            this.f4063a.put(cls, cVar);
            this.f4064b.remove(cls);
            return this;
        }
    }

    C2419f(Map<Class<?>, C3268c<?>> map, Map<Class<?>, C3270e<?>> map2, C3268c<Object> cVar) {
        this.f4059a = map;
        this.f4060b = map2;
        this.f4061c = cVar;
    }

    /* renamed from: a */
    public static C2420a m6449a() {
        return new C2420a();
    }

    /* renamed from: b */
    public void mo19023b(@NonNull Object obj, @NonNull OutputStream outputStream) {
        new C2416d(outputStream, this.f4059a, this.f4060b, this.f4061c).mo19022s(obj);
    }

    @NonNull
    /* renamed from: c */
    public byte[] mo19024c(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            mo19023b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
