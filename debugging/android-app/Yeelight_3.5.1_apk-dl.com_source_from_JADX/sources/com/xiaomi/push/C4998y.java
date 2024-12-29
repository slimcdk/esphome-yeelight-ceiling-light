package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: com.xiaomi.push.y */
public abstract class C4998y implements Runnable {

    /* renamed from: a */
    private Context f9773a;

    /* renamed from: a */
    private File f9774a;

    /* renamed from: a */
    private Runnable f9775a;

    private C4998y(Context context, File file) {
        this.f9773a = context;
        this.f9774a = file;
    }

    /* synthetic */ C4998y(Context context, File file, C4999z zVar) {
        this(context, file);
    }

    /* renamed from: a */
    public static void m15752a(Context context, File file, Runnable runnable) {
        new C4999z(context, file, runnable).run();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo30097a(Context context);

    public final void run() {
        C4997x xVar = null;
        try {
            if (this.f9774a == null) {
                this.f9774a = new File(this.f9773a.getFilesDir(), "default_locker");
            }
            xVar = C4997x.m15750a(this.f9773a, this.f9774a);
            Runnable runnable = this.f9775a;
            if (runnable != null) {
                runnable.run();
            }
            mo30097a(this.f9773a);
            if (xVar == null) {
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (xVar == null) {
                return;
            }
        } catch (Throwable th) {
            if (xVar != null) {
                xVar.mo30096a();
            }
            throw th;
        }
        xVar.mo30096a();
    }
}
