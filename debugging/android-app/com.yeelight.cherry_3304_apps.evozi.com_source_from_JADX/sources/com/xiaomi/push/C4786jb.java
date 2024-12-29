package com.xiaomi.push;

import com.xiaomi.push.C4789je;

/* renamed from: com.xiaomi.push.jb */
public class C4786jb {

    /* renamed from: a */
    private final C4794ji f9799a;

    /* renamed from: a */
    private final C4804jr f9800a;

    public C4786jb() {
        this(new C4789je.C4790a());
    }

    public C4786jb(C4796jk jkVar) {
        C4804jr jrVar = new C4804jr();
        this.f9800a = jrVar;
        this.f9799a = jkVar.mo25839a(jrVar);
    }

    /* renamed from: a */
    public void mo25814a(C4777ix ixVar, byte[] bArr) {
        try {
            this.f9800a.mo25846a(bArr);
            ixVar.mo25076a(this.f9799a);
        } finally {
            this.f9799a.mo25841k();
        }
    }
}
