package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4543bp;
import com.xiaomi.push.C4662fb;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4751hy;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4754ia;
import com.xiaomi.push.C4756ic;
import com.xiaomi.push.C4757id;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4769ip;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4777ix;
import com.xiaomi.push.C4787jc;
import com.xiaomi.push.C4815r;
import com.xiaomi.push.service.C4837aa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TimeZone;

/* renamed from: com.xiaomi.mipush.sdk.an */
public class C4044an {

    /* renamed from: a */
    private static C4044an f6872a;

    /* renamed from: a */
    private static Object f6873a = new Object();

    /* renamed from: a */
    private static Queue<String> f6874a;

    /* renamed from: a */
    private Context f6875a;

    private C4044an(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f6875a = applicationContext;
        if (applicationContext == null) {
            this.f6875a = context;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x013b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m10810a(android.content.Context r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x017e
            java.lang.String r1 = "notify_effect"
            boolean r2 = r8.containsKey(r1)
            if (r2 != 0) goto L_0x000d
            goto L_0x017e
        L_0x000d:
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            java.lang.String r3 = "intent_flag"
            java.lang.Object r3 = r8.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ NumberFormatException -> 0x0027 }
            if (r4 != 0) goto L_0x0040
            int r2 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0027 }
            goto L_0x0040
        L_0x0027:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Cause by intent_flag: "
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r3)
        L_0x0040:
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10026a
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = "Cause: "
            if (r3 == 0) goto L_0x006d
            android.content.pm.PackageManager r8 = r6.getPackageManager()     // Catch:{ Exception -> 0x0054 }
            android.content.Intent r7 = r8.getLaunchIntentForPackage(r7)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0139
        L_0x0054:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r7)
            goto L_0x0138
        L_0x006d:
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10027b
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x00bf
            java.lang.String r1 = "intent_uri"
            boolean r3 = r8.containsKey(r1)
            if (r3 == 0) goto L_0x00a1
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0138
            r1 = 1
            android.content.Intent r8 = android.content.Intent.parseUri(r8, r1)     // Catch:{ URISyntaxException -> 0x0091 }
            r8.setPackage(r7)     // Catch:{ URISyntaxException -> 0x008f }
            goto L_0x0136
        L_0x008f:
            r7 = move-exception
            goto L_0x0093
        L_0x0091:
            r7 = move-exception
            r8 = r0
        L_0x0093:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r7 = r7.getMessage()
            goto L_0x012c
        L_0x00a1:
            java.lang.String r1 = "class_name"
            boolean r3 = r8.containsKey(r1)
            if (r3 == 0) goto L_0x0138
            java.lang.Object r8 = r8.get(r1)
            java.lang.String r8 = (java.lang.String) r8
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r7, r8)
            r1.setComponent(r3)
            r7 = r1
            goto L_0x0139
        L_0x00bf:
            java.lang.String r7 = com.xiaomi.push.service.C4870at.f10028c
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0138
            java.lang.String r7 = "web_uri"
            java.lang.Object r7 = r8.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0138
            java.lang.String r7 = r7.trim()
            java.lang.String r8 = "http://"
            boolean r1 = r7.startsWith(r8)
            if (r1 != 0) goto L_0x00f4
            java.lang.String r1 = "https://"
            boolean r1 = r7.startsWith(r1)
            if (r1 != 0) goto L_0x00f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L_0x00f4:
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x011e }
            r8.<init>(r7)     // Catch:{ MalformedURLException -> 0x011e }
            java.lang.String r8 = r8.getProtocol()     // Catch:{ MalformedURLException -> 0x011e }
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r8)     // Catch:{ MalformedURLException -> 0x011e }
            if (r1 != 0) goto L_0x010d
            java.lang.String r1 = "https"
            boolean r8 = r1.equals(r8)     // Catch:{ MalformedURLException -> 0x011e }
            if (r8 == 0) goto L_0x0138
        L_0x010d:
            android.content.Intent r8 = new android.content.Intent     // Catch:{ MalformedURLException -> 0x011e }
            java.lang.String r1 = "android.intent.action.VIEW"
            r8.<init>(r1)     // Catch:{ MalformedURLException -> 0x011e }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ MalformedURLException -> 0x011c }
            r8.setData(r7)     // Catch:{ MalformedURLException -> 0x011c }
            goto L_0x0136
        L_0x011c:
            r7 = move-exception
            goto L_0x0120
        L_0x011e:
            r7 = move-exception
            r8 = r0
        L_0x0120:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r7 = r7.getMessage()
        L_0x012c:
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r7)
        L_0x0136:
            r7 = r8
            goto L_0x0139
        L_0x0138:
            r7 = r0
        L_0x0139:
            if (r7 == 0) goto L_0x017e
            if (r2 < 0) goto L_0x0140
            r7.setFlags(r2)
        L_0x0140:
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r7.addFlags(r8)
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ Exception -> 0x0167 }
            r8 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r6 = r6.resolveActivity(r7, r8)     // Catch:{ Exception -> 0x0167 }
            if (r6 == 0) goto L_0x0152
            return r7
        L_0x0152:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0167 }
            r6.<init>()     // Catch:{ Exception -> 0x0167 }
            java.lang.String r8 = "not resolve activity:"
            r6.append(r8)     // Catch:{ Exception -> 0x0167 }
            r6.append(r7)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0167 }
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r6)     // Catch:{ Exception -> 0x0167 }
            goto L_0x017e
        L_0x0167:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r6)
        L_0x017e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4044an.m10810a(android.content.Context, java.lang.String, java.util.Map):android.content.Intent");
    }

    /* JADX WARNING: type inference failed for: r4v20, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r10v5, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r10v7, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r10v9, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.xiaomi.mipush.sdk.PushMessageHandler.C4029a m10811a(com.xiaomi.push.C4762ii r21, boolean r22, byte[] r23, java.lang.String r24, int r25) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            r0 = r22
            r3 = r23
            r8 = r24
            r9 = r25
            java.lang.Class<com.xiaomi.mipush.sdk.ag> r4 = com.xiaomi.mipush.sdk.C4037ag.class
            r10 = 0
            android.content.Context r5 = r1.f6875a     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            com.xiaomi.push.ix r5 = com.xiaomi.mipush.sdk.C4040aj.m10806a((android.content.Context) r5, (com.xiaomi.push.C4762ii) r2)     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            if (r5 != 0) goto L_0x0043
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            r0.<init>()     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            java.lang.String r3 = "receiving an un-recognized message. "
            r0.append(r3)     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            com.xiaomi.push.hm r3 = r2.f9488a     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            r0.append(r3)     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            java.lang.String r0 = r0.toString()     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r0)     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            android.content.Context r0 = r1.f6875a     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            com.xiaomi.push.fb r0 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            android.content.Context r3 = r1.f6875a     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            java.lang.String r4 = com.xiaomi.push.C4660fa.m14135a((int) r25)     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            java.lang.String r5 = "18"
            r0.mo25064b(r3, r4, r8, r5)     // Catch:{ t -> 0x0985, jc -> 0x0966 }
            return r10
        L_0x0043:
            com.xiaomi.push.hm r6 = r21.mo25521a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "processing a message, action="
            r7.append(r11)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r7)
            int[] r7 = com.xiaomi.mipush.sdk.C4046ap.f6879a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            r7 = 1
            r11 = 0
            r13 = 0
            switch(r6) {
                case 1: goto L_0x0703;
                case 2: goto L_0x0659;
                case 3: goto L_0x063e;
                case 4: goto L_0x0605;
                case 5: goto L_0x05cc;
                case 6: goto L_0x04a7;
                case 7: goto L_0x006c;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x0965
        L_0x006c:
            android.content.Context r0 = r1.f6875a
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r6 = r1.f6875a
            com.xiaomi.push.hm r8 = com.xiaomi.push.C4739hm.Notification
            int r3 = r3.length
            com.xiaomi.push.C4596df.m13712a(r0, r6, r5, r8, r3)
            boolean r0 = r5 instanceof com.xiaomi.push.C4757id
            if (r0 == 0) goto L_0x0205
            com.xiaomi.push.id r5 = (com.xiaomi.push.C4757id) r5
            java.lang.String r0 = r5.mo25446a()
            com.xiaomi.push.hw r2 = com.xiaomi.push.C4749hw.DisablePushMessage
            java.lang.String r2 = r2.f9252a
            java.lang.String r3 = r5.f9422d
            boolean r2 = r2.equalsIgnoreCase(r3)
            r3 = 10
            if (r2 == 0) goto L_0x0145
            long r5 = r5.f9415a
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x00eb
            monitor-enter(r4)
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x00e8 }
            boolean r2 = r2.mo22894a((java.lang.String) r0)     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00e5
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x00e8 }
            r2.mo22898c(r0)     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = "syncing"
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.av r3 = com.xiaomi.mipush.sdk.C4053av.DISABLE_PUSH     // Catch:{ all -> 0x00e8 }
            java.lang.String r2 = r2.mo22895a((com.xiaomi.mipush.sdk.C4053av) r3)     // Catch:{ all -> 0x00e8 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00e5
            android.content.Context r0 = r1.f6875a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.ag r0 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r0)     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.av r2 = com.xiaomi.mipush.sdk.C4053av.DISABLE_PUSH     // Catch:{ all -> 0x00e8 }
            java.lang.String r3 = "synced"
            r0.mo22896a(r2, r3)     // Catch:{ all -> 0x00e8 }
            android.content.Context r0 = r1.f6875a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.MiPushClient.clearNotification(r0)     // Catch:{ all -> 0x00e8 }
            android.content.Context r0 = r1.f6875a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.MiPushClient.clearLocalNotificationType(r0)     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.PushMessageHandler.mo22778a()     // Catch:{ all -> 0x00e8 }
            android.content.Context r0 = r1.f6875a     // Catch:{ all -> 0x00e8 }
            com.xiaomi.mipush.sdk.aq r0 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r0)     // Catch:{ all -> 0x00e8 }
            r0.mo22920b()     // Catch:{ all -> 0x00e8 }
        L_0x00e5:
            monitor-exit(r4)     // Catch:{ all -> 0x00e8 }
            goto L_0x0965
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e8 }
            throw r0
        L_0x00eb:
            java.lang.String r2 = "syncing"
            android.content.Context r5 = r1.f6875a
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r5)
            com.xiaomi.mipush.sdk.av r6 = com.xiaomi.mipush.sdk.C4053av.DISABLE_PUSH
            java.lang.String r5 = r5.mo22895a((com.xiaomi.mipush.sdk.C4053av) r6)
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x013a
            monitor-enter(r4)
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x0137 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x0137 }
            boolean r2 = r2.mo22894a((java.lang.String) r0)     // Catch:{ all -> 0x0137 }
            if (r2 == 0) goto L_0x0134
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x0137 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x0137 }
            int r2 = r2.mo22894a((java.lang.String) r0)     // Catch:{ all -> 0x0137 }
            if (r2 >= r3) goto L_0x012b
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x0137 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x0137 }
            r2.mo22897b(r0)     // Catch:{ all -> 0x0137 }
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x0137 }
            com.xiaomi.mipush.sdk.aq r2 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r2)     // Catch:{ all -> 0x0137 }
            r2.mo22919a((boolean) r7, (java.lang.String) r0)     // Catch:{ all -> 0x0137 }
            goto L_0x0134
        L_0x012b:
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x0137 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x0137 }
            r2.mo22898c(r0)     // Catch:{ all -> 0x0137 }
        L_0x0134:
            monitor-exit(r4)     // Catch:{ all -> 0x0137 }
            goto L_0x0965
        L_0x0137:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0137 }
            throw r0
        L_0x013a:
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)
            r2.mo22898c(r0)
            goto L_0x0965
        L_0x0145:
            com.xiaomi.push.hw r2 = com.xiaomi.push.C4749hw.EnablePushMessage
            java.lang.String r2 = r2.f9252a
            java.lang.String r6 = r5.f9422d
            boolean r2 = r2.equalsIgnoreCase(r6)
            if (r2 == 0) goto L_0x01e3
            long r5 = r5.f9415a
            int r2 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0194
            monitor-enter(r4)
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x0191 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x0191 }
            boolean r2 = r2.mo22894a((java.lang.String) r0)     // Catch:{ all -> 0x0191 }
            if (r2 == 0) goto L_0x018e
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x0191 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x0191 }
            r2.mo22898c(r0)     // Catch:{ all -> 0x0191 }
            java.lang.String r0 = "syncing"
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x0191 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x0191 }
            com.xiaomi.mipush.sdk.av r3 = com.xiaomi.mipush.sdk.C4053av.ENABLE_PUSH     // Catch:{ all -> 0x0191 }
            java.lang.String r2 = r2.mo22895a((com.xiaomi.mipush.sdk.C4053av) r3)     // Catch:{ all -> 0x0191 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x0191 }
            if (r0 == 0) goto L_0x018e
            android.content.Context r0 = r1.f6875a     // Catch:{ all -> 0x0191 }
            com.xiaomi.mipush.sdk.ag r0 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r0)     // Catch:{ all -> 0x0191 }
            com.xiaomi.mipush.sdk.av r2 = com.xiaomi.mipush.sdk.C4053av.ENABLE_PUSH     // Catch:{ all -> 0x0191 }
            java.lang.String r3 = "synced"
            r0.mo22896a(r2, r3)     // Catch:{ all -> 0x0191 }
        L_0x018e:
            monitor-exit(r4)     // Catch:{ all -> 0x0191 }
            goto L_0x0965
        L_0x0191:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0191 }
            throw r0
        L_0x0194:
            java.lang.String r2 = "syncing"
            android.content.Context r5 = r1.f6875a
            com.xiaomi.mipush.sdk.ag r5 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r5)
            com.xiaomi.mipush.sdk.av r6 = com.xiaomi.mipush.sdk.C4053av.ENABLE_PUSH
            java.lang.String r5 = r5.mo22895a((com.xiaomi.mipush.sdk.C4053av) r6)
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x013a
            monitor-enter(r4)
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x01e0 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x01e0 }
            boolean r2 = r2.mo22894a((java.lang.String) r0)     // Catch:{ all -> 0x01e0 }
            if (r2 == 0) goto L_0x01dd
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x01e0 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x01e0 }
            int r2 = r2.mo22894a((java.lang.String) r0)     // Catch:{ all -> 0x01e0 }
            if (r2 >= r3) goto L_0x01d4
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x01e0 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x01e0 }
            r2.mo22897b(r0)     // Catch:{ all -> 0x01e0 }
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x01e0 }
            com.xiaomi.mipush.sdk.aq r2 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r2)     // Catch:{ all -> 0x01e0 }
            r2.mo22919a((boolean) r13, (java.lang.String) r0)     // Catch:{ all -> 0x01e0 }
            goto L_0x01dd
        L_0x01d4:
            android.content.Context r2 = r1.f6875a     // Catch:{ all -> 0x01e0 }
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4037ag.m10796a((android.content.Context) r2)     // Catch:{ all -> 0x01e0 }
            r2.mo22898c(r0)     // Catch:{ all -> 0x01e0 }
        L_0x01dd:
            monitor-exit(r4)     // Catch:{ all -> 0x01e0 }
            goto L_0x0965
        L_0x01e0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01e0 }
            throw r0
        L_0x01e3:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.ThirdPartyRegUpdate
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9422d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x01f4
            r1.m10825b((com.xiaomi.push.C4757id) r5)
            goto L_0x0965
        L_0x01f4:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.UploadTinyData
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9422d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0965
            r1.m10819a((com.xiaomi.push.C4757id) r5)
            goto L_0x0965
        L_0x0205:
            boolean r0 = r5 instanceof com.xiaomi.push.C4765il
            if (r0 == 0) goto L_0x0965
            com.xiaomi.push.il r5 = (com.xiaomi.push.C4765il) r5
            java.lang.String r0 = "registration id expired"
            java.lang.String r3 = r5.f9529d
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x029f
            android.content.Context r0 = r1.f6875a
            java.util.List r0 = com.xiaomi.mipush.sdk.MiPushClient.getAllAlias(r0)
            android.content.Context r2 = r1.f6875a
            java.util.List r2 = com.xiaomi.mipush.sdk.MiPushClient.getAllTopic(r2)
            android.content.Context r3 = r1.f6875a
            java.util.List r3 = com.xiaomi.mipush.sdk.MiPushClient.getAllUserAccount(r3)
            android.content.Context r4 = r1.f6875a
            java.lang.String r4 = com.xiaomi.mipush.sdk.MiPushClient.getAcceptTime(r4)
            android.content.Context r5 = r1.f6875a
            com.xiaomi.push.ia r6 = com.xiaomi.push.C4754ia.RegIdExpired
            com.xiaomi.mipush.sdk.MiPushClient.reInitialize(r5, r6)
            java.util.Iterator r0 = r0.iterator()
        L_0x0238:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x024f
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            android.content.Context r6 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.removeAlias(r6, r5)
            android.content.Context r6 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.setAlias(r6, r5, r10)
            goto L_0x0238
        L_0x024f:
            java.util.Iterator r0 = r2.iterator()
        L_0x0253:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x026a
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r5 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.removeTopic(r5, r2)
            android.content.Context r5 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.subscribe(r5, r2, r10)
            goto L_0x0253
        L_0x026a:
            java.util.Iterator r0 = r3.iterator()
        L_0x026e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0285
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            android.content.Context r3 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.removeAccount(r3, r2)
            android.content.Context r3 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.setUserAccount(r3, r2, r10)
            goto L_0x026e
        L_0x0285:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r4.split(r0)
            int r2 = r0.length
            r3 = 2
            if (r2 != r3) goto L_0x0965
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.removeAcceptTime(r2)
            android.content.Context r2 = r1.f6875a
            r3 = r0[r13]
            r0 = r0[r7]
            com.xiaomi.mipush.sdk.MiPushClient.addAcceptTime(r2, r3, r0)
            goto L_0x0965
        L_0x029f:
            java.lang.String r0 = "client_info_update_ok"
            java.lang.String r3 = r5.f9529d
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x02d2
            java.util.Map r0 = r5.mo25560a()
            if (r0 == 0) goto L_0x0965
            java.util.Map r0 = r5.mo25560a()
            java.lang.String r2 = "app_version"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0965
            java.util.Map r0 = r5.mo25560a()
            java.lang.String r2 = "app_version"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r2)
            r2.mo22931a((java.lang.String) r0)
            goto L_0x0965
        L_0x02d2:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.AwakeApp
            java.lang.String r0 = r0.f9252a
            java.lang.String r3 = r5.f9529d
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0321
            boolean r0 = r21.mo25530b()
            if (r0 == 0) goto L_0x0965
            java.util.Map r0 = r5.mo25560a()
            if (r0 == 0) goto L_0x0965
            java.util.Map r0 = r5.mo25560a()
            java.lang.String r2 = "awake_info"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0965
            java.util.Map r0 = r5.mo25560a()
            java.lang.String r2 = "awake_info"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.b r3 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r2)
            java.lang.String r3 = r3.mo22930a()
            android.content.Context r4 = r1.f6875a
            com.xiaomi.push.service.ak r4 = com.xiaomi.push.service.C4854ak.m15568a((android.content.Context) r4)
            com.xiaomi.push.hr r5 = com.xiaomi.push.C4744hr.AwakeInfoUploadWaySwitch
            int r5 = r5.mo25291a()
            int r4 = r4.mo25906a((int) r5, (int) r13)
            com.xiaomi.mipush.sdk.C4070n.m10974a((android.content.Context) r2, (java.lang.String) r3, (int) r4, (java.lang.String) r0)
            goto L_0x0965
        L_0x0321:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.NormalClientConfigUpdate
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9529d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0344
            com.xiaomi.push.ik r0 = new com.xiaomi.push.ik
            r0.<init>()
            byte[] r2 = r5.mo25560a()     // Catch:{ jc -> 0x0431 }
            com.xiaomi.push.C4776iw.m15224a(r0, (byte[]) r2)     // Catch:{ jc -> 0x0431 }
            android.content.Context r2 = r1.f6875a     // Catch:{ jc -> 0x0431 }
            com.xiaomi.push.service.ak r2 = com.xiaomi.push.service.C4854ak.m15568a((android.content.Context) r2)     // Catch:{ jc -> 0x0431 }
            com.xiaomi.push.service.C4856al.m15585a((com.xiaomi.push.service.C4854ak) r2, (com.xiaomi.push.C4764ik) r0)     // Catch:{ jc -> 0x0431 }
            goto L_0x0965
        L_0x0344:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.CustomClientConfigUpdate
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9529d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0367
            com.xiaomi.push.ij r0 = new com.xiaomi.push.ij
            r0.<init>()
            byte[] r2 = r5.mo25560a()     // Catch:{ jc -> 0x0431 }
            com.xiaomi.push.C4776iw.m15224a(r0, (byte[]) r2)     // Catch:{ jc -> 0x0431 }
            android.content.Context r2 = r1.f6875a     // Catch:{ jc -> 0x0431 }
            com.xiaomi.push.service.ak r2 = com.xiaomi.push.service.C4854ak.m15568a((android.content.Context) r2)     // Catch:{ jc -> 0x0431 }
            com.xiaomi.push.service.C4856al.m15584a((com.xiaomi.push.service.C4854ak) r2, (com.xiaomi.push.C4763ij) r0)     // Catch:{ jc -> 0x0431 }
            goto L_0x0965
        L_0x0367:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.SyncInfoResult
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9529d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x037a
            android.content.Context r0 = r1.f6875a
            com.xiaomi.mipush.sdk.C4054aw.m10883a((android.content.Context) r0, (com.xiaomi.push.C4765il) r5)
            goto L_0x0965
        L_0x037a:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.ForceSync
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9529d
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0392
            java.lang.String r0 = "receive force sync notification"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            android.content.Context r0 = r1.f6875a
            com.xiaomi.mipush.sdk.C4054aw.m10884a((android.content.Context) r0, (boolean) r13)
            goto L_0x0965
        L_0x0392:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.CancelPushMessage
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9529d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0412
            java.util.Map r0 = r5.mo25560a()
            if (r0 == 0) goto L_0x0965
            java.util.Map r0 = r5.mo25560a()
            java.lang.String r2 = com.xiaomi.push.service.C4870at.f10025J
            boolean r0 = r0.containsKey(r2)
            r2 = -2
            if (r0 == 0) goto L_0x03cd
            java.util.Map r0 = r5.mo25560a()
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10025J
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x03cd
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03c8 }
            goto L_0x03cd
        L_0x03c8:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
        L_0x03cd:
            r0 = -1
            if (r2 < r0) goto L_0x03d7
            android.content.Context r0 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.clearNotification(r0, r2)
            goto L_0x0965
        L_0x03d7:
            java.lang.String r0 = ""
            java.lang.String r2 = ""
            java.util.Map r3 = r5.mo25560a()
            java.lang.String r4 = com.xiaomi.push.service.C4870at.f10023H
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x03f3
            java.util.Map r0 = r5.mo25560a()
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10023H
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
        L_0x03f3:
            java.util.Map r3 = r5.mo25560a()
            java.lang.String r4 = com.xiaomi.push.service.C4870at.f10024I
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x040b
            java.util.Map r2 = r5.mo25560a()
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10024I
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
        L_0x040b:
            android.content.Context r3 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.clearNotification(r3, r0, r2)
            goto L_0x0965
        L_0x0412:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.HybridRegisterResult
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9529d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0437
            com.xiaomi.push.in r0 = new com.xiaomi.push.in     // Catch:{ jc -> 0x0431 }
            r0.<init>()     // Catch:{ jc -> 0x0431 }
            byte[] r2 = r5.mo25560a()     // Catch:{ jc -> 0x0431 }
            com.xiaomi.push.C4776iw.m15224a(r0, (byte[]) r2)     // Catch:{ jc -> 0x0431 }
            android.content.Context r2 = r1.f6875a     // Catch:{ jc -> 0x0431 }
            com.xiaomi.mipush.sdk.MiPushClient4Hybrid.onReceiveRegisterResult(r2, r0)     // Catch:{ jc -> 0x0431 }
            goto L_0x0965
        L_0x0431:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
            goto L_0x0965
        L_0x0437:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.HybridUnregisterResult
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9529d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0456
            com.xiaomi.push.it r0 = new com.xiaomi.push.it     // Catch:{ jc -> 0x0431 }
            r0.<init>()     // Catch:{ jc -> 0x0431 }
            byte[] r2 = r5.mo25560a()     // Catch:{ jc -> 0x0431 }
            com.xiaomi.push.C4776iw.m15224a(r0, (byte[]) r2)     // Catch:{ jc -> 0x0431 }
            android.content.Context r2 = r1.f6875a     // Catch:{ jc -> 0x0431 }
            com.xiaomi.mipush.sdk.MiPushClient4Hybrid.onReceiveUnregisterResult(r2, r0)     // Catch:{ jc -> 0x0431 }
            goto L_0x0965
        L_0x0456:
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.PushLogUpload
            java.lang.String r0 = r0.f9252a
            java.lang.String r2 = r5.f9529d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0965
            java.util.Map r0 = r5.mo25560a()
            if (r0 == 0) goto L_0x0965
            java.util.Map r0 = r5.mo25560a()
            java.lang.String r2 = "packages"
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L_0x0965
            java.util.Map r0 = r5.mo25560a()
            java.lang.String r2 = "packages"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = ","
            java.lang.String[] r0 = r0.split(r2)
            android.content.Context r2 = r1.f6875a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = "com.xiaomi.xmsf"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x04a0
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.Logger.uploadLogFile(r2, r7)
            android.content.Context r2 = r1.f6875a
            r1.m10817a((android.content.Context) r2, (java.lang.String[]) r0)
            goto L_0x0965
        L_0x04a0:
            android.content.Context r0 = r1.f6875a
            com.xiaomi.mipush.sdk.Logger.uploadLogFile(r0, r13)
            goto L_0x0965
        L_0x04a7:
            android.content.Context r0 = r1.f6875a
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r2 = r1.f6875a
            com.xiaomi.push.hm r4 = com.xiaomi.push.C4739hm.Command
            int r3 = r3.length
            com.xiaomi.push.C4596df.m13712a(r0, r2, r5, r4, r3)
            com.xiaomi.push.ih r5 = (com.xiaomi.push.C4761ih) r5
            java.lang.String r14 = r5.mo25504a()
            java.util.List r0 = r5.mo25504a()
            long r2 = r5.f9468a
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x05ba
            com.xiaomi.push.fg r2 = com.xiaomi.push.C4668fg.COMMAND_SET_ACCEPT_TIME
            java.lang.String r2 = r2.f8633a
            boolean r2 = android.text.TextUtils.equals(r14, r2)
            if (r2 == 0) goto L_0x0523
            if (r0 == 0) goto L_0x0523
            int r2 = r0.size()
            if (r2 <= r7) goto L_0x0523
            android.content.Context r2 = r1.f6875a
            java.lang.Object r3 = r0.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            com.xiaomi.mipush.sdk.MiPushClient.addAcceptTime(r2, r3, r4)
            java.lang.String r2 = "00:00"
            java.lang.Object r3 = r0.get(r13)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x050a
            java.lang.String r2 = "00:00"
            java.lang.Object r3 = r0.get(r7)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x050a
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r2)
            r2.mo22935a((boolean) r7)
            goto L_0x0513
        L_0x050a:
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r2)
            r2.mo22935a((boolean) r13)
        L_0x0513:
            java.lang.String r2 = "GMT+08"
            java.util.TimeZone r2 = java.util.TimeZone.getTimeZone(r2)
            java.util.TimeZone r3 = java.util.TimeZone.getDefault()
            java.util.List r0 = r1.mo22901a((java.util.TimeZone) r2, (java.util.TimeZone) r3, (java.util.List<java.lang.String>) r0)
            goto L_0x05ba
        L_0x0523:
            com.xiaomi.push.fg r2 = com.xiaomi.push.C4668fg.COMMAND_SET_ALIAS
            java.lang.String r2 = r2.f8633a
            boolean r2 = android.text.TextUtils.equals(r14, r2)
            if (r2 == 0) goto L_0x0542
            if (r0 == 0) goto L_0x0542
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0542
            android.content.Context r2 = r1.f6875a
            java.lang.Object r3 = r0.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            com.xiaomi.mipush.sdk.MiPushClient.addAlias(r2, r3)
            goto L_0x05ba
        L_0x0542:
            com.xiaomi.push.fg r2 = com.xiaomi.push.C4668fg.COMMAND_UNSET_ALIAS
            java.lang.String r2 = r2.f8633a
            boolean r2 = android.text.TextUtils.equals(r14, r2)
            if (r2 == 0) goto L_0x0560
            if (r0 == 0) goto L_0x0560
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x0560
            android.content.Context r2 = r1.f6875a
            java.lang.Object r3 = r0.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            com.xiaomi.mipush.sdk.MiPushClient.removeAlias(r2, r3)
            goto L_0x05ba
        L_0x0560:
            com.xiaomi.push.fg r2 = com.xiaomi.push.C4668fg.COMMAND_SET_ACCOUNT
            java.lang.String r2 = r2.f8633a
            boolean r2 = android.text.TextUtils.equals(r14, r2)
            if (r2 == 0) goto L_0x057e
            if (r0 == 0) goto L_0x057e
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x057e
            android.content.Context r2 = r1.f6875a
            java.lang.Object r3 = r0.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            com.xiaomi.mipush.sdk.MiPushClient.addAccount(r2, r3)
            goto L_0x05ba
        L_0x057e:
            com.xiaomi.push.fg r2 = com.xiaomi.push.C4668fg.COMMAND_UNSET_ACCOUNT
            java.lang.String r2 = r2.f8633a
            boolean r2 = android.text.TextUtils.equals(r14, r2)
            if (r2 == 0) goto L_0x059c
            if (r0 == 0) goto L_0x059c
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x059c
            android.content.Context r2 = r1.f6875a
            java.lang.Object r3 = r0.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            com.xiaomi.mipush.sdk.MiPushClient.removeAccount(r2, r3)
            goto L_0x05ba
        L_0x059c:
            com.xiaomi.push.fg r2 = com.xiaomi.push.C4668fg.COMMAND_CHK_VDEVID
            java.lang.String r2 = r2.f8633a
            boolean r2 = android.text.TextUtils.equals(r14, r2)
            if (r2 == 0) goto L_0x05ba
            if (r0 == 0) goto L_0x05b9
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x05b9
            android.content.Context r2 = r1.f6875a
            java.lang.Object r0 = r0.get(r13)
            java.lang.String r0 = (java.lang.String) r0
            com.xiaomi.push.C4753i.m14742a((android.content.Context) r2, (java.lang.String) r0)
        L_0x05b9:
            return r10
        L_0x05ba:
            r15 = r0
            long r2 = r5.f9468a
            java.lang.String r0 = r5.f9476d
            java.lang.String r19 = r5.mo25506b()
            r16 = r2
            r18 = r0
            com.xiaomi.mipush.sdk.MiPushCommandMessage r0 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r14, r15, r16, r18, r19)
            return r0
        L_0x05cc:
            com.xiaomi.push.iv r5 = (com.xiaomi.push.C4775iv) r5
            long r2 = r5.f9783a
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x05dd
            android.content.Context r0 = r1.f6875a
            java.lang.String r2 = r5.mo25792a()
            com.xiaomi.mipush.sdk.MiPushClient.removeTopic(r0, r2)
        L_0x05dd:
            java.lang.String r0 = r5.mo25792a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05f3
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r0 = r5.mo25792a()
            r10.add(r0)
        L_0x05f3:
            r12 = r10
            com.xiaomi.push.fg r0 = com.xiaomi.push.C4668fg.COMMAND_UNSUBSCRIBE_TOPIC
            java.lang.String r11 = r0.f8633a
            long r13 = r5.f9783a
            java.lang.String r15 = r5.f9789d
            java.lang.String r16 = r5.mo25794b()
            com.xiaomi.mipush.sdk.MiPushCommandMessage r0 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r11, r12, r13, r15, r16)
            return r0
        L_0x0605:
            com.xiaomi.push.ir r5 = (com.xiaomi.push.C4771ir) r5
            long r2 = r5.f9700a
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0616
            android.content.Context r0 = r1.f6875a
            java.lang.String r2 = r5.mo25718a()
            com.xiaomi.mipush.sdk.MiPushClient.addTopic(r0, r2)
        L_0x0616:
            java.lang.String r0 = r5.mo25718a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x062c
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r0 = r5.mo25718a()
            r10.add(r0)
        L_0x062c:
            r12 = r10
            com.xiaomi.push.fg r0 = com.xiaomi.push.C4668fg.COMMAND_SUBSCRIBE_TOPIC
            java.lang.String r11 = r0.f8633a
            long r13 = r5.f9700a
            java.lang.String r15 = r5.f9706d
            java.lang.String r16 = r5.mo25720b()
            com.xiaomi.mipush.sdk.MiPushCommandMessage r0 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r11, r12, r13, r15, r16)
            return r0
        L_0x063e:
            com.xiaomi.push.it r5 = (com.xiaomi.push.C4773it) r5
            long r2 = r5.f9746a
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0654
            android.content.Context r0 = r1.f6875a
            com.xiaomi.mipush.sdk.b r0 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r0)
            r0.mo22930a()
            android.content.Context r0 = r1.f6875a
            com.xiaomi.mipush.sdk.MiPushClient.clearExtras(r0)
        L_0x0654:
            com.xiaomi.mipush.sdk.PushMessageHandler.mo22778a()
            goto L_0x0965
        L_0x0659:
            r0 = r5
            com.xiaomi.push.in r0 = (com.xiaomi.push.C4767in) r0
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r2)
            java.lang.String r2 = r2.f6911a
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x06e8
            java.lang.String r3 = r0.mo25641a()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x0675
            goto L_0x06e8
        L_0x0675:
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r2)
            r2.f6911a = r10
            long r2 = r0.f9613a
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            android.content.Context r2 = r1.f6875a
            if (r4 != 0) goto L_0x06a7
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r2)
            java.lang.String r3 = r0.f9623e
            java.lang.String r4 = r0.f9624f
            java.lang.String r5 = r0.f9630l
            r2.mo22939b(r3, r4, r5)
            android.content.Context r2 = r1.f6875a
            com.xiaomi.push.fb r2 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r2)
            android.content.Context r3 = r1.f6875a
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            r6 = 6006(0x1776, float:8.416E-42)
            java.lang.String r7 = "1"
            goto L_0x06b9
        L_0x06a7:
            com.xiaomi.push.fb r2 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r2)
            android.content.Context r3 = r1.f6875a
            java.lang.String r3 = r3.getPackageName()
            java.lang.String r4 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            r6 = 6006(0x1776, float:8.416E-42)
            java.lang.String r7 = "2"
        L_0x06b9:
            r5 = r24
            r2.mo25062a(r3, r4, r5, r6, r7)
            java.lang.String r2 = r0.f9623e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x06d0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r2 = r0.f9623e
            r10.add(r2)
        L_0x06d0:
            r4 = r10
            com.xiaomi.push.fg r2 = com.xiaomi.push.C4668fg.COMMAND_REGISTER
            java.lang.String r3 = r2.f8633a
            long r5 = r0.f9613a
            java.lang.String r7 = r0.f9622d
            r8 = 0
            com.xiaomi.mipush.sdk.MiPushCommandMessage r0 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r3, r4, r5, r7, r8)
            android.content.Context r2 = r1.f6875a
            com.xiaomi.mipush.sdk.aq r2 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r2)
            r2.mo22923d()
            return r0
        L_0x06e8:
            java.lang.String r0 = "bad Registration result:"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.fb r0 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            android.content.Context r2 = r1.f6875a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            java.lang.String r4 = "21"
            r0.mo25064b(r2, r3, r8, r4)
            return r10
        L_0x0703:
            boolean r4 = r21.mo25530b()
            if (r4 != 0) goto L_0x070f
            java.lang.String r0 = "receiving an un-encrypt message(SendMessage)."
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r0)
            return r10
        L_0x070f:
            android.content.Context r4 = r1.f6875a
            com.xiaomi.mipush.sdk.b r4 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r4)
            boolean r4 = r4.mo22941d()
            if (r4 == 0) goto L_0x0738
            if (r0 != 0) goto L_0x0738
            java.lang.String r0 = "receive a message in pause state. drop it"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.fb r0 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            android.content.Context r2 = r1.f6875a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            java.lang.String r4 = "12"
            r0.mo25063a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r4)
            return r10
        L_0x0738:
            com.xiaomi.push.ip r5 = (com.xiaomi.push.C4769ip) r5
            com.xiaomi.push.hy r4 = r5.mo25682a()
            if (r4 != 0) goto L_0x075b
            java.lang.String r0 = "receive an empty message without push content, drop it"
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r0)
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.fb r0 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            android.content.Context r2 = r1.f6875a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            java.lang.String r4 = "22"
            r0.mo25064b(r2, r3, r8, r4)
            return r10
        L_0x075b:
            if (r0 == 0) goto L_0x0788
            boolean r6 = com.xiaomi.push.service.C4837aa.m15505a((com.xiaomi.push.C4762ii) r21)
            if (r6 == 0) goto L_0x0777
            android.content.Context r6 = r1.f6875a
            java.lang.String r7 = r4.mo25335a()
            com.xiaomi.push.hz r13 = r21.mo25521a()
            java.lang.String r14 = r2.f9495b
            java.lang.String r15 = r4.mo25337b()
            com.xiaomi.mipush.sdk.MiPushClient.reportIgnoreRegMessageClicked(r6, r7, r13, r14, r15)
            goto L_0x0788
        L_0x0777:
            android.content.Context r6 = r1.f6875a
            java.lang.String r7 = r4.mo25335a()
            com.xiaomi.push.hz r13 = r21.mo25521a()
            java.lang.String r14 = r4.mo25337b()
            com.xiaomi.mipush.sdk.MiPushClient.reportMessageClicked(r6, r7, r13, r14)
        L_0x0788:
            if (r0 != 0) goto L_0x07cd
            java.lang.String r6 = r5.mo25687d()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x07ac
            android.content.Context r6 = r1.f6875a
            java.lang.String r7 = r5.mo25687d()
            long r6 = com.xiaomi.mipush.sdk.MiPushClient.aliasSetTime(r6, r7)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x07ac
            android.content.Context r6 = r1.f6875a
            java.lang.String r7 = r5.mo25687d()
            com.xiaomi.mipush.sdk.MiPushClient.addAlias(r6, r7)
            goto L_0x07cd
        L_0x07ac:
            java.lang.String r6 = r5.mo25685c()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x07cd
            android.content.Context r6 = r1.f6875a
            java.lang.String r7 = r5.mo25685c()
            long r6 = com.xiaomi.mipush.sdk.MiPushClient.topicSubscribedTime(r6, r7)
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x07cd
            android.content.Context r6 = r1.f6875a
            java.lang.String r7 = r5.mo25685c()
            com.xiaomi.mipush.sdk.MiPushClient.addTopic(r6, r7)
        L_0x07cd:
            com.xiaomi.push.hz r6 = r2.f9489a
            if (r6 == 0) goto L_0x07e4
            java.util.Map r6 = r6.mo25361a()
            if (r6 == 0) goto L_0x07e4
            com.xiaomi.push.hz r6 = r2.f9489a
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f9325a
            java.lang.String r7 = "jobkey"
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x07e5
        L_0x07e4:
            r6 = r10
        L_0x07e5:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L_0x07ef
            java.lang.String r6 = r4.mo25335a()
        L_0x07ef:
            if (r0 != 0) goto L_0x0833
            android.content.Context r7 = r1.f6875a
            boolean r7 = m10816a((android.content.Context) r7, (java.lang.String) r6)
            if (r7 == 0) goto L_0x0833
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "drop a duplicate message, key="
            r3.append(r4)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r3)
            android.content.Context r3 = r1.f6875a
            com.xiaomi.push.fb r3 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r3)
            android.content.Context r4 = r1.f6875a
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r7 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "2:"
            r9.append(r11)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r3.mo25065c(r4, r7, r8, r6)
            goto L_0x095a
        L_0x0833:
            com.xiaomi.push.hz r7 = r21.mo25521a()
            com.xiaomi.mipush.sdk.MiPushMessage r7 = com.xiaomi.mipush.sdk.PushMessageHelper.generateMessage(r5, r7, r0)
            int r11 = r7.getPassThrough()
            if (r11 != 0) goto L_0x0853
            if (r0 != 0) goto L_0x0853
            java.util.Map r11 = r7.getExtra()
            boolean r11 = com.xiaomi.push.service.C4837aa.m15490a((java.util.Map<java.lang.String, java.lang.String>) r11)
            if (r11 == 0) goto L_0x0853
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.service.C4837aa.m15501a((android.content.Context) r0, (com.xiaomi.push.C4762ii) r2, (byte[]) r3)
            return r10
        L_0x0853:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "receive a message, msgid="
            r3.append(r11)
            java.lang.String r11 = r4.mo25335a()
            r3.append(r11)
            java.lang.String r11 = ", jobkey="
            r3.append(r11)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r3)
            if (r0 == 0) goto L_0x0959
            java.util.Map r3 = r7.getExtra()
            if (r3 == 0) goto L_0x0959
            java.util.Map r3 = r7.getExtra()
            java.lang.String r6 = "notify_effect"
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0959
            java.util.Map r0 = r7.getExtra()
            java.lang.String r3 = "notify_effect"
            java.lang.Object r3 = r0.get(r3)
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            boolean r3 = com.xiaomi.push.service.C4837aa.m15505a((com.xiaomi.push.C4762ii) r21)
            if (r3 == 0) goto L_0x08f6
            android.content.Context r3 = r1.f6875a
            java.lang.String r2 = r2.f9495b
            android.content.Intent r0 = m10810a((android.content.Context) r3, (java.lang.String) r2, (java.util.Map<java.lang.String, java.lang.String>) r0)
            java.lang.String r2 = "eventMessageType"
            r0.putExtra(r2, r9)
            java.lang.String r2 = "messageId"
            r0.putExtra(r2, r8)
            if (r0 != 0) goto L_0x08c9
            java.lang.String r0 = "Getting Intent fail from ignore reg message. "
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.fb r0 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            android.content.Context r2 = r1.f6875a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            java.lang.String r4 = "23"
            r0.mo25064b(r2, r3, r8, r4)
            return r10
        L_0x08c9:
            java.lang.String r2 = r4.mo25339c()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x08d8
            java.lang.String r3 = "payload"
            r0.putExtra(r3, r2)
        L_0x08d8:
            android.content.Context r2 = r1.f6875a
            r2.startActivity(r0)
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.fb r2 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            android.content.Context r0 = r1.f6875a
            java.lang.String r3 = r0.getPackageName()
            java.lang.String r4 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            r6 = 3006(0xbbe, float:4.212E-42)
            r5 = r24
            r7 = r11
            r2.mo25062a(r3, r4, r5, r6, r7)
            goto L_0x0958
        L_0x08f6:
            android.content.Context r2 = r1.f6875a
            java.lang.String r3 = r2.getPackageName()
            android.content.Intent r0 = m10810a((android.content.Context) r2, (java.lang.String) r3, (java.util.Map<java.lang.String, java.lang.String>) r0)
            if (r0 == 0) goto L_0x0958
            java.lang.String r2 = com.xiaomi.push.service.C4870at.f10028c
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L_0x0919
            java.lang.String r2 = "key_message"
            r0.putExtra(r2, r7)
            java.lang.String r2 = "eventMessageType"
            r0.putExtra(r2, r9)
            java.lang.String r2 = "messageId"
            r0.putExtra(r2, r8)
        L_0x0919:
            android.content.Context r2 = r1.f6875a
            r2.startActivity(r0)
            java.lang.String r0 = "start activity succ"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.fb r2 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            android.content.Context r0 = r1.f6875a
            java.lang.String r3 = r0.getPackageName()
            java.lang.String r4 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            r6 = 1006(0x3ee, float:1.41E-42)
            r5 = r24
            r7 = r11
            r2.mo25062a(r3, r4, r5, r6, r7)
            java.lang.String r0 = com.xiaomi.push.service.C4870at.f10028c
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0958
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.fb r0 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            android.content.Context r2 = r1.f6875a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            java.lang.String r4 = "13"
            r0.mo25063a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r8, (java.lang.String) r4)
        L_0x0958:
            return r10
        L_0x0959:
            r10 = r7
        L_0x095a:
            com.xiaomi.push.hz r3 = r21.mo25521a()
            if (r3 != 0) goto L_0x0965
            if (r0 != 0) goto L_0x0965
            r1.m10821a((com.xiaomi.push.C4769ip) r5, (com.xiaomi.push.C4762ii) r2)
        L_0x0965:
            return r10
        L_0x0966:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
            java.lang.String r0 = "receive a message which action string is not valid. is the reg expired?"
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r0)
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.fb r0 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            android.content.Context r2 = r1.f6875a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            java.lang.String r4 = "20"
            r0.mo25064b(r2, r3, r8, r4)
            return r10
        L_0x0985:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
            r20.m10820a((com.xiaomi.push.C4762ii) r21)
            android.content.Context r0 = r1.f6875a
            com.xiaomi.push.fb r0 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            android.content.Context r2 = r1.f6875a
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = com.xiaomi.push.C4660fa.m14135a((int) r25)
            java.lang.String r4 = "19"
            r0.mo25064b(r2, r3, r8, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4044an.m10811a(com.xiaomi.push.ii, boolean, byte[], java.lang.String, int):com.xiaomi.mipush.sdk.PushMessageHandler$a");
    }

    /* renamed from: a */
    private PushMessageHandler.C4029a m10812a(C4762ii iiVar, byte[] bArr) {
        String str;
        String str2 = null;
        try {
            C4777ix a = C4040aj.m10806a(this.f6875a, iiVar);
            if (a == null) {
                C3989b.m10681d("message arrived: receiving an un-recognized message. " + iiVar.f9488a);
                return null;
            }
            C4739hm a2 = iiVar.mo25521a();
            C3989b.m10669a("message arrived: processing an arrived message, action=" + a2);
            if (C4046ap.f6879a[a2.ordinal()] != 1) {
                return null;
            }
            if (!iiVar.mo25530b()) {
                str = "message arrived: receiving an un-encrypt message(SendMessage).";
            } else {
                C4769ip ipVar = (C4769ip) a;
                C4751hy a3 = ipVar.mo25682a();
                if (a3 == null) {
                    str = "message arrived: receive an empty message without push content, drop it";
                } else {
                    C4752hz hzVar = iiVar.f9489a;
                    if (!(hzVar == null || hzVar.mo25361a() == null)) {
                        str2 = iiVar.f9489a.f9325a.get("jobkey");
                    }
                    MiPushMessage generateMessage = PushMessageHelper.generateMessage(ipVar, iiVar.mo25521a(), false);
                    generateMessage.setArrivedMessage(true);
                    C3989b.m10669a("message arrived: receive a message, msgid=" + a3.mo25335a() + ", jobkey=" + str2);
                    return generateMessage;
                }
            }
            C3989b.m10681d(str);
            return null;
        } catch (C4076t e) {
            C3989b.m10678a((Throwable) e);
            str = "message arrived: receive a message but decrypt failed. report when click.";
        } catch (C4787jc e2) {
            C3989b.m10678a((Throwable) e2);
            str = "message arrived: receive a message which action string is not valid. is the reg expired?";
        }
    }

    /* renamed from: a */
    public static C4044an m10813a(Context context) {
        if (f6872a == null) {
            f6872a = new C4044an(context);
        }
        return f6872a;
    }

    /* renamed from: a */
    private void m10814a() {
        SharedPreferences sharedPreferences = this.f6875a.getSharedPreferences("mipush_extra", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - sharedPreferences.getLong(Constants.SP_KEY_LAST_REINITIALIZE, 0)) > 1800000) {
            MiPushClient.reInitialize(this.f6875a, C4754ia.PackageUnregistered);
            sharedPreferences.edit().putLong(Constants.SP_KEY_LAST_REINITIALIZE, currentTimeMillis).commit();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10815a(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            int length = serviceInfoArr.length;
            int i = 0;
            while (i < length) {
                ServiceInfo serviceInfo = serviceInfoArr[i];
                if (!serviceInfo.exported || !serviceInfo.enabled || !"com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) || context.getPackageName().equals(serviceInfo.packageName)) {
                    i++;
                } else {
                    try {
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.SYNC_LOG");
                        PushMessageHandler.m10776a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m10816a(Context context, String str) {
        synchronized (f6873a) {
            f6874a.remove(str);
            C4056b.m10888a(context);
            SharedPreferences a = C4056b.m10888a(context);
            String a2 = C4532bf.m13433a((Collection<?>) f6874a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = a.edit();
            edit.putString("pref_msg_ids", a2);
            C4815r.m15379a(edit);
        }
    }

    /* renamed from: a */
    private void m10817a(Context context, String[] strArr) {
        C4498ai.m13271a(context).mo24725a((Runnable) new C4045ao(this, strArr, context));
    }

    /* renamed from: a */
    private void m10819a(C4757id idVar) {
        String a = idVar.mo25446a();
        C3989b.m10679b("receive ack " + a);
        Map a2 = idVar.mo25446a();
        if (a2 != null) {
            String str = (String) a2.get("real_source");
            if (!TextUtils.isEmpty(str)) {
                C3989b.m10679b("receive ack : messageId = " + a + "  realSource = " + str);
                C4543bp.m13474a(this.f6875a).mo24787a(a, str, Boolean.valueOf(idVar.f9415a == 0));
            }
        }
    }

    /* renamed from: a */
    private void m10820a(C4762ii iiVar) {
        C3989b.m10669a("receive a message but decrypt failed. report now.");
        C4765il ilVar = new C4765il(iiVar.mo25521a().f9323a, false);
        ilVar.mo25565c(C4749hw.DecryptMessageFail.f9252a);
        ilVar.mo25562b(iiVar.mo25521a());
        ilVar.mo25569d(iiVar.f9495b);
        HashMap hashMap = new HashMap();
        ilVar.f9524a = hashMap;
        hashMap.put("regid", MiPushClient.getRegId(this.f6875a));
        C4047aq.m10835a(this.f6875a).mo22912a(ilVar, C4739hm.Notification, false, (C4752hz) null);
    }

    /* renamed from: a */
    private void m10821a(C4769ip ipVar, C4762ii iiVar) {
        C4752hz a = iiVar.mo25521a();
        C4756ic icVar = new C4756ic();
        icVar.mo25415b(ipVar.mo25684b());
        icVar.mo25411a(ipVar.mo25682a());
        icVar.mo25410a(ipVar.mo25682a().mo25335a());
        if (!TextUtils.isEmpty(ipVar.mo25685c())) {
            icVar.mo25418c(ipVar.mo25685c());
        }
        if (!TextUtils.isEmpty(ipVar.mo25687d())) {
            icVar.mo25422d(ipVar.mo25687d());
        }
        icVar.mo25412a(C4776iw.m15223a(this.f6875a, iiVar));
        C4047aq.m10835a(this.f6875a).mo22910a(icVar, C4739hm.AckMessage, a);
    }

    /* renamed from: a */
    private void m10822a(String str, long j, C4059d dVar) {
        Class<C4037ag> cls = C4037ag.class;
        C4053av a = C4066k.m10961a(dVar);
        if (a != null) {
            if (j == 0) {
                synchronized (cls) {
                    if (C4037ag.m10796a(this.f6875a).mo22894a(str)) {
                        C4037ag.m10796a(this.f6875a).mo22898c(str);
                        if ("syncing".equals(C4037ag.m10796a(this.f6875a).mo22895a(a))) {
                            C4037ag.m10796a(this.f6875a).mo22896a(a, "synced");
                        }
                    }
                }
            } else if ("syncing".equals(C4037ag.m10796a(this.f6875a).mo22895a(a))) {
                synchronized (cls) {
                    if (C4037ag.m10796a(this.f6875a).mo22894a(str)) {
                        if (C4037ag.m10796a(this.f6875a).mo22894a(str) < 10) {
                            C4037ag.m10796a(this.f6875a).mo22897b(str);
                            C4047aq.m10835a(this.f6875a).mo22916a(str, a, dVar);
                        } else {
                            C4037ag.m10796a(this.f6875a).mo22898c(str);
                        }
                    }
                }
            } else {
                C4037ag.m10796a(this.f6875a).mo22898c(str);
            }
        }
    }

    /* renamed from: a */
    private static boolean m10823a(Context context, String str) {
        synchronized (f6873a) {
            C4056b.m10888a(context);
            SharedPreferences a = C4056b.m10888a(context);
            if (f6874a == null) {
                String[] split = a.getString("pref_msg_ids", "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                f6874a = new LinkedList();
                for (String add : split) {
                    f6874a.add(add);
                }
            }
            if (f6874a.contains(str)) {
                return true;
            }
            f6874a.add(str);
            if (f6874a.size() > 25) {
                f6874a.poll();
            }
            String a2 = C4532bf.m13433a((Collection<?>) f6874a, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = a.edit();
            edit.putString("pref_msg_ids", a2);
            C4815r.m15379a(edit);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m10824a(C4762ii iiVar) {
        if (!TextUtils.equals(Constants.HYBRID_PACKAGE_NAME, iiVar.mo25530b()) && !TextUtils.equals(Constants.HYBRID_DEBUG_PACKAGE_NAME, iiVar.mo25530b())) {
            return false;
        }
        Map a = iiVar.mo25521a() == null ? null : iiVar.mo25521a().mo25361a();
        if (a == null) {
            return false;
        }
        String str = (String) a.get(Constants.EXTRA_KEY_PUSH_SERVER_ACTION);
        return TextUtils.equals(str, Constants.EXTRA_VALUE_HYBRID_MESSAGE) || TextUtils.equals(str, Constants.EXTRA_VALUE_PLATFORM_MESSAGE);
    }

    /* renamed from: b */
    private void m10825b(C4757id idVar) {
        long j;
        C4059d dVar;
        C3989b.m10680c("ASSEMBLE_PUSH : " + idVar.toString());
        String a = idVar.mo25446a();
        Map a2 = idVar.mo25446a();
        if (a2 != null) {
            String str = (String) a2.get(Constants.ASSEMBLE_PUSH_REG_INFO);
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("brand:" + C4038ah.FCM.name())) {
                    C3989b.m10669a("ASSEMBLE_PUSH : receive fcm token sync ack");
                    C4063h.m10957b(this.f6875a, C4059d.ASSEMBLE_PUSH_FCM, str);
                    j = idVar.f9415a;
                    dVar = C4059d.ASSEMBLE_PUSH_FCM;
                } else {
                    if (str.contains("brand:" + C4038ah.HUAWEI.name())) {
                        C3989b.m10669a("ASSEMBLE_PUSH : receive hw token sync ack");
                        C4063h.m10957b(this.f6875a, C4059d.ASSEMBLE_PUSH_HUAWEI, str);
                        j = idVar.f9415a;
                        dVar = C4059d.ASSEMBLE_PUSH_HUAWEI;
                    } else {
                        if (str.contains("brand:" + C4038ah.OPPO.name())) {
                            C3989b.m10669a("ASSEMBLE_PUSH : receive COS token sync ack");
                            C4063h.m10957b(this.f6875a, C4059d.ASSEMBLE_PUSH_COS, str);
                            j = idVar.f9415a;
                            dVar = C4059d.ASSEMBLE_PUSH_COS;
                        } else {
                            if (str.contains("brand:" + C4038ah.VIVO.name())) {
                                C3989b.m10669a("ASSEMBLE_PUSH : receive FTOS token sync ack");
                                C4063h.m10957b(this.f6875a, C4059d.ASSEMBLE_PUSH_FTOS, str);
                                j = idVar.f9415a;
                                dVar = C4059d.ASSEMBLE_PUSH_FTOS;
                            } else {
                                return;
                            }
                        }
                    }
                }
                m10822a(a, j, dVar);
            }
        }
    }

    /* renamed from: b */
    private void m10826b(C4762ii iiVar) {
        C4752hz a = iiVar.mo25521a();
        C4756ic icVar = new C4756ic();
        icVar.mo25415b(iiVar.mo25521a());
        icVar.mo25411a(a.mo25361a());
        icVar.mo25410a(a.mo25361a());
        if (!TextUtils.isEmpty(a.mo25368b())) {
            icVar.mo25418c(a.mo25368b());
        }
        icVar.mo25412a(C4776iw.m15223a(this.f6875a, iiVar));
        C4047aq.m10835a(this.f6875a).mo22912a(icVar, C4739hm.AckMessage, false, iiVar.mo25521a());
    }

    /* renamed from: a */
    public PushMessageHandler.C4029a mo22900a(Intent intent) {
        String str;
        String str2;
        String str3;
        C4662fb fbVar;
        C4662fb a;
        String packageName;
        String format;
        String action = intent.getAction();
        C3989b.m10669a("receive an intent from server, action=" + action);
        String stringExtra = intent.getStringExtra("mrt");
        if (stringExtra == null) {
            stringExtra = Long.toString(System.currentTimeMillis());
        }
        String stringExtra2 = intent.getStringExtra("messageId");
        int intExtra = intent.getIntExtra("eventMessageType", -1);
        if ("com.xiaomi.mipush.RECEIVE_MESSAGE".equals(action)) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("mipush_payload");
            boolean booleanExtra = intent.getBooleanExtra("mipush_notified", false);
            if (byteArrayExtra == null) {
                C3989b.m10681d("receiving an empty message, drop");
                C4662fb.m14151a(this.f6875a).mo25060a(this.f6875a.getPackageName(), intent, "12");
                return null;
            }
            C4762ii iiVar = new C4762ii();
            try {
                C4776iw.m15224a(iiVar, byteArrayExtra);
                C4056b a2 = C4056b.m10888a(this.f6875a);
                C4752hz a3 = iiVar.mo25521a();
                if (iiVar.mo25521a() == C4739hm.SendMessage && a3 != null && !a2.mo22941d() && !booleanExtra) {
                    a3.mo25366a("mrt", stringExtra);
                    a3.mo25366a("mat", Long.toString(System.currentTimeMillis()));
                    if (!m10820a(iiVar)) {
                        m10826b(iiVar);
                    } else {
                        C3989b.m10679b("this is a mina's message, ack later");
                        a3.mo25366a(Constants.EXTRA_KEY_HYBRID_MESSAGE_TS, String.valueOf(a3.mo25361a()));
                        a3.mo25366a(Constants.EXTRA_KEY_HYBRID_DEVICE_STATUS, String.valueOf(C4776iw.m15223a(this.f6875a, iiVar)));
                    }
                }
                String str4 = "";
                if (iiVar.mo25521a() == C4739hm.SendMessage) {
                    if (!iiVar.mo25530b()) {
                        if (C4837aa.m15505a(iiVar)) {
                            Object[] objArr = new Object[2];
                            objArr[0] = iiVar.mo25530b();
                            if (a3 != null) {
                                str4 = a3.mo25361a();
                            }
                            objArr[1] = str4;
                            C3989b.m10669a(String.format("drop an un-encrypted wake-up messages. %1$s, %2$s", objArr));
                            a = C4662fb.m14151a(this.f6875a);
                            packageName = this.f6875a.getPackageName();
                            format = String.format("13: %1$s", new Object[]{iiVar.mo25530b()});
                        } else {
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = iiVar.mo25530b();
                            if (a3 != null) {
                                str4 = a3.mo25361a();
                            }
                            objArr2[1] = str4;
                            C3989b.m10669a(String.format("drop an un-encrypted messages. %1$s, %2$s", objArr2));
                            a = C4662fb.m14151a(this.f6875a);
                            packageName = this.f6875a.getPackageName();
                            format = String.format("14: %1$s", new Object[]{iiVar.mo25530b()});
                        }
                        a.mo25060a(packageName, intent, format);
                        return null;
                    }
                }
                if (iiVar.mo25521a() == C4739hm.SendMessage && iiVar.mo25530b() && C4837aa.m15505a(iiVar)) {
                    if (!booleanExtra || a3 == null || a3.mo25361a() == null || !a3.mo25361a().containsKey("notify_effect")) {
                        Object[] objArr3 = new Object[2];
                        objArr3[0] = iiVar.mo25530b();
                        if (a3 != null) {
                            str4 = a3.mo25361a();
                        }
                        objArr3[1] = str4;
                        C3989b.m10669a(String.format("drop a wake-up messages which not has 'notify_effect' attr. %1$s, %2$s", objArr3));
                        C4662fb.m14151a(this.f6875a).mo25060a(this.f6875a.getPackageName(), intent, String.format("25: %1$s", new Object[]{iiVar.mo25530b()}));
                        return null;
                    }
                }
                if (a2.mo22940c() || iiVar.f9488a == C4739hm.Registration) {
                    if (!a2.mo22940c() || !a2.mo22942e()) {
                        return m10811a(iiVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra);
                    }
                    if (iiVar.f9488a == C4739hm.UnRegistration) {
                        a2.mo22930a();
                        MiPushClient.clearExtras(this.f6875a);
                        PushMessageHandler.mo22778a();
                    } else {
                        MiPushClient.unregisterPush(this.f6875a);
                    }
                } else if (C4837aa.m15505a(iiVar)) {
                    return m10811a(iiVar, booleanExtra, byteArrayExtra, stringExtra2, intExtra);
                } else {
                    C3989b.m10681d("receive message without registration. need re-register!");
                    C4662fb.m14151a(this.f6875a).mo25060a(this.f6875a.getPackageName(), intent, "15");
                    m10814a();
                }
            } catch (C4787jc e) {
                e = e;
                fbVar = C4662fb.m14151a(this.f6875a);
                str3 = this.f6875a.getPackageName();
                str2 = "16";
                fbVar.mo25060a(str3, intent, str2);
                C3989b.m10678a(e);
                return null;
            } catch (Exception e2) {
                e = e2;
                fbVar = C4662fb.m14151a(this.f6875a);
                str3 = this.f6875a.getPackageName();
                str2 = "17";
                fbVar.mo25060a(str3, intent, str2);
                C3989b.m10678a(e);
                return null;
            }
        } else if ("com.xiaomi.mipush.ERROR".equals(action)) {
            MiPushCommandMessage miPushCommandMessage = new MiPushCommandMessage();
            C4762ii iiVar2 = new C4762ii();
            try {
                byte[] byteArrayExtra2 = intent.getByteArrayExtra("mipush_payload");
                if (byteArrayExtra2 != null) {
                    C4776iw.m15224a(iiVar2, byteArrayExtra2);
                }
            } catch (C4787jc unused) {
            }
            miPushCommandMessage.setCommand(String.valueOf(iiVar2.mo25521a()));
            miPushCommandMessage.setResultCode((long) intent.getIntExtra("mipush_error_code", 0));
            miPushCommandMessage.setReason(intent.getStringExtra("mipush_error_msg"));
            C3989b.m10681d("receive a error message. code = " + intent.getIntExtra("mipush_error_code", 0) + ", msg= " + intent.getStringExtra("mipush_error_msg"));
            return miPushCommandMessage;
        } else if ("com.xiaomi.mipush.MESSAGE_ARRIVED".equals(action)) {
            byte[] byteArrayExtra3 = intent.getByteArrayExtra("mipush_payload");
            if (byteArrayExtra3 == null) {
                C3989b.m10681d("message arrived: receiving an empty message, drop");
                return null;
            }
            C4762ii iiVar3 = new C4762ii();
            try {
                C4776iw.m15224a(iiVar3, byteArrayExtra3);
                C4056b a4 = C4056b.m10888a(this.f6875a);
                if (C4837aa.m15505a(iiVar3)) {
                    str = "message arrived: receive ignore reg message, ignore!";
                } else if (!a4.mo22940c()) {
                    str = "message arrived: receive message without registration. need unregister or re-register!";
                } else if (!a4.mo22940c() || !a4.mo22942e()) {
                    return m10812a(iiVar3, byteArrayExtra3);
                } else {
                    str = "message arrived: app info is invalidated";
                }
                C3989b.m10681d(str);
            } catch (C4787jc | Exception e3) {
                C3989b.m10678a(e3);
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<String> mo22901a(TimeZone timeZone, TimeZone timeZone2, List<String> list) {
        List<String> list2 = list;
        if (timeZone.equals(timeZone2)) {
            return list2;
        }
        long rawOffset = (long) (((timeZone.getRawOffset() - timeZone2.getRawOffset()) / 1000) / 60);
        long parseLong = Long.parseLong(list2.get(0).split(Constants.COLON_SEPARATOR)[0]);
        long parseLong2 = Long.parseLong(list2.get(0).split(Constants.COLON_SEPARATOR)[1]);
        long j = ((((parseLong * 60) + parseLong2) - rawOffset) + 1440) % 1440;
        long parseLong3 = ((((Long.parseLong(list2.get(1).split(Constants.COLON_SEPARATOR)[0]) * 60) + Long.parseLong(list2.get(1).split(Constants.COLON_SEPARATOR)[1])) - rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}));
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(parseLong3 / 60), Long.valueOf(parseLong3 % 60)}));
        return arrayList;
    }
}
