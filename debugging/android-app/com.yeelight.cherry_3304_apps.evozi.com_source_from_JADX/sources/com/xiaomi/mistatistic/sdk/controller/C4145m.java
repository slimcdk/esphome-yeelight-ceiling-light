package com.xiaomi.mistatistic.sdk.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.data.C4173i;
import com.xiaomi.mistatistic.sdk.data.C4174j;
import com.xiaomi.mistatistic.sdk.data.C4175k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.m */
public class C4145m {

    /* renamed from: a */
    private static C4145m f7099a = null;

    /* renamed from: c */
    private static long f7100c = 30000;

    /* renamed from: d */
    private static final List<C4173i> f7101d = new ArrayList();

    /* renamed from: b */
    private Handler f7102b = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 31415927) {
                long a = C4137k.m11203a(C4113c.m11105a(), "session_begin", 0);
                long a2 = C4137k.m11203a(C4113c.m11105a(), "last_deactivate", 0);
                String a3 = C4137k.m11205a(C4113c.m11105a(), "pv_path", "");
                if (a > 0 && a2 > a) {
                    C4145m.this.m11237a(C4113c.m11105a(), a, a2);
                }
                if (!TextUtils.isEmpty(a3)) {
                    C4145m.this.m11243b(C4113c.m11105a(), a3);
                }
            }
        }
    };

    private C4145m() {
    }

    /* renamed from: a */
    public static C4145m m11235a() {
        if (f7099a == null) {
            f7099a = new C4145m();
        }
        return f7099a;
    }

    /* renamed from: a */
    private String m11236a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11237a(Context context, long j, long j2) {
        String b = C4132j.m11194b(context.getApplicationContext());
        if (TextUtils.isEmpty(b)) {
            b = "NULL";
        }
        LocalEventRecorder.insertEvent(new C4175k(j, j2, b));
        C4137k.m11211b(context.getApplicationContext(), "session_begin", 0);
        C4137k.m11211b(C4113c.m11105a(), "last_deactivate", 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11242a(String str, Context context) {
        int i;
        try {
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            C4137k.m11211b(C4113c.m11105a(), "last_deactivate", valueOf.longValue());
            if (!f7101d.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    String c = m11245c(context, str);
                    int size = f7101d.size() - 1;
                    while (true) {
                        if (size < 0) {
                            i = -1;
                            break;
                        } else if (TextUtils.equals(f7101d.get(size).mo23141b(), c)) {
                            i = size;
                            break;
                        } else {
                            size--;
                        }
                    }
                } else {
                    i = f7101d.size() - 1;
                }
                if (i >= 0) {
                    C4173i iVar = f7101d.get(i);
                    String b = iVar.mo23141b();
                    long a = iVar.mo23139a();
                    long longValue = valueOf.longValue() - a;
                    if (!TextUtils.isEmpty(b) && a > 0 && longValue > 0) {
                        iVar.mo23140a(Long.valueOf(longValue));
                        LocalEventRecorder.insertEvent(iVar);
                        f7101d.remove(i);
                    }
                }
            }
        } catch (Exception e) {
            C4130h.m11176a("processActDeativated exception: ", (Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m11243b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            LocalEventRecorder.insertEvent(new C4174j(str, C4137k.m11205a(context, "source_path", "")));
            C4137k.m11212b(context, "source_path", "");
            C4137k.m11212b(context, "pv_path", "");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007e A[Catch:{ Exception -> 0x00bf }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m11244b(android.content.Context r19, java.lang.String r20, java.lang.String r21) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            java.lang.String r8 = "source_path"
            java.lang.String r9 = "pv_path"
            java.lang.String r10 = ""
            java.lang.String r11 = "session_begin"
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00bf }
            android.content.Context r1 = r19.getApplicationContext()     // Catch:{ Exception -> 0x00bf }
            r2 = 0
            long r4 = com.xiaomi.mistatistic.sdk.controller.C4137k.m11203a((android.content.Context) r1, (java.lang.String) r11, (long) r2)     // Catch:{ Exception -> 0x00bf }
            android.content.Context r1 = r19.getApplicationContext()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r6 = "last_deactivate"
            long r14 = com.xiaomi.mistatistic.sdk.controller.C4137k.m11203a((android.content.Context) r1, (java.lang.String) r6, (long) r2)     // Catch:{ Exception -> 0x00bf }
            android.content.Context r1 = r19.getApplicationContext()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r1 = com.xiaomi.mistatistic.sdk.controller.C4137k.m11205a((android.content.Context) r1, (java.lang.String) r9, (java.lang.String) r10)     // Catch:{ Exception -> 0x00bf }
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0038
            android.content.Context r6 = r19.getApplicationContext()     // Catch:{ Exception -> 0x00bf }
            com.xiaomi.mistatistic.sdk.controller.C4137k.m11211b((android.content.Context) r6, (java.lang.String) r11, (long) r12)     // Catch:{ Exception -> 0x00bf }
            goto L_0x004e
        L_0x0038:
            int r6 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x004e
            android.content.Context r6 = r19.getApplicationContext()     // Catch:{ Exception -> 0x00bf }
            com.xiaomi.mistatistic.sdk.controller.C4137k.m11211b((android.content.Context) r6, (java.lang.String) r11, (long) r12)     // Catch:{ Exception -> 0x00bf }
            boolean r6 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00bf }
            if (r6 != 0) goto L_0x004e
            r7.m11243b(r0, r1)     // Catch:{ Exception -> 0x00bf }
            r6 = r10
            goto L_0x004f
        L_0x004e:
            r6 = r1
        L_0x004f:
            int r1 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x007e
            long r1 = r12 - r14
            long r16 = f7100c     // Catch:{ Exception -> 0x00bf }
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x007e
            r1 = r18
            r2 = r19
            r3 = r4
            r16 = r6
            r5 = r14
            r1.m11237a((android.content.Context) r2, (long) r3, (long) r5)     // Catch:{ Exception -> 0x00bf }
            boolean r1 = android.text.TextUtils.isEmpty(r16)     // Catch:{ Exception -> 0x00bf }
            if (r1 != 0) goto L_0x0073
            r1 = r16
            r7.m11243b(r0, r1)     // Catch:{ Exception -> 0x00bf }
            r6 = r10
            goto L_0x0076
        L_0x0073:
            r1 = r16
            r6 = r1
        L_0x0076:
            android.content.Context r1 = r19.getApplicationContext()     // Catch:{ Exception -> 0x00bf }
            com.xiaomi.mistatistic.sdk.controller.C4137k.m11211b((android.content.Context) r1, (java.lang.String) r11, (long) r12)     // Catch:{ Exception -> 0x00bf }
            goto L_0x0080
        L_0x007e:
            r1 = r6
            r6 = r1
        L_0x0080:
            java.lang.String r1 = r18.m11245c(r19, r20)     // Catch:{ Exception -> 0x00bf }
            boolean r2 = r6.endsWith(r1)     // Catch:{ Exception -> 0x00bf }
            if (r2 == 0) goto L_0x0090
            boolean r2 = android.text.TextUtils.isEmpty(r21)     // Catch:{ Exception -> 0x00bf }
            if (r2 != 0) goto L_0x00b0
        L_0x0090:
            java.lang.String r2 = r7.m11236a((java.lang.String) r6, (java.lang.String) r1)     // Catch:{ Exception -> 0x00bf }
            android.content.Context r0 = r19.getApplicationContext()     // Catch:{ Exception -> 0x00bf }
            com.xiaomi.mistatistic.sdk.controller.C4137k.m11212b((android.content.Context) r0, (java.lang.String) r9, (java.lang.String) r2)     // Catch:{ Exception -> 0x00bf }
            android.content.Context r0 = com.xiaomi.mistatistic.sdk.controller.C4113c.m11105a()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = com.xiaomi.mistatistic.sdk.controller.C4137k.m11205a((android.content.Context) r0, (java.lang.String) r8, (java.lang.String) r10)     // Catch:{ Exception -> 0x00bf }
            r2 = r21
            java.lang.String r0 = r7.m11236a((java.lang.String) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x00bf }
            android.content.Context r2 = com.xiaomi.mistatistic.sdk.controller.C4113c.m11105a()     // Catch:{ Exception -> 0x00bf }
            com.xiaomi.mistatistic.sdk.controller.C4137k.m11212b((android.content.Context) r2, (java.lang.String) r8, (java.lang.String) r0)     // Catch:{ Exception -> 0x00bf }
        L_0x00b0:
            com.xiaomi.mistatistic.sdk.data.i r0 = new com.xiaomi.mistatistic.sdk.data.i     // Catch:{ Exception -> 0x00bf }
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x00bf }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x00bf }
            java.util.List<com.xiaomi.mistatistic.sdk.data.i> r1 = f7101d     // Catch:{ Exception -> 0x00bf }
            r1.add(r0)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00c5
        L_0x00bf:
            r0 = move-exception
            java.lang.String r1 = "processActActivated exception: "
            com.xiaomi.mistatistic.sdk.controller.C4130h.m11176a((java.lang.String) r1, (java.lang.Throwable) r0)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mistatistic.sdk.controller.C4145m.m11244b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: c */
    private String m11245c(Context context, String str) {
        if (context == null) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            str = context.getClass().getName();
        }
        String packageName = context.getPackageName();
        return str.startsWith(packageName) ? str.replace(packageName, "") : str;
    }

    /* renamed from: a */
    public void mo23079a(final Context context, final String str) {
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                C4145m.this.m11242a(str, context);
            }
        });
        this.f7102b.sendEmptyMessageDelayed(31415927, f7100c);
    }

    /* renamed from: a */
    public void mo23080a(final Context context, final String str, final String str2) {
        if (context == null) {
            C4130h.m11176a("record pageStart without context.", (Throwable) null);
            return;
        }
        this.f7102b.removeMessages(31415927);
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                C4145m.this.m11244b(context, str, str2);
            }
        });
    }
}
