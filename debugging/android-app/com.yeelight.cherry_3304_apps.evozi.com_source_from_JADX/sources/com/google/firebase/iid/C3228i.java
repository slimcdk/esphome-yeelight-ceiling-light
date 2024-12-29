package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.firebase.iid.i */
final /* synthetic */ class C3228i implements Handler.Callback {

    /* renamed from: a */
    private final C3219f f6246a;

    C3228i(C3219f fVar) {
        this.f6246a = fVar;
    }

    public final boolean handleMessage(Message message) {
        return this.f6246a.mo17823d(message);
    }
}
