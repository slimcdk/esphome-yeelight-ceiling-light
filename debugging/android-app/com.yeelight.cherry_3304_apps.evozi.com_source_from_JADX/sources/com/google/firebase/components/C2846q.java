package com.google.firebase.components;

import com.google.firebase.p131g.C3192a;
import com.google.firebase.p131g.C3193b;
import java.util.Map;

/* renamed from: com.google.firebase.components.q */
final /* synthetic */ class C2846q implements Runnable {

    /* renamed from: a */
    private final Map.Entry f5480a;

    /* renamed from: b */
    private final C3192a f5481b;

    private C2846q(Map.Entry entry, C3192a aVar) {
        this.f5480a = entry;
        this.f5481b = aVar;
    }

    /* renamed from: b */
    public static Runnable m8652b(Map.Entry entry, C3192a aVar) {
        return new C2846q(entry, aVar);
    }

    public void run() {
        ((C3193b) this.f5480a.getKey()).mo17054a(this.f5481b);
    }
}
