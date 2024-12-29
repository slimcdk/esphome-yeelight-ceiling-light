package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4511ag;
import com.xiaomi.push.C4558bm;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4766hp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.service.ba */
public class C4898ba {

    /* renamed from: a */
    private static volatile C4898ba f9515a;

    /* renamed from: a */
    protected SharedPreferences f9516a;

    /* renamed from: a */
    private HashSet<C4899a> f9517a = new HashSet<>();

    /* renamed from: b */
    protected SharedPreferences f9518b;

    /* renamed from: com.xiaomi.push.service.ba$a */
    public static abstract class C4899a implements Runnable {
        private String mDescription;
        private int mId;

        public C4899a(int i, String str) {
            this.mId = i;
            this.mDescription = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C4899a) && this.mId == ((C4899a) obj).mId;
        }

        public int hashCode() {
            return this.mId;
        }

        /* access modifiers changed from: protected */
        public abstract void onCallback();

        public final void run() {
            onCallback();
        }
    }

    private C4898ba(Context context) {
        this.f9516a = context.getSharedPreferences("mipush_oc_normal", 0);
        this.f9518b = context.getSharedPreferences("mipush_oc_custom", 0);
    }

    /* renamed from: a */
    public static C4898ba m15362a(Context context) {
        if (f9515a == null) {
            synchronized (C4898ba.class) {
                if (f9515a == null) {
                    f9515a = new C4898ba(context);
                }
            }
        }
        return f9515a;
    }

    /* renamed from: a */
    private String m15363a(int i) {
        return "oc_" + i;
    }

    /* renamed from: a */
    private String m15364a(C4766hp hpVar) {
        return "oc_version_" + hpVar.mo29323a();
    }

    /* renamed from: a */
    private void m15365a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (str.equals(m15363a(C4765ho.AppIsInstalledList.mo29322a()))) {
                str2 = C4558bm.m13029a(str2);
            }
            editor.putString(str, str2);
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: a */
    public int mo29988a(int i, int i2) {
        try {
            String a = m15363a(i);
            return this.f9518b.contains(a) ? this.f9518b.getInt(a, 0) : this.f9516a.contains(a) ? this.f9516a.getInt(a, 0) : i2;
        } catch (Exception e) {
            C4408b.m12464a(i + " oc int error " + e);
            return i2;
        }
    }

    /* renamed from: a */
    public int mo29989a(C4766hp hpVar, int i) {
        try {
            return this.f9516a.getInt(m15364a(hpVar), i);
        } catch (Exception e) {
            C4408b.m12464a(hpVar + " version error " + e);
            return i;
        }
    }

    /* renamed from: a */
    public long mo29990a(int i, long j) {
        try {
            String a = m15363a(i);
            return this.f9518b.contains(a) ? this.f9518b.getLong(a, 0) : this.f9516a.contains(a) ? this.f9516a.getLong(a, 0) : j;
        } catch (Exception e) {
            C4408b.m12464a(i + " oc long error " + e);
            return j;
        }
    }

    /* renamed from: a */
    public String mo29991a(int i, String str) {
        try {
            String a = m15363a(i);
            return this.f9518b.contains(a) ? this.f9518b.getString(a, (String) null) : this.f9516a.contains(a) ? this.f9516a.getString(a, (String) null) : str;
        } catch (Exception e) {
            C4408b.m12464a(i + " oc string error " + e);
            return str;
        }
    }

    /* renamed from: a */
    public synchronized void mo29992a() {
        this.f9517a.clear();
    }

    /* renamed from: a */
    public synchronized void mo29993a(C4899a aVar) {
        if (!this.f9517a.contains(aVar)) {
            this.f9517a.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo29994a(List<Pair<Integer, Object>> list) {
        if (!C4511ag.m12849a(list)) {
            SharedPreferences.Editor edit = this.f9518b.edit();
            for (Pair next : list) {
                Object obj = next.first;
                if (obj != null) {
                    String a = m15363a(((Integer) obj).intValue());
                    if (next.second == null) {
                        edit.remove(a);
                    } else {
                        m15365a(edit, next, a);
                    }
                }
            }
            edit.apply();
        }
    }

    /* renamed from: a */
    public void mo29995a(List<Pair<C4766hp, Integer>> list, List<Pair<Integer, Object>> list2) {
        if (C4511ag.m12849a(list) || C4511ag.m12849a(list2)) {
            C4408b.m12464a("not update oc, because versions or configs are empty");
            return;
        }
        SharedPreferences.Editor edit = this.f9516a.edit();
        edit.clear();
        for (Pair next : list) {
            Object obj = next.first;
            if (!(obj == null || next.second == null)) {
                edit.putInt(m15364a((C4766hp) obj), ((Integer) next.second).intValue());
            }
        }
        for (Pair next2 : list2) {
            Object obj2 = next2.first;
            if (!(obj2 == null || next2.second == null)) {
                m15365a(edit, next2, m15363a(((Integer) obj2).intValue()));
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public boolean mo29996a(int i, boolean z) {
        try {
            String a = m15363a(i);
            return this.f9518b.contains(a) ? this.f9518b.getBoolean(a, false) : this.f9516a.contains(a) ? this.f9516a.getBoolean(a, false) : z;
        } catch (Exception e) {
            C4408b.m12464a(i + " oc boolean error " + e);
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo29997b() {
        C4408b.m12482c("OC_Callback : receive new oc data");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f9517a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C4899a aVar = (C4899a) it.next();
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }
}
