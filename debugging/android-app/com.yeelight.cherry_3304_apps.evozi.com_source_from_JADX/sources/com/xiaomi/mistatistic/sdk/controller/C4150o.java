package com.xiaomi.mistatistic.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.view.View;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.data.C4165a;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mistatistic.sdk.controller.o */
public class C4150o {

    /* renamed from: d */
    private static C4150o f7113d;

    /* renamed from: a */
    private long f7114a = 0;

    /* renamed from: b */
    private boolean f7115b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4153a f7116c = new C4153a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f7117e = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 100 && C4150o.this.mo23090h()) {
                C4130h.m11172a("handle shaking....");
                C4150o oVar = C4150o.this;
                oVar.m11254c(oVar.f7116c.mo23092a());
                C4150o.this.mo23089g();
            }
        }
    };

    /* renamed from: f */
    private boolean f7118f = false;

    /* renamed from: com.xiaomi.mistatistic.sdk.controller.o$a */
    class C4153a implements SensorEventListener {

        /* renamed from: b */
        private SoftReference<Activity> f7123b;

        public C4153a() {
        }

        /* renamed from: a */
        public Activity mo23092a() {
            return this.f7123b.get();
        }

        /* renamed from: a */
        public void mo23093a(Activity activity) {
            this.f7123b = new SoftReference<>(activity);
        }

        /* renamed from: b */
        public void mo23094b() {
            try {
                if (this.f7123b != null) {
                    this.f7123b.clear();
                }
            } catch (Exception e) {
                C4130h.m11176a("clearActivity exception: ", (Throwable) e);
            }
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            float f4 = (float) 19;
            if (Math.abs(f) > f4 || Math.abs(f2) > f4 || Math.abs(f3) > f4) {
                C4150o.this.f7117e.sendEmptyMessage(100);
                C4130h.m11172a("shaking...");
            }
        }
    }

    private C4150o() {
    }

    /* renamed from: a */
    public static C4150o m11251a() {
        if (f7113d == null) {
            f7113d = new C4150o();
        }
        return f7113d;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11254c(final Activity activity) {
        C4115d.m11120b().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                int i;
                try {
                    File b = C4150o.this.mo23083b(activity);
                    JSONObject jSONObject = new JSONObject();
                    DisplayMetrics displayMetrics = C4113c.m11105a().getResources().getDisplayMetrics();
                    int i2 = 0;
                    if (displayMetrics != null) {
                        int i3 = displayMetrics.widthPixels;
                        i2 = displayMetrics.heightPixels;
                        i = i3;
                    } else {
                        i = 0;
                    }
                    jSONObject.put("height", Integer.toString(i2));
                    jSONObject.put("width", Integer.toString(i));
                    C4163r rVar = new C4163r();
                    rVar.mo23106a(activity);
                    List<C4165a> a = rVar.mo23105a();
                    JSONArray jSONArray = new JSONArray();
                    for (C4165a a2 : a) {
                        jSONArray.put(a2.mo23134a());
                    }
                    jSONObject.put("clickable_views", jSONArray);
                    HashMap hashMap = new HashMap();
                    hashMap.put("appId", C4113c.m11108b());
                    hashMap.put("appKey", C4113c.m11110c());
                    hashMap.put("deviceId", new C4120e().mo23042a());
                    hashMap.put("meta", jSONObject.toString());
                    String a3 = C4132j.m11186a("https://dev.mi.com/mistats/xmstats/event/dynamic/upload", (Map<String, String>) hashMap, b, "test");
                    C4130h.m11172a("upload snapshot with clickable views " + a.size());
                    C4130h.m11172a(a3);
                } catch (Exception e) {
                    C4130h.m11176a("uploadSnapShot task exception: ", (Throwable) e);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo23082a(Activity activity) {
        SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
        sensorManager.registerListener(this.f7116c, sensorManager.getDefaultSensor(1), 3);
        this.f7116c.mo23093a(activity);
        this.f7118f = true;
        C4130h.m11172a("enable AcceleroMeterSensor...");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public File mo23083b(Activity activity) {
        View rootView = activity.getWindow().getDecorView().getRootView();
        rootView.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
        rootView.setDrawingCacheEnabled(false);
        File file = new File(activity.getExternalCacheDir(), "snapshot.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        fileOutputStream.close();
        return file;
    }

    /* renamed from: b */
    public boolean mo23084b() {
        return this.f7115b;
    }

    /* renamed from: c */
    public void mo23085c() {
        this.f7115b = true;
    }

    /* renamed from: d */
    public void mo23086d() {
        this.f7115b = false;
        if (mo23087e()) {
            mo23088f();
        }
    }

    /* renamed from: e */
    public boolean mo23087e() {
        return this.f7118f;
    }

    /* renamed from: f */
    public void mo23088f() {
        SensorManager sensorManager = (SensorManager) C4113c.m11105a().getSystemService("sensor");
        sensorManager.unregisterListener(this.f7116c, sensorManager.getDefaultSensor(1));
        this.f7118f = false;
        this.f7116c.mo23094b();
        C4130h.m11172a("disable AcceleroMeterSensor...");
    }

    /* renamed from: g */
    public void mo23089g() {
        this.f7114a = System.currentTimeMillis();
    }

    /* renamed from: h */
    public boolean mo23090h() {
        return System.currentTimeMillis() > this.f7114a + 5000;
    }
}
