package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.firebase.heartbeatinfo.c */
class C2427c {

    /* renamed from: a */
    private final SharedPreferences f4081a;

    public C2427c(Context context, String str) {
        this.f4081a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m6480a() {
        long j = this.f4081a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.f4081a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f4081a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f4081a.edit().putStringSet(str2, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m6481d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo19040b() {
        SharedPreferences.Editor edit = this.f4081a.edit();
        for (Map.Entry next : this.f4081a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List<C2428d> mo19041c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry next : this.f4081a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                arrayList.add(C2428d.m6486a((String) next.getKey(), new ArrayList((Set) next.getValue())));
            }
        }
        mo19043f(System.currentTimeMillis());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo19042e(long j, String str) {
        String d = m6481d(j);
        if (!this.f4081a.getString("last-used-date", "").equals(d)) {
            long j2 = this.f4081a.getLong("fire-count", 0);
            if (j2 + 1 == 30) {
                m6480a();
                j2 = this.f4081a.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.f4081a.getStringSet(str, new HashSet()));
            hashSet.add(d);
            this.f4081a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized void mo19043f(long j) {
        this.f4081a.edit().putLong("fire-global", j).commit();
    }
}
