package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
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
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4525ba;
import com.xiaomi.push.C4689g;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4762ii;
import com.xiaomi.push.service.C4850ai;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Arrays;
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

/* renamed from: com.xiaomi.push.service.aa */
public class C4837aa {

    /* renamed from: a */
    public static long f9935a;

    /* renamed from: a */
    private static final LinkedList<Pair<Integer, C4762ii>> f9936a = new LinkedList<>();

    /* renamed from: a */
    private static ExecutorService f9937a = Executors.newCachedThreadPool();

    /* renamed from: com.xiaomi.push.service.aa$a */
    private static class C4838a implements Callable<Bitmap> {

        /* renamed from: a */
        private Context f9938a;

        /* renamed from: a */
        private String f9939a;

        /* renamed from: a */
        private boolean f9940a;

        public C4838a(String str, Context context, boolean z) {
            this.f9938a = context;
            this.f9939a = str;
            this.f9940a = z;
        }

        /* renamed from: a */
        public Bitmap call() {
            Bitmap bitmap = null;
            if (!TextUtils.isEmpty(this.f9939a)) {
                if (this.f9939a.startsWith("http")) {
                    C4850ai.C4852b a = C4850ai.m15560a(this.f9938a, this.f9939a, this.f9940a);
                    if (a != null) {
                        return a.f9965a;
                    }
                } else {
                    bitmap = C4850ai.m15558a(this.f9938a, this.f9939a);
                    if (bitmap != null) {
                        return bitmap;
                    }
                }
                C3989b.m10669a("Failed get online picture/icon resource");
                return bitmap;
            }
            C3989b.m10669a("Failed get online picture/icon resource cause picUrl is empty");
            return null;
        }
    }

    /* renamed from: com.xiaomi.push.service.aa$b */
    public static class C4839b {

        /* renamed from: a */
        long f9941a = 0;

        /* renamed from: a */
        Notification f9942a;
    }

    /* renamed from: com.xiaomi.push.service.aa$c */
    public static class C4840c {

        /* renamed from: a */
        public long f9943a = 0;

        /* renamed from: a */
        public String f9944a;
    }

    /* renamed from: a */
    static int m15488a(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    /* renamed from: a */
    private static int m15489a(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    /* renamed from: a */
    private static int m15490a(Map<String, String> map) {
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

    @TargetApi(16)
    /* renamed from: a */
    private static Notification.Builder m15491a(Notification.Builder builder, Context context, String str, Map<String, String> map) {
        PendingIntent a = m15496a(context, str, 1, map);
        if (a != null && !TextUtils.isEmpty(map.get("notification_style_button_left_name"))) {
            builder.addAction(0, map.get("notification_style_button_left_name"), a);
        }
        PendingIntent a2 = m15496a(context, str, 2, map);
        if (a2 != null && !TextUtils.isEmpty(map.get("notification_style_button_mid_name"))) {
            builder.addAction(0, map.get("notification_style_button_mid_name"), a2);
        }
        PendingIntent a3 = m15496a(context, str, 3, map);
        if (a3 != null && !TextUtils.isEmpty(map.get("notification_style_button_right_name"))) {
            builder.addAction(0, map.get("notification_style_button_right_name"), a3);
        }
        return builder;
    }

    @TargetApi(16)
    /* renamed from: a */
    private static Notification.Builder m15492a(Context context, Map<String, String> map, Notification.Builder builder, String str) {
        if ("2".equals(map.get("notification_style_type"))) {
            Bitmap a = map == null ? null : m15499a(context, map.get("notification_bigPic_uri"), false);
            if (a == null) {
                C3989b.m10669a("can not get big picture.");
                return builder;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(builder);
            bigPictureStyle.bigPicture(a);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            builder.setStyle(bigPictureStyle);
        } else if (TimerCodec.ENABLE.equals(map.get("notification_style_type"))) {
            builder.setStyle(new Notification.BigTextStyle().bigText(str));
        }
        return builder;
    }

    /* renamed from: a */
    private static Notification m15493a(Notification notification) {
        Object a = C4525ba.m13402a((Object) notification, "extraNotification");
        if (a != null) {
            C4525ba.m13403a(a, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    /* renamed from: a */
    private static Notification m15494a(Notification notification, String str) {
        try {
            Field declaredField = Notification.class.getDeclaredField("extraNotification");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(notification);
            Method declaredMethod = obj.getClass().getDeclaredMethod("setTargetPkg", new Class[]{CharSequence.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(obj, new Object[]{str});
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
        return notification;
    }

    /* renamed from: a */
    private static PendingIntent m15495a(Context context, C4762ii iiVar, C4752hz hzVar, byte[] bArr, int i) {
        ComponentName componentName;
        Intent intent;
        Context context2 = context;
        C4762ii iiVar2 = iiVar;
        C4752hz hzVar2 = hzVar;
        byte[] bArr2 = bArr;
        int i2 = m15526c(iiVar) ? 1000 : m15505a(iiVar) ? PathInterpolatorCompat.MAX_NUM_POINTS : -1;
        String a = hzVar2 != null ? hzVar.mo25361a() : "";
        if (hzVar2 == null || TextUtils.isEmpty(hzVar2.f9334e)) {
            if (m15505a(iiVar)) {
                intent = new Intent();
                componentName = new ComponentName("com.xiaomi.xmsf", "com.xiaomi.mipush.sdk.PushMessageHandler");
            } else {
                intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
                componentName = new ComponentName(iiVar2.f9495b, "com.xiaomi.mipush.sdk.PushMessageHandler");
            }
            intent.setComponent(componentName);
            intent.putExtra("mipush_payload", bArr2);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i));
            intent.addCategory(String.valueOf(a));
            intent.putExtra("messageId", a);
            intent.putExtra("eventMessageType", i2);
            if (!C4909f.m15744b(context2, iiVar2.f9495b, "com.xiaomi.mipush.MESSAGE_CLICKED")) {
                return PendingIntent.getService(context2, 0, intent, 134217728);
            }
            Intent intent2 = new Intent();
            intent2.setAction("com.xiaomi.mipush.MESSAGE_CLICKED");
            intent2.setClassName(iiVar2.f9495b, "com.xiaomi.mipush.sdk.BridgeActivity");
            intent2.addFlags(276824064);
            intent2.putExtra("mipush_serviceIntent", intent);
            intent2.addCategory(String.valueOf(i));
            intent2.addCategory(String.valueOf(a));
            return PendingIntent.getActivity(context2, 0, intent2, 134217728);
        }
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setData(Uri.parse(hzVar2.f9334e));
        intent3.addFlags(268435456);
        intent3.putExtra("messageId", a);
        intent3.putExtra("eventMessageType", i2);
        return PendingIntent.getActivity(context2, 0, intent3, 134217728);
    }

    /* renamed from: a */
    private static PendingIntent m15496a(Context context, String str, int i, Map<String, String> map) {
        Intent a;
        if (map == null || (a = m15496a(context, str, i, map)) == null) {
            return null;
        }
        return PendingIntent.getActivity(context, 0, a, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x013f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m15497a(android.content.Context r6, java.lang.String r7, int r8, java.util.Map<java.lang.String, java.lang.String> r9) {
        /*
            r0 = 3
            r1 = 2
            if (r8 >= r1) goto L_0x0007
            java.lang.String r2 = "notification_style_button_left_notify_effect"
            goto L_0x000e
        L_0x0007:
            if (r8 >= r0) goto L_0x000c
            java.lang.String r2 = "notification_style_button_mid_notify_effect"
            goto L_0x000e
        L_0x000c:
            java.lang.String r2 = "notification_style_button_right_notify_effect"
        L_0x000e:
            java.lang.Object r2 = r9.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 == 0) goto L_0x001c
            return r4
        L_0x001c:
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10026a
            boolean r3 = r3.equals(r2)
            java.lang.String r5 = "Cause: "
            if (r3 == 0) goto L_0x0049
            android.content.pm.PackageManager r8 = r6.getPackageManager()     // Catch:{ Exception -> 0x0030 }
            android.content.Intent r7 = r8.getLaunchIntentForPackage(r7)     // Catch:{ Exception -> 0x0030 }
            goto L_0x013d
        L_0x0030:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r7)
            goto L_0x013c
        L_0x0049:
            java.lang.String r3 = com.xiaomi.push.service.C4870at.f10027b
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x00b2
            if (r8 >= r1) goto L_0x0056
            java.lang.String r2 = "notification_style_button_left_intent_uri"
            goto L_0x005d
        L_0x0056:
            if (r8 >= r0) goto L_0x005b
            java.lang.String r2 = "notification_style_button_mid_intent_uri"
            goto L_0x005d
        L_0x005b:
            java.lang.String r2 = "notification_style_button_right_intent_uri"
        L_0x005d:
            if (r8 >= r1) goto L_0x0062
            java.lang.String r8 = "notification_style_button_left_intent_class"
            goto L_0x0069
        L_0x0062:
            if (r8 >= r0) goto L_0x0067
            java.lang.String r8 = "notification_style_button_mid_intent_class"
            goto L_0x0069
        L_0x0067:
            java.lang.String r8 = "notification_style_button_right_intent_class"
        L_0x0069:
            boolean r0 = r9.containsKey(r2)
            if (r0 == 0) goto L_0x0096
            java.lang.Object r8 = r9.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x0093
            r9 = 1
            android.content.Intent r8 = android.content.Intent.parseUri(r8, r9)     // Catch:{ URISyntaxException -> 0x0083 }
            r8.setPackage(r7)     // Catch:{ URISyntaxException -> 0x0081 }
            goto L_0x013a
        L_0x0081:
            r7 = move-exception
            goto L_0x0085
        L_0x0083:
            r7 = move-exception
            r8 = r4
        L_0x0085:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r7 = r7.getMessage()
            goto L_0x0130
        L_0x0093:
            r8 = r4
            goto L_0x013a
        L_0x0096:
            boolean r0 = r9.containsKey(r8)
            if (r0 == 0) goto L_0x013c
            java.lang.Object r8 = r9.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            android.content.Intent r9 = new android.content.Intent
            r9.<init>()
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r7, r8)
            r9.setComponent(r0)
            r7 = r9
            goto L_0x013d
        L_0x00b2:
            java.lang.String r7 = com.xiaomi.push.service.C4870at.f10028c
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x013c
            if (r8 >= r1) goto L_0x00bf
            java.lang.String r7 = "notification_style_button_left_web_uri"
            goto L_0x00c6
        L_0x00bf:
            if (r8 >= r0) goto L_0x00c4
            java.lang.String r7 = "notification_style_button_mid_web_uri"
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r7 = "notification_style_button_right_web_uri"
        L_0x00c6:
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x013c
            java.lang.String r7 = r7.trim()
            java.lang.String r8 = "http://"
            boolean r9 = r7.startsWith(r8)
            if (r9 != 0) goto L_0x00f5
            java.lang.String r9 = "https://"
            boolean r9 = r7.startsWith(r9)
            if (r9 != 0) goto L_0x00f5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
        L_0x00f5:
            java.net.URL r8 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0122 }
            r8.<init>(r7)     // Catch:{ MalformedURLException -> 0x0122 }
            java.lang.String r8 = r8.getProtocol()     // Catch:{ MalformedURLException -> 0x0122 }
            java.lang.String r9 = "http"
            boolean r9 = r9.equals(r8)     // Catch:{ MalformedURLException -> 0x0122 }
            if (r9 != 0) goto L_0x010e
            java.lang.String r9 = "https"
            boolean r8 = r9.equals(r8)     // Catch:{ MalformedURLException -> 0x0122 }
            if (r8 == 0) goto L_0x013c
        L_0x010e:
            android.content.Intent r8 = new android.content.Intent     // Catch:{ MalformedURLException -> 0x0122 }
            java.lang.String r9 = "android.intent.action.VIEW"
            r8.<init>(r9)     // Catch:{ MalformedURLException -> 0x0122 }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ MalformedURLException -> 0x0120 }
            r8.setData(r7)     // Catch:{ MalformedURLException -> 0x0120 }
            com.xiaomi.push.service.C4853aj.m15567a((android.content.Context) r6, (android.content.Intent) r8)     // Catch:{ MalformedURLException -> 0x0120 }
            goto L_0x013a
        L_0x0120:
            r7 = move-exception
            goto L_0x0124
        L_0x0122:
            r7 = move-exception
            r8 = r4
        L_0x0124:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            java.lang.String r7 = r7.getMessage()
        L_0x0130:
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r7)
        L_0x013a:
            r7 = r8
            goto L_0x013d
        L_0x013c:
            r7 = r4
        L_0x013d:
            if (r7 == 0) goto L_0x0168
            r8 = 268435456(0x10000000, float:2.5243549E-29)
            r7.addFlags(r8)
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch:{ Exception -> 0x0151 }
            r8 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r6 = r6.resolveActivity(r7, r8)     // Catch:{ Exception -> 0x0151 }
            if (r6 == 0) goto L_0x0168
            return r7
        L_0x0151:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r6)
        L_0x0168:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4837aa.m15497a(android.content.Context, java.lang.String, int, java.util.Map):android.content.Intent");
    }

    /* renamed from: a */
    private static Bitmap m15498a(Context context, int i) {
        return m15500a(context.getResources().getDrawable(i));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static Bitmap m15499a(Context context, String str, boolean z) {
        Future submit = f9937a.submit(new C4838a(str, context, z));
        try {
            Bitmap bitmap = (Bitmap) submit.get(180, TimeUnit.SECONDS);
            if (bitmap != null) {
                return bitmap;
            }
            submit.cancel(true);
            return bitmap;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            C3989b.m10678a(e);
            submit.cancel(true);
            return null;
        } catch (Throwable th) {
            submit.cancel(true);
            throw th;
        }
    }

    /* renamed from: a */
    public static Bitmap m15500a(Drawable drawable) {
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
    private static RemoteViews m15501a(Context context, C4762ii iiVar, byte[] bArr) {
        C4752hz a = iiVar.mo25521a();
        String a2 = m15505a(iiVar);
        Map a3 = a.mo25361a();
        if (a3 == null) {
            return null;
        }
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
                    C3989b.m10678a((Throwable) e);
                    return null;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                C3989b.m10678a((Throwable) e2);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0117 A[SYNTHETIC, Splitter:B:45:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01fb  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.xiaomi.push.service.C4837aa.C4839b m15502a(android.content.Context r25, com.xiaomi.push.C4762ii r26, byte[] r27, android.widget.RemoteViews r28, android.app.PendingIntent r29) {
        /*
            r1 = r25
            r0 = r28
            com.xiaomi.push.service.aa$b r2 = new com.xiaomi.push.service.aa$b
            r2.<init>()
            com.xiaomi.push.hz r3 = r26.mo25521a()
            java.lang.String r4 = m15505a((com.xiaomi.push.C4762ii) r26)
            java.util.Map r5 = r3.mo25361a()
            android.app.Notification$Builder r6 = new android.app.Notification$Builder
            r6.<init>(r1)
            java.lang.String[] r7 = m15517a((android.content.Context) r1, (com.xiaomi.push.C4752hz) r3)
            r8 = 0
            r9 = r7[r8]
            r6.setContentTitle(r9)
            r9 = 1
            r10 = r7[r9]
            r6.setContentText(r10)
            r10 = 16
            if (r0 == 0) goto L_0x0032
            r6.setContent(r0)
            goto L_0x0046
        L_0x0032:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x0046
            if (r5 == 0) goto L_0x0046
            java.lang.String r0 = "notification_style_type"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0046
            r0 = r7[r9]
            android.app.Notification$Builder r6 = m15492a((android.content.Context) r1, (java.util.Map<java.lang.String, java.lang.String>) r5, (android.app.Notification.Builder) r6, (java.lang.String) r0)
        L_0x0046:
            java.lang.String r0 = r26.mo25530b()
            android.app.Notification$Builder r6 = m15491a((android.app.Notification.Builder) r6, (android.content.Context) r1, (java.lang.String) r0, (java.util.Map<java.lang.String, java.lang.String>) r5)
            long r11 = java.lang.System.currentTimeMillis()
            r6.setWhen(r11)
            if (r5 != 0) goto L_0x0059
            r0 = 0
            goto L_0x0061
        L_0x0059:
            java.lang.String r0 = "notification_show_when"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0061:
            boolean r13 = android.text.TextUtils.isEmpty(r0)
            r14 = 24
            if (r13 == 0) goto L_0x0071
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r14) goto L_0x0078
            r6.setShowWhen(r9)
            goto L_0x0078
        L_0x0071:
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r6.setShowWhen(r0)
        L_0x0078:
            r0 = r29
            r6.setContentIntent(r0)
            java.lang.String r0 = "mipush_notification"
            int r0 = m15489a((android.content.Context) r1, (java.lang.String) r4, (java.lang.String) r0)
            java.lang.String r13 = "mipush_small_notification"
            int r13 = m15489a((android.content.Context) r1, (java.lang.String) r4, (java.lang.String) r13)
            if (r0 <= 0) goto L_0x0098
            if (r13 <= 0) goto L_0x0098
            android.graphics.Bitmap r0 = m15498a((android.content.Context) r1, (int) r0)
            r6.setLargeIcon(r0)
            r6.setSmallIcon(r13)
            goto L_0x009f
        L_0x0098:
            int r0 = m15518b((android.content.Context) r1, (java.lang.String) r4)
            r6.setSmallIcon(r0)
        L_0x009f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 23
            if (r0 < r13) goto L_0x012d
            java.lang.String r0 = "notification_small_icon_uri"
            if (r5 != 0) goto L_0x00ab
            r13 = 0
            goto L_0x00b5
        L_0x00ab:
            java.lang.Object r13 = r5.get(r0)
            java.lang.String r13 = (java.lang.String) r13
            android.graphics.Bitmap r13 = m15499a((android.content.Context) r1, (java.lang.String) r13, (boolean) r9)
        L_0x00b5:
            if (r13 == 0) goto L_0x00f7
            java.lang.Object[] r15 = new java.lang.Object[r9]
            r15[r8] = r13
            java.lang.String r13 = "android.graphics.drawable.Icon"
            java.lang.String r10 = "createWithBitmap"
            java.lang.Object r10 = com.xiaomi.push.C4525ba.m13405a((java.lang.String) r13, (java.lang.String) r10, (java.lang.Object[]) r15)
            if (r10 == 0) goto L_0x00dc
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r10
            java.lang.String r10 = "setSmallIcon"
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r10, (java.lang.Object[]) r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r10 = "miui.isGrayscaleIcon"
            r0.putBoolean(r10, r9)
            r6.addExtras(r0)
            goto L_0x0105
        L_0x00dc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "failed te get small icon with url:"
            r10.append(r13)
        L_0x00e6:
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x00ec:
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            goto L_0x0105
        L_0x00f7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "failed to get small icon url:"
            r10.append(r13)
            if (r5 != 0) goto L_0x00e6
            r0 = 0
            goto L_0x00ec
        L_0x0105:
            if (r5 != 0) goto L_0x0109
            r0 = 0
            goto L_0x0111
        L_0x0109:
            java.lang.String r0 = "notification_small_icon_color"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0111:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x012d
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x0129 }
            java.lang.String r10 = "setColor"
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0129 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0129 }
            r13[r8] = r0     // Catch:{ Exception -> 0x0129 }
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r10, (java.lang.Object[]) r13)     // Catch:{ Exception -> 0x0129 }
            goto L_0x012d
        L_0x0129:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
        L_0x012d:
            if (r5 != 0) goto L_0x0131
            r0 = 0
            goto L_0x0139
        L_0x0131:
            java.lang.String r0 = "__dynamic_icon_uri"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0139:
            if (r5 == 0) goto L_0x014b
            java.lang.String r10 = "__adiom"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            if (r10 == 0) goto L_0x014b
            r10 = 1
            goto L_0x014c
        L_0x014b:
            r10 = 0
        L_0x014c:
            if (r10 != 0) goto L_0x0157
            boolean r10 = com.xiaomi.push.C4808l.m15356a()
            if (r10 != 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r10 = 0
            goto L_0x0158
        L_0x0157:
            r10 = 1
        L_0x0158:
            if (r0 == 0) goto L_0x017e
            if (r10 == 0) goto L_0x017e
            java.lang.String r10 = "http"
            boolean r10 = r0.startsWith(r10)
            if (r10 == 0) goto L_0x0173
            com.xiaomi.push.service.ai$b r0 = com.xiaomi.push.service.C4850ai.m15560a((android.content.Context) r1, (java.lang.String) r0, (boolean) r9)
            if (r0 == 0) goto L_0x0171
            android.graphics.Bitmap r10 = r0.f9965a
            long r7 = r0.f9964a
            r2.f9941a = r7
            goto L_0x0177
        L_0x0171:
            r10 = 0
            goto L_0x0177
        L_0x0173:
            android.graphics.Bitmap r10 = com.xiaomi.push.service.C4850ai.m15558a((android.content.Context) r1, (java.lang.String) r0)
        L_0x0177:
            if (r10 == 0) goto L_0x017e
            r6.setLargeIcon(r10)
            r7 = 1
            goto L_0x017f
        L_0x017e:
            r7 = 0
        L_0x017f:
            if (r5 != 0) goto L_0x0183
            r0 = 0
            goto L_0x018f
        L_0x0183:
            java.lang.String r0 = "notification_large_icon_uri"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.graphics.Bitmap r0 = m15499a((android.content.Context) r1, (java.lang.String) r0, (boolean) r9)
        L_0x018f:
            if (r0 == 0) goto L_0x0194
            r6.setLargeIcon(r0)
        L_0x0194:
            java.lang.String r0 = "setGroup"
            if (r5 == 0) goto L_0x01d7
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r14) goto L_0x01d7
            java.lang.String r8 = "notification_group"
            java.lang.Object r8 = r5.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r10 = "notification_is_summary"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = java.lang.Boolean.parseBoolean(r10)
            boolean r14 = android.text.TextUtils.isEmpty(r8)
            if (r14 == 0) goto L_0x01ba
            java.lang.String r8 = m15505a((com.xiaomi.push.C4762ii) r26)
        L_0x01ba:
            com.xiaomi.push.service.ag r14 = com.xiaomi.push.service.C4846ag.m15541a()
            java.lang.String r8 = r14.mo25903a((android.content.Context) r1, (android.app.Notification.Builder) r6, (java.lang.String) r8)
            java.lang.Object[] r14 = new java.lang.Object[r9]
            r13 = 0
            r14[r13] = r8
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r0, (java.lang.Object[]) r14)
            java.lang.Object[] r8 = new java.lang.Object[r9]
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r8[r13] = r10
            java.lang.String r10 = "setGroupSummary"
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r10, (java.lang.Object[]) r8)
        L_0x01d7:
            r6.setAutoCancel(r9)
            long r14 = java.lang.System.currentTimeMillis()
            if (r5 == 0) goto L_0x01f1
            java.lang.String r8 = "ticker"
            boolean r10 = r5.containsKey(r8)
            if (r10 == 0) goto L_0x01f1
            java.lang.Object r8 = r5.get(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r6.setTicker(r8)
        L_0x01f1:
            long r16 = f9935a
            long r16 = r14 - r16
            r18 = 10000(0x2710, double:4.9407E-320)
            int r10 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r10 <= 0) goto L_0x0244
            f9935a = r14
            int r3 = r3.f9321a
            boolean r10 = m15518b((android.content.Context) r1, (java.lang.String) r4)
            if (r10 == 0) goto L_0x0209
            int r3 = m15488a((android.content.Context) r1, (java.lang.String) r4)
        L_0x0209:
            r6.setDefaults(r3)
            if (r5 == 0) goto L_0x0246
            r10 = r3 & 1
            if (r10 == 0) goto L_0x0246
            java.lang.String r10 = "sound_uri"
            java.lang.Object r10 = r5.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            boolean r14 = android.text.TextUtils.isEmpty(r10)
            if (r14 != 0) goto L_0x0246
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "android.resource://"
            r14.append(r15)
            r14.append(r4)
            java.lang.String r14 = r14.toString()
            boolean r14 = r10.startsWith(r14)
            if (r14 == 0) goto L_0x0246
            r14 = r3 ^ 1
            r6.setDefaults(r14)
            android.net.Uri r10 = android.net.Uri.parse(r10)
            r6.setSound(r10)
            goto L_0x0247
        L_0x0244:
            r3 = -100
        L_0x0246:
            r10 = 0
        L_0x0247:
            java.lang.String r14 = "_top_"
            java.lang.String r15 = "com.xiaomi.xmsf"
            r8 = 26
            if (r5 == 0) goto L_0x04bc
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r8) goto L_0x04bc
            int r13 = m15490a((java.util.Map<java.lang.String, java.lang.String>) r5)
            java.lang.String r8 = "setTimeoutAfter"
            r20 = r2
            if (r13 <= 0) goto L_0x026f
            java.lang.Object[] r2 = new java.lang.Object[r9]
            int r13 = r13 * 1000
            r22 = r10
            long r9 = (long) r13
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 0
            r2[r10] = r9
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r8, (java.lang.Object[]) r2)
            goto L_0x0271
        L_0x026f:
            r22 = r10
        L_0x0271:
            java.lang.String r2 = "channel_id"
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r10 = android.text.TextUtils.isEmpty(r2)
            if (r10 == 0) goto L_0x028e
            android.content.pm.ApplicationInfo r10 = r25.getApplicationInfo()
            int r10 = r10.targetSdkVersion
            r13 = 26
            if (r10 < r13) goto L_0x028a
            goto L_0x028e
        L_0x028a:
            r23 = r7
            goto L_0x0491
        L_0x028e:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r13 = "mipush_"
            r10.append(r13)
            r10.append(r4)
            java.lang.String r9 = "_default"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            boolean r10 = android.text.TextUtils.isEmpty(r2)
            if (r10 == 0) goto L_0x02ae
            r23 = r7
            r2 = r9
            goto L_0x02d0
        L_0x02ae:
            boolean r10 = com.xiaomi.push.C4808l.m15356a()
            if (r10 == 0) goto L_0x02ce
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r13)
            r10.append(r4)
            r23 = r7
            java.lang.String r7 = "_"
            r10.append(r7)
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            goto L_0x02d0
        L_0x02ce:
            r23 = r7
        L_0x02d0:
            r7 = 1
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r7 = 0
            r10[r7] = r2
            java.lang.String r7 = "setChannelId"
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r7, (java.lang.Object[]) r10)
            java.lang.String r7 = m15504a((android.content.Context) r1, (java.lang.String) r4, (java.util.Map<java.lang.String, java.lang.String>) r5)
            int r10 = m15519b((java.util.Map<java.lang.String, java.lang.String>) r5)
            r27 = r9
            r9 = 4
            if (r10 < r9) goto L_0x0353
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r24 = r13
            java.lang.String r13 = m15505a((com.xiaomi.push.C4762ii) r26)
            r9.append(r13)
            r9.append(r14)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r21 = 0
            r14[r21] = r9
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r0, (java.lang.Object[]) r14)
            java.lang.String r0 = r25.getPackageName()
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0355
            com.xiaomi.push.service.ak r0 = com.xiaomi.push.service.C4854ak.m15568a((android.content.Context) r25)
            com.xiaomi.push.hr r14 = com.xiaomi.push.C4744hr.TopNotificationUpdateSwitch
            int r14 = r14.mo25291a()
            boolean r0 = r0.mo25911a((int) r14, (boolean) r13)
            if (r0 == 0) goto L_0x0355
            com.xiaomi.push.service.ak r0 = com.xiaomi.push.service.C4854ak.m15568a((android.content.Context) r25)
            com.xiaomi.push.hr r14 = com.xiaomi.push.C4744hr.TopNotificationUpdateFrequency
            int r14 = r14.mo25291a()
            r9 = 14400(0x3840, float:2.0179E-41)
            int r0 = r0.mo25906a((int) r14, (int) r9)
            if (r0 <= 0) goto L_0x0355
            java.lang.Object[] r9 = new java.lang.Object[r13]
            int r0 = r0 * 1000
            long r13 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r13 = 0
            r9[r13] = r0
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r8, (java.lang.Object[]) r9)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r8 = "mipush_org_when"
            r0.putLong(r8, r11)
            r6.addExtras(r0)
            goto L_0x0355
        L_0x0353:
            r24 = r13
        L_0x0355:
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r8 = "getNotificationChannel"
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x048d }
            r9 = 0
            r11[r9] = r2     // Catch:{ Exception -> 0x048d }
            java.lang.Object r8 = com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r0, (java.lang.String) r8, (java.lang.Object[]) r11)     // Catch:{ Exception -> 0x048d }
            if (r8 != 0) goto L_0x0406
            java.lang.String r8 = "android.app.NotificationChannel"
            java.lang.Class r8 = com.xiaomi.push.C4937t.m15867a(r1, r8)     // Catch:{ Exception -> 0x048d }
            r11 = 3
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x048d }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r9 = 0
            r12[r9] = r11     // Catch:{ Exception -> 0x048d }
            java.lang.Class<java.lang.CharSequence> r11 = java.lang.CharSequence.class
            r13 = 1
            r12[r13] = r11     // Catch:{ Exception -> 0x048d }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x048d }
            r13 = 2
            r12[r13] = r11     // Catch:{ Exception -> 0x048d }
            java.lang.reflect.Constructor r8 = r8.getConstructor(r12)     // Catch:{ Exception -> 0x048d }
            r11 = 3
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x048d }
            r9 = 0
            r12[r9] = r2     // Catch:{ Exception -> 0x048d }
            r9 = 1
            r12[r9] = r7     // Catch:{ Exception -> 0x048d }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x048d }
            r9 = 2
            r12[r9] = r7     // Catch:{ Exception -> 0x048d }
            java.lang.Object r7 = r8.newInstance(r12)     // Catch:{ Exception -> 0x048d }
            r8 = -100
            if (r3 <= r8) goto L_0x03f8
            r8 = 0
            r6.setSound(r8, r8)     // Catch:{ Exception -> 0x048d }
            r2 = 0
            r6.setDefaults(r2)     // Catch:{ Exception -> 0x048d }
            r8 = r3 & 1
            r9 = r3 & 2
            r10 = 4
            r3 = r3 & r10
            java.lang.String r10 = "setSound"
            r11 = 1
            if (r8 == r11) goto L_0x03be
            r8 = 2
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x048d }
            r2 = 0
            r8 = 0
            r12[r8] = r2     // Catch:{ Exception -> 0x048d }
            r12[r11] = r2     // Catch:{ Exception -> 0x048d }
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r7, (java.lang.String) r10, (java.lang.Object[]) r12)     // Catch:{ Exception -> 0x048d }
        L_0x03be:
            if (r22 == 0) goto L_0x03ce
            r2 = 2
            java.lang.Object[] r11 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x048d }
            r2 = 0
            r11[r2] = r22     // Catch:{ Exception -> 0x048d }
            android.media.AudioAttributes r8 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT     // Catch:{ Exception -> 0x048d }
            r12 = 1
            r11[r12] = r8     // Catch:{ Exception -> 0x048d }
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r7, (java.lang.String) r10, (java.lang.Object[]) r11)     // Catch:{ Exception -> 0x048d }
        L_0x03ce:
            java.lang.String r8 = "enableVibration"
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x048d }
            r10 = 2
            if (r9 != r10) goto L_0x03d8
            r13 = 1
            goto L_0x03d9
        L_0x03d8:
            r13 = 0
        L_0x03d9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x048d }
            r2 = 0
            r11[r2] = r9     // Catch:{ Exception -> 0x048d }
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r7, (java.lang.String) r8, (java.lang.Object[]) r11)     // Catch:{ Exception -> 0x048d }
            java.lang.String r8 = "enableLights"
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x048d }
            r9 = 4
            if (r3 != r9) goto L_0x03ed
            r13 = 1
            goto L_0x03ee
        L_0x03ed:
            r13 = 0
        L_0x03ee:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x048d }
            r2 = 0
            r10[r2] = r3     // Catch:{ Exception -> 0x048d }
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r7, (java.lang.String) r8, (java.lang.Object[]) r10)     // Catch:{ Exception -> 0x048d }
        L_0x03f8:
            m15511a((java.lang.Object) r7, (java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ Exception -> 0x048d }
            java.lang.String r3 = "createNotificationChannel"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x048d }
            r2 = 0
            r9[r2] = r7     // Catch:{ Exception -> 0x048d }
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r0, (java.lang.String) r3, (java.lang.Object[]) r9)     // Catch:{ Exception -> 0x048d }
        L_0x0406:
            java.lang.String r3 = "getNotificationChannels"
            r2 = 0
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x048d }
            java.lang.Object r3 = com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r0, (java.lang.String) r3, (java.lang.Object[]) r7)     // Catch:{ Exception -> 0x048d }
            if (r3 == 0) goto L_0x0491
            boolean r7 = r3 instanceof java.util.List     // Catch:{ Exception -> 0x048d }
            if (r7 == 0) goto L_0x0491
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x048d }
            if (r3 == 0) goto L_0x0491
            int r7 = r3.size()     // Catch:{ Exception -> 0x048d }
            if (r7 <= 0) goto L_0x0491
            r13 = 0
        L_0x0420:
            int r7 = r3.size()     // Catch:{ Exception -> 0x048d }
            if (r13 >= r7) goto L_0x0491
            java.lang.Object r7 = r3.get(r13)     // Catch:{ Exception -> 0x048d }
            java.lang.String r8 = "getName"
            r2 = 0
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x048d }
            java.lang.Object r8 = com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r7, (java.lang.String) r8, (java.lang.Object[]) r9)     // Catch:{ Exception -> 0x048d }
            java.lang.String r9 = "getId"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x048d }
            java.lang.Object r7 = com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r7, (java.lang.String) r9, (java.lang.Object[]) r10)     // Catch:{ Exception -> 0x048d }
            java.lang.String r9 = com.xiaomi.push.C4689g.m14357b((android.content.Context) r1, (java.lang.String) r4)     // Catch:{ Exception -> 0x048d }
            if (r8 == 0) goto L_0x0482
            if (r7 == 0) goto L_0x0482
            boolean r10 = r8 instanceof java.lang.CharSequence     // Catch:{ Exception -> 0x048d }
            if (r10 == 0) goto L_0x0482
            boolean r10 = r7 instanceof java.lang.String     // Catch:{ Exception -> 0x048d }
            if (r10 == 0) goto L_0x0482
            boolean r8 = r8.equals(r9)     // Catch:{ Exception -> 0x048d }
            if (r8 == 0) goto L_0x0482
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x048d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x048d }
            r9.<init>()     // Catch:{ Exception -> 0x048d }
            r10 = r24
            r9.append(r10)     // Catch:{ Exception -> 0x048d }
            r9.append(r4)     // Catch:{ Exception -> 0x048d }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x048d }
            boolean r8 = r8.startsWith(r9)     // Catch:{ Exception -> 0x048d }
            if (r8 == 0) goto L_0x047f
            r8 = r27
            boolean r9 = r7.equals(r8)     // Catch:{ Exception -> 0x048d }
            if (r9 != 0) goto L_0x0486
            java.lang.String r9 = "deleteNotificationChannel"
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x048d }
            r2 = 0
            r12[r2] = r7     // Catch:{ Exception -> 0x048d }
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r0, (java.lang.String) r9, (java.lang.Object[]) r12)     // Catch:{ Exception -> 0x048d }
            goto L_0x0486
        L_0x047f:
            r8 = r27
            goto L_0x0486
        L_0x0482:
            r8 = r27
            r10 = r24
        L_0x0486:
            int r13 = r13 + 1
            r27 = r8
            r24 = r10
            goto L_0x0420
        L_0x048d:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
        L_0x0491:
            java.lang.String r0 = "background_color"
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x04ff
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x04b7 }
            r3 = 1
            r6.setOngoing(r3)     // Catch:{ Exception -> 0x04b7 }
            r6.setColor(r0)     // Catch:{ Exception -> 0x04b7 }
            java.lang.String r0 = "setColorized"
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x04b7 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x04b7 }
            r2 = 0
            r4[r2] = r3     // Catch:{ Exception -> 0x04b7 }
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r0, (java.lang.Object[]) r4)     // Catch:{ Exception -> 0x04b7 }
            goto L_0x04ff
        L_0x04b7:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
            goto L_0x04ff
        L_0x04bc:
            r20 = r2
            r23 = r7
            if (r5 == 0) goto L_0x04ff
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r3 < r4) goto L_0x04ff
            r4 = 26
            if (r3 >= r4) goto L_0x04ff
            int r3 = m15525c((java.util.Map<java.lang.String, java.lang.String>) r5)
            r4 = 1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            r2 = 0
            r7[r2] = r8
            java.lang.String r8 = "setPriority"
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r8, (java.lang.Object[]) r7)
            if (r3 < r4) goto L_0x04ff
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = m15505a((com.xiaomi.push.C4762ii) r26)
            r3.append(r7)
            r3.append(r14)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r2 = 0
            r7[r2] = r3
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r6, (java.lang.String) r0, (java.lang.Object[]) r7)
        L_0x04ff:
            boolean r0 = com.xiaomi.push.C4808l.m15365c()
            if (r0 == 0) goto L_0x0526
            java.lang.String r0 = r25.getPackageName()
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0526
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r2 = 0
            r0[r2] = r1
            r2 = 1
            r0[r2] = r6
            java.lang.String r2 = m15505a((com.xiaomi.push.C4762ii) r26)
            r3 = 2
            r0[r3] = r2
            java.lang.String r2 = "miui.util.NotificationHelper"
            java.lang.String r3 = "setTargetPkg"
            com.xiaomi.push.C4525ba.m13405a((java.lang.String) r2, (java.lang.String) r3, (java.lang.Object[]) r0)
        L_0x0526:
            android.app.Notification r0 = r6.getNotification()
            if (r23 == 0) goto L_0x0535
            boolean r2 = com.xiaomi.push.C4808l.m15356a()
            if (r2 == 0) goto L_0x0535
            m15493a((android.app.Notification) r0)
        L_0x0535:
            if (r5 == 0) goto L_0x058d
            java.lang.String r2 = "extraNotification"
            java.lang.Object r2 = com.xiaomi.push.C4525ba.m13402a((java.lang.Object) r0, (java.lang.String) r2)
            if (r2 == 0) goto L_0x058d
            java.lang.String r3 = "enable_keyguard"
            java.lang.Object r4 = r5.get(r3)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0566
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1 = 0
            r6[r1] = r3
            java.lang.String r1 = "setEnableKeyguard"
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r2, (java.lang.String) r1, (java.lang.Object[]) r6)
        L_0x0566:
            java.lang.String r1 = "enable_float"
            java.lang.Object r3 = r5.get(r1)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x058d
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "setEnableFloat"
            com.xiaomi.push.C4525ba.m13403a((java.lang.Object) r2, (java.lang.String) r1, (java.lang.Object[]) r3)
        L_0x058d:
            r1 = r20
            r1.f9942a = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4837aa.m15502a(android.content.Context, com.xiaomi.push.ii, byte[], android.widget.RemoteViews, android.app.PendingIntent):com.xiaomi.push.service.aa$b");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.lang.String} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0273  */
    /* renamed from: a */
    public static com.xiaomi.push.service.C4837aa.C4840c m15503a(android.content.Context r19, com.xiaomi.push.C4762ii r20, byte[] r21) {
        /*
            r1 = r19
            r2 = r20
            r0 = r21
            com.xiaomi.push.service.aa$c r3 = new com.xiaomi.push.service.aa$c
            r3.<init>()
            java.lang.String r4 = m15505a((com.xiaomi.push.C4762ii) r20)
            com.xiaomi.push.g$a r4 = com.xiaomi.push.C4689g.m14350a((android.content.Context) r1, (java.lang.String) r4)
            com.xiaomi.push.g$a r5 = com.xiaomi.push.C4689g.C4690a.NOT_ALLOWED
            if (r4 != r5) goto L_0x0067
            com.xiaomi.push.hz r0 = r20.mo25521a()
            if (r0 == 0) goto L_0x0049
            android.content.Context r1 = r19.getApplicationContext()
            com.xiaomi.push.fb r1 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r1)
            java.lang.String r4 = r20.mo25530b()
            java.lang.String r5 = m15520b((com.xiaomi.push.C4762ii) r20)
            java.lang.String r0 = r0.mo25361a()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "10:"
            r6.append(r7)
            java.lang.String r7 = m15505a((com.xiaomi.push.C4762ii) r20)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r1.mo25063a((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r0, (java.lang.String) r6)
        L_0x0049:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Do not notify because user block "
            r0.append(r1)
            java.lang.String r1 = m15505a((com.xiaomi.push.C4762ii) r20)
            r0.append(r1)
            java.lang.String r1 = "‘s notification"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0063:
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)
            return r3
        L_0x0067:
            java.lang.String r4 = "notification"
            java.lang.Object r4 = r1.getSystemService(r4)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            com.xiaomi.push.hz r5 = r20.mo25521a()
            android.widget.RemoteViews r6 = m15501a((android.content.Context) r19, (com.xiaomi.push.C4762ii) r20, (byte[]) r21)
            r7 = 0
            if (r5 == 0) goto L_0x007f
            int r8 = r5.mo25373c()
            goto L_0x0080
        L_0x007f:
            r8 = 0
        L_0x0080:
            java.lang.String r9 = m15505a((com.xiaomi.push.C4762ii) r20)
            int r9 = r9.hashCode()
            int r9 = r9 / 10
            int r9 = r9 * 10
            int r9 = r9 + r8
            android.app.PendingIntent r8 = m15495a((android.content.Context) r1, (com.xiaomi.push.C4762ii) r2, (com.xiaomi.push.C4752hz) r5, (byte[]) r0, (int) r9)
            if (r8 != 0) goto L_0x00b1
            if (r5 == 0) goto L_0x00ae
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.fb r0 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            java.lang.String r1 = r20.mo25530b()
            java.lang.String r2 = m15520b((com.xiaomi.push.C4762ii) r20)
            java.lang.String r4 = r5.mo25361a()
            java.lang.String r5 = "11"
            r0.mo25063a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r4, (java.lang.String) r5)
        L_0x00ae:
            java.lang.String r0 = "The click PendingIntent is null. "
            goto L_0x0063
        L_0x00b1:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 11
            r12 = 0
            if (r10 < r11) goto L_0x00cb
            com.xiaomi.push.service.aa$b r0 = m15502a((android.content.Context) r1, (com.xiaomi.push.C4762ii) r2, (byte[]) r0, (android.widget.RemoteViews) r6, (android.app.PendingIntent) r8)
            long r6 = r0.f9941a
            r3.f9943a = r6
            java.lang.String r6 = m15505a((com.xiaomi.push.C4762ii) r20)
            r3.f9944a = r6
            android.app.Notification r0 = r0.f9942a
            r10 = r0
            goto L_0x0201
        L_0x00cb:
            android.app.Notification r10 = new android.app.Notification
            java.lang.String r0 = m15505a((com.xiaomi.push.C4762ii) r20)
            int r0 = m15518b((android.content.Context) r1, (java.lang.String) r0)
            long r13 = java.lang.System.currentTimeMillis()
            r10.<init>(r0, r12, r13)
            java.lang.String[] r0 = m15517a((android.content.Context) r1, (com.xiaomi.push.C4752hz) r5)
            r11 = 1
            java.lang.Class r13 = r10.getClass()     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            java.lang.String r14 = "setLatestEventInfo"
            r15 = 4
            java.lang.Class[] r12 = new java.lang.Class[r15]     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            java.lang.Class<android.content.Context> r16 = android.content.Context.class
            r12[r7] = r16     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            java.lang.Class<java.lang.CharSequence> r16 = java.lang.CharSequence.class
            r12[r11] = r16     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            java.lang.Class<java.lang.CharSequence> r16 = java.lang.CharSequence.class
            r17 = 2
            r12[r17] = r16     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            java.lang.Class<android.app.PendingIntent> r16 = android.app.PendingIntent.class
            r18 = 3
            r12[r18] = r16     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            java.lang.reflect.Method r12 = r13.getMethod(r14, r12)     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            java.lang.Object[] r13 = new java.lang.Object[r15]     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            r13[r7] = r1     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            r7 = r0[r7]     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            r13[r11] = r7     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            r0 = r0[r11]     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            r13[r17] = r0     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            r13[r18] = r8     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            r12.invoke(r10, r13)     // Catch:{ NoSuchMethodException -> 0x0162, IllegalAccessException -> 0x0148, IllegalArgumentException -> 0x012e, InvocationTargetException -> 0x0114 }
            goto L_0x0181
        L_0x0114:
            r0 = move-exception
            if (r5 == 0) goto L_0x017e
            android.content.Context r7 = r19.getApplicationContext()
            com.xiaomi.push.fb r7 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r7)
            java.lang.String r8 = r20.mo25530b()
            java.lang.String r12 = m15520b((com.xiaomi.push.C4762ii) r20)
            java.lang.String r13 = r5.mo25361a()
            java.lang.String r14 = "7"
            goto L_0x017b
        L_0x012e:
            r0 = move-exception
            if (r5 == 0) goto L_0x017e
            android.content.Context r7 = r19.getApplicationContext()
            com.xiaomi.push.fb r7 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r7)
            java.lang.String r8 = r20.mo25530b()
            java.lang.String r12 = m15520b((com.xiaomi.push.C4762ii) r20)
            java.lang.String r13 = r5.mo25361a()
            java.lang.String r14 = "6"
            goto L_0x017b
        L_0x0148:
            r0 = move-exception
            if (r5 == 0) goto L_0x017e
            android.content.Context r7 = r19.getApplicationContext()
            com.xiaomi.push.fb r7 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r7)
            java.lang.String r8 = r20.mo25530b()
            java.lang.String r12 = m15520b((com.xiaomi.push.C4762ii) r20)
            java.lang.String r13 = r5.mo25361a()
            java.lang.String r14 = "5"
            goto L_0x017b
        L_0x0162:
            r0 = move-exception
            if (r5 == 0) goto L_0x017e
            android.content.Context r7 = r19.getApplicationContext()
            com.xiaomi.push.fb r7 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r7)
            java.lang.String r8 = r20.mo25530b()
            java.lang.String r12 = m15520b((com.xiaomi.push.C4762ii) r20)
            java.lang.String r13 = r5.mo25361a()
            java.lang.String r14 = "4"
        L_0x017b:
            r7.mo25064b(r8, r12, r13, r14)
        L_0x017e:
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
        L_0x0181:
            java.util.Map r0 = r5.mo25361a()
            if (r0 == 0) goto L_0x0199
            java.lang.String r7 = "ticker"
            boolean r7 = r0.containsKey(r7)
            if (r7 == 0) goto L_0x0199
            java.lang.String r7 = "ticker"
            java.lang.Object r7 = r0.get(r7)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r10.tickerText = r7
        L_0x0199:
            long r7 = java.lang.System.currentTimeMillis()
            long r12 = f9935a
            long r12 = r7 - r12
            r14 = 10000(0x2710, double:4.9407E-320)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x01f7
            f9935a = r7
            int r7 = r5.f9321a
            java.lang.String r8 = m15505a((com.xiaomi.push.C4762ii) r20)
            boolean r8 = m15518b((android.content.Context) r1, (java.lang.String) r8)
            if (r8 == 0) goto L_0x01bd
            java.lang.String r7 = m15505a((com.xiaomi.push.C4762ii) r20)
            int r7 = m15488a((android.content.Context) r1, (java.lang.String) r7)
        L_0x01bd:
            r10.defaults = r7
            if (r0 == 0) goto L_0x01f7
            r8 = r7 & 1
            if (r8 == 0) goto L_0x01f7
            java.lang.String r8 = "sound_uri"
            java.lang.Object r0 = r0.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L_0x01f7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r12 = "android.resource://"
            r8.append(r12)
            java.lang.String r12 = m15505a((com.xiaomi.push.C4762ii) r20)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            boolean r8 = r0.startsWith(r8)
            if (r8 == 0) goto L_0x01f7
            r7 = r7 ^ r11
            r10.defaults = r7
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r10.sound = r0
        L_0x01f7:
            int r0 = r10.flags
            r0 = r0 | 16
            r10.flags = r0
            if (r6 == 0) goto L_0x0201
            r10.contentView = r6
        L_0x0201:
            boolean r0 = com.xiaomi.push.C4808l.m15356a()
            if (r0 == 0) goto L_0x026b
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 19
            if (r0 < r6) goto L_0x026b
            java.lang.String r0 = r5.mo25361a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0222
            android.os.Bundle r0 = r10.extras
            java.lang.String r6 = "message_id"
            java.lang.String r7 = r5.mo25361a()
            r0.putString(r6, r7)
        L_0x0222:
            java.util.Map r0 = r5.mo25368b()
            if (r0 != 0) goto L_0x022a
            r0 = 0
            goto L_0x0236
        L_0x022a:
            java.util.Map r0 = r5.mo25368b()
            java.lang.String r6 = "score_info"
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0236:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L_0x0243
            android.os.Bundle r6 = r10.extras
            java.lang.String r7 = "score_info"
            r6.putString(r7, r0)
        L_0x0243:
            r0 = -1
            boolean r6 = m15526c((com.xiaomi.push.C4762ii) r20)
            if (r6 == 0) goto L_0x024d
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0255
        L_0x024d:
            boolean r6 = m15505a((com.xiaomi.push.C4762ii) r20)
            if (r6 == 0) goto L_0x0255
            r0 = 3000(0xbb8, float:4.204E-42)
        L_0x0255:
            android.os.Bundle r6 = r10.extras
            java.lang.String r7 = "eventMessageType"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.putString(r7, r0)
            android.os.Bundle r0 = r10.extras
            java.lang.String r6 = "target_package"
            java.lang.String r7 = m15505a((com.xiaomi.push.C4762ii) r20)
            r0.putString(r6, r7)
        L_0x026b:
            java.util.Map r0 = r5.mo25361a()
            if (r0 != 0) goto L_0x0273
            r12 = 0
            goto L_0x0280
        L_0x0273:
            java.util.Map r0 = r5.mo25361a()
            java.lang.String r6 = "message_count"
            java.lang.Object r0 = r0.get(r6)
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
        L_0x0280:
            boolean r0 = com.xiaomi.push.C4808l.m15356a()
            if (r0 == 0) goto L_0x02af
            if (r12 == 0) goto L_0x02af
            int r0 = java.lang.Integer.parseInt(r12)     // Catch:{ NumberFormatException -> 0x0290 }
            m15506a((android.app.Notification) r10, (int) r0)     // Catch:{ NumberFormatException -> 0x0290 }
            goto L_0x02af
        L_0x0290:
            r0 = move-exception
            if (r5 == 0) goto L_0x02ac
            android.content.Context r6 = r19.getApplicationContext()
            com.xiaomi.push.fb r6 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r6)
            java.lang.String r7 = r20.mo25530b()
            java.lang.String r8 = m15520b((com.xiaomi.push.C4762ii) r20)
            java.lang.String r11 = r5.mo25361a()
            java.lang.String r12 = "8"
            r6.mo25064b(r7, r8, r11, r12)
        L_0x02ac:
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
        L_0x02af:
            boolean r0 = com.xiaomi.push.C4808l.m15365c()
            if (r0 != 0) goto L_0x02c8
            java.lang.String r0 = "com.xiaomi.xmsf"
            java.lang.String r6 = r19.getPackageName()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x02c8
            java.lang.String r0 = m15505a((com.xiaomi.push.C4762ii) r20)
            m15494a((android.app.Notification) r10, (java.lang.String) r0)
        L_0x02c8:
            r4.notify(r9, r10)
            boolean r0 = com.xiaomi.push.C4808l.m15356a()
            if (r0 == 0) goto L_0x02e4
            java.lang.String r0 = "com.xiaomi.xmsf"
            java.lang.String r6 = r19.getPackageName()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x02e4
            com.xiaomi.push.service.ag r0 = com.xiaomi.push.service.C4846ag.m15541a()
            r0.mo25904a((android.content.Context) r1, (int) r9, (android.app.Notification) r10)
        L_0x02e4:
            boolean r0 = m15505a((com.xiaomi.push.C4762ii) r20)
            if (r0 == 0) goto L_0x0304
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.fb r10 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            java.lang.String r11 = r20.mo25530b()
            java.lang.String r12 = m15520b((com.xiaomi.push.C4762ii) r20)
            java.lang.String r13 = r5.mo25361a()
            r14 = 3002(0xbba, float:4.207E-42)
            r15 = 0
            r10.mo25062a(r11, r12, r13, r14, r15)
        L_0x0304:
            boolean r0 = m15526c((com.xiaomi.push.C4762ii) r20)
            if (r0 == 0) goto L_0x0324
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.fb r10 = com.xiaomi.push.C4662fb.m14151a((android.content.Context) r0)
            java.lang.String r11 = r20.mo25530b()
            java.lang.String r12 = m15520b((com.xiaomi.push.C4762ii) r20)
            java.lang.String r13 = r5.mo25361a()
            r14 = 1002(0x3ea, float:1.404E-42)
            r15 = 0
            r10.mo25062a(r11, r12, r13, r14, r15)
        L_0x0324:
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r0 >= r6) goto L_0x0343
            com.xiaomi.push.ai r0 = com.xiaomi.push.C4498ai.m13271a((android.content.Context) r19)
            r0.mo24727a((int) r9)
            java.util.Map r1 = r5.mo25361a()
            int r1 = m15490a((java.util.Map<java.lang.String, java.lang.String>) r1)
            if (r1 <= 0) goto L_0x0343
            com.xiaomi.push.service.ab r5 = new com.xiaomi.push.service.ab
            r5.<init>(r9, r4)
            r0.mo24731b(r5, r1)
        L_0x0343:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0.<init>(r1, r2)
            java.util.LinkedList<android.util.Pair<java.lang.Integer, com.xiaomi.push.ii>> r1 = f9936a
            monitor-enter(r1)
            java.util.LinkedList<android.util.Pair<java.lang.Integer, com.xiaomi.push.ii>> r2 = f9936a     // Catch:{ all -> 0x0365 }
            r2.add(r0)     // Catch:{ all -> 0x0365 }
            java.util.LinkedList<android.util.Pair<java.lang.Integer, com.xiaomi.push.ii>> r0 = f9936a     // Catch:{ all -> 0x0365 }
            int r0 = r0.size()     // Catch:{ all -> 0x0365 }
            r2 = 100
            if (r0 <= r2) goto L_0x0363
            java.util.LinkedList<android.util.Pair<java.lang.Integer, com.xiaomi.push.ii>> r0 = f9936a     // Catch:{ all -> 0x0365 }
            r0.remove()     // Catch:{ all -> 0x0365 }
        L_0x0363:
            monitor-exit(r1)     // Catch:{ all -> 0x0365 }
            return r3
        L_0x0365:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0365 }
            goto L_0x0369
        L_0x0368:
            throw r0
        L_0x0369:
            goto L_0x0368
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4837aa.m15503a(android.content.Context, com.xiaomi.push.ii, byte[]):com.xiaomi.push.service.aa$c");
    }

    /* renamed from: a */
    private static String m15504a(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? C4689g.m14357b(context, str) : map.get("channel_name");
    }

    /* renamed from: a */
    static String m15505a(C4762ii iiVar) {
        C4752hz a;
        if (!(!"com.xiaomi.xmsf".equals(iiVar.f9495b) || (a = iiVar.mo25521a()) == null || a.mo25361a() == null)) {
            String str = (String) a.mo25361a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return iiVar.f9495b;
    }

    /* renamed from: a */
    private static void m15506a(Notification notification, int i) {
        Object a = C4525ba.m13402a((Object) notification, "extraNotification");
        if (a != null) {
            C4525ba.m13403a(a, "setMessageCount", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static void m15507a(Context context, String str) {
        m15508a(context, str, -1);
    }

    /* renamed from: a */
    public static void m15508a(Context context, String str, int i) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        int hashCode = ((str.hashCode() / 10) * 10) + i;
        LinkedList linkedList = new LinkedList();
        if (i >= 0) {
            notificationManager.cancel(hashCode);
        }
        synchronized (f9936a) {
            Iterator it = f9936a.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                C4762ii iiVar = (C4762ii) pair.second;
                if (iiVar != null) {
                    String a = m15505a(iiVar);
                    if (i >= 0) {
                        if (hashCode == ((Integer) pair.first).intValue()) {
                            if (!TextUtils.equals(a, str)) {
                            }
                        }
                    } else if (i == -1 && TextUtils.equals(a, str)) {
                        notificationManager.cancel(((Integer) pair.first).intValue());
                    }
                    linkedList.add(pair);
                }
            }
            if (f9936a != null) {
                f9936a.removeAll(linkedList);
                m15510a(context, (LinkedList<? extends Object>) linkedList);
            }
        }
    }

    /* renamed from: a */
    public static void m15509a(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            LinkedList linkedList = new LinkedList();
            synchronized (f9936a) {
                Iterator it = f9936a.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    C4762ii iiVar = (C4762ii) pair.second;
                    if (iiVar != null) {
                        String a = m15505a(iiVar);
                        C4752hz a2 = iiVar.mo25521a();
                        if (a2 != null) {
                            if (TextUtils.equals(a, str)) {
                                String c = a2.mo25373c();
                                String d = a2.mo25379d();
                                if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(d) && m15515a(str2, c) && m15515a(str3, d)) {
                                    notificationManager.cancel(((Integer) pair.first).intValue());
                                    linkedList.add(pair);
                                }
                            }
                        }
                    }
                }
                if (f9936a != null) {
                    f9936a.removeAll(linkedList);
                    m15510a(context, (LinkedList<? extends Object>) linkedList);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m15510a(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList != null && linkedList.size() > 0) {
            C4890bi.m15704a(context, "category_clear_notification", "clear_notification", (long) linkedList.size(), "");
        }
    }

    /* renamed from: a */
    private static void m15511a(Object obj, Map<String, String> map) {
        if (map != null && !TextUtils.isEmpty(map.get("channel_description"))) {
            C4525ba.m13403a(obj, "setDescription", map.get("channel_description"));
        }
    }

    /* renamed from: a */
    public static boolean m15512a(Context context, String str) {
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
    private static boolean m15513a(C4752hz hzVar) {
        if (hzVar == null) {
            return false;
        }
        String a = hzVar.mo25361a();
        return !TextUtils.isEmpty(a) && a.length() == 22 && "satuigmo".indexOf(a.charAt(0)) >= 0;
    }

    /* renamed from: a */
    public static boolean m15514a(C4762ii iiVar) {
        C4752hz a = iiVar.mo25521a();
        return m15513a(a) && a.mo25391l();
    }

    /* renamed from: a */
    private static boolean m15515a(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* renamed from: a */
    public static boolean m15516a(Map<String, String> map) {
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
    private static java.lang.String[] m15517a(android.content.Context r3, com.xiaomi.push.C4752hz r4) {
        /*
            java.lang.String r0 = r4.mo25373c()
            java.lang.String r1 = r4.mo25379d()
            java.util.Map r4 = r4.mo25361a()
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
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4837aa.m15517a(android.content.Context, com.xiaomi.push.hz):java.lang.String[]");
    }

    /* renamed from: b */
    private static int m15518b(Context context, String str) {
        int a = m15489a(context, str, "mipush_notification");
        int a2 = m15489a(context, str, "mipush_small_notification");
        if (a <= 0) {
            a = a2 > 0 ? a2 : context.getApplicationInfo().icon;
        }
        return (a != 0 || Build.VERSION.SDK_INT < 9) ? a : context.getApplicationInfo().logo;
    }

    /* renamed from: b */
    private static int m15519b(Map<String, String> map) {
        if (map == null) {
            return 3;
        }
        String str = map.get("channel_importance");
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        try {
            C3989b.m10680c("importance=" + 3);
            return Integer.parseInt(str);
        } catch (Exception e) {
            C3989b.m10681d("parsing channel importance error: " + e);
            return 3;
        }
    }

    /* renamed from: b */
    public static String m15520b(C4762ii iiVar) {
        return m15505a(iiVar) ? "E100002" : m15526c(iiVar) ? "E100000" : m15520b(iiVar) ? "E100001" : m15527d(iiVar) ? "E100003" : "";
    }

    /* renamed from: b */
    static void m15521b(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    /* renamed from: b */
    static void m15522b(Context context, String str, int i) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i).commit();
    }

    /* renamed from: b */
    static boolean m15523b(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    /* renamed from: b */
    public static boolean m15524b(C4762ii iiVar) {
        C4752hz a = iiVar.mo25521a();
        return m15513a(a) && a.f9327b == 1 && !m15505a(iiVar);
    }

    /* renamed from: c */
    private static int m15525c(Map<String, String> map) {
        if (map == null) {
            return 0;
        }
        String str = map.get("notification_priority");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            C3989b.m10680c("priority=" + str);
            return Integer.parseInt(str);
        } catch (Exception e) {
            C3989b.m10681d("parsing notification priority error: " + e);
            return 0;
        }
    }

    /* renamed from: c */
    public static boolean m15526c(C4762ii iiVar) {
        C4752hz a = iiVar.mo25521a();
        return m15513a(a) && a.f9327b == 0 && !m15505a(iiVar);
    }

    /* renamed from: d */
    public static boolean m15527d(C4762ii iiVar) {
        return iiVar.mo25521a() == C4739hm.Registration;
    }

    /* renamed from: e */
    public static boolean m15528e(C4762ii iiVar) {
        return m15505a(iiVar) || m15526c(iiVar) || m15520b(iiVar);
    }
}
