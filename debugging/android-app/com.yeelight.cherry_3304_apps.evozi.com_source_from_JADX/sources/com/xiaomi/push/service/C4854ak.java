package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4493ad;
import com.xiaomi.push.C4529bc;
import com.xiaomi.push.C4744hr;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.xiaomi.push.service.ak */
public class C4854ak {

    /* renamed from: a */
    private static volatile C4854ak f9968a;

    /* renamed from: a */
    protected SharedPreferences f9969a;

    /* renamed from: a */
    private HashSet<C4855a> f9970a = new HashSet<>();

    /* renamed from: com.xiaomi.push.service.ak$a */
    public static abstract class C4855a implements Runnable {
        private String mDescription;
        private int mId;

        public C4855a(int i, String str) {
            this.mId = i;
            this.mDescription = str;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C4855a) && this.mId == ((C4855a) obj).mId;
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

    private C4854ak(Context context) {
        this.f9969a = context.getSharedPreferences("mipush_oc", 0);
    }

    /* renamed from: a */
    public static C4854ak m15568a(Context context) {
        if (f9968a == null) {
            synchronized (C4854ak.class) {
                if (f9968a == null) {
                    f9968a = new C4854ak(context);
                }
            }
        }
        return f9968a;
    }

    /* renamed from: a */
    private String m15569a(int i) {
        return "normal_oc_" + i;
    }

    /* renamed from: a */
    private void m15570a(SharedPreferences.Editor editor, Pair<Integer, Object> pair, String str) {
        Object obj = pair.second;
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (str.equals(m15569a(C4744hr.AppIsInstalledList.mo25291a()))) {
                str2 = C4529bc.m13418a(str2);
            }
            editor.putString(str, str2);
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: b */
    private String m15571b(int i) {
        return "custom_oc_" + i;
    }

    /* renamed from: a */
    public int mo25906a(int i, int i2) {
        String b = m15571b(i);
        if (this.f9969a.contains(b)) {
            return this.f9969a.getInt(b, 0);
        }
        String a = m15569a(i);
        return this.f9969a.contains(a) ? this.f9969a.getInt(a, 0) : i2;
    }

    /* renamed from: a */
    public String mo25907a(int i, String str) {
        String b = m15571b(i);
        if (this.f9969a.contains(b)) {
            return this.f9969a.getString(b, (String) null);
        }
        String a = m15569a(i);
        return this.f9969a.contains(a) ? this.f9969a.getString(a, (String) null) : str;
    }

    /* renamed from: a */
    public synchronized void mo25908a() {
        this.f9970a.clear();
    }

    /* renamed from: a */
    public synchronized void mo25909a(C4855a aVar) {
        if (!this.f9970a.contains(aVar)) {
            this.f9970a.add(aVar);
        }
    }

    /* renamed from: a */
    public void mo25910a(List<Pair<Integer, Object>> list) {
        if (!C4493ad.m13262a(list)) {
            SharedPreferences.Editor edit = this.f9969a.edit();
            for (Pair next : list) {
                Object obj = next.first;
                if (!(obj == null || next.second == null)) {
                    m15570a(edit, next, m15569a(((Integer) obj).intValue()));
                }
            }
            edit.commit();
        }
    }

    /* renamed from: a */
    public boolean mo25911a(int i, boolean z) {
        String b = m15571b(i);
        if (this.f9969a.contains(b)) {
            return this.f9969a.getBoolean(b, false);
        }
        String a = m15569a(i);
        return this.f9969a.contains(a) ? this.f9969a.getBoolean(a, false) : z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo25912b() {
        C3989b.m10680c("OC_Callback : receive new oc data");
        HashSet hashSet = new HashSet();
        synchronized (this) {
            hashSet.addAll(this.f9970a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C4855a aVar = (C4855a) it.next();
            if (aVar != null) {
                aVar.run();
            }
        }
        hashSet.clear();
    }

    /* renamed from: b */
    public void mo25913b(List<Pair<Integer, Object>> list) {
        if (!C4493ad.m13262a(list)) {
            SharedPreferences.Editor edit = this.f9969a.edit();
            for (Pair next : list) {
                Object obj = next.first;
                if (obj != null) {
                    String b = m15571b(((Integer) obj).intValue());
                    if (next.second == null) {
                        edit.remove(b);
                    } else {
                        m15570a(edit, next, b);
                    }
                }
            }
            edit.commit();
        }
    }
}
