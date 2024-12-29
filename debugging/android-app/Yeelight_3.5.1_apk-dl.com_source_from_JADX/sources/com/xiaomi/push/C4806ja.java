package com.xiaomi.push;

import com.xiaomi.push.C4807jb;
import java.io.ByteArrayOutputStream;

/* renamed from: com.xiaomi.push.ja */
public class C4806ja {

    /* renamed from: a */
    private C4812jf f9270a;

    /* renamed from: a */
    private final C4820jm f9271a;

    /* renamed from: a */
    private final ByteArrayOutputStream f9272a;

    public C4806ja() {
        this(new C4807jb.C4808a());
    }

    public C4806ja(C4814jh jhVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f9272a = byteArrayOutputStream;
        C4820jm jmVar = new C4820jm(byteArrayOutputStream);
        this.f9271a = jmVar;
        this.f9270a = jhVar.mo29873a(jmVar);
    }

    /* renamed from: a */
    public byte[] mo29849a(C4798iu iuVar) {
        this.f9272a.reset();
        iuVar.mo29099b(this.f9270a);
        return this.f9272a.toByteArray();
    }
}
