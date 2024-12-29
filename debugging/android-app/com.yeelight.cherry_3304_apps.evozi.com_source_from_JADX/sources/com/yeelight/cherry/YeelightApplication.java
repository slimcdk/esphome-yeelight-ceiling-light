package com.yeelight.cherry;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;
import com.miot.api.DeviceManipulator;
import com.miot.api.LogHelper;
import com.miot.api.MiotManager;
import com.miot.common.config.AppConfiguration;
import com.miot.common.exception.MiotException;
import com.miot.common.model.DeviceModelException;
import com.miot.common.model.DeviceModelFactory;
import com.p146mi.iot.common.abstractdevice.DeviceType;
import com.p146mi.iot.common.urn.UrnType;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.yeelight.yeelib.C4189a;
import com.yeelight.yeelib.device.xiaomi.YeelightBleController;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLamp2Device;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLamp3Device;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLampDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling10Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling19Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling29Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling2Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling4Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling5Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling6Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeilingDDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightCeilingDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightCeilingbDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightColor2Device;
import com.yeelight.yeelib.device.xiaomi.YeelightColor3Device;
import com.yeelight.yeelib.device.xiaomi.YeelightColor4Device;
import com.yeelight.yeelib.device.xiaomi.YeelightColorDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightColorcDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightCtDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightCtaDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp10Device;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp15Device;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp2Device;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp3Device;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp7Device;
import com.yeelight.yeelib.device.xiaomi.YeelightLamp9Device;
import com.yeelight.yeelib.device.xiaomi.YeelightLampDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightMeshGatewayDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightMono4Device;
import com.yeelight.yeelib.device.xiaomi.YeelightMonoDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightMonobDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightPanel1Device;
import com.yeelight.yeelib.device.xiaomi.YeelightPanel3Device;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe2Device;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe4Device;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe6Device;
import com.yeelight.yeelib.device.xiaomi.YeelightStripeDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightWifiSpeaker;
import com.yeelight.yeelib.device.xiaomi.YilaiCeilingDevice;
import com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice;
import com.yeelight.yeelib.p150c.C4191d;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4214g;
import com.yeelight.yeelib.p152f.C4222h;
import com.yeelight.yeelib.p152f.C4226i;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4232m;
import com.yeelight.yeelib.p152f.C4235o;
import com.yeelight.yeelib.p152f.C4237p;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p152f.C4243s;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4295x;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import com.yeelight.yeelib.utils.C4311i;
import com.yeelight.yeelib.utils.C4312n;
import com.yeelight.yeelib.utils.C4315y;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import p011c.p077b.p078a.C0981a;

public class YeelightApplication extends MultiDexApplication implements C4189a.C4190a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f7202f = YeelightApplication.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static YeelightApplication f7203g;

    /* renamed from: a */
    private String f7204a = "";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f7205b = -1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f7206c = 0;

    /* renamed from: d */
    private Application.ActivityLifecycleCallbacks f7207d = new C4184a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f7208e = new Handler(new C4185b());

    /* renamed from: com.yeelight.cherry.YeelightApplication$a */
    class C4184a implements Application.ActivityLifecycleCallbacks {
        C4184a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity.getLocalClassName().contains("ui.activity.LauncherActivity") || activity.getLocalClassName().contains("ui.activity.MainActivity")) {
                ((NotificationManager) YeelightApplication.this.getSystemService("notification")).cancel(1);
            }
        }

        public void onActivityPaused(Activity activity) {
            YeelightApplication.m11353c(YeelightApplication.this);
            if (YeelightApplication.this.f7206c == 0) {
                YeelightApplication.this.f7208e.sendEmptyMessageDelayed(0, 15000);
                YeelightApplication.this.f7208e.removeMessages(1);
                YeelightApplication.this.f7208e.sendEmptyMessageDelayed(2, 2000);
            }
            String unused = YeelightApplication.f7202f;
            "onActivityPaused : class = " + activity.getClass().getSimpleName() + ", active count = " + YeelightApplication.this.f7206c;
        }

        public void onActivityResumed(Activity activity) {
            YeelightApplication.m11352b(YeelightApplication.this);
            YeelightApplication.this.f7208e.removeMessages(0);
            YeelightApplication.this.f7208e.removeMessages(2);
            YeelightApplication.this.f7208e.sendEmptyMessageDelayed(1, 2000);
            String unused = YeelightApplication.f7202f;
            "onActivityResumed : class = " + activity.getClass().getSimpleName() + ", active count = " + YeelightApplication.this.f7206c;
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.yeelight.cherry.YeelightApplication$b */
    class C4185b implements Handler.Callback {
        C4185b() {
        }

        public boolean handleMessage(Message message) {
            String str;
            StringBuilder sb;
            int i = message.what;
            if (i == 0) {
                for (C4200i next : C4257w.m11947l0().mo23688t0()) {
                    if (next.mo23387P() != null) {
                        next.mo23380K0((C4191d) null);
                        String unused = YeelightApplication.f7202f;
                        sb = new StringBuilder();
                        str = "App in back ground， lan device != null, disconnect ,device name = ";
                    } else {
                        String unused2 = YeelightApplication.f7202f;
                        sb = new StringBuilder();
                        str = "App in back ground， lan device = null, ignore ,device name = ";
                    }
                    sb.append(str);
                    sb.append(next.mo23397U());
                    sb.toString();
                }
                C4222h.m11725k().mo23534e();
                C4295x.m12055g().mo23728j();
                return false;
            } else if (i != 1) {
                if (i != 2 || YeelightApplication.this.f7206c != 0) {
                    return false;
                }
                C4257w.m11912G1();
                return false;
            } else if (YeelightApplication.this.f7206c <= 0) {
                return false;
            } else {
                C4257w.m11964z1();
                return false;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.YeelightApplication$c */
    class C4186c implements LoggerInterface {
        C4186c(YeelightApplication yeelightApplication) {
        }

        public void log(String str) {
        }

        public void log(String str, Throwable th) {
        }

        public void setTag(String str) {
        }
    }

    /* renamed from: com.yeelight.cherry.YeelightApplication$d */
    private class C4187d extends AsyncTask<Void, Void, Integer> {
        private C4187d() {
        }

        /* synthetic */ C4187d(YeelightApplication yeelightApplication, C4184a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            AppConfiguration appConfiguration = new AppConfiguration();
            appConfiguration.setAppId(2882303761517308695L);
            appConfiguration.setAppKey("5971730887695");
            String a = C4230l.m11766b().mo23552a();
            appConfiguration.setLocale(a.equals(AppConfiguration.Locale.sg.name()) ? AppConfiguration.Locale.sg : a.equals(AppConfiguration.Locale.us.name()) ? AppConfiguration.Locale.us : a.equals(AppConfiguration.Locale.de.name()) ? AppConfiguration.Locale.de : a.equals(AppConfiguration.Locale.ru.name()) ? AppConfiguration.Locale.ru : a.equals(AppConfiguration.Locale.i2.name()) ? AppConfiguration.Locale.i2 : AppConfiguration.Locale.cn);
            MiotManager.getInstance().setAppConfig(appConfiguration);
            try {
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color1", "YeelightColor1.xml", YeelightColorDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip1", "YeelightStripe1.xml", YeelightStripeDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip2", "YeelightStripe2.xml", YeelightStripe2Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip6", "YeelightStripe6.xml", YeelightStripe6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.stripa", "YeelightStripeA.xml", YeelightStripe6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.mono1", "YeelightMono1.xml", YeelightMonoDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.mono4", "YeelightMono4.xml", YeelightMono4Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.monoa", "YeelightMonoa.xml", YeelightMonobDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.monob", "YeelightMonob.xml", YeelightMonobDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.mono5", "YeelightMono5.xml", YeelightMono4Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.bleremote.v1", "YeelightBleController.xml", YeelightBleController.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp1", "YeelightLamp1.xml", YeelightLampDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp4", "YeelightLamp4.xml", YeelightLampDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp2", "YeelightLamp2.xml", YeelightLamp2Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp3", "YeelightLamp3.xml", YeelightLamp3Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp5", "YeelightLamp5.xml", YeelightLamp3Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp7", "YeelightLamp7.xml", YeelightLamp7Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp8", "YeelightLamp8.xml", YeelightLamp7Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp9", "YeelightLamp9.xml", YeelightLamp9Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp15", "YeelightLamp15.xml", YeelightLamp15Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp10", "YeelightLamp10.xml", YeelightLamp10Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp17", "YeelightLamp17.xml", YeelightLamp3Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.lamp19", "YeelightLamp19.xml", YeelightBsLamp3Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling1", "YeelightCeiling1.xml", YeelightCeilingDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.bslamp1", "YeelightBsLamp1.xml", YeelightBsLampDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.bslamp2", "YeelightBsLamp2.xml", YeelightBsLamp2Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.bslamp3", "YeelightBsLamp3.xml", YeelightBsLamp3Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling2", "YeelightCeiling2.xml", YeelightCeiling2Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color2", "YeelightColor2.xml", YeelightColor2Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color4", "YeelightColor4.xml", YeelightColor4Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.colora", "YeelightColora.xml", YeelightColorDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.colorb", "YeelightColorb.xml", YeelightColorcDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.colorc", "YeelightColorc.xml", YeelightColorcDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color6", "YeelightColor6.xml", YeelightColor2Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color8", "YeelightColor8.xml", YeelightColor4Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.mono2", "YeelightMono2.xml", YeelightMonoDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ct2", "YeelightCt2.xml", YeelightCtDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.cta", "YeelightCta.xml", YeelightCtaDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip4", "YeelightStripe4.xml", YeelightStripe4Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.panel3", "YeelightPanel3.xml", YeelightPanel3Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.panel1", "YeelightPanel1.xml", YeelightPanel1Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling3", "YeelightCeiling3.xml", YeelightCeilingDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling4", "YeelightCeiling4.xml", YeelightCeiling4Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling5", "YeelightCeiling5.xml", YeelightCeiling5Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling6", "YeelightCeiling6.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling7", "YeelightCeiling7.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling8", "YeelightCeiling8.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling9", "YeelightCeiling9.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling10", "YeelightCeiling10.xml", YeelightCeiling10Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling11", "YeelightCeiling11.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling12", "YeelightCeiling12.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling13", "YeelightCeiling13.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling14", "YeelightCeiling14.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling15", "YeelightCeiling15.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling16", "YeelightCeiling16.xml", YeelightCeilingDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling17", "YeelightCeiling17.xml", YeelightCeilingDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling18", "YeelightCeiling18.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling19", "YeelightCeiling19.xml", YeelightCeiling19Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling20", "YeelightCeiling20.xml", YeelightCeiling19Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling21", "YeelightCeiling21.xml", YeelightCeiling5Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling22", "YeelightCeiling22.xml", YeelightCeiling5Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling23", "YeelightCeiling23.xml", YeelightCeiling5Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceiling24", "YeelightCeiling24.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceil26", "YeelightCeilingA.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceil27", "YeelightCeiling27.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceil29", "YeelightCeiling29.xml", YeelightCeiling29Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceil30", "YeelightCeiling30.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceil31", "YeelightCeiling31.xml", YeelightCeilingDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceil32", "YeelightCeiling32.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceil33", "YeelightCeiling33.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceila", "YeelightCeilingA.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceilb", "YeelightCeilingB.xml", YeelightCeilingbDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceilc", "YeelightCeilingC.xml", YeelightCeilingbDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceild", "YeelightCeilingD.xml", YeelightCeilingDDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yilai.light.ceiling1", "YilaiCeiling1.xml", YilaiCeilingDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yilai.light.ceiling2", "YilaiCeiling2.xml", YilaiCeilingDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yilai.light.ceiling3", "YilaiCeiling3.xml", YilaiCeilingDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.wifispeaker.v1", "YeelightSpeaker1.xml", YeelightWifiSpeaker.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color3", "YeelightColor3.xml", YeelightColor3Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.gateway.v1", "YeelightMeshGateway.xml", YeelightMeshGatewayDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.gateway.va", "YeelightMeshGatewayVA.xml", YeelightMeshGatewayDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.dnlight2"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-dnlight2:2:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.meshbulb1"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-meshbulb1:2:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.meshbulb2"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-meshbulb2:2:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.spot1"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-spot1:2:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.dn2grp"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-dn2grp:2:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.mb1grp"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-mb1grp:2:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.mb2grp"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-mb2grp:2:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.sp1grp"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-sp1grp:2:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.curtain.ctmt1"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:curtain:0000A00C:yeelink-ctmt1:2"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ml1"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-ml1:1:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ml2"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-ml2:1:0000C802"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.switch.sw1"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:switch:0000A003:yeelink-sw1:1:0000C809"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.plug.plug"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:outlet:0000A002:yeelink-plug:1"), MiSpecDevice.class, "yeelink.plug.plug"));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.fancl1"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-fancl1:1"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.fancl2"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-fancl2:1"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.fancl5"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-fancl5:1"), MiSpecDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createSpecDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.fancl6"));
                MiotManager.getInstance().addDeviceType(new DeviceType(UrnType.parse("urn:miot-spec-v2:device:light:0000A001:yeelink-fancl6:1"), MiSpecDevice.class));
            } catch (DeviceModelException e) {
                e.printStackTrace();
            }
            return Integer.valueOf(MiotManager.getInstance().open());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            Intent intent = new Intent();
            "Miot process bund, result: " + num;
            if (num.intValue() == 0) {
                YeelightApplication yeelightApplication = YeelightApplication.this;
                int unused = yeelightApplication.f7205b = yeelightApplication.mo23281i();
                "Miot process bund, pid: " + YeelightApplication.this.f7205b;
                try {
                    DeviceManipulator deviceManipulator = MiotManager.getDeviceManipulator();
                    if (deviceManipulator != null) {
                        deviceManipulator.enableLanCtrl(false);
                    }
                } catch (MiotException e) {
                    e.printStackTrace();
                }
                if (C4308b.f7482a) {
                    MiotManager.getDeviceConnector().enableHttpLog();
                }
                intent.setAction("com.yeelight.cherry.action.BIND_SERVICE_SUCCEED");
            } else {
                intent.setAction("com.yeelight.cherry.action.BIND_SERVICE_FAILED");
                if (!C4308b.f7482a) {
                    C4311i.m12158i(num.intValue());
                }
            }
            YeelightApplication.f7203g.sendBroadcast(intent);
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m11352b(YeelightApplication yeelightApplication) {
        int i = yeelightApplication.f7206c;
        yeelightApplication.f7206c = i + 1;
        return i;
    }

    /* renamed from: c */
    static /* synthetic */ int m11353c(YeelightApplication yeelightApplication) {
        int i = yeelightApplication.f7206c;
        yeelightApplication.f7206c = i - 1;
        return i;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    /* renamed from: i */
    public int mo23281i() {
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.processName.equals("com.yeelight.cherry:miot")) {
                this.f7205b = next.pid;
                "miot service pid: " + this.f7205b;
                break;
            }
        }
        return this.f7205b;
    }

    /* renamed from: j */
    public boolean mo23282j() {
        String str = this.f7204a;
        return str != null && str.equals("com.yeelight.cherry");
    }

    /* renamed from: k */
    public /* synthetic */ void mo23283k(Thread thread, Throwable th) {
        Intent intent = new Intent("com.yeelight.cherry.action.MIOT_SERVICE_CRASHED");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        intent.putExtra("exception", stringWriter.toString());
        sendBroadcast(intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (mo23282j()) {
            "onConfigurationChanged : " + configuration.locale.toString();
            C4239r.m11809q();
            for (C4198d next : C4257w.m11947l0().mo23665e0()) {
                next.mo23414j0();
                next.mo23412h0();
            }
            C4300b0.m12083u().mo23758y();
        }
    }

    public void onCreate() {
        super.onCreate();
        Logger.setLogger(this, new C4186c(this));
        try {
            LogHelper.enableLog(C4308b.f7482a);
        } catch (MiotException e) {
            e.printStackTrace();
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) getSystemService("activity")).getRunningAppProcesses()) {
            if (next.pid == myPid) {
                this.f7204a = next.processName;
            }
        }
        if (mo23282j()) {
            "Main process started! process id: " + Process.myPid();
            f7203g = this;
            C4297y.m12065g(this);
            C4308b.m12128g(this);
            if (!C4308b.f7482a) {
                C4310h.m12145a(this);
                C4310h.m12148d("Country", getResources().getConfiguration().locale.getDisplayCountry());
                C4310h.m12148d("Language", getResources().getConfiguration().locale.getDisplayLanguage());
                C4310h.m12148d("Server", C4230l.m11766b().mo23552a());
                C4310h.m12148d("Process", "Main");
                C4310h.m12147c("LaunchTime", System.currentTimeMillis());
            }
            C4311i.m12150a(this);
            C4232m.m11775b(this);
            registerActivityLifecycleCallbacks(this.f7207d);
            C4308b.m12142u();
            C4201a.m11608s(this);
            C4214g.m11666k(this);
            C4312n.m12166c();
            C4239r.m11807g();
            C4247u.m11865n();
            C4257w.m11949m0(this);
            C4226i.m11744e(this);
            MiotManager.getInstance().initialize(getApplicationContext());
            C4235o.m11786k().mo23569t();
            C4315y.m12184a(this);
            new C4187d(this, (C4184a) null).execute(new Void[0]);
            C4189a.m11364a(this);
            C4237p.m11800a();
            C4243s.m11829f().mo23606x();
            if (C4308b.f7482a) {
                C0981a.m1885x(this, getPackageName());
                return;
            }
            return;
        }
        if (C4308b.m12130i()) {
            C4310h.m12145a(this);
            C4310h.m12148d("Country", getResources().getConfiguration().locale.getDisplayCountry());
            C4310h.m12148d("Language", getResources().getConfiguration().locale.getDisplayLanguage());
            C4310h.m12148d("Process", "Miot");
        }
        "Miot process started! process id: " + Process.myPid();
        Thread.setDefaultUncaughtExceptionHandler(new C4188a(this));
    }
}
