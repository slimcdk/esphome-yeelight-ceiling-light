package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import p040h0.C3239j;

@SuppressLint({"HandlerLeak"})
/* renamed from: com.google.android.gms.common.f */
final class C0885f extends C3239j {

    /* renamed from: a */
    private final Context f909a;

    /* renamed from: b */
    final /* synthetic */ C0721a f910b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0885f(C0721a aVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f910b = aVar;
        this.f909a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            return;
        }
        int i2 = this.f910b.mo11773i(this.f909a);
        if (this.f910b.mo11775m(i2)) {
            this.f910b.mo11779r(this.f909a, i2);
        }
    }
}
