package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.mipush.sdk.ag */
public class C4037ag {

    /* renamed from: a */
    private static volatile C4037ag f6859a;

    /* renamed from: a */
    private Context f6860a;

    /* renamed from: a */
    private List<C4084z> f6861a = new ArrayList();

    private C4037ag(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f6860a = applicationContext;
        if (applicationContext == null) {
            this.f6860a = context;
        }
    }

    /* renamed from: a */
    public static C4037ag m10796a(Context context) {
        if (f6859a == null) {
            synchronized (C4037ag.class) {
                if (f6859a == null) {
                    f6859a = new C4037ag(context);
                }
            }
        }
        return f6859a;
    }

    /* renamed from: a */
    public int mo22894a(String str) {
        synchronized (this.f6861a) {
            C4084z zVar = new C4084z();
            zVar.f6969a = str;
            if (this.f6861a.contains(zVar)) {
                for (C4084z next : this.f6861a) {
                    if (next.equals(zVar)) {
                        int i = next.f6968a;
                        return i;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public synchronized String mo22895a(C4053av avVar) {
        return this.f6860a.getSharedPreferences("mipush_extra", 0).getString(avVar.name(), "");
    }

    /* renamed from: a */
    public synchronized void mo22896a(C4053av avVar, String str) {
        SharedPreferences sharedPreferences = this.f6860a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(avVar.name(), str).commit();
    }

    /* renamed from: a */
    public void m10800a(String str) {
        synchronized (this.f6861a) {
            C4084z zVar = new C4084z();
            zVar.f6968a = 0;
            zVar.f6969a = str;
            if (this.f6861a.contains(zVar)) {
                this.f6861a.remove(zVar);
            }
            this.f6861a.add(zVar);
        }
    }

    /* renamed from: a */
    public boolean m10801a(String str) {
        synchronized (this.f6861a) {
            C4084z zVar = new C4084z();
            zVar.f6969a = str;
            return this.f6861a.contains(zVar);
        }
    }

    /* renamed from: b */
    public void mo22897b(String str) {
        synchronized (this.f6861a) {
            C4084z zVar = new C4084z();
            zVar.f6969a = str;
            if (this.f6861a.contains(zVar)) {
                Iterator<C4084z> it = this.f6861a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C4084z next = it.next();
                    if (zVar.equals(next)) {
                        zVar = next;
                        break;
                    }
                }
            }
            zVar.f6968a++;
            this.f6861a.remove(zVar);
            this.f6861a.add(zVar);
        }
    }

    /* renamed from: c */
    public void mo22898c(String str) {
        synchronized (this.f6861a) {
            C4084z zVar = new C4084z();
            zVar.f6969a = str;
            if (this.f6861a.contains(zVar)) {
                this.f6861a.remove(zVar);
            }
        }
    }
}
