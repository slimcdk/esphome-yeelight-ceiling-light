package com.squareup.okhttp;

import java.nio.charset.Charset;
import java.util.Objects;
import okio.ByteString;
import okio.C9837d;
import p231y2.C12033k;

/* renamed from: com.squareup.okhttp.w */
public abstract class C4315w {

    /* renamed from: com.squareup.okhttp.w$a */
    static class C4316a extends C4315w {

        /* renamed from: a */
        final /* synthetic */ C4307s f7075a;

        /* renamed from: b */
        final /* synthetic */ ByteString f7076b;

        C4316a(C4307s sVar, ByteString byteString) {
            this.f7075a = sVar;
            this.f7076b = byteString;
        }

        /* renamed from: a */
        public long mo27982a() {
            return (long) this.f7076b.size();
        }

        /* renamed from: b */
        public C4307s mo27983b() {
            return this.f7075a;
        }

        /* renamed from: g */
        public void mo27984g(C9837d dVar) {
            dVar.mo24733P0(this.f7076b);
        }
    }

    /* renamed from: com.squareup.okhttp.w$b */
    static class C4317b extends C4315w {

        /* renamed from: a */
        final /* synthetic */ C4307s f7077a;

        /* renamed from: b */
        final /* synthetic */ int f7078b;

        /* renamed from: c */
        final /* synthetic */ byte[] f7079c;

        /* renamed from: d */
        final /* synthetic */ int f7080d;

        C4317b(C4307s sVar, int i, byte[] bArr, int i2) {
            this.f7077a = sVar;
            this.f7078b = i;
            this.f7079c = bArr;
            this.f7080d = i2;
        }

        /* renamed from: a */
        public long mo27982a() {
            return (long) this.f7078b;
        }

        /* renamed from: b */
        public C4307s mo27983b() {
            return this.f7077a;
        }

        /* renamed from: g */
        public void mo27984g(C9837d dVar) {
            dVar.mo24765m0(this.f7079c, this.f7080d, this.f7078b);
        }
    }

    /* renamed from: c */
    public static C4315w m12157c(C4307s sVar, String str) {
        Charset charset = C12033k.f22067c;
        if (sVar != null) {
            Charset a = sVar.mo27973a();
            if (a == null) {
                sVar = C4307s.m12062c(sVar + "; charset=utf-8");
            } else {
                charset = a;
            }
        }
        return m12159e(sVar, str.getBytes(charset));
    }

    /* renamed from: d */
    public static C4315w m12158d(C4307s sVar, ByteString byteString) {
        return new C4316a(sVar, byteString);
    }

    /* renamed from: e */
    public static C4315w m12159e(C4307s sVar, byte[] bArr) {
        return m12160f(sVar, bArr, 0, bArr.length);
    }

    /* renamed from: f */
    public static C4315w m12160f(C4307s sVar, byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "content == null");
        C12033k.m31041a((long) bArr.length, (long) i, (long) i2);
        return new C4317b(sVar, i2, bArr, i);
    }

    /* renamed from: a */
    public long mo27982a() {
        return -1;
    }

    /* renamed from: b */
    public abstract C4307s mo27983b();

    /* renamed from: g */
    public abstract void mo27984g(C9837d dVar);
}
