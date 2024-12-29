package com.google.firebase.crashlytics.p110c.p126q;

import android.content.Context;
import com.google.firebase.crashlytics.p110c.p112g.C2884h;

/* renamed from: com.google.firebase.crashlytics.c.q.a */
public class C3045a implements C3046b {

    /* renamed from: a */
    private final Context f5931a;

    /* renamed from: b */
    private boolean f5932b = false;

    /* renamed from: c */
    private String f5933c;

    public C3045a(Context context) {
        this.f5931a = context;
    }

    /* renamed from: a */
    public String mo17429a() {
        if (!this.f5932b) {
            this.f5933c = C2884h.m8800G(this.f5931a);
            this.f5932b = true;
        }
        String str = this.f5933c;
        if (str != null) {
            return str;
        }
        return null;
    }
}
