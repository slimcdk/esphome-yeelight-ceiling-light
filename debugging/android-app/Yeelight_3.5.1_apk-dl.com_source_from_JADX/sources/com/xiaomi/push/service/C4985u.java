package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4509ae;
import com.xiaomi.push.C4713fx;
import com.xiaomi.push.C4805j;
import com.xiaomi.push.C4835q;

/* renamed from: com.xiaomi.push.service.u */
public class C4985u {

    /* renamed from: a */
    private static C4984t f9747a;

    /* renamed from: a */
    private static C4986a f9748a;

    /* renamed from: com.xiaomi.push.service.u$a */
    public interface C4986a {
        /* renamed from: a */
        void mo30044a();
    }

    /* renamed from: a */
    private static int m15674a(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.xiaomi.push.service.C4984t m15675a(android.content.Context r12) {
        /*
            java.lang.Class<com.xiaomi.push.service.u> r0 = com.xiaomi.push.service.C4985u.class
            monitor-enter(r0)
            com.xiaomi.push.service.t r1 = f9747a     // Catch:{ all -> 0x00a4 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return r1
        L_0x0009:
            java.lang.String r1 = "mipush_account"
            r2 = 0
            android.content.SharedPreferences r1 = r12.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "uuid"
            r3 = 0
            java.lang.String r5 = r1.getString(r2, r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "token"
            java.lang.String r6 = r1.getString(r2, r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "security"
            java.lang.String r7 = r1.getString(r2, r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "app_id"
            java.lang.String r8 = r1.getString(r2, r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "app_token"
            java.lang.String r9 = r1.getString(r2, r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "package_name"
            java.lang.String r10 = r1.getString(r2, r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r2 = "device_id"
            java.lang.String r2 = r1.getString(r2, r3)     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = "env_type"
            r11 = 1
            int r11 = r1.getInt(r4, r11)     // Catch:{ all -> 0x00a4 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00a4 }
            if (r4 != 0) goto L_0x005f
            boolean r4 = com.xiaomi.push.C4805j.m14867a((java.lang.String) r2)     // Catch:{ all -> 0x00a4 }
            if (r4 == 0) goto L_0x005f
            java.lang.String r2 = com.xiaomi.push.C4805j.m14885i(r12)     // Catch:{ all -> 0x00a4 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x00a4 }
            java.lang.String r4 = "device_id"
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r2)     // Catch:{ all -> 0x00a4 }
            r1.commit()     // Catch:{ all -> 0x00a4 }
        L_0x005f:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00a4 }
            if (r1 != 0) goto L_0x00a2
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00a4 }
            if (r1 != 0) goto L_0x00a2
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x00a4 }
            if (r1 != 0) goto L_0x00a2
            java.lang.String r1 = com.xiaomi.push.C4805j.m14885i(r12)     // Catch:{ all -> 0x00a4 }
            java.lang.String r3 = "com.xiaomi.xmsf"
            java.lang.String r12 = r12.getPackageName()     // Catch:{ all -> 0x00a4 }
            boolean r12 = r3.equals(r12)     // Catch:{ all -> 0x00a4 }
            if (r12 != 0) goto L_0x0098
            boolean r12 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00a4 }
            if (r12 != 0) goto L_0x0098
            boolean r12 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00a4 }
            if (r12 != 0) goto L_0x0098
            boolean r12 = r2.equals(r1)     // Catch:{ all -> 0x00a4 }
            if (r12 != 0) goto L_0x0098
            java.lang.String r12 = "read_phone_state permission changes."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)     // Catch:{ all -> 0x00a4 }
        L_0x0098:
            com.xiaomi.push.service.t r12 = new com.xiaomi.push.service.t     // Catch:{ all -> 0x00a4 }
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00a4 }
            f9747a = r12     // Catch:{ all -> 0x00a4 }
            monitor-exit(r0)
            return r12
        L_0x00a2:
            monitor-exit(r0)
            return r3
        L_0x00a4:
            r12 = move-exception
            monitor-exit(r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4985u.m15675a(android.content.Context):com.xiaomi.push.service.t");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a3 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013e A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0184 A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01eb A[Catch:{ Exception -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x023e A[SYNTHETIC, Splitter:B:82:0x023e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.xiaomi.push.service.C4984t m15676a(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            r1 = r17
            java.lang.Class<com.xiaomi.push.service.u> r2 = com.xiaomi.push.service.C4985u.class
            monitor-enter(r2)
            java.util.TreeMap r3 = new java.util.TreeMap     // Catch:{ all -> 0x032e }
            r3.<init>()     // Catch:{ all -> 0x032e }
            r4 = 0
            java.lang.String r0 = com.xiaomi.push.C4805j.m14864a((android.content.Context) r1, (boolean) r4)     // Catch:{ all -> 0x032e }
            java.lang.String r5 = "devid"
            r3.put(r5, r0)     // Catch:{ all -> 0x032e }
            com.xiaomi.push.service.t r0 = f9747a     // Catch:{ all -> 0x032e }
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = r0.f9741a     // Catch:{ all -> 0x032e }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x032e }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "uuid"
            com.xiaomi.push.service.t r7 = f9747a     // Catch:{ all -> 0x032e }
            java.lang.String r7 = r7.f9741a     // Catch:{ all -> 0x032e }
            r3.put(r0, r7)     // Catch:{ all -> 0x032e }
            com.xiaomi.push.service.t r0 = f9747a     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r0.f9741a     // Catch:{ all -> 0x032e }
            java.lang.String r7 = "/"
            int r0 = r0.lastIndexOf(r7)     // Catch:{ all -> 0x032e }
            r7 = -1
            if (r0 == r7) goto L_0x0043
            com.xiaomi.push.service.t r7 = f9747a     // Catch:{ all -> 0x032e }
            java.lang.String r7 = r7.f9741a     // Catch:{ all -> 0x032e }
            int r0 = r0 + r5
            java.lang.String r0 = r7.substring(r0)     // Catch:{ all -> 0x032e }
            r7 = r0
            goto L_0x0044
        L_0x0043:
            r7 = r6
        L_0x0044:
            com.xiaomi.push.ba r0 = com.xiaomi.push.C4539ba.m12950a((android.content.Context) r17)     // Catch:{ all -> 0x032e }
            r0.mo28767a((java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = com.xiaomi.push.C4805j.m14863a((android.content.Context) r17)     // Catch:{ all -> 0x032e }
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x032e }
            if (r8 != 0) goto L_0x005a
            java.lang.String r8 = "gaid"
            r3.put(r8, r0)     // Catch:{ all -> 0x032e }
        L_0x005a:
            boolean r0 = m15674a((android.content.Context) r17)     // Catch:{ all -> 0x032e }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "1000271"
            r12 = r0
            goto L_0x0066
        L_0x0064:
            r12 = r19
        L_0x0066:
            boolean r0 = m15674a((android.content.Context) r17)     // Catch:{ all -> 0x032e }
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "420100086271"
            r13 = r0
            goto L_0x0072
        L_0x0070:
            r13 = r20
        L_0x0072:
            boolean r0 = m15674a((android.content.Context) r17)     // Catch:{ all -> 0x032e }
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "com.xiaomi.xmsf"
            r14 = r0
            goto L_0x007e
        L_0x007c:
            r14 = r18
        L_0x007e:
            java.lang.String r0 = "appid"
            r3.put(r0, r12)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "apptoken"
            r3.put(r0, r13)     // Catch:{ all -> 0x032e }
            android.content.pm.PackageManager r0 = r17.getPackageManager()     // Catch:{ Exception -> 0x0093 }
            r8 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r14, r8)     // Catch:{ Exception -> 0x0093 }
            goto L_0x0098
        L_0x0093:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r0)     // Catch:{ all -> 0x032e }
            r0 = r6
        L_0x0098:
            java.lang.String r8 = "appversion"
            if (r0 == 0) goto L_0x00a3
            int r0 = r0.versionCode     // Catch:{ all -> 0x032e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x032e }
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r0 = "0"
        L_0x00a5:
            r3.put(r8, r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "sdkversion"
            r8 = 40091(0x9c9b, float:5.618E-41)
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x032e }
            r3.put(r0, r8)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "packagename"
            r3.put(r0, r14)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "model"
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x032e }
            r3.put(r0, r8)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "board"
            java.lang.String r8 = android.os.Build.BOARD     // Catch:{ all -> 0x032e }
            r3.put(r0, r8)     // Catch:{ all -> 0x032e }
            boolean r0 = com.xiaomi.push.C4830m.m15015d()     // Catch:{ all -> 0x032e }
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = ""
            java.lang.String r8 = com.xiaomi.push.C4805j.m14879d((android.content.Context) r17)     // Catch:{ all -> 0x032e }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x032e }
            if (r9 != 0) goto L_0x00ec
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r9.<init>()     // Catch:{ all -> 0x032e }
            r9.append(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = com.xiaomi.push.C4561bp.m13042a((java.lang.String) r8)     // Catch:{ all -> 0x032e }
            r9.append(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x032e }
        L_0x00ec:
            java.lang.String r8 = com.xiaomi.push.C4805j.m14882f(r17)     // Catch:{ all -> 0x032e }
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x032e }
            if (r9 != 0) goto L_0x0110
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x032e }
            if (r9 != 0) goto L_0x0110
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r9.<init>()     // Catch:{ all -> 0x032e }
            r9.append(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = ","
            r9.append(r0)     // Catch:{ all -> 0x032e }
            r9.append(r8)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x032e }
        L_0x0110:
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x032e }
            if (r8 != 0) goto L_0x011b
            java.lang.String r8 = "imei_md5"
            r3.put(r8, r0)     // Catch:{ all -> 0x032e }
        L_0x011b:
            java.lang.String r0 = "os"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r8.<init>()     // Catch:{ all -> 0x032e }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x032e }
            r8.append(r9)     // Catch:{ all -> 0x032e }
            java.lang.String r9 = "-"
            r8.append(r9)     // Catch:{ all -> 0x032e }
            java.lang.String r9 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x032e }
            r8.append(r9)     // Catch:{ all -> 0x032e }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x032e }
            r3.put(r0, r8)     // Catch:{ all -> 0x032e }
            int r0 = com.xiaomi.push.C4805j.m14859a()     // Catch:{ all -> 0x032e }
            if (r0 < 0) goto L_0x0147
            java.lang.String r8 = "space_id"
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x032e }
            r3.put(r8, r0)     // Catch:{ all -> 0x032e }
        L_0x0147:
            java.lang.String r0 = "brand"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r8.<init>()     // Catch:{ all -> 0x032e }
            java.lang.String r9 = android.os.Build.BRAND     // Catch:{ all -> 0x032e }
            r8.append(r9)     // Catch:{ all -> 0x032e }
            java.lang.String r9 = ""
            r8.append(r9)     // Catch:{ all -> 0x032e }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x032e }
            r3.put(r0, r8)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "ram"
            java.lang.String r8 = com.xiaomi.push.C4805j.m14859a()     // Catch:{ all -> 0x032e }
            r3.put(r0, r8)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = "rom"
            java.lang.String r8 = com.xiaomi.push.C4805j.m14868b()     // Catch:{ all -> 0x032e }
            r3.put(r0, r8)     // Catch:{ all -> 0x032e }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x032e }
            r8.<init>()     // Catch:{ all -> 0x032e }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x032e }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x032e }
        L_0x017e:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x032e }
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x032e }
            r10 = r0
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ all -> 0x032e }
            java.lang.Object r0 = r10.getKey()     // Catch:{ JSONException -> 0x0199 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0199 }
            java.lang.Object r11 = r10.getValue()     // Catch:{ JSONException -> 0x0199 }
            r8.put(r0, r11)     // Catch:{ JSONException -> 0x0199 }
            goto L_0x017e
        L_0x0199:
            r0 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r11.<init>()     // Catch:{ all -> 0x032e }
            java.lang.String r15 = "failed to add data in json format: k="
            r11.append(r15)     // Catch:{ all -> 0x032e }
            java.lang.Object r15 = r10.getKey()     // Catch:{ all -> 0x032e }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x032e }
            r11.append(r15)     // Catch:{ all -> 0x032e }
            java.lang.String r15 = ",v="
            r11.append(r15)     // Catch:{ all -> 0x032e }
            java.lang.Object r10 = r10.getValue()     // Catch:{ all -> 0x032e }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x032e }
            r11.append(r10)     // Catch:{ all -> 0x032e }
            java.lang.String r10 = ". "
            r11.append(r10)     // Catch:{ all -> 0x032e }
            r11.append(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x032e }
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)     // Catch:{ all -> 0x032e }
            goto L_0x017e
        L_0x01cb:
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x032e }
            java.lang.String r0 = com.xiaomi.push.service.C4926bs.m15459a(r0)     // Catch:{ all -> 0x032e }
            java.util.TreeMap r8 = new java.util.TreeMap     // Catch:{ all -> 0x032e }
            r8.<init>()     // Catch:{ all -> 0x032e }
            java.lang.String r9 = "requestData"
            r8.put(r9, r0)     // Catch:{ all -> 0x032e }
            java.lang.String r9 = "keyPairVer"
            java.lang.String r10 = "1"
            r8.put(r9, r10)     // Catch:{ all -> 0x032e }
            int r9 = m15674a((android.content.Context) r17)     // Catch:{ all -> 0x032e }
            r10 = 2
            if (r9 >= r10) goto L_0x0208
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x032e }
            if (r9 == 0) goto L_0x01f2
            goto L_0x0208
        L_0x01f2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r9.<init>()     // Catch:{ all -> 0x032e }
            java.lang.String r10 = "r.data = "
            r9.append(r10)     // Catch:{ all -> 0x032e }
            r9.append(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x032e }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ all -> 0x032e }
            r15 = 1
            goto L_0x0209
        L_0x0208:
            r15 = 0
        L_0x0209:
            java.lang.String r0 = m15678a((android.content.Context) r1, (boolean) r15)     // Catch:{ all -> 0x032e }
            if (r15 == 0) goto L_0x0210
            r3 = r8
        L_0x0210:
            com.xiaomi.push.bh r0 = com.xiaomi.push.C4551bj.m12988a(r1, r0, r3)     // Catch:{ IOException -> 0x0215 }
            goto L_0x022c
        L_0x0215:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r0.<init>()     // Catch:{ all -> 0x032e }
            java.lang.String r8 = "device registration request failed. "
            r0.append(r8)     // Catch:{ all -> 0x032e }
            r0.append(r3)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x032e }
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)     // Catch:{ all -> 0x032e }
            r0 = r6
        L_0x022c:
            if (r0 == 0) goto L_0x0315
            int r3 = r0.f7645a     // Catch:{ all -> 0x032e }
            r8 = 200(0xc8, float:2.8E-43)
            if (r3 != r8) goto L_0x0315
            java.lang.String r0 = r0.mo28776a()     // Catch:{ all -> 0x032e }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x032e }
            if (r3 != 0) goto L_0x0315
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            java.lang.String r8 = "code"
            int r8 = r3.getInt(r8)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            if (r8 != 0) goto L_0x02be
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            java.lang.String r3 = "ssecurity"
            java.lang.String r11 = r0.getString(r3)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            java.lang.String r3 = "token"
            java.lang.String r10 = r0.getString(r3)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            java.lang.String r3 = "userId"
            java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            boolean r3 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            if (r3 == 0) goto L_0x027f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            r3.<init>()     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            java.lang.String r7 = "an"
            r3.append(r7)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            r7 = 6
            java.lang.String r7 = com.xiaomi.push.C4561bp.m13041a((int) r7)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            r3.append(r7)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            java.lang.String r7 = r3.toString()     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
        L_0x027f:
            com.xiaomi.push.service.t r3 = new com.xiaomi.push.service.t     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            r8.<init>()     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            r8.append(r0)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            java.lang.String r9 = "@xiaomi.com/"
            r8.append(r9)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            r8.append(r7)     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            java.lang.String r9 = r8.toString()     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            int r7 = com.xiaomi.push.C4509ae.m12843a()     // Catch:{ JSONException -> 0x0300, all -> 0x02e8 }
            r8 = r3
            r16 = r15
            r15 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            m15682a((android.content.Context) r1, (com.xiaomi.push.service.C4984t) r3)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            f9747a = r3     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            m15681a((android.content.Context) r1, (int) r4)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            r4.<init>()     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            java.lang.String r7 = "device registration is successful. "
            r4.append(r7)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            r4.append(r0)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            java.lang.String r0 = r4.toString()     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            monitor-exit(r2)
            return r3
        L_0x02be:
            r16 = r15
            java.lang.String r4 = "code"
            int r4 = r3.getInt(r4)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            java.lang.String r7 = "description"
            java.lang.String r3 = r3.optString(r7)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            com.xiaomi.push.service.C4989x.m15698a(r1, r4, r3)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            r3.<init>()     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            java.lang.String r4 = "device registration resp: "
            r3.append(r4)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            r3.append(r0)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ JSONException -> 0x02e6, all -> 0x02e4 }
            goto L_0x0317
        L_0x02e4:
            r0 = move-exception
            goto L_0x02eb
        L_0x02e6:
            r0 = move-exception
            goto L_0x0303
        L_0x02e8:
            r0 = move-exception
            r16 = r15
        L_0x02eb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r3.<init>()     // Catch:{ all -> 0x032e }
            java.lang.String r4 = "unknow throwable. "
            r3.append(r4)     // Catch:{ all -> 0x032e }
            r3.append(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x032e }
        L_0x02fc:
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)     // Catch:{ all -> 0x032e }
            goto L_0x0317
        L_0x0300:
            r0 = move-exception
            r16 = r15
        L_0x0303:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x032e }
            r3.<init>()     // Catch:{ all -> 0x032e }
            java.lang.String r4 = "failed to parse respone json data. "
            r3.append(r4)     // Catch:{ all -> 0x032e }
            r3.append(r0)     // Catch:{ all -> 0x032e }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x032e }
            goto L_0x02fc
        L_0x0315:
            r16 = r15
        L_0x0317:
            if (r16 == 0) goto L_0x0327
            boolean r0 = com.xiaomi.push.C4551bj.m13001c(r17)     // Catch:{ all -> 0x032e }
            if (r0 == 0) goto L_0x0327
            int r0 = m15674a((android.content.Context) r17)     // Catch:{ all -> 0x032e }
            int r0 = r0 + r5
            m15681a((android.content.Context) r1, (int) r0)     // Catch:{ all -> 0x032e }
        L_0x0327:
            java.lang.String r0 = "fail to register push account. meet error."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ all -> 0x032e }
            monitor-exit(r2)
            return r6
        L_0x032e:
            r0 = move-exception
            monitor-exit(r2)
            goto L_0x0332
        L_0x0331:
            throw r0
        L_0x0332:
            goto L_0x0331
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4985u.m15676a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.t");
    }

    /* renamed from: a */
    public static String m15677a(Context context) {
        C4984t a = m15674a(context);
        if (a != null && !TextUtils.isEmpty(a.f9741a)) {
            String[] split = a.f9741a.split("@");
            if (split.length > 0) {
                return split[0];
            }
        }
        return null;
    }

    /* renamed from: a */
    private static String m15678a(Context context, boolean z) {
        StringBuilder sb;
        String str;
        String a = C4860a.m15159a(context).mo29957a();
        String str2 = z ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (C4509ae.m12846b()) {
            sb = new StringBuilder();
            sb.append("http://");
            sb.append(C4713fx.f8238b);
            str = ":9085";
        } else if (C4835q.China.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://cn.register.xmpush.xiaomi.com";
        } else if (C4835q.Global.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://register.xmpush.global.xiaomi.com";
        } else if (C4835q.Europe.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://fr.register.xmpush.global.xiaomi.com";
        } else if (C4835q.Russia.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://ru.register.xmpush.global.xiaomi.com";
        } else if (C4835q.India.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://idmb.register.xmpush.global.xiaomi.com";
        } else {
            sb = new StringBuilder();
            sb.append("https://");
            str = C4509ae.m12843a() ? "sandbox.xmpush.xiaomi.com" : "register.xmpush.xiaomi.com";
        }
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m15679a() {
        C4986a aVar = f9748a;
        if (aVar != null) {
            aVar.mo30044a();
        }
    }

    /* renamed from: a */
    public static void m15680a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f9747a = null;
        m15679a();
    }

    /* renamed from: a */
    private static void m15681a(Context context, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putInt("enc_req_fail_count", i);
        edit.commit();
    }

    /* renamed from: a */
    public static void m15682a(Context context, C4984t tVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putString("uuid", tVar.f9741a);
        edit.putString("security", tVar.f9743c);
        edit.putString("token", tVar.f9742b);
        edit.putString(Constants.APP_ID, tVar.f9744d);
        edit.putString(Constants.PACKAGE_NAME, tVar.f9746f);
        edit.putString("app_token", tVar.f9745e);
        edit.putString("device_id", C4805j.m14885i(context));
        edit.putInt("env_type", tVar.f9740a);
        edit.commit();
        m15679a();
    }

    /* renamed from: a */
    public static void m15683a(C4986a aVar) {
        f9748a = aVar;
    }

    /* renamed from: a */
    private static boolean m15684a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }
}
