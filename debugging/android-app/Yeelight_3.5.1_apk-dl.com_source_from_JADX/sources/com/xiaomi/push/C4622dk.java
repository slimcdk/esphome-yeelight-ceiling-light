package com.xiaomi.push;

import android.util.Pair;
import java.util.Date;
import java.util.List;

/* renamed from: com.xiaomi.push.dk */
class C4622dk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4621dj f7820a;

    /* renamed from: a */
    final /* synthetic */ String f7821a;

    /* renamed from: a */
    final /* synthetic */ Throwable f7822a;

    C4622dk(C4621dj djVar, String str, Throwable th) {
        this.f7820a = djVar;
        this.f7821a = str;
        this.f7822a = th;
    }

    public void run() {
        C4621dj.m13321a().add(new Pair(String.format("%1$s %2$s %3$s ", new Object[]{C4621dj.m13321a().format(new Date()), C4621dj.m13320a(this.f7820a), this.f7821a}), this.f7822a));
        if (C4621dj.m13321a().size() > 20000) {
            int size = (C4621dj.m13321a().size() - 20000) + 50;
            for (int i = 0; i < size; i++) {
                try {
                    if (C4621dj.m13321a().size() > 0) {
                        C4621dj.m13321a().remove(0);
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            List a = C4621dj.m13321a();
            a.add(new Pair(String.format("%1$s %2$s %3$s ", new Object[]{C4621dj.m13321a().format(new Date()), C4621dj.m13320a(this.f7820a), "flush " + size + " lines logs."}), (Object) null));
        }
        try {
            if (!C4508ad.m12842d()) {
                C4621dj.m13320a(this.f7820a);
            } else {
                C4621dj.m13320a(this.f7820a);
            }
        } catch (Exception unused2) {
            C4621dj.m13320a(this.f7820a);
        }
    }
}
