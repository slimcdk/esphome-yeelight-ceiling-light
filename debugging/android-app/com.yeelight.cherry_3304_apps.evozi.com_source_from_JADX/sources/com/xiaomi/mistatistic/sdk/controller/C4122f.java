package com.xiaomi.mistatistic.sdk.controller;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Intent;
import android.content.ServiceConnection;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.mistatistic.sdk.BaseService;
import com.xiaomi.mistatistic.sdk.C4091a;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.mistatistic.sdk.data.StatEventPojo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.f */
public class C4122f {

    /* renamed from: a */
    public static String f7058a = "";

    /* renamed from: b */
    public static boolean f7059b = false;

    /* renamed from: c */
    private static C4131i f7060c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4091a f7061d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f7062e = false;

    /* renamed from: f */
    private ServiceConnection f7063f = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            boolean unused = C4122f.this.f7062e = true;
            C4091a unused2 = C4122f.this.f7061d = C4091a.C4092a.m11018a(iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            boolean unused = C4122f.this.f7062e = false;
            C4091a unused2 = C4122f.this.f7061d = null;
        }
    };

    /* renamed from: a */
    public static StatEventPojo m11131a(Cursor cursor) {
        StatEventPojo statEventPojo = new StatEventPojo();
        long j = cursor.getLong(2);
        String string = cursor.getString(4);
        String string2 = cursor.getString(5);
        String string3 = cursor.getString(1);
        String string4 = cursor.getString(3);
        String string5 = cursor.getString(6);
        statEventPojo.category = string3;
        statEventPojo.key = string4;
        statEventPojo.value = string;
        statEventPojo.timeStamp = j;
        statEventPojo.type = string2;
        statEventPojo.extra = string5;
        return statEventPojo;
    }

    /* renamed from: a */
    public static void m11132a() {
        f7060c = new C4131i(C4113c.m11105a());
    }

    /* renamed from: f */
    private void m11134f() {
        if (!this.f7062e) {
            try {
                Intent intent = new Intent(C4113c.m11105a(), Class.forName(f7058a));
                C4113c.m11105a().startService(intent);
                if (this.f7061d != null) {
                    C4130h.m11177b("unbind service before bind it again!");
                    C4113c.m11105a().unbindService(this.f7063f);
                }
                C4113c.m11105a().bindService(intent, this.f7063f, 1);
            } catch (Exception e) {
                C4130h.m11176a("ensureServiceBinded", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public StatEventPojo mo23043a(String str, String str2) {
        if (!f7059b) {
            return mo23048b(str, str2);
        }
        m11134f();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            do {
                if (this.f7062e) {
                    if (this.f7061d != null) {
                        StatEventPojo a = this.f7061d.mo22984a(str, str2);
                        C4130h.m11177b("process query, result is: " + a);
                        return a;
                    }
                }
            } while (System.currentTimeMillis() - currentTimeMillis <= 1000);
            return null;
        } catch (Exception e) {
            C4130h.m11176a("queryCustomEvent", (Throwable) e);
            return null;
        }
    }

    /* renamed from: a */
    public List<StatEventPojo> mo23044a(long j) {
        if (!f7059b) {
            return mo23049b(j);
        }
        m11134f();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            do {
                if (this.f7062e) {
                    if (this.f7061d != null) {
                        List<StatEventPojo> a = this.f7061d.mo22985a(j);
                        StringBuilder sb = new StringBuilder();
                        sb.append("process getAll, result size is :");
                        sb.append(a == null ? 0 : a.size());
                        C4130h.m11177b(sb.toString());
                        return a;
                    }
                }
            } while (System.currentTimeMillis() - currentTimeMillis <= 1000);
            return new ArrayList();
        } catch (Exception e) {
            C4130h.m11176a("getAllEventOrderByTimestampDescend", (Throwable) e);
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public void mo23045a(long j, long j2) {
        if (f7059b) {
            try {
                Intent intent = new Intent(C4113c.m11105a(), Class.forName(f7058a));
                intent.putExtra("type", 5);
                intent.putExtra(BaseService.START_TIME, j);
                intent.putExtra(BaseService.END_TIME, j2);
                C4113c.m11105a().startService(intent);
            } catch (Exception e) {
                C4130h.m11176a("deleteEventsByStartAndEndTS", (Throwable) e);
            }
        } else {
            mo23051b(j, j2);
        }
    }

    /* renamed from: a */
    public void mo23046a(StatEventPojo statEventPojo) {
        if (f7059b) {
            try {
                Intent intent = new Intent(C4113c.m11105a(), Class.forName(f7058a));
                intent.putExtra("type", 1);
                intent.putExtra(BaseService.STAT_EVENT_POJO, statEventPojo);
                C4113c.m11105a().startService(intent);
            } catch (Exception e) {
                C4130h.m11176a("insertNewEvent", (Throwable) e);
            }
        } else {
            mo23052b(statEventPojo);
        }
    }

    /* renamed from: a */
    public void mo23047a(String str, String str2, String str3) {
        if (f7059b) {
            try {
                Intent intent = new Intent(C4113c.m11105a(), Class.forName(f7058a));
                intent.putExtra("type", 2);
                intent.putExtra(BaseService.KEY, str);
                intent.putExtra(BaseService.CATEGORY, str2);
                intent.putExtra(BaseService.NEW_VALUE, str3);
                C4113c.m11105a().startService(intent);
            } catch (Exception e) {
                C4130h.m11176a("updateEventByKeyAndCategory", (Throwable) e);
            }
        } else {
            mo23053b(str, str2, str3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.xiaomi.mistatistic.sdk.data.StatEventPojo} */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054 A[SYNTHETIC, Splitter:B:24:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0060 A[Catch:{ all -> 0x005c }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.xiaomi.mistatistic.sdk.data.StatEventPojo mo23048b(java.lang.String r15, java.lang.String r16) {
        /*
            r14 = this;
            java.lang.String r0 = "EventDAO"
            java.lang.String r1 = "queryCustomEvent key: %s, category: %s"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r16
            r5 = 1
            r3[r5] = r15
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11180b((java.lang.String) r0, (java.lang.String) r1, (java.lang.Object[]) r3)
            com.xiaomi.mistatistic.sdk.controller.i r1 = f7060c
            monitor-enter(r1)
            r3 = 0
            com.xiaomi.mistatistic.sdk.controller.i r0 = f7060c     // Catch:{ SQLiteException -> 0x0049, all -> 0x0047 }
            android.database.sqlite.SQLiteDatabase r6 = r0.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0049, all -> 0x0047 }
            java.lang.String r7 = "mistat_event"
            r8 = 0
            java.lang.String r9 = "category=? AND key=?"
            java.lang.String[] r10 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0049, all -> 0x0047 }
            r10[r4] = r15     // Catch:{ SQLiteException -> 0x0049, all -> 0x0047 }
            r10[r5] = r16     // Catch:{ SQLiteException -> 0x0049, all -> 0x0047 }
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r2 = r6.query(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x0049, all -> 0x0047 }
            if (r2 == 0) goto L_0x003c
            boolean r0 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x003a }
            if (r0 == 0) goto L_0x003c
            com.xiaomi.mistatistic.sdk.data.StatEventPojo r0 = m11131a((android.database.Cursor) r2)     // Catch:{ SQLiteException -> 0x003a }
            r3 = r0
            goto L_0x003c
        L_0x003a:
            r0 = move-exception
            goto L_0x004b
        L_0x003c:
            if (r2 == 0) goto L_0x0041
            r2.close()     // Catch:{ all -> 0x0069 }
        L_0x0041:
            com.xiaomi.mistatistic.sdk.controller.i r0 = f7060c     // Catch:{ all -> 0x0069 }
        L_0x0043:
            r0.close()     // Catch:{ all -> 0x0069 }
            goto L_0x005a
        L_0x0047:
            r0 = move-exception
            goto L_0x005e
        L_0x0049:
            r0 = move-exception
            r2 = r3
        L_0x004b:
            java.lang.String r4 = "EventDAO"
            java.lang.String r5 = "queryCustomEvent exception"
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11174a((java.lang.String) r4, (java.lang.String) r5, (java.lang.Throwable) r0)     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0057
            r2.close()     // Catch:{ all -> 0x0069 }
        L_0x0057:
            com.xiaomi.mistatistic.sdk.controller.i r0 = f7060c     // Catch:{ all -> 0x0069 }
            goto L_0x0043
        L_0x005a:
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            return r3
        L_0x005c:
            r0 = move-exception
            r3 = r2
        L_0x005e:
            if (r3 == 0) goto L_0x0063
            r3.close()     // Catch:{ all -> 0x0069 }
        L_0x0063:
            com.xiaomi.mistatistic.sdk.controller.i r2 = f7060c     // Catch:{ all -> 0x0069 }
            r2.close()     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0069 }
            goto L_0x006d
        L_0x006c:
            throw r0
        L_0x006d:
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4122f.mo23048b(java.lang.String, java.lang.String):com.xiaomi.mistatistic.sdk.data.StatEventPojo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b A[Catch:{ all -> 0x0089 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.xiaomi.mistatistic.sdk.data.StatEventPojo> mo23049b(long r17) {
        /*
            r16 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.xiaomi.mistatistic.sdk.controller.i r2 = f7060c
            monitor-enter(r2)
            com.xiaomi.mistatistic.sdk.controller.i r0 = f7060c     // Catch:{ all -> 0x00bf }
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ all -> 0x00bf }
            if (r0 != 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x00bf }
            return r1
        L_0x0012:
            r12 = 2
            r13 = 0
            r14 = 1
            r15 = 0
            java.lang.String r4 = "mistat_event"
            r5 = 0
            java.lang.String r6 = "ts<?"
            java.lang.String[] r7 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x008b }
            java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch:{ SQLiteException -> 0x008b }
            r7[r13] = r3     // Catch:{ SQLiteException -> 0x008b }
            r8 = 0
            r9 = 0
            java.lang.String r10 = "ts DESC"
            r3 = 500(0x1f4, float:7.0E-43)
            java.lang.String r11 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x008b }
            r3 = r0
            android.database.Cursor r15 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ SQLiteException -> 0x008b }
            if (r15 == 0) goto L_0x006b
            boolean r3 = r15.moveToLast()     // Catch:{ SQLiteException -> 0x008b }
            if (r3 == 0) goto L_0x006b
            java.lang.String r3 = "ts"
            int r3 = r15.getColumnIndex(r3)     // Catch:{ SQLiteException -> 0x008b }
            long r3 = r15.getLong(r3)     // Catch:{ SQLiteException -> 0x008b }
            r15.close()     // Catch:{ SQLiteException -> 0x008b }
            java.lang.String r5 = "mistat_event"
            r6 = 0
            java.lang.String r7 = "ts<? AND ts>=?"
            java.lang.String[] r8 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x008b }
            java.lang.String r9 = java.lang.String.valueOf(r17)     // Catch:{ SQLiteException -> 0x008b }
            r8[r13] = r9     // Catch:{ SQLiteException -> 0x008b }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x008b }
            r8[r14] = r3     // Catch:{ SQLiteException -> 0x008b }
            r9 = 0
            r10 = 0
            java.lang.String r11 = "ts DESC"
            r3 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x008b }
            r15 = r0
        L_0x006b:
            if (r15 == 0) goto L_0x0080
            boolean r0 = r15.moveToFirst()     // Catch:{ SQLiteException -> 0x008b }
            if (r0 == 0) goto L_0x0080
        L_0x0073:
            com.xiaomi.mistatistic.sdk.data.StatEventPojo r0 = m11131a((android.database.Cursor) r15)     // Catch:{ SQLiteException -> 0x008b }
            r1.add(r0)     // Catch:{ SQLiteException -> 0x008b }
            boolean r0 = r15.moveToNext()     // Catch:{ SQLiteException -> 0x008b }
            if (r0 != 0) goto L_0x0073
        L_0x0080:
            r15.close()     // Catch:{ all -> 0x00bf }
            com.xiaomi.mistatistic.sdk.controller.i r0 = f7060c     // Catch:{ all -> 0x00bf }
        L_0x0085:
            r0.close()     // Catch:{ all -> 0x00bf }
            goto L_0x0099
        L_0x0089:
            r0 = move-exception
            goto L_0x00b6
        L_0x008b:
            r0 = move-exception
            java.lang.String r3 = "EventDAO"
            java.lang.String r4 = "Error while reading data from DB"
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11174a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0089 }
            r15.close()     // Catch:{ all -> 0x00bf }
            com.xiaomi.mistatistic.sdk.controller.i r0 = f7060c     // Catch:{ all -> 0x00bf }
            goto L_0x0085
        L_0x0099:
            if (r15 == 0) goto L_0x00b4
            java.lang.String r0 = "EventDAO"
            java.lang.String r3 = "get %d DB events by timestamp %d"
            java.lang.Object[] r4 = new java.lang.Object[r12]     // Catch:{ all -> 0x00bf }
            int r5 = r15.getCount()     // Catch:{ all -> 0x00bf }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00bf }
            r4[r13] = r5     // Catch:{ all -> 0x00bf }
            java.lang.Long r5 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x00bf }
            r4[r14] = r5     // Catch:{ all -> 0x00bf }
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11180b((java.lang.String) r0, (java.lang.String) r3, (java.lang.Object[]) r4)     // Catch:{ all -> 0x00bf }
        L_0x00b4:
            monitor-exit(r2)     // Catch:{ all -> 0x00bf }
            return r1
        L_0x00b6:
            r15.close()     // Catch:{ all -> 0x00bf }
            com.xiaomi.mistatistic.sdk.controller.i r1 = f7060c     // Catch:{ all -> 0x00bf }
            r1.close()     // Catch:{ all -> 0x00bf }
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bf }
            goto L_0x00c3
        L_0x00c2:
            throw r0
        L_0x00c3:
            goto L_0x00c2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4122f.mo23049b(long):java.util.List");
    }

    /* renamed from: b */
    public void mo23050b() {
        if (f7059b) {
            try {
                Intent intent = new Intent(C4113c.m11105a(), Class.forName(f7058a));
                intent.putExtra("type", 3);
                C4113c.m11105a().startService(intent);
            } catch (Exception e) {
                C4130h.m11176a("deleteOldEvents", (Throwable) e);
            }
        } else {
            mo23054c();
        }
    }

    /* renamed from: b */
    public void mo23051b(long j, long j2) {
        C4131i iVar;
        synchronized (f7060c) {
            try {
                C4130h.m11180b("EventDAO", "deleteEventsByStartAndEndTS, start:%d, end:%d", Long.valueOf(j), Long.valueOf(j2));
                f7060c.getWritableDatabase().delete("mistat_event", "ts<=? AND ts>=?", new String[]{String.valueOf(j2), String.valueOf(j)});
                iVar = f7060c;
            } catch (SQLiteException e) {
                try {
                    C4130h.m11174a("EventDAO", "Error while deleting event by ts from DB", (Throwable) e);
                    iVar = f7060c;
                } catch (Throwable th) {
                    f7060c.close();
                    throw th;
                }
            }
            iVar.close();
        }
    }

    /* renamed from: b */
    public void mo23052b(StatEventPojo statEventPojo) {
        C4131i iVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put(BaseService.CATEGORY, statEventPojo.category);
        contentValues.put(BaseService.KEY, TextUtils.isEmpty(statEventPojo.key) ? "" : statEventPojo.key);
        contentValues.put("ts", Long.valueOf(statEventPojo.timeStamp));
        contentValues.put("type", TextUtils.isEmpty(statEventPojo.type) ? "" : statEventPojo.type);
        contentValues.put("value", TextUtils.isEmpty(statEventPojo.value) ? "" : statEventPojo.value);
        contentValues.put("extra", TextUtils.isEmpty(statEventPojo.extra) ? "" : statEventPojo.extra);
        synchronized (f7060c) {
            try {
                f7060c.getWritableDatabase().insert("mistat_event", "", contentValues);
                iVar = f7060c;
            } catch (SQLiteException e) {
                try {
                    C4130h.m11174a("EventDAO", "Error to insert data into DB, key=" + statEventPojo.key, (Throwable) e);
                    iVar = f7060c;
                } catch (Throwable th) {
                    f7060c.close();
                    throw th;
                }
            }
            iVar.close();
        }
    }

    /* renamed from: b */
    public void mo23053b(String str, String str2, String str3) {
        C4131i iVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str3);
        synchronized (f7060c) {
            try {
                f7060c.getWritableDatabase().update("mistat_event", contentValues, "category=? AND key=?", new String[]{str2, str});
                iVar = f7060c;
            } catch (SQLiteException e) {
                try {
                    C4130h.m11174a("EventDAO", "Error to update data from DB, key=" + str, (Throwable) e);
                    iVar = f7060c;
                } catch (Throwable th) {
                    f7060c.close();
                    throw th;
                }
            }
            iVar.close();
        }
    }

    /* renamed from: c */
    public void mo23054c() {
        C4131i iVar;
        long currentTimeMillis = System.currentTimeMillis() - 259200000;
        synchronized (f7060c) {
            try {
                int delete = f7060c.getWritableDatabase().delete("mistat_event", "ts<=? and category <> ?", new String[]{String.valueOf(currentTimeMillis), "mistat_basic"});
                if (delete > 0) {
                    MiStatInterface.recordCalculateEvent("quality_monitor", "delete_old_events", (long) delete);
                }
                iVar = f7060c;
            } catch (SQLiteException e) {
                try {
                    C4130h.m11174a("EventDAO", "Error while deleting out-of-date data from DB", (Throwable) e);
                    iVar = f7060c;
                } catch (Throwable th) {
                    f7060c.close();
                    throw th;
                }
            }
            iVar.close();
        }
    }

    /* renamed from: c */
    public void mo23055c(long j) {
        if (f7059b) {
            try {
                Intent intent = new Intent(C4113c.m11105a(), Class.forName(f7058a));
                intent.putExtra("type", 4);
                intent.putExtra(BaseService.TIME_STAMP, j);
                C4113c.m11105a().startService(intent);
            } catch (Exception e) {
                C4130h.m11176a("deleteEventsByTS", (Throwable) e);
            }
        } else {
            mo23057d(j);
        }
    }

    /* renamed from: d */
    public int mo23056d() {
        if (!f7059b) {
            return mo23058e();
        }
        m11134f();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            do {
                if (this.f7062e) {
                    if (this.f7061d != null) {
                        int a = this.f7061d.mo22983a();
                        C4130h.m11177b("process getCount , result is:" + a);
                        return a;
                    }
                }
            } while (System.currentTimeMillis() - currentTimeMillis <= 1000);
            return 0;
        } catch (Exception e) {
            C4130h.m11176a("getEventCount", (Throwable) e);
            return 0;
        }
    }

    /* renamed from: d */
    public void mo23057d(long j) {
        C4131i iVar;
        synchronized (f7060c) {
            try {
                C4130h.m11180b("EventDAO", "deleteEventsByTS, ts:%d", Long.valueOf(j));
                f7060c.getWritableDatabase().delete("mistat_event", "ts<=?", new String[]{String.valueOf(j)});
                iVar = f7060c;
            } catch (SQLiteException e) {
                try {
                    C4130h.m11174a("EventDAO", "Error while deleting event by ts from DB", (Throwable) e);
                    iVar = f7060c;
                } catch (Throwable th) {
                    f7060c.close();
                    throw th;
                }
            }
            iVar.close();
        }
    }

    /* renamed from: e */
    public int mo23058e() {
        C4131i iVar;
        synchronized (f7060c) {
            Cursor cursor = null;
            try {
                Cursor query = f7060c.getReadableDatabase().query("mistat_event", new String[]{"count(*)"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
                if (query == null || !query.moveToFirst()) {
                    if (query != null) {
                        query.close();
                    }
                    iVar = f7060c;
                    iVar.close();
                    return 0;
                }
                int i = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                f7060c.close();
                return i;
            } catch (SQLiteException e) {
                try {
                    C4130h.m11174a("EventDAO", "Error while getting count from DB", (Throwable) e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    iVar = f7060c;
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    f7060c.close();
                    throw th;
                }
            }
        }
    }
}
