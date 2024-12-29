package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: com.xiaomi.push.v */
public abstract class C4939v implements Runnable {

    /* renamed from: a */
    private Context f10214a;

    /* renamed from: a */
    private File f10215a;

    /* renamed from: a */
    private Runnable f10216a;

    private C4939v(Context context, File file) {
        this.f10214a = context;
        this.f10215a = file;
    }

    /* synthetic */ C4939v(Context context, File file, C4940w wVar) {
        this(context, file);
    }

    /* renamed from: a */
    public static void m15879a(Context context, File file, Runnable runnable) {
        new C4940w(context, file, runnable).run();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo26007a(Context context);

    public final void run() {
        C4938u uVar = null;
        try {
            if (this.f10215a == null) {
                this.f10215a = new File(this.f10214a.getFilesDir(), "default_locker");
            }
            uVar = C4938u.m15877a(this.f10214a, this.f10215a);
            if (this.f10216a != null) {
                this.f10216a.run();
            }
            mo26007a(this.f10214a);
            if (uVar == null) {
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (uVar == null) {
                return;
            }
        } catch (Throwable th) {
            if (uVar != null) {
                uVar.mo26006a();
            }
            throw th;
        }
        uVar.mo26006a();
    }
}
