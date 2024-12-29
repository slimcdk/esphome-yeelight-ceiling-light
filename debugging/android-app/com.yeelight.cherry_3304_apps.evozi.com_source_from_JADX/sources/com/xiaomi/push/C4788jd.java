package com.xiaomi.push;

import com.xiaomi.push.C4789je;
import java.io.ByteArrayOutputStream;

/* renamed from: com.xiaomi.push.jd */
public class C4788jd {

    /* renamed from: a */
    private C4794ji f9801a;

    /* renamed from: a */
    private final C4802jp f9802a;

    /* renamed from: a */
    private final ByteArrayOutputStream f9803a;

    public C4788jd() {
        this(new C4789je.C4790a());
    }

    public C4788jd(C4796jk jkVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f9803a = byteArrayOutputStream;
        C4802jp jpVar = new C4802jp(byteArrayOutputStream);
        this.f9802a = jpVar;
        this.f9801a = jkVar.mo25839a(jpVar);
    }

    /* renamed from: a */
    public byte[] mo25815a(C4777ix ixVar) {
        this.f9803a.reset();
        ixVar.mo25080b(this.f9801a);
        return this.f9803a.toByteArray();
    }
}
