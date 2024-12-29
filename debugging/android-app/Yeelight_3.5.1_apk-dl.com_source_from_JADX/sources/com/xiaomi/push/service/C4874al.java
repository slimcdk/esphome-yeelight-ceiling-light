package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import androidx.appcompat.widget.ActivityChooserView;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4668ep;
import com.xiaomi.push.C4669eq;
import com.xiaomi.push.C4670er;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.C4995w;
import com.xiaomi.push.service.C4890aw;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.service.al */
public class C4874al {

    /* renamed from: a */
    public static long f9452a;

    /* renamed from: a */
    private static volatile C4884as f9453a;

    /* renamed from: a */
    private static final LinkedList<Pair<Integer, C4783if>> f9454a = new LinkedList<>();

    /* renamed from: a */
    private static ExecutorService f9455a = Executors.newCachedThreadPool();

    /* renamed from: com.xiaomi.push.service.al$a */
    private static class C4875a implements Callable<Bitmap> {

        /* renamed from: a */
        private Context f9456a;

        /* renamed from: a */
        private String f9457a;

        /* renamed from: a */
        private boolean f9458a;

        public C4875a(String str, Context context, boolean z) {
            this.f9456a = context;
            this.f9457a = str;
            this.f9458a = z;
        }

        /* renamed from: a */
        public Bitmap call() {
            Bitmap bitmap = null;
            if (!TextUtils.isEmpty(this.f9457a)) {
                if (this.f9457a.startsWith("http")) {
                    C4890aw.C4892b a = C4890aw.m15309a(this.f9456a, this.f9457a, this.f9458a);
                    if (a != null) {
                        return a.f9494a;
                    }
                } else {
                    bitmap = C4890aw.m15307a(this.f9456a, this.f9457a);
                    if (bitmap != null) {
                        return bitmap;
                    }
                }
                C4408b.m12464a("Failed get online picture/icon resource");
                return bitmap;
            }
            C4408b.m12464a("Failed get online picture/icon resource cause picUrl is empty");
            return null;
        }
    }

    /* renamed from: com.xiaomi.push.service.al$b */
    public static class C4876b {

        /* renamed from: a */
        long f9459a = 0;

        /* renamed from: a */
        Notification f9460a;
    }

    /* renamed from: com.xiaomi.push.service.al$c */
    public static class C4877c {

        /* renamed from: a */
        public long f9461a = 0;

        /* renamed from: a */
        public String f9462a;

        /* renamed from: a */
        public boolean f9463a = false;
    }

    /* renamed from: a */
    static int m15207a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: a */
    private static int m15208a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    /* renamed from: a */
    private static int m15209a(Context context, String str, Map<String, String> map, int i) {
        ComponentName a;
        Intent b = m15247b(context, str, map, i);
        if (b == null || (a = C4969l.m15573a(context, b)) == null) {
            return 0;
        }
        return a.hashCode();
    }

    /* renamed from: a */
    private static int m15210a(Map<String, String> map) {
        String str = map == null ? null : map.get("timeout");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    private static Notification m15211a(Notification notification) {
        Object a = C4554bk.m13011a((Object) notification, "extraNotification");
        if (a != null) {
            C4554bk.m13012a(a, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    /* renamed from: a */
    private static PendingIntent m15212a(Context context, C4783if ifVar, String str, byte[] bArr, int i) {
        return m15213a(context, ifVar, str, bArr, i, 0, m15237a(context, ifVar, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.app.PendingIntent m15213a(android.content.Context r16, com.xiaomi.push.C4783if r17, java.lang.String r18, byte[] r19, int r20, int r21, boolean r22) {
        /*
            r6 = r16
            r0 = r18
            r1 = r19
            boolean r2 = m15257c((com.xiaomi.push.C4783if) r17)
            if (r2 == 0) goto L_0x000f
            r2 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0019
        L_0x000f:
            boolean r2 = m15226a((com.xiaomi.push.C4783if) r17)
            if (r2 == 0) goto L_0x0018
            r2 = 3000(0xbb8, float:4.204E-42)
            goto L_0x0019
        L_0x0018:
            r2 = -1
        L_0x0019:
            com.xiaomi.push.hw r3 = r17.mo29558a()
            if (r3 == 0) goto L_0x0024
            java.lang.String r4 = r3.mo29392a()
            goto L_0x0026
        L_0x0024:
            java.lang.String r4 = ""
        L_0x0026:
            boolean r5 = m15226a((com.xiaomi.push.C4783if) r17)
            java.lang.String r7 = "eventMessageType"
            java.lang.String r8 = "messageId"
            r9 = 167772160(0xa000000, float:6.162976E-33)
            r10 = 134217728(0x8000000, float:3.85186E-34)
            r11 = 31
            r12 = 0
            if (r3 == 0) goto L_0x00a5
            java.lang.String r13 = r3.f8800e
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 != 0) goto L_0x00a5
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.VIEW"
            r1.<init>(r5)
            java.lang.String r5 = r3.f8800e
            android.net.Uri r5 = android.net.Uri.parse(r5)
            r1.setData(r5)
            java.net.URL r5 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0073 }
            java.lang.String r13 = r3.f8800e     // Catch:{ MalformedURLException -> 0x0073 }
            r5.<init>(r13)     // Catch:{ MalformedURLException -> 0x0073 }
            java.lang.String r5 = r5.getProtocol()     // Catch:{ MalformedURLException -> 0x0073 }
            java.lang.String r13 = "http"
            boolean r13 = r13.equals(r5)     // Catch:{ MalformedURLException -> 0x0073 }
            if (r13 != 0) goto L_0x006f
            java.lang.String r13 = "https"
            boolean r5 = r13.equals(r5)     // Catch:{ MalformedURLException -> 0x0073 }
            if (r5 == 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            r1.setPackage(r0)     // Catch:{ MalformedURLException -> 0x0073 }
            goto L_0x008c
        L_0x006f:
            com.xiaomi.push.service.C4894ay.m15351a((android.content.Context) r6, (java.lang.String) r0, (android.content.Intent) r1)     // Catch:{ MalformedURLException -> 0x0073 }
            goto L_0x008c
        L_0x0073:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r13 = "meet URL exception : "
            r5.append(r13)
            java.lang.String r3 = r3.f8800e
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r3)
            r1.setPackage(r0)
        L_0x008c:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            r1.putExtra(r8, r4)
            r1.putExtra(r7, r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r11) goto L_0x00a0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r6, r12, r1, r9)
            return r0
        L_0x00a0:
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r6, r12, r1, r10)
            return r0
        L_0x00a5:
            r13 = 1
            java.lang.String r14 = "mipush_notified"
            java.lang.String r15 = "mipush_payload"
            java.lang.String r10 = "com.xiaomi.mipush.sdk.PushMessageHandler"
            android.content.Intent r9 = new android.content.Intent
            if (r5 == 0) goto L_0x00be
            r9.<init>()
            android.content.ComponentName r12 = new android.content.ComponentName
            java.lang.String r11 = "com.xiaomi.xmsf"
            r12.<init>(r11, r10)
            r9.setComponent(r12)
            goto L_0x00cb
        L_0x00be:
            java.lang.String r11 = "com.xiaomi.mipush.RECEIVE_MESSAGE"
            r9.<init>(r11)
            android.content.ComponentName r11 = new android.content.ComponentName
            r11.<init>(r0, r10)
            r9.setComponent(r11)
        L_0x00cb:
            r9.putExtra(r15, r1)
            r9.putExtra(r14, r13)
            java.lang.String r1 = java.lang.String.valueOf(r20)
            r9.addCategory(r1)
            java.lang.String r1 = java.lang.String.valueOf(r4)
            r9.addCategory(r1)
            java.lang.String r1 = "notification_click_button"
            r10 = r21
            r9.putExtra(r1, r10)
            r9.putExtra(r8, r4)
            r9.putExtra(r7, r2)
            if (r5 != 0) goto L_0x013e
            if (r22 == 0) goto L_0x013e
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.content.ComponentName r0 = m15215a((java.lang.String) r18)
            r7.setComponent(r0)
            r0 = 276824064(0x10800000, float:5.0487098E-29)
            r7.addFlags(r0)
            java.lang.String r0 = "mipush_serviceIntent"
            r7.putExtra(r0, r9)
            java.lang.String r0 = java.lang.String.valueOf(r20)
            r7.addCategory(r0)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r7.addCategory(r0)
            java.lang.String r0 = java.lang.String.valueOf(r21)
            r7.addCategory(r0)
            r0 = r16
            r1 = r7
            r2 = r17
            r5 = r21
            m15229a((android.content.Context) r0, (android.content.Intent) r1, (com.xiaomi.push.C4783if) r2, (com.xiaomi.push.C4773hw) r3, (java.lang.String) r4, (int) r5)
            m15235a((android.content.Intent) r7)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x0136
            r0 = 167772160(0xa000000, float:6.162976E-33)
            r1 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r6, r1, r7, r0)
            return r0
        L_0x0136:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r6, r1, r7, r0)
            return r0
        L_0x013e:
            r0 = r16
            r1 = r9
            r2 = r17
            r5 = r21
            m15229a((android.content.Context) r0, (android.content.Intent) r1, (com.xiaomi.push.C4783if) r2, (com.xiaomi.push.C4773hw) r3, (java.lang.String) r4, (int) r5)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x0156
            r0 = 167772160(0xa000000, float:6.162976E-33)
            r1 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r6, r1, r9, r0)
            return r0
        L_0x0156:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r6, r1, r9, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4874al.m15213a(android.content.Context, com.xiaomi.push.if, java.lang.String, byte[], int, int, boolean):android.app.PendingIntent");
    }

    /* renamed from: a */
    private static PendingIntent m15214a(Context context, String str, C4783if ifVar, byte[] bArr, int i, int i2) {
        Map a = ifVar.mo29558a().mo29392a();
        if (a == null) {
            return null;
        }
        boolean a2 = m15237a(context, ifVar, str);
        if (a2) {
            return m15213a(context, ifVar, str, bArr, i, i2, a2);
        }
        Intent a3 = m15209a(context, str, (Map<String, String>) a, i2);
        if (a3 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, a3, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    /* renamed from: a */
    public static ComponentName m15215a(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* renamed from: a */
    public static Intent m15216a(Context context, String str, Map<String, String> map, int i) {
        if (m15246b(map)) {
            return m15217a(context, str, map, String.format("cust_btn_%s_ne", new Object[]{Integer.valueOf(i)}), String.format("cust_btn_%s_iu", new Object[]{Integer.valueOf(i)}), String.format("cust_btn_%s_ic", new Object[]{Integer.valueOf(i)}), String.format("cust_btn_%s_wu", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return m15217a(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        } else {
            if (i == 2) {
                return m15217a(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
            }
            if (i == 3) {
                return m15217a(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
            }
            if (i != 4) {
                return null;
            }
            return m15217a(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0113  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m15217a(android.content.Context r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.Object r6 = r5.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9579a
            boolean r0 = r0.equals(r6)
            java.lang.String r2 = "Cause: "
            if (r0 == 0) goto L_0x003b
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ Exception -> 0x0022 }
            android.content.Intent r4 = r5.getLaunchIntentForPackage(r4)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0111
        L_0x0022:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r4)
            goto L_0x0110
        L_0x003b:
            java.lang.String r0 = com.xiaomi.push.service.C4916bk.f9580b
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0093
            boolean r9 = r5.containsKey(r7)
            if (r9 == 0) goto L_0x0077
            java.lang.Object r5 = r5.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0110
            r7 = 1
            android.content.Intent r5 = android.content.Intent.parseUri(r5, r7)     // Catch:{ URISyntaxException -> 0x005c }
            r5.setPackage(r4)     // Catch:{ URISyntaxException -> 0x005a }
            goto L_0x0074
        L_0x005a:
            r4 = move-exception
            goto L_0x005e
        L_0x005c:
            r4 = move-exception
            r5 = r1
        L_0x005e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r4 = r4.getMessage()
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r4)
        L_0x0074:
            r4 = r5
            goto L_0x0111
        L_0x0077:
            boolean r7 = r5.containsKey(r8)
            if (r7 == 0) goto L_0x0110
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            android.content.ComponentName r8 = new android.content.ComponentName
            r8.<init>(r4, r5)
            r7.setComponent(r8)
        L_0x0090:
            r4 = r7
            goto L_0x0111
        L_0x0093:
            java.lang.String r7 = com.xiaomi.push.service.C4916bk.f9581c
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0110
            java.lang.Object r5 = r5.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L_0x0110
            java.lang.String r5 = r5.trim()
            java.lang.String r7 = "http://"
            boolean r8 = r5.startsWith(r7)
            if (r8 != 0) goto L_0x00ca
            java.lang.String r8 = "https://"
            boolean r8 = r5.startsWith(r8)
            if (r8 != 0) goto L_0x00ca
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
        L_0x00ca:
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00f7 }
            r7.<init>(r5)     // Catch:{ MalformedURLException -> 0x00f7 }
            java.lang.String r7 = r7.getProtocol()     // Catch:{ MalformedURLException -> 0x00f7 }
            java.lang.String r8 = "http"
            boolean r8 = r8.equals(r7)     // Catch:{ MalformedURLException -> 0x00f7 }
            if (r8 != 0) goto L_0x00e3
            java.lang.String r8 = "https"
            boolean r7 = r8.equals(r7)     // Catch:{ MalformedURLException -> 0x00f7 }
            if (r7 == 0) goto L_0x0110
        L_0x00e3:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ MalformedURLException -> 0x00f7 }
            java.lang.String r8 = "android.intent.action.VIEW"
            r7.<init>(r8)     // Catch:{ MalformedURLException -> 0x00f7 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ MalformedURLException -> 0x00f5 }
            r7.setData(r5)     // Catch:{ MalformedURLException -> 0x00f5 }
            com.xiaomi.push.service.C4894ay.m15351a((android.content.Context) r3, (java.lang.String) r4, (android.content.Intent) r7)     // Catch:{ MalformedURLException -> 0x00f5 }
            goto L_0x0090
        L_0x00f5:
            r4 = move-exception
            goto L_0x00f9
        L_0x00f7:
            r4 = move-exception
            r7 = r1
        L_0x00f9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r4)
            goto L_0x0090
        L_0x0110:
            r4 = r1
        L_0x0111:
            if (r4 == 0) goto L_0x016b
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            r4.addFlags(r5)
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ Exception -> 0x0154 }
            r7 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r5 = r5.resolveActivity(r4, r7)     // Catch:{ Exception -> 0x0154 }
            if (r5 == 0) goto L_0x0125
            return r4
        L_0x0125:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0154 }
            r7 = 30
            if (r5 < r7) goto L_0x013a
            boolean r3 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r3)     // Catch:{ Exception -> 0x0154 }
            if (r3 != 0) goto L_0x013a
            java.lang.String r3 = com.xiaomi.push.service.C4916bk.f9581c     // Catch:{ Exception -> 0x0154 }
            boolean r3 = r3.equals(r6)     // Catch:{ Exception -> 0x0154 }
            if (r3 == 0) goto L_0x013a
            return r4
        L_0x013a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0154 }
            r3.<init>()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r5 = "not resolve activity:"
            r3.append(r5)     // Catch:{ Exception -> 0x0154 }
            r3.append(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r4 = "for buttons"
            r3.append(r4)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0154 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r3)     // Catch:{ Exception -> 0x0154 }
            goto L_0x016b
        L_0x0154:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r3)
        L_0x016b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4874al.m15217a(android.content.Context, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.content.Intent");
    }

    /* renamed from: a */
    private static Bitmap m15218a(Context context, int i) {
        return m15220a(context.getResources().getDrawable(i));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static Bitmap m15219a(Context context, String str, boolean z) {
        Future submit = f9455a.submit(new C4875a(str, context, z));
        try {
            Bitmap bitmap = (Bitmap) submit.get(180, TimeUnit.SECONDS);
            if (bitmap != null) {
                return bitmap;
            }
            submit.cancel(true);
            return bitmap;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C4408b.m12478a(e);
            submit.cancel(true);
            return null;
        } catch (Throwable th) {
            submit.cancel(true);
            throw th;
        }
    }

    /* renamed from: a */
    public static Bitmap m15220a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int i = 1;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight > 0) {
            i = intrinsicHeight;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    private static RemoteViews m15221a(Context context, C4783if ifVar, byte[] bArr) {
        C4773hw a = ifVar.mo29558a();
        String a2 = m15226a(ifVar);
        if (!(a == null || a.mo29392a() == null)) {
            Map a3 = a.mo29392a();
            String str = (String) a3.get("layout_name");
            String str2 = (String) a3.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(a2);
                    int identifier = resourcesForApplication.getIdentifier(str, "layout", a2);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(a2, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> keys = jSONObject2.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", a2);
                                if (identifier2 > 0) {
                                    remoteViews.setTextViewText(identifier2, string);
                                }
                            }
                        }
                        if (jSONObject.has("image")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                            Iterator<String> keys2 = jSONObject3.keys();
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                String string2 = jSONObject3.getString(next2);
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", a2);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", a2);
                                if (identifier3 > 0) {
                                    remoteViews.setImageViewResource(identifier3, identifier4);
                                }
                            }
                        }
                        if (jSONObject.has("time")) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                            Iterator<String> keys3 = jSONObject4.keys();
                            while (keys3.hasNext()) {
                                String next3 = keys3.next();
                                String string3 = jSONObject4.getString(next3);
                                if (string3.length() == 0) {
                                    string3 = "yy-MM-dd hh:mm";
                                }
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", a2);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e) {
                        C4408b.m12478a((Throwable) e);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    C4408b.m12478a((Throwable) e2);
                }
            }
        }
        return null;
    }

    @TargetApi(16)
    /* renamed from: a */
    private static C4669eq m15222a(Context context, C4783if ifVar, byte[] bArr, String str, int i) {
        PendingIntent a;
        String a2 = m15226a(ifVar);
        Map a3 = ifVar.mo29558a().mo29392a();
        String str2 = (String) a3.get("notification_style_type");
        C4669eq a4 = (!C4830m.m14998a(context) || f9453a == null) ? null : f9453a.mo29971a(context, i, a2, (Map<String, String>) a3);
        if (a4 != null) {
            a4.mo29066a((Map<String, String>) a3);
            return a4;
        } else if ("2".equals(str2)) {
            C4669eq eqVar = new C4669eq(context);
            Bitmap a5 = TextUtils.isEmpty((String) a3.get("notification_bigPic_uri")) ? null : m15219a(context, (String) a3.get("notification_bigPic_uri"), false);
            if (a5 == null) {
                C4408b.m12464a("can not get big picture.");
                return eqVar;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(eqVar);
            bigPictureStyle.bigPicture(a5);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            eqVar.setStyle(bigPictureStyle);
            return eqVar;
        } else if (TimerCodec.ENABLE.equals(str2)) {
            C4669eq eqVar2 = new C4669eq(context);
            eqVar2.setStyle(new Notification.BigTextStyle().bigText(str));
            return eqVar2;
        } else if ("4".equals(str2) && C4830m.m14997a()) {
            C4668ep epVar = new C4668ep(context, a2);
            if (!TextUtils.isEmpty((CharSequence) a3.get("notification_banner_image_uri"))) {
                epVar.setLargeIcon(m15219a(context, (String) a3.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty((CharSequence) a3.get("notification_banner_icon_uri"))) {
                epVar.mo29060b(m15219a(context, (String) a3.get("notification_banner_icon_uri"), false));
            }
            epVar.mo29066a((Map<String, String>) a3);
            return epVar;
        } else if (!"3".equals(str2) || !C4830m.m14997a()) {
            return new C4669eq(context);
        } else {
            C4670er erVar = new C4670er(context, i, a2);
            if (!TextUtils.isEmpty((CharSequence) a3.get("notification_colorful_button_text")) && (a = m15214a(context, a2, ifVar, bArr, i, 4)) != null) {
                erVar.mo29070a((CharSequence) a3.get("notification_colorful_button_text"), a).mo29058a((String) a3.get("notification_colorful_button_bg_color"));
            }
            if (!TextUtils.isEmpty((CharSequence) a3.get("notification_colorful_bg_color"))) {
                erVar.mo29071b((String) a3.get("notification_colorful_bg_color"));
            } else if (!TextUtils.isEmpty((CharSequence) a3.get("notification_colorful_bg_image_uri"))) {
                erVar.mo29057a(m15219a(context, (String) a3.get("notification_colorful_bg_image_uri"), false));
            }
            erVar.mo29066a((Map<String, String>) a3);
            return erVar;
        }
    }

    /* JADX WARNING: type inference failed for: r2v47 */
    /* JADX WARNING: type inference failed for: r2v48 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v40, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02e2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03ff  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0433  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0279  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.xiaomi.push.service.C4874al.C4876b m15223a(android.content.Context r26, com.xiaomi.push.C4783if r27, byte[] r28, android.widget.RemoteViews r29, android.app.PendingIntent r30, int r31) {
        /*
            r7 = r26
            r0 = r29
            com.xiaomi.push.service.al$b r8 = new com.xiaomi.push.service.al$b
            r8.<init>()
            com.xiaomi.push.hw r9 = r27.mo29558a()
            java.lang.String r10 = m15226a((com.xiaomi.push.C4783if) r27)
            java.util.Map r11 = r9.mo29392a()
            java.lang.String[] r12 = m15244a((android.content.Context) r7, (com.xiaomi.push.C4773hw) r9)
            java.lang.String r13 = "notification_style_type"
            r14 = 1
            if (r0 == 0) goto L_0x002e
            com.xiaomi.push.eq r1 = new com.xiaomi.push.eq
            r1.<init>(r7)
            r1.setCustomContentView((android.widget.RemoteViews) r0)
            r15 = r27
            r5 = r28
            r6 = r31
        L_0x002c:
            r4 = r1
            goto L_0x004f
        L_0x002e:
            if (r11 == 0) goto L_0x0043
            boolean r0 = r11.containsKey(r13)
            if (r0 == 0) goto L_0x0043
            r0 = r12[r14]
            r15 = r27
            r5 = r28
            r6 = r31
            com.xiaomi.push.eq r1 = m15222a((android.content.Context) r7, (com.xiaomi.push.C4783if) r15, (byte[]) r5, (java.lang.String) r0, (int) r6)
            goto L_0x002c
        L_0x0043:
            r15 = r27
            r5 = r28
            r6 = r31
            com.xiaomi.push.eq r1 = new com.xiaomi.push.eq
            r1.<init>(r7)
            goto L_0x002c
        L_0x004f:
            java.lang.String r3 = r27.mo29567b()
            r1 = r4
            r2 = r26
            r14 = r4
            r4 = r27
            r5 = r28
            r6 = r31
            m15236a((com.xiaomi.push.C4669eq) r1, (android.content.Context) r2, (java.lang.String) r3, (com.xiaomi.push.C4783if) r4, (byte[]) r5, (int) r6)
            r1 = 0
            r0 = r12[r1]
            r14.setContentTitle(r0)
            r2 = 1
            r0 = r12[r2]
            r14.setContentText(r0)
            long r3 = java.lang.System.currentTimeMillis()
            r14.setWhen(r3)
            java.lang.String r0 = "notification_show_when"
            java.lang.String r0 = m15228a((java.util.Map<java.lang.String, java.lang.String>) r11, (java.lang.String) r0)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            r6 = 24
            if (r5 == 0) goto L_0x0089
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L_0x0090
            r14.setShowWhen(r2)
            goto L_0x0090
        L_0x0089:
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r14.setShowWhen(r0)
        L_0x0090:
            r0 = r30
            r14.setContentIntent(r0)
            java.lang.String r0 = "mipush_notification"
            int r0 = m15208a((android.content.Context) r7, (java.lang.String) r10, (java.lang.String) r0)
            java.lang.String r2 = "mipush_small_notification"
            int r2 = m15208a((android.content.Context) r7, (java.lang.String) r10, (java.lang.String) r2)
            r5 = 23
            if (r0 <= 0) goto L_0x00b2
            if (r2 <= 0) goto L_0x00b2
            android.graphics.Bitmap r0 = m15218a((android.content.Context) r7, (int) r0)
            r14.setLargeIcon(r0)
            r14.setSmallIcon(r2)
            goto L_0x00f8
        L_0x00b2:
            boolean r0 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r26)
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = "fcm_icon_uri"
            java.lang.String r0 = m15228a((java.util.Map<java.lang.String, java.lang.String>) r11, (java.lang.String) r0)
            java.lang.String r2 = "fcm_icon_color"
            java.lang.String r2 = m15228a((java.util.Map<java.lang.String, java.lang.String>) r11, (java.lang.String) r2)
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L_0x00de
            boolean r12 = android.text.TextUtils.isEmpty(r2)
            if (r12 != 0) goto L_0x00de
            int r0 = m15208a((android.content.Context) r7, (java.lang.String) r10, (java.lang.String) r0)
            if (r0 <= 0) goto L_0x00de
            r14.setSmallIcon(r0)
            r14.mo29058a((java.lang.String) r2)
            r0 = 1
            goto L_0x00df
        L_0x00de:
            r0 = 0
        L_0x00df:
            if (r0 != 0) goto L_0x00f8
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L_0x00f1
            int r0 = com.xiaomi.push.service.C4894ay.m15340a((android.content.Context) r7, (java.lang.String) r10)
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithResource(r10, r0)
            r14.setSmallIcon(r0)
            goto L_0x00f8
        L_0x00f1:
            int r0 = m15245b((android.content.Context) r7, (java.lang.String) r10)
            r14.setSmallIcon(r0)
        L_0x00f8:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r5) goto L_0x0168
            java.lang.String r5 = "notification_small_icon_uri"
            if (r11 != 0) goto L_0x0103
            r2 = 1
            r12 = 0
            goto L_0x010e
        L_0x0103:
            java.lang.Object r12 = r11.get(r5)
            java.lang.String r12 = (java.lang.String) r12
            r2 = 1
            android.graphics.Bitmap r12 = m15219a((android.content.Context) r7, (java.lang.String) r12, (boolean) r2)
        L_0x010e:
            if (r12 == 0) goto L_0x0147
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r1] = r12
            java.lang.String r12 = "android.graphics.drawable.Icon"
            java.lang.String r1 = "createWithBitmap"
            java.lang.Object r1 = com.xiaomi.push.C4554bk.m13014a((java.lang.String) r12, (java.lang.String) r1, (java.lang.Object[]) r6)
            if (r1 == 0) goto L_0x0136
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r6 = 0
            r5[r6] = r1
            java.lang.String r1 = "setSmallIcon"
            com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r14, (java.lang.String) r1, (java.lang.Object[]) r5)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r5 = "miui.isGrayscaleIcon"
            r1.putBoolean(r5, r2)
            r14.addExtras((android.os.Bundle) r1)
            goto L_0x015f
        L_0x0136:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed te get small icon with url:"
            r1.append(r2)
            java.lang.Object r2 = r11.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0155
        L_0x0147:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to get small icon url:"
            r1.append(r2)
            java.lang.String r2 = m15228a((java.util.Map<java.lang.String, java.lang.String>) r11, (java.lang.String) r5)
        L_0x0155:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r1)
        L_0x015f:
            java.lang.String r1 = "notification_small_icon_color"
            java.lang.String r1 = m15228a((java.util.Map<java.lang.String, java.lang.String>) r11, (java.lang.String) r1)
            r14.mo29058a((java.lang.String) r1)
        L_0x0168:
            java.lang.String r1 = "__dynamic_icon_uri"
            java.lang.String r1 = m15228a((java.util.Map<java.lang.String, java.lang.String>) r11, (java.lang.String) r1)
            java.lang.String r2 = "__adiom"
            java.lang.String r2 = m15228a((java.util.Map<java.lang.String, java.lang.String>) r11, (java.lang.String) r2)
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 != 0) goto L_0x0183
            boolean r2 = com.xiaomi.push.C4830m.m14997a()
            if (r2 != 0) goto L_0x0181
            goto L_0x0183
        L_0x0181:
            r2 = 0
            goto L_0x0184
        L_0x0183:
            r2 = 1
        L_0x0184:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x01af
            if (r2 == 0) goto L_0x01af
            java.lang.String r2 = "http"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x01a4
            r2 = 1
            com.xiaomi.push.service.aw$b r1 = com.xiaomi.push.service.C4890aw.m15309a((android.content.Context) r7, (java.lang.String) r1, (boolean) r2)
            if (r1 == 0) goto L_0x01a2
            android.graphics.Bitmap r2 = r1.f9494a
            long r5 = r1.f9493a
            r8.f9459a = r5
            goto L_0x01a8
        L_0x01a2:
            r2 = 0
            goto L_0x01a8
        L_0x01a4:
            android.graphics.Bitmap r2 = com.xiaomi.push.service.C4890aw.m15307a((android.content.Context) r7, (java.lang.String) r1)
        L_0x01a8:
            if (r2 == 0) goto L_0x01af
            r14.setLargeIcon(r2)
            r2 = 1
            goto L_0x01b0
        L_0x01af:
            r2 = 0
        L_0x01b0:
            if (r11 != 0) goto L_0x01b4
            r1 = 0
            goto L_0x01c1
        L_0x01b4:
            java.lang.String r1 = "notification_large_icon_uri"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r5 = 1
            android.graphics.Bitmap r1 = m15219a((android.content.Context) r7, (java.lang.String) r1, (boolean) r5)
        L_0x01c1:
            if (r1 == 0) goto L_0x01c6
            r14.setLargeIcon(r1)
        L_0x01c6:
            java.lang.String r1 = "com.xiaomi.xmsf"
            if (r11 == 0) goto L_0x024f
            r5 = 24
            if (r0 < r5) goto L_0x024f
            java.lang.String r5 = "notification_group"
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "notification_is_summary"
            java.lang.Object r6 = r11.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            java.lang.String r12 = "notification_group_disable_default"
            java.lang.Object r12 = r11.get(r12)
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = java.lang.Boolean.parseBoolean(r12)
            boolean r16 = android.text.TextUtils.isEmpty(r5)
            if (r16 == 0) goto L_0x0200
            boolean r16 = com.xiaomi.push.C4830m.m14997a()
            if (r16 != 0) goto L_0x01fc
            if (r12 != 0) goto L_0x0200
        L_0x01fc:
            java.lang.String r5 = m15226a((com.xiaomi.push.C4783if) r27)
        L_0x0200:
            r28 = r5
            r12 = 1
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            r16 = 0
            r5[r16] = r12
            java.lang.String r12 = "setGroupSummary"
            com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r14, (java.lang.String) r12, (java.lang.Object[]) r5)
            java.lang.Object r5 = r11.get(r13)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r12 = r26.getPackageName()
            boolean r12 = r1.equals(r12)
            if (r12 == 0) goto L_0x024c
            java.lang.String r12 = "4"
            boolean r12 = r12.equals(r5)
            if (r12 != 0) goto L_0x0232
            java.lang.String r12 = "3"
            boolean r5 = r12.equals(r5)
            if (r5 == 0) goto L_0x024c
        L_0x0232:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r12 = m15226a((com.xiaomi.push.C4783if) r27)
            r5.append(r12)
            java.lang.String r12 = "_custom_"
            r5.append(r12)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r12 = 1
            goto L_0x0252
        L_0x024c:
            r5 = r28
            goto L_0x0251
        L_0x024f:
            r5 = 0
            r6 = 0
        L_0x0251:
            r12 = 0
        L_0x0252:
            r13 = 1
            r14.setAutoCancel(r13)
            long r16 = java.lang.System.currentTimeMillis()
            if (r11 == 0) goto L_0x026d
            java.lang.String r13 = "ticker"
            boolean r18 = r11.containsKey(r13)
            if (r18 == 0) goto L_0x026d
            java.lang.Object r13 = r11.get(r13)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r14.setTicker(r13)
        L_0x026d:
            long r18 = f9452a
            long r18 = r16 - r18
            r20 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r13 = "sound_uri"
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r22 <= 0) goto L_0x02d4
            f9452a = r16
            int r15 = r9.f8787a
            boolean r16 = m15245b((android.content.Context) r7, (java.lang.String) r10)
            if (r16 == 0) goto L_0x0287
            int r15 = m15207a((android.content.Context) r7, (java.lang.String) r10)
        L_0x0287:
            r14.setDefaults(r15)
            if (r11 == 0) goto L_0x02cd
            r16 = r15 & 1
            if (r16 == 0) goto L_0x02cd
            java.lang.Object r16 = r11.get(r13)
            r17 = r8
            r8 = r16
            java.lang.String r8 = (java.lang.String) r8
            boolean r16 = android.text.TextUtils.isEmpty(r8)
            if (r16 != 0) goto L_0x02c8
            r29 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r30 = r1
            java.lang.String r1 = "android.resource://"
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            boolean r1 = r8.startsWith(r1)
            if (r1 == 0) goto L_0x02dc
            r1 = r15 ^ 1
            r14.setDefaults(r1)
            android.net.Uri r1 = android.net.Uri.parse(r8)
            r14.setSound(r1)
            goto L_0x02dc
        L_0x02c8:
            r30 = r1
            r29 = r2
            goto L_0x02dc
        L_0x02cd:
            r30 = r1
            r29 = r2
            r17 = r8
            goto L_0x02dc
        L_0x02d4:
            r30 = r1
            r29 = r2
            r17 = r8
            r15 = -100
        L_0x02dc:
            java.lang.String r1 = "0"
            r2 = 26
            if (r11 == 0) goto L_0x03c8
            if (r0 < r2) goto L_0x03c8
            com.xiaomi.push.service.ax r18 = com.xiaomi.push.service.C4893ax.m15315a((android.content.Context) r7, (java.lang.String) r10)
            int r0 = m15210a((java.util.Map<java.lang.String, java.lang.String>) r11)
            if (r0 <= 0) goto L_0x0302
            r8 = 1
            java.lang.Object[] r2 = new java.lang.Object[r8]
            int r0 = r0 * 1000
            r8 = r1
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "setTimeoutAfter"
            com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r14, (java.lang.String) r0, (java.lang.Object[]) r2)
            goto L_0x0303
        L_0x0302:
            r8 = r1
        L_0x0303:
            com.xiaomi.push.service.C4885at.m15282a((com.xiaomi.push.C4773hw) r9)
            java.lang.String r0 = "channel_id"
            java.lang.Object r0 = r11.get(r0)
            r19 = r0
            java.lang.String r19 = (java.lang.String) r19
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 == 0) goto L_0x0320
            android.content.pm.ApplicationInfo r0 = r26.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r1 = 26
            if (r0 < r1) goto L_0x039d
        L_0x0320:
            java.lang.String r20 = m15225a((android.content.Context) r7, (java.lang.String) r10, (java.util.Map<java.lang.String, java.lang.String>) r11)
            int r23 = m15246b((java.util.Map<java.lang.String, java.lang.String>) r11)
            int r0 = r9.f8787a
            java.lang.String r1 = "channel_description"
            java.lang.Object r1 = r11.get(r1)
            r21 = r1
            java.lang.String r21 = (java.lang.String) r21
            java.lang.Object r1 = r11.get(r13)
            r24 = r1
            java.lang.String r24 = (java.lang.String) r24
            java.lang.String r1 = "channel_perm"
            java.lang.Object r1 = r11.get(r1)
            r25 = r1
            java.lang.String r25 = (java.lang.String) r25
            com.xiaomi.push.service.C4939cc.m15514a((android.content.Context) r7, (java.util.Map<java.lang.String, java.lang.String>) r11, (com.xiaomi.push.C4669eq) r14, (long) r3)
            r22 = r0
            java.lang.String r0 = com.xiaomi.push.service.C4885at.m15278a(r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "setChannelId"
            com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r14, (java.lang.String) r0, (java.lang.Object[]) r2)
            r0 = -100
            if (r15 != r0) goto L_0x0367
            boolean r0 = com.xiaomi.push.service.C4894ay.m15356a((java.util.Map<java.lang.String, java.lang.String>) r11)
            if (r0 == 0) goto L_0x0367
            com.xiaomi.push.service.C4894ay.m15353a((android.app.Notification.Builder) r14, (boolean) r6)
        L_0x0367:
            java.lang.String r0 = com.xiaomi.push.service.C4894ay.m15346a((java.lang.Object) r11)
            java.lang.String r1 = "pulldown"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0388
            boolean r0 = com.xiaomi.push.service.C4894ay.m15356a((java.util.Map<java.lang.String, java.lang.String>) r11)
            if (r0 == 0) goto L_0x0388
            java.lang.String r0 = "pull_down_pop_type"
            java.lang.Object r0 = r11.get(r0)
            boolean r0 = java.util.Objects.equals(r0, r8)
            if (r0 == 0) goto L_0x0388
            com.xiaomi.push.service.C4894ay.m15353a((android.app.Notification.Builder) r14, (boolean) r6)
        L_0x0388:
            java.lang.String r0 = com.xiaomi.push.service.C4894ay.m15346a((java.lang.Object) r11)
            java.lang.String r1 = "tts"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x039d
            boolean r0 = com.xiaomi.push.service.C4894ay.m15356a((java.util.Map<java.lang.String, java.lang.String>) r11)
            if (r0 == 0) goto L_0x039d
            com.xiaomi.push.service.C4894ay.m15353a((android.app.Notification.Builder) r14, (boolean) r6)
        L_0x039d:
            java.lang.String r0 = "background_color"
            java.lang.Object r0 = r11.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x03e2
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x03c3 }
            r1 = 1
            r14.setOngoing(r1)     // Catch:{ Exception -> 0x03c3 }
            r14.setColor(r0)     // Catch:{ Exception -> 0x03c3 }
            java.lang.String r0 = "setColorized"
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x03c3 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x03c3 }
            r3 = 0
            r2[r3] = r1     // Catch:{ Exception -> 0x03c3 }
            com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r14, (java.lang.String) r0, (java.lang.Object[]) r2)     // Catch:{ Exception -> 0x03c3 }
            goto L_0x03e2
        L_0x03c3:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r0)
            goto L_0x03e2
        L_0x03c8:
            r8 = r1
            if (r11 == 0) goto L_0x03e2
            r1 = 26
            if (r0 >= r1) goto L_0x03e2
            int r0 = m15255c((java.util.Map<java.lang.String, java.lang.String>) r11)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = "setPriority"
            com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r14, (java.lang.String) r0, (java.lang.Object[]) r2)
        L_0x03e2:
            if (r5 == 0) goto L_0x03f9
            if (r12 != 0) goto L_0x03ee
            com.xiaomi.push.service.au r0 = com.xiaomi.push.service.C4886au.m15290a()
            java.lang.String r5 = r0.mo29975a((android.content.Context) r7, (android.app.Notification.Builder) r14, (java.lang.String) r5)
        L_0x03ee:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r5
            java.lang.String r1 = "setGroup"
            com.xiaomi.push.C4554bk.m13012a((java.lang.Object) r14, (java.lang.String) r1, (java.lang.Object[]) r0)
        L_0x03f9:
            boolean r0 = com.xiaomi.push.C4830m.m15013c()
            if (r0 == 0) goto L_0x0422
            java.lang.String r0 = r26.getPackageName()
            r1 = r30
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0422
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r7
            r1 = 1
            r0[r1] = r14
            r1 = 2
            java.lang.String r2 = m15226a((com.xiaomi.push.C4783if) r27)
            r0[r1] = r2
            java.lang.String r1 = "miui.util.NotificationHelper"
            java.lang.String r2 = "setTargetPkg"
            com.xiaomi.push.C4554bk.m13014a((java.lang.String) r1, (java.lang.String) r2, (java.lang.Object[]) r0)
        L_0x0422:
            android.app.Notification r0 = r14.getNotification()
            if (r29 == 0) goto L_0x0431
            boolean r1 = com.xiaomi.push.C4830m.m14997a()
            if (r1 == 0) goto L_0x0431
            m15211a((android.app.Notification) r0)
        L_0x0431:
            if (r11 == 0) goto L_0x04b8
            android.os.Bundle r1 = r0.extras
            if (r1 != 0) goto L_0x043e
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0.extras = r1
        L_0x043e:
            java.lang.String r1 = "enable_keyguard"
            java.lang.Object r2 = r11.get(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0459
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            com.xiaomi.push.service.C4894ay.m15359b(r0, r1)
        L_0x0459:
            java.lang.String r1 = "enable_float"
            java.lang.Object r2 = r11.get(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0474
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            com.xiaomi.push.service.C4894ay.m15350a((android.app.Notification) r0, (boolean) r1)
        L_0x0474:
            java.lang.String r1 = "float_small_win"
            java.lang.Object r2 = r11.get(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0498
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0498
            boolean r1 = com.xiaomi.push.C4747h.m14135d(r7, r10)
            if (r1 == 0) goto L_0x0498
            r1 = 0
            com.xiaomi.push.service.C4894ay.m15350a((android.app.Notification) r0, (boolean) r1)
        L_0x0498:
            java.lang.String r1 = "section_is_prr"
            java.lang.Object r1 = r11.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r2 = -1
            int r1 = com.xiaomi.push.C4995w.m15744a(r1, r2)
            java.lang.String r3 = "section_prr_cl"
            java.lang.Object r3 = r11.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            int r2 = com.xiaomi.push.C4995w.m15744a(r3, r2)
            if (r1 < 0) goto L_0x04b8
            if (r2 < 0) goto L_0x04b8
            com.xiaomi.push.service.C4894ay.m15348a((android.app.Notification) r0, (int) r1, (int) r2)
        L_0x04b8:
            r1 = r17
            r1.f9460a = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4874al.m15223a(android.content.Context, com.xiaomi.push.if, byte[], android.widget.RemoteViews, android.app.PendingIntent, int):com.xiaomi.push.service.al$b");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.push.service.C4874al.C4877c m15224a(android.content.Context r21, com.xiaomi.push.C4783if r22, byte[] r23) {
        /*
            r7 = r21
            r8 = r22
            com.xiaomi.push.service.al$c r9 = new com.xiaomi.push.service.al$c
            r9.<init>()
            java.lang.String r0 = m15226a((com.xiaomi.push.C4783if) r22)
            r10 = 1
            com.xiaomi.push.h$a r0 = com.xiaomi.push.C4747h.m14127a(r7, r0, r10)
            com.xiaomi.push.hw r11 = r22.mo29558a()
            r12 = 0
            if (r11 == 0) goto L_0x0023
            int r1 = r11.mo29404c()
            java.util.Map r2 = r11.mo29392a()
            r13 = r2
            goto L_0x0025
        L_0x0023:
            r1 = 0
            r13 = r12
        L_0x0025:
            java.lang.String r2 = m15226a((com.xiaomi.push.C4783if) r22)
            int r14 = com.xiaomi.push.C4995w.m15748b(r2, r1)
            boolean r1 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r21)
            if (r1 == 0) goto L_0x0083
            com.xiaomi.push.h$a r1 = com.xiaomi.push.C4747h.C4748a.NOT_ALLOWED
            if (r0 != r1) goto L_0x0083
            if (r11 == 0) goto L_0x0065
            android.content.Context r0 = r21.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r1 = r22.mo29567b()
            java.lang.String r2 = m15248b((com.xiaomi.push.C4783if) r22)
            java.lang.String r3 = r11.mo29392a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "10:"
            r4.append(r5)
            java.lang.String r5 = m15226a((com.xiaomi.push.C4783if) r22)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.mo29054a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4)
        L_0x0065:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Do not notify because user block "
            r0.append(r1)
            java.lang.String r1 = m15226a((com.xiaomi.push.C4783if) r22)
            r0.append(r1)
            java.lang.String r1 = "‘s notification"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x007f:
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
            return r9
        L_0x0083:
            boolean r0 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r21)
            if (r0 == 0) goto L_0x00ca
            com.xiaomi.push.service.as r0 = f9453a
            if (r0 == 0) goto L_0x00ca
            com.xiaomi.push.service.as r0 = f9453a
            java.lang.String r1 = m15226a((com.xiaomi.push.C4783if) r22)
            boolean r0 = r0.mo29971a((android.content.Context) r7, (int) r14, (java.lang.String) r1, (java.util.Map<java.lang.String, java.lang.String>) r13)
            if (r0 == 0) goto L_0x00ca
            if (r11 == 0) goto L_0x00c7
            android.content.Context r0 = r21.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r1 = r22.mo29567b()
            java.lang.String r2 = m15248b((com.xiaomi.push.C4783if) r22)
            java.lang.String r3 = r11.mo29392a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "14:"
            r4.append(r5)
            java.lang.String r5 = m15226a((com.xiaomi.push.C4783if) r22)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.mo29054a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4)
        L_0x00c7:
            java.lang.String r0 = "Do not notify because card notification is canceled or sequence incorrect"
            goto L_0x007f
        L_0x00ca:
            android.widget.RemoteViews r4 = m15221a((android.content.Context) r21, (com.xiaomi.push.C4783if) r22, (byte[]) r23)
            java.lang.String r0 = r22.mo29567b()
            r3 = r23
            android.app.PendingIntent r5 = m15212a((android.content.Context) r7, (com.xiaomi.push.C4783if) r8, (java.lang.String) r0, (byte[]) r3, (int) r14)
            if (r5 != 0) goto L_0x00f8
            if (r11 == 0) goto L_0x00f5
            android.content.Context r0 = r21.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r1 = r22.mo29567b()
            java.lang.String r2 = m15248b((com.xiaomi.push.C4783if) r22)
            java.lang.String r3 = r11.mo29392a()
            java.lang.String r4 = "11"
            r0.mo29054a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4)
        L_0x00f5:
            java.lang.String r0 = "The click PendingIntent is null. "
            goto L_0x007f
        L_0x00f8:
            r1 = r21
            r2 = r22
            r3 = r23
            r6 = r14
            com.xiaomi.push.service.al$b r0 = m15223a((android.content.Context) r1, (com.xiaomi.push.C4783if) r2, (byte[]) r3, (android.widget.RemoteViews) r4, (android.app.PendingIntent) r5, (int) r6)
            long r1 = r0.f9459a
            r9.f9461a = r1
            java.lang.String r1 = m15226a((com.xiaomi.push.C4783if) r22)
            r9.f9462a = r1
            android.app.Notification r1 = r0.f9460a
            boolean r0 = com.xiaomi.push.C4830m.m14997a()
            if (r0 == 0) goto L_0x019b
            java.lang.String r0 = r11.mo29392a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x012a
            android.os.Bundle r0 = r1.extras
            java.lang.String r2 = "message_id"
            java.lang.String r3 = r11.mo29392a()
            r0.putString(r2, r3)
        L_0x012a:
            android.os.Bundle r0 = r1.extras
            java.lang.String r2 = "local_paid"
            java.lang.String r3 = r22.mo29558a()
            r0.putString(r2, r3)
            android.os.Bundle r0 = r1.extras
            java.lang.String r2 = "msg_busi_type"
            com.xiaomi.push.service.C4894ay.m15352a((java.util.Map<java.lang.String, java.lang.String>) r13, (android.os.Bundle) r0, (java.lang.String) r2)
            android.os.Bundle r0 = r1.extras
            java.lang.String r2 = "disable_notification_flags"
            com.xiaomi.push.service.C4894ay.m15352a((java.util.Map<java.lang.String, java.lang.String>) r13, (android.os.Bundle) r0, (java.lang.String) r2)
            java.util.Map r0 = r11.mo29399b()
            if (r0 != 0) goto L_0x014b
            r0 = r12
            goto L_0x0157
        L_0x014b:
            java.util.Map r0 = r11.mo29399b()
            java.lang.String r2 = "score_info"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0157:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0164
            android.os.Bundle r2 = r1.extras
            java.lang.String r3 = "score_info"
            r2.putString(r3, r0)
        L_0x0164:
            android.os.Bundle r0 = r1.extras
            java.lang.String r2 = "pushUid"
            java.util.Map<java.lang.String, java.lang.String> r3 = r11.f8791a
            java.lang.String r4 = "n_stats_expose"
            java.lang.String r3 = m15228a((java.util.Map<java.lang.String, java.lang.String>) r3, (java.lang.String) r4)
            r0.putString(r2, r3)
            r0 = -1
            boolean r2 = m15257c((com.xiaomi.push.C4783if) r22)
            if (r2 == 0) goto L_0x017d
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0185
        L_0x017d:
            boolean r2 = m15226a((com.xiaomi.push.C4783if) r22)
            if (r2 == 0) goto L_0x0185
            r0 = 3000(0xbb8, float:4.204E-42)
        L_0x0185:
            android.os.Bundle r2 = r1.extras
            java.lang.String r3 = "eventMessageType"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.putString(r3, r0)
            android.os.Bundle r0 = r1.extras
            java.lang.String r2 = "target_package"
            java.lang.String r3 = m15226a((com.xiaomi.push.C4783if) r22)
            r0.putString(r2, r3)
        L_0x019b:
            java.util.Map r0 = r11.mo29392a()
            if (r0 != 0) goto L_0x01a2
            goto L_0x01af
        L_0x01a2:
            java.util.Map r0 = r11.mo29392a()
            java.lang.String r2 = "message_count"
            java.lang.Object r0 = r0.get(r2)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
        L_0x01af:
            boolean r0 = com.xiaomi.push.C4830m.m14997a()
            if (r0 == 0) goto L_0x01ed
            if (r12 == 0) goto L_0x01ed
            int r0 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x01bf }
            com.xiaomi.push.service.C4894ay.m15347a((android.app.Notification) r1, (int) r0)     // Catch:{ NumberFormatException -> 0x01bf }
            goto L_0x01ed
        L_0x01bf:
            r0 = move-exception
            android.content.Context r2 = r21.getApplicationContext()
            com.xiaomi.push.eo r2 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r2)
            java.lang.String r3 = r22.mo29567b()
            java.lang.String r4 = m15248b((com.xiaomi.push.C4783if) r22)
            java.lang.String r5 = r11.mo29392a()
            java.lang.String r6 = "8"
            r2.mo29055b(r3, r4, r5, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fail to set message count. "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)
        L_0x01ed:
            java.lang.String r0 = m15226a((com.xiaomi.push.C4783if) r22)
            boolean r2 = com.xiaomi.push.C4830m.m15013c()
            if (r2 != 0) goto L_0x0200
            boolean r2 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r21)
            if (r2 == 0) goto L_0x0200
            com.xiaomi.push.service.C4894ay.m15343a((android.app.Notification) r1, (java.lang.String) r0)
        L_0x0200:
            com.xiaomi.push.service.ax r2 = com.xiaomi.push.service.C4893ax.m15315a((android.content.Context) r7, (java.lang.String) r0)
            boolean r3 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r21)
            if (r3 == 0) goto L_0x0217
            com.xiaomi.push.service.as r3 = f9453a
            if (r3 == 0) goto L_0x0217
            com.xiaomi.push.service.as r3 = f9453a
            java.util.Map r4 = r11.mo29392a()
            r3.mo29972a((com.xiaomi.push.C4783if) r8, (java.util.Map<java.lang.String, java.lang.String>) r4, (int) r14, (android.app.Notification) r1)
        L_0x0217:
            boolean r3 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r21)
            if (r3 == 0) goto L_0x0233
            com.xiaomi.push.service.as r3 = f9453a
            if (r3 == 0) goto L_0x0233
            com.xiaomi.push.service.as r3 = f9453a
            java.util.Map r4 = r11.mo29392a()
            boolean r3 = r3.mo29974a(r4, r14, r1)
            if (r3 == 0) goto L_0x0233
            java.lang.String r3 = "consume this notificaiton by agent"
            com.xiaomi.channel.commonutils.logger.C4408b.m12481b(r3)
            goto L_0x0255
        L_0x0233:
            r2.mo29981a((int) r14, (android.app.Notification) r1)
            r9.f9463a = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "notification: "
            r3.append(r4)
            java.lang.String r4 = r11.mo29392a()
            r3.append(r4)
            java.lang.String r4 = " is notifyied"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r3)
        L_0x0255:
            boolean r3 = com.xiaomi.push.C4830m.m14997a()
            if (r3 == 0) goto L_0x026f
            boolean r3 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r21)
            if (r3 == 0) goto L_0x026f
            com.xiaomi.push.service.au r3 = com.xiaomi.push.service.C4886au.m15290a()
            r3.mo29976a((android.content.Context) r7, (int) r14, (android.app.Notification) r1)
            java.lang.String r3 = r11.mo29392a()
            com.xiaomi.push.service.C4939cc.m15511a((android.content.Context) r7, (java.lang.String) r0, (int) r14, (java.lang.String) r3, (android.app.Notification) r1)
        L_0x026f:
            boolean r0 = m15226a((com.xiaomi.push.C4783if) r22)
            if (r0 == 0) goto L_0x0290
            android.content.Context r0 = r21.getApplicationContext()
            com.xiaomi.push.eo r15 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r16 = r22.mo29567b()
            java.lang.String r17 = m15248b((com.xiaomi.push.C4783if) r22)
            java.lang.String r18 = r11.mo29392a()
            r19 = 3002(0xbba, float:4.207E-42)
            r20 = 0
            r15.mo29053a(r16, r17, r18, r19, r20)
        L_0x0290:
            boolean r0 = m15257c((com.xiaomi.push.C4783if) r22)
            if (r0 == 0) goto L_0x02b1
            android.content.Context r0 = r21.getApplicationContext()
            com.xiaomi.push.eo r15 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r16 = r22.mo29567b()
            java.lang.String r17 = m15248b((com.xiaomi.push.C4783if) r22)
            java.lang.String r18 = r11.mo29392a()
            r19 = 1002(0x3ea, float:1.404E-42)
            r20 = 0
            r15.mo29053a(r16, r17, r18, r19, r20)
        L_0x02b1:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x02eb
            java.lang.String r0 = r11.mo29392a()
            com.xiaomi.push.al r1 = com.xiaomi.push.C4516al.m12857a((android.content.Context) r21)
            java.util.Map r3 = r11.mo29392a()
            int r3 = m15210a((java.util.Map<java.lang.String, java.lang.String>) r3)
            if (r3 <= 0) goto L_0x02eb
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 != 0) goto L_0x02eb
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "n_timeout_"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.mo28739a((java.lang.String) r0)
            com.xiaomi.push.service.am r4 = new com.xiaomi.push.service.am
            r4.<init>(r0, r2, r14)
            r1.mo28740b(r4, r3)
        L_0x02eb:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0.<init>(r1, r8)
            java.util.LinkedList<android.util.Pair<java.lang.Integer, com.xiaomi.push.if>> r1 = f9454a
            monitor-enter(r1)
            r1.add(r0)     // Catch:{ all -> 0x0307 }
            int r0 = r1.size()     // Catch:{ all -> 0x0307 }
            r2 = 100
            if (r0 <= r2) goto L_0x0305
            r1.remove()     // Catch:{ all -> 0x0307 }
        L_0x0305:
            monitor-exit(r1)     // Catch:{ all -> 0x0307 }
            return r9
        L_0x0307:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0307 }
            goto L_0x030b
        L_0x030a:
            throw r0
        L_0x030b:
            goto L_0x030a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4874al.m15224a(android.content.Context, com.xiaomi.push.if, byte[]):com.xiaomi.push.service.al$c");
    }

    /* renamed from: a */
    private static String m15225a(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? C4747h.m14131b(context, str) : map.get("channel_name");
    }

    /* renamed from: a */
    public static String m15226a(C4783if ifVar) {
        C4773hw a;
        if (!(!"com.xiaomi.xmsf".equals(ifVar.f8954b) || (a = ifVar.mo29558a()) == null || a.mo29392a() == null)) {
            String str = (String) a.mo29392a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return ifVar.f8954b;
    }

    /* renamed from: a */
    public static String m15227a(Map<String, String> map, int i) {
        String format = i == 0 ? "notify_effect" : m15246b(map) ? String.format("cust_btn_%s_ne", new Object[]{Integer.valueOf(i)}) : i == 1 ? "notification_style_button_left_notify_effect" : i == 2 ? "notification_style_button_mid_notify_effect" : i == 3 ? "notification_style_button_right_notify_effect" : i == 4 ? "notification_colorful_button_notify_effect" : null;
        if (map == null || format == null) {
            return null;
        }
        return map.get(format);
    }

    /* renamed from: a */
    private static String m15228a(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: a */
    private static void m15229a(Context context, Intent intent, C4783if ifVar, C4773hw hwVar, String str, int i) {
        if (ifVar != null && hwVar != null && !TextUtils.isEmpty(str)) {
            String a = m15227a((Map<String, String>) hwVar.mo29392a(), i);
            if (TextUtils.isEmpty(a)) {
                return;
            }
            if (C4916bk.f9579a.equals(a) || C4916bk.f9580b.equals(a) || C4916bk.f9581c.equals(a)) {
                intent.putExtra("messageId", str);
                intent.putExtra("local_paid", ifVar.f8950a);
                if (!TextUtils.isEmpty(ifVar.f8954b)) {
                    intent.putExtra("target_package", ifVar.f8954b);
                }
                intent.putExtra("job_key", m15228a((Map<String, String>) hwVar.mo29392a(), "jobkey"));
                intent.putExtra(i + "_" + "target_component", m15209a(context, ifVar.f8954b, (Map<String, String>) hwVar.mo29392a(), i));
            }
        }
    }

    /* renamed from: a */
    public static void m15230a(Context context, String str) {
        m15231a(context, str, -1);
    }

    /* renamed from: a */
    public static void m15231a(Context context, String str, int i) {
        m15232a(context, str, i, -1);
    }

    /* renamed from: a */
    public static void m15232a(Context context, String str, int i, int i2) {
        int i3;
        if (context != null && !TextUtils.isEmpty(str) && i >= -1) {
            C4893ax a = C4893ax.m15315a(context, str);
            List b = a.mo29984b();
            if (!C4995w.m15747a((Collection<?>) b)) {
                LinkedList linkedList = new LinkedList();
                boolean z = false;
                if (i == -1) {
                    i3 = 0;
                    z = true;
                } else {
                    i3 = ((str.hashCode() / 10) * 10) + i;
                }
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
                    if (!TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                        int id = statusBarNotification.getId();
                        if (z) {
                            linkedList.add(statusBarNotification);
                            a.mo29980a(id);
                        } else if (i3 == id) {
                            C4958d.m15543a(context, statusBarNotification, i2);
                            linkedList.add(statusBarNotification);
                            a.mo29980a(id);
                            break;
                        }
                    }
                }
                m15234a(context, (LinkedList<? extends Object>) linkedList);
            }
        }
    }

    /* renamed from: a */
    public static void m15233a(Context context, String str, String str2, String str3) {
        if (context != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            C4893ax a = C4893ax.m15315a(context, str);
            List<StatusBarNotification> b = a.mo29984b();
            if (!C4995w.m15747a((Collection<?>) b)) {
                LinkedList linkedList = new LinkedList();
                for (StatusBarNotification statusBarNotification : b) {
                    Notification notification = statusBarNotification.getNotification();
                    if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                        int id = statusBarNotification.getId();
                        String a2 = C4894ay.m15345a(notification);
                        String b2 = C4894ay.m15358b(notification);
                        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(b2) && m15242a(a2, str2) && m15242a(b2, str3)) {
                            linkedList.add(statusBarNotification);
                            a.mo29980a(id);
                        }
                    }
                }
                m15234a(context, (LinkedList<? extends Object>) linkedList);
            }
        }
    }

    /* renamed from: a */
    public static void m15234a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList != null && linkedList.size() > 0) {
            C4935bz.m15496a(context, "category_clear_notification", "clear_notification", (long) linkedList.size(), "");
        }
    }

    /* renamed from: a */
    private static void m15235a(Intent intent) {
        try {
            Method declaredMethod = intent.getClass().getDeclaredMethod("addMiuiFlags", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(intent, new Object[]{2});
        } catch (Exception e) {
            C4408b.m12481b("insert flags error " + e);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    private static void m15236a(C4669eq eqVar, Context context, String str, C4783if ifVar, byte[] bArr, int i) {
        PendingIntent a;
        PendingIntent a2;
        PendingIntent a3;
        PendingIntent a4;
        C4669eq eqVar2 = eqVar;
        Map a5 = ifVar.mo29558a().mo29392a();
        if (!TextUtils.equals("3", (CharSequence) a5.get("notification_style_type")) && !TextUtils.equals("4", (CharSequence) a5.get("notification_style_type"))) {
            if (m15246b((Map<String, String>) a5)) {
                for (int i2 = 1; i2 <= 3; i2++) {
                    String str2 = (String) a5.get(String.format("cust_btn_%s_n", new Object[]{Integer.valueOf(i2)}));
                    if (!TextUtils.isEmpty(str2) && (a4 = m15214a(context, str, ifVar, bArr, i, i2)) != null) {
                        eqVar.addAction(0, str2, a4);
                    }
                }
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) a5.get("notification_style_button_left_name")) && (a3 = m15214a(context, str, ifVar, bArr, i, 1)) != null) {
                eqVar.addAction(0, (CharSequence) a5.get("notification_style_button_left_name"), a3);
            }
            if (!TextUtils.isEmpty((CharSequence) a5.get("notification_style_button_mid_name")) && (a2 = m15214a(context, str, ifVar, bArr, i, 2)) != null) {
                eqVar.addAction(0, (CharSequence) a5.get("notification_style_button_mid_name"), a2);
            }
            if (!TextUtils.isEmpty((CharSequence) a5.get("notification_style_button_right_name")) && (a = m15214a(context, str, ifVar, bArr, i, 3)) != null) {
                eqVar.addAction(0, (CharSequence) a5.get("notification_style_button_right_name"), a);
            }
        }
    }

    /* renamed from: a */
    private static boolean m15237a(Context context, C4783if ifVar, String str) {
        if (ifVar != null && ifVar.mo29558a() != null && ifVar.mo29558a().mo29392a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean((String) ifVar.mo29558a().mo29392a().get("use_clicked_activity")) && C4969l.m15574a(context, m15215a(str));
        }
        C4408b.m12464a("should clicked activity params are null.");
        return false;
    }

    /* renamed from: a */
    public static boolean m15238a(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.importance == 100 && Arrays.asList(next.pkgList).contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m15239a(Context context, String str, boolean z) {
        return C4830m.m14997a() && !z && m15207a(context, str);
    }

    /* renamed from: a */
    private static boolean m15240a(C4773hw hwVar) {
        if (hwVar == null) {
            return false;
        }
        String a = hwVar.mo29392a();
        return !TextUtils.isEmpty(a) && a.length() == 22 && "satuigmo".indexOf(a.charAt(0)) >= 0;
    }

    /* renamed from: a */
    public static boolean m15241a(C4783if ifVar) {
        C4773hw a = ifVar.mo29558a();
        return m15240a(a) && a.mo29422l();
    }

    /* renamed from: a */
    private static boolean m15242a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* renamed from: a */
    public static boolean m15243a(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return TimerCodec.ENABLE.equals(map.get("notify_foreground"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004e, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x0072;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] m15244a(android.content.Context r3, com.xiaomi.push.C4773hw r4) {
        /*
            java.lang.String r0 = r4.mo29404c()
            java.lang.String r1 = r4.mo29410d()
            java.util.Map r4 = r4.mo29392a()
            if (r4 == 0) goto L_0x0073
            android.content.res.Resources r2 = r3.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = (float) r2
            float r2 = r2 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            int r3 = r3.intValue()
            r2 = 320(0x140, float:4.48E-43)
            if (r3 > r2) goto L_0x0051
            java.lang.String r3 = "title_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0042
            r0 = r3
        L_0x0042:
            java.lang.String r3 = "description_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0073
            goto L_0x0072
        L_0x0051:
            r2 = 360(0x168, float:5.04E-43)
            if (r3 <= r2) goto L_0x0073
            java.lang.String r3 = "title_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x0064
            r0 = r3
        L_0x0064:
            java.lang.String r3 = "description_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0073
        L_0x0072:
            r1 = r3
        L_0x0073:
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4874al.m15244a(android.content.Context, com.xiaomi.push.hw):java.lang.String[]");
    }

    /* renamed from: b */
    private static int m15245b(Context context, String str) {
        int a = m15208a(context, str, "mipush_notification");
        int a2 = m15208a(context, str, "mipush_small_notification");
        if (a <= 0) {
            a = a2 > 0 ? a2 : context.getApplicationInfo().icon;
        }
        return a == 0 ? context.getApplicationInfo().logo : a;
    }

    /* renamed from: b */
    private static int m15246b(Map<String, String> map) {
        if (map == null) {
            return 3;
        }
        String str = map.get("channel_importance");
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        try {
            C4408b.m12482c("importance=" + str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            C4408b.m12483d("parsing channel importance error: " + e);
            return 3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x014e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m15247b(android.content.Context r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, int r8) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            if (r8 == 0) goto L_0x000b
            android.content.Intent r5 = m15209a((android.content.Context) r5, (java.lang.String) r6, (java.util.Map<java.lang.String, java.lang.String>) r7, (int) r8)
            return r5
        L_0x000b:
            java.lang.String r8 = "notify_effect"
            boolean r1 = r7.containsKey(r8)
            if (r1 != 0) goto L_0x0014
            return r0
        L_0x0014:
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r1 = -1
            java.lang.String r2 = "intent_flag"
            java.lang.Object r2 = r7.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ NumberFormatException -> 0x002e }
            if (r3 != 0) goto L_0x0047
            int r1 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x002e }
            goto L_0x0047
        L_0x002e:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cause by intent_flag: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r2)
        L_0x0047:
            java.lang.String r2 = com.xiaomi.push.service.C4916bk.f9579a
            boolean r2 = r2.equals(r8)
            java.lang.String r3 = "Cause: "
            if (r2 == 0) goto L_0x0074
            android.content.pm.PackageManager r7 = r5.getPackageManager()     // Catch:{ Exception -> 0x005b }
            android.content.Intent r6 = r7.getLaunchIntentForPackage(r6)     // Catch:{ Exception -> 0x005b }
            goto L_0x014c
        L_0x005b:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r6)
            goto L_0x014b
        L_0x0074:
            java.lang.String r2 = com.xiaomi.push.service.C4916bk.f9580b
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x00d0
            java.lang.String r2 = "intent_uri"
            boolean r4 = r7.containsKey(r2)
            if (r4 == 0) goto L_0x00b2
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x014b
            r2 = 1
            android.content.Intent r7 = android.content.Intent.parseUri(r7, r2)     // Catch:{ URISyntaxException -> 0x0097 }
            r7.setPackage(r6)     // Catch:{ URISyntaxException -> 0x0095 }
            goto L_0x00af
        L_0x0095:
            r6 = move-exception
            goto L_0x0099
        L_0x0097:
            r6 = move-exception
            r7 = r0
        L_0x0099:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r6 = r6.getMessage()
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r6)
        L_0x00af:
            r6 = r7
            goto L_0x014c
        L_0x00b2:
            java.lang.String r2 = "class_name"
            boolean r4 = r7.containsKey(r2)
            if (r4 == 0) goto L_0x014b
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.ComponentName r4 = new android.content.ComponentName
            r4.<init>(r6, r7)
            r2.setComponent(r4)
        L_0x00cd:
            r6 = r2
            goto L_0x014c
        L_0x00d0:
            java.lang.String r2 = com.xiaomi.push.service.C4916bk.f9581c
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x014b
            java.lang.String r2 = "web_uri"
            java.lang.Object r7 = r7.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x014b
            java.lang.String r7 = r7.trim()
            java.lang.String r2 = "http://"
            boolean r4 = r7.startsWith(r2)
            if (r4 != 0) goto L_0x0105
            java.lang.String r4 = "https://"
            boolean r4 = r7.startsWith(r4)
            if (r4 != 0) goto L_0x0105
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
        L_0x0105:
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0132 }
            r2.<init>(r7)     // Catch:{ MalformedURLException -> 0x0132 }
            java.lang.String r2 = r2.getProtocol()     // Catch:{ MalformedURLException -> 0x0132 }
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r2)     // Catch:{ MalformedURLException -> 0x0132 }
            if (r4 != 0) goto L_0x011e
            java.lang.String r4 = "https"
            boolean r2 = r4.equals(r2)     // Catch:{ MalformedURLException -> 0x0132 }
            if (r2 == 0) goto L_0x014b
        L_0x011e:
            android.content.Intent r2 = new android.content.Intent     // Catch:{ MalformedURLException -> 0x0132 }
            java.lang.String r4 = "android.intent.action.VIEW"
            r2.<init>(r4)     // Catch:{ MalformedURLException -> 0x0132 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ MalformedURLException -> 0x0130 }
            r2.setData(r7)     // Catch:{ MalformedURLException -> 0x0130 }
            com.xiaomi.push.service.C4894ay.m15351a((android.content.Context) r5, (java.lang.String) r6, (android.content.Intent) r2)     // Catch:{ MalformedURLException -> 0x0130 }
            goto L_0x00cd
        L_0x0130:
            r6 = move-exception
            goto L_0x0134
        L_0x0132:
            r6 = move-exception
            r2 = r0
        L_0x0134:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r6)
            goto L_0x00cd
        L_0x014b:
            r6 = r0
        L_0x014c:
            if (r6 == 0) goto L_0x01a9
            if (r1 < 0) goto L_0x0153
            r6.setFlags(r1)
        L_0x0153:
            m15251b((android.content.Intent) r6)
            r7 = 268435456(0x10000000, float:2.5243549E-29)
            r6.addFlags(r7)
            android.content.pm.PackageManager r7 = r5.getPackageManager()     // Catch:{ Exception -> 0x0192 }
            r1 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r6, r1)     // Catch:{ Exception -> 0x0192 }
            if (r7 == 0) goto L_0x0168
            return r6
        L_0x0168:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0192 }
            r1 = 30
            if (r7 < r1) goto L_0x017d
            boolean r5 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r5)     // Catch:{ Exception -> 0x0192 }
            if (r5 != 0) goto L_0x017d
            java.lang.String r5 = com.xiaomi.push.service.C4916bk.f9581c     // Catch:{ Exception -> 0x0192 }
            boolean r5 = r5.equals(r8)     // Catch:{ Exception -> 0x0192 }
            if (r5 == 0) goto L_0x017d
            return r6
        L_0x017d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0192 }
            r5.<init>()     // Catch:{ Exception -> 0x0192 }
            java.lang.String r7 = "not resolve activity:"
            r5.append(r7)     // Catch:{ Exception -> 0x0192 }
            r5.append(r6)     // Catch:{ Exception -> 0x0192 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0192 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r5)     // Catch:{ Exception -> 0x0192 }
            goto L_0x01a9
        L_0x0192:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r5 = r5.getMessage()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r5)
        L_0x01a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4874al.m15247b(android.content.Context, java.lang.String, java.util.Map, int):android.content.Intent");
    }

    /* renamed from: b */
    public static String m15248b(C4783if ifVar) {
        return m15226a(ifVar) ? "E100002" : m15257c(ifVar) ? "E100000" : m15248b(ifVar) ? "E100001" : m15258d(ifVar) ? "E100003" : "";
    }

    /* renamed from: b */
    public static void m15249b(Context context, String str) {
        if (C4830m.m14998a(context) && f9453a != null && !TextUtils.isEmpty(str)) {
            f9453a.mo29973a(str);
        }
    }

    /* renamed from: b */
    static void m15250b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* renamed from: b */
    private static void m15251b(Intent intent) {
        if (intent != null) {
            int flags = intent.getFlags() & -2 & -3 & -65;
            if (Build.VERSION.SDK_INT >= 21) {
                flags &= -129;
            }
            intent.setFlags(flags);
        }
    }

    /* renamed from: b */
    static boolean m15252b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    /* renamed from: b */
    public static boolean m15253b(C4783if ifVar) {
        C4773hw a = ifVar.mo29558a();
        return m15240a(a) && a.f8793b == 1 && !m15226a(ifVar);
    }

    /* renamed from: b */
    private static boolean m15254b(Map<String, String> map) {
        if (map != null) {
            return "6".equals(map.get("notification_style_type"));
        }
        C4408b.m12464a("meta extra is null");
        return false;
    }

    /* renamed from: c */
    private static int m15255c(Map<String, String> map) {
        if (map == null) {
            return 0;
        }
        String str = map.get("notification_priority");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            C4408b.m12482c("priority=" + str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            C4408b.m12483d("parsing notification priority error: " + e);
            return 0;
        }
    }

    /* renamed from: c */
    static void m15256c(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    /* renamed from: c */
    public static boolean m15257c(C4783if ifVar) {
        C4773hw a = ifVar.mo29558a();
        return m15240a(a) && a.f8793b == 0 && !m15226a(ifVar);
    }

    /* renamed from: d */
    public static boolean m15258d(C4783if ifVar) {
        return ifVar.mo29558a() == C4760hj.Registration;
    }

    /* renamed from: e */
    public static boolean m15259e(C4783if ifVar) {
        return m15226a(ifVar) || m15257c(ifVar) || m15248b(ifVar);
    }
}
