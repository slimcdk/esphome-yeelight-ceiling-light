package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.mipush.sdk.af */
public class C4456af {

    /* renamed from: a */
    private static volatile C4456af f7427a;

    /* renamed from: a */
    private Context f7428a;

    /* renamed from: a */
    private List<C4501x> f7429a = new ArrayList();

    private C4456af(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f7428a = applicationContext;
        if (applicationContext == null) {
            this.f7428a = context;
        }
    }

    /* renamed from: a */
    public static C4456af m12606a(Context context) {
        if (f7427a == null) {
            synchronized (C4456af.class) {
                if (f7427a == null) {
                    f7427a = new C4456af(context);
                }
            }
        }
        return f7427a;
    }

    /* renamed from: a */
    public int mo28645a(String str) {
        synchronized (this.f7429a) {
            C4501x xVar = new C4501x();
            xVar.f7527a = str;
            if (this.f7429a.contains(xVar)) {
                for (C4501x next : this.f7429a) {
                    if (next.equals(xVar)) {
                        int i = next.f7526a;
                        return i;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: a */
    public synchronized String mo28646a(C4472au auVar) {
        return this.f7428a.getSharedPreferences("mipush_extra", 0).getString(auVar.name(), "");
    }

    /* renamed from: a */
    public synchronized void mo28647a(C4472au auVar, String str) {
        SharedPreferences sharedPreferences = this.f7428a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(auVar.name(), str).commit();
    }

    /* renamed from: a */
    public void m12610a(String str) {
        synchronized (this.f7429a) {
            C4501x xVar = new C4501x();
            xVar.f7526a = 0;
            xVar.f7527a = str;
            if (this.f7429a.contains(xVar)) {
                this.f7429a.remove(xVar);
            }
            this.f7429a.add(xVar);
        }
    }

    /* renamed from: a */
    public boolean m12611a(String str) {
        synchronized (this.f7429a) {
            C4501x xVar = new C4501x();
            xVar.f7527a = str;
            return this.f7429a.contains(xVar);
        }
    }

    /* renamed from: b */
    public void mo28648b(String str) {
        synchronized (this.f7429a) {
            C4501x xVar = new C4501x();
            xVar.f7527a = str;
            if (this.f7429a.contains(xVar)) {
                Iterator<C4501x> it = this.f7429a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C4501x next = it.next();
                    if (xVar.equals(next)) {
                        xVar = next;
                        break;
                    }
                }
            }
            xVar.f7526a++;
            this.f7429a.remove(xVar);
            this.f7429a.add(xVar);
        }
    }

    /* renamed from: c */
    public void mo28649c(String str) {
        synchronized (this.f7429a) {
            C4501x xVar = new C4501x();
            xVar.f7527a = str;
            if (this.f7429a.contains(xVar)) {
                this.f7429a.remove(xVar);
            }
        }
    }
}
