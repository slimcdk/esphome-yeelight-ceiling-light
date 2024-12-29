package com.google.zxing.oned.rss.expanded.decoders;

final class CurrentParsingState {

    /* renamed from: a */
    private int f4403a = 0;

    /* renamed from: b */
    private State f4404b = State.NUMERIC;

    private enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    CurrentParsingState() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo19566a() {
        return this.f4403a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19567b(int i) {
        this.f4403a += i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo19568c() {
        return this.f4404b == State.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo19569d() {
        return this.f4404b == State.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo19570e() {
        this.f4404b = State.ALPHA;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo19571f() {
        this.f4404b = State.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo19572g() {
        this.f4404b = State.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo19573h(int i) {
        this.f4403a = i;
    }
}
