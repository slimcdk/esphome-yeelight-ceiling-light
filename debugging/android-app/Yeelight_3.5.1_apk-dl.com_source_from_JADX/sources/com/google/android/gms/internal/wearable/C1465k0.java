package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.C1465k0;
import com.google.android.gms.internal.wearable.C1480n0;

/* renamed from: com.google.android.gms.internal.wearable.k0 */
public class C1465k0<MessageType extends C1480n0<MessageType, BuilderType>, BuilderType extends C1465k0<MessageType, BuilderType>> extends C1434e<MessageType, BuilderType> {

    /* renamed from: a */
    private final MessageType f1808a;

    /* renamed from: b */
    protected MessageType f1809b;

    /* renamed from: c */
    protected boolean f1810c = false;

    protected C1465k0(MessageType messagetype) {
        this.f1808a = messagetype;
        this.f1809b = (C1480n0) messagetype.mo13717j(4, (Object) null, (Object) null);
    }

    /* renamed from: g */
    private static final void m3583g(MessageType messagetype, MessageType messagetype2) {
        C1529x1.m3906a().mo13843b(messagetype.getClass()).mo13581c(messagetype, messagetype2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C1486o1 mo13680a() {
        return this.f1808a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1434e mo13601f(C1439f fVar) {
        mo13686o((C1480n0) fVar);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo13682h() {
        MessageType messagetype = (C1480n0) this.f1809b.mo13717j(4, (Object) null, (Object) null);
        m3583g(messagetype, this.f1809b);
        this.f1809b = messagetype;
    }

    /* renamed from: i */
    public final BuilderType clone() {
        BuilderType buildertype = (C1465k0) this.f1808a.mo13717j(5, (Object) null, (Object) null);
        buildertype.mo13686o(mo13679G());
        return buildertype;
    }

    /* renamed from: j */
    public MessageType mo13679G() {
        if (this.f1810c) {
            return this.f1809b;
        }
        MessageType messagetype = this.f1809b;
        C1529x1.m3906a().mo13843b(messagetype.getClass()).mo13584f(messagetype);
        this.f1810c = true;
        return this.f1809b;
    }

    /* renamed from: k */
    public final MessageType mo13685k() {
        MessageType j = mo13679G();
        if (j.mo13719l()) {
            return j;
        }
        throw new zzdv(j);
    }

    /* renamed from: o */
    public final BuilderType mo13686o(MessageType messagetype) {
        if (this.f1810c) {
            mo13682h();
            this.f1810c = false;
        }
        m3583g(this.f1809b, messagetype);
        return this;
    }
}
