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
import com.p022mi.iot.common.abstractdevice.DeviceType;
import com.p022mi.iot.common.urn.UrnType;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Logger;
import com.yeelight.yeelib.device.LanDevice;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.xiaomi.YeelightBleController;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLamp2Device;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLamp3Device;
import com.yeelight.yeelib.device.xiaomi.YeelightBsLampDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling10Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling19Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling29Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling2Device;
import com.yeelight.yeelib.device.xiaomi.YeelightCeiling35Device;
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
import com.yeelight.yeelib.device.xiaomi.YeelightPlate2Device;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe2Device;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe4Device;
import com.yeelight.yeelib.device.xiaomi.YeelightStripe6Device;
import com.yeelight.yeelib.device.xiaomi.YeelightStripeDevice;
import com.yeelight.yeelib.device.xiaomi.YeelightWifiSpeaker;
import com.yeelight.yeelib.device.xiaomi.YilaiCeilingDevice;
import com.yeelight.yeelib.device.xiaomi.base.MiSpecDevice;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3064h;
import com.yeelight.yeelib.managers.C3072i;
import com.yeelight.yeelib.managers.C3076j;
import com.yeelight.yeelib.managers.C3081m;
import com.yeelight.yeelib.managers.C3084o;
import com.yeelight.yeelib.managers.C3086p;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.managers.C3092s;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.managers.C3106w;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.utils.AppUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import p051j4.C3278f;
import p051j4.C3279g;
import p051j4.C3280l;
import p051j4.C3283v;
import p051j4.C3284x;
import p072n3.C3380a;
import p086q2.C3617a;
import p091r3.C3626a;

public class YeelightApplication extends MultiDexApplication implements C3626a.C3627a {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f4704f = YeelightApplication.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static YeelightApplication f4705g;

    /* renamed from: a */
    private String f4706a = "";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f4707b = -1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f4708c = 0;

    /* renamed from: d */
    private Application.ActivityLifecycleCallbacks f4709d = new C3001a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f4710e = new Handler(new C3002b());

    /* renamed from: com.yeelight.cherry.YeelightApplication$a */
    class C3001a implements Application.ActivityLifecycleCallbacks {
        C3001a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity.getLocalClassName().contains("ui.activity.LauncherActivity") || activity.getLocalClassName().contains("ui.activity.MainActivity")) {
                ((NotificationManager) YeelightApplication.this.getSystemService("notification")).cancel(1);
            }
        }

        public void onActivityPaused(Activity activity) {
            YeelightApplication.m7510d(YeelightApplication.this);
            if (YeelightApplication.this.f4708c == 0) {
                YeelightApplication.this.f4710e.sendEmptyMessageDelayed(0, 15000);
                YeelightApplication.this.f4710e.removeMessages(1);
                YeelightApplication.this.f4710e.sendEmptyMessageDelayed(2, 2000);
            }
            String unused = YeelightApplication.f4704f;
            StringBuilder sb = new StringBuilder();
            sb.append("onActivityPaused : class = ");
            sb.append(activity.getClass().getSimpleName());
            sb.append(", active count = ");
            sb.append(YeelightApplication.this.f4708c);
        }

        public void onActivityResumed(Activity activity) {
            YeelightApplication.m7509c(YeelightApplication.this);
            YeelightApplication.this.f4710e.removeMessages(0);
            YeelightApplication.this.f4710e.removeMessages(2);
            YeelightApplication.this.f4710e.sendEmptyMessageDelayed(1, 2000);
            String unused = YeelightApplication.f4704f;
            StringBuilder sb = new StringBuilder();
            sb.append("onActivityResumed : class = ");
            sb.append(activity.getClass().getSimpleName());
            sb.append(", active count = ");
            sb.append(YeelightApplication.this.f4708c);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: com.yeelight.cherry.YeelightApplication$b */
    class C3002b implements Handler.Callback {
        C3002b() {
        }

        public boolean handleMessage(Message message) {
            String str;
            StringBuilder sb;
            int i = message.what;
            if (i == 0) {
                for (C3012e next : YeelightDeviceManager.m7800o0().mo23321w0()) {
                    if (next.mo23200P() != null) {
                        next.mo23193K0((LanDevice) null);
                        String unused = YeelightApplication.f4704f;
                        sb = new StringBuilder();
                        str = "App in back ground， lan device != null, disconnect ,device name = ";
                    } else {
                        String unused2 = YeelightApplication.f4704f;
                        sb = new StringBuilder();
                        str = "App in back ground， lan device = null, ignore ,device name = ";
                    }
                    sb.append(str);
                    sb.append(next.mo23210U());
                }
                C3072i.m8042k().mo23433e();
                C3106w.m8214g().mo23538j();
                return false;
            } else if (i != 1) {
                if (i != 2 || YeelightApplication.this.f4708c != 0) {
                    return false;
                }
                YeelightDeviceManager.m7763M1();
                return false;
            } else if (YeelightApplication.this.f4708c <= 0) {
                return false;
            } else {
                YeelightDeviceManager.m7752E1();
                return false;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.YeelightApplication$c */
    class C3003c implements LoggerInterface {
        C3003c(YeelightApplication yeelightApplication) {
        }

        public void log(String str) {
        }

        public void log(String str, Throwable th) {
        }

        public void setTag(String str) {
        }
    }

    /* renamed from: com.yeelight.cherry.YeelightApplication$d */
    private class C3004d extends AsyncTask<Void, Void, Integer> {
        private C3004d() {
        }

        /* synthetic */ C3004d(YeelightApplication yeelightApplication, C3001a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            AppConfiguration appConfiguration = new AppConfiguration();
            appConfiguration.setAppId(2882303761517308695L);
            appConfiguration.setAppKey("5971730887695");
            String a = C8281l.m19542b().mo35223a();
            AppConfiguration.Locale locale = AppConfiguration.Locale.sg;
            if (!a.equals(locale.name())) {
                locale = AppConfiguration.Locale.us;
                if (!a.equals(locale.name())) {
                    locale = AppConfiguration.Locale.de;
                    if (!a.equals(locale.name())) {
                        locale = AppConfiguration.Locale.ru;
                        if (!a.equals(locale.name())) {
                            locale = AppConfiguration.Locale.i2;
                            if (!a.equals(locale.name())) {
                                appConfiguration.setLocale(AppConfiguration.Locale.cn);
                                MiotManager.getInstance().setAppConfig(appConfiguration);
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color1", "YeelightColor1.xml", YeelightColorDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip1", "YeelightStripe1.xml", YeelightStripeDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip2", "YeelightStripe2.xml", YeelightStripe2Device.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip6", "YeelightStripe6.xml", YeelightStripe6Device.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip8", "YeelightStripe8.xml", YeelightStripe6Device.class));
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
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.colore", "YeelightColore.xml", YeelightColorcDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.colorc", "YeelightColorc.xml", YeelightColorcDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color6", "YeelightColor6.xml", YeelightColor2Device.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color8", "YeelightColor8.xml", YeelightColor4Device.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.plate2", "YeelightPlate2.xml", YeelightPlate2Device.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.mono2", "YeelightMono2.xml", YeelightMonoDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ct2", "YeelightCt2.xml", YeelightCtDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.cta", "YeelightCta.xml", YeelightCtaDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ctc", "YeelightCtc.xml", YeelightCtaDevice.class));
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
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceil35", "YeelightCeiling35.xml", YeelightCeiling35Device.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceila", "YeelightCeilingA.xml", YeelightCeiling6Device.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceilb", "YeelightCeilingB.xml", YeelightCeilingbDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceilc", "YeelightCeilingC.xml", YeelightCeilingbDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceild", "YeelightCeilingD.xml", YeelightCeilingDDevice.class));
                                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceile", "YeelightCeilingE.xml", YeelightCeiling35Device.class));
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
                                return Integer.valueOf(MiotManager.getInstance().open());
                            }
                        }
                    }
                }
            }
            appConfiguration.setLocale(locale);
            MiotManager.getInstance().setAppConfig(appConfiguration);
            try {
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color1", "YeelightColor1.xml", YeelightColorDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip1", "YeelightStripe1.xml", YeelightStripeDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip2", "YeelightStripe2.xml", YeelightStripe2Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip6", "YeelightStripe6.xml", YeelightStripe6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.strip8", "YeelightStripe8.xml", YeelightStripe6Device.class));
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
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.colore", "YeelightColore.xml", YeelightColorcDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.colorc", "YeelightColorc.xml", YeelightColorcDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color6", "YeelightColor6.xml", YeelightColor2Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.color8", "YeelightColor8.xml", YeelightColor4Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.plate2", "YeelightPlate2.xml", YeelightPlate2Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.mono2", "YeelightMono2.xml", YeelightMonoDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ct2", "YeelightCt2.xml", YeelightCtDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.cta", "YeelightCta.xml", YeelightCtaDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ctc", "YeelightCtc.xml", YeelightCtaDevice.class));
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
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceil35", "YeelightCeiling35.xml", YeelightCeiling35Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceila", "YeelightCeilingA.xml", YeelightCeiling6Device.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceilb", "YeelightCeilingB.xml", YeelightCeilingbDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceilc", "YeelightCeilingC.xml", YeelightCeilingbDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceild", "YeelightCeilingD.xml", YeelightCeilingDDevice.class));
                MiotManager.getInstance().addModel(DeviceModelFactory.createDeviceModel(YeelightApplication.this.getApplicationContext(), "yeelink.light.ceile", "YeelightCeilingE.xml", YeelightCeiling35Device.class));
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
            StringBuilder sb = new StringBuilder();
            sb.append("Miot process bund, result: ");
            sb.append(num);
            if (num.intValue() == 0) {
                try {
                    LogHelper.enableLog(AppUtils.f4977a);
                } catch (MiotException e) {
                    e.printStackTrace();
                }
                YeelightApplication yeelightApplication = YeelightApplication.this;
                int unused = yeelightApplication.f4707b = yeelightApplication.mo23097j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Miot process bund, pid: ");
                sb2.append(YeelightApplication.this.f4707b);
                try {
                    DeviceManipulator deviceManipulator = MiotManager.getDeviceManipulator();
                    if (deviceManipulator != null) {
                        deviceManipulator.enableLanCtrl(false);
                    }
                } catch (MiotException e2) {
                    e2.printStackTrace();
                }
                if (AppUtils.f4977a) {
                    MiotManager.getDeviceConnector().enableHttpLog();
                }
                intent.setAction("com.yeelight.cherry.action.BIND_SERVICE_SUCCEED");
            } else {
                intent.setAction("com.yeelight.cherry.action.BIND_SERVICE_FAILED");
                if (!AppUtils.f4977a) {
                    C3279g.m8809i(num.intValue());
                }
            }
            YeelightApplication.f4705g.sendBroadcast(intent);
        }
    }

    /* renamed from: c */
    static /* synthetic */ int m7509c(YeelightApplication yeelightApplication) {
        int i = yeelightApplication.f4708c;
        yeelightApplication.f4708c = i + 1;
        return i;
    }

    /* renamed from: d */
    static /* synthetic */ int m7510d(YeelightApplication yeelightApplication) {
        int i = yeelightApplication.f4708c;
        yeelightApplication.f4708c = i - 1;
        return i;
    }

    /* renamed from: k */
    private void m7516k() {
        boolean b = C3283v.m8836b("PRIVACY_GRANTED", false);
        StringBuilder sb = new StringBuilder();
        sb.append("initCrashUtil process: main    privacyGranted : ");
        sb.append(b);
        if (AppUtils.f4978b || (!AppUtils.f4977a && b)) {
            C3278f.m8796a(this, "Main");
        }
    }

    /* renamed from: l */
    private void m7517l() {
        boolean b = C3283v.m8836b("PRIVACY_GRANTED", false);
        StringBuilder sb = new StringBuilder();
        sb.append("initCrashUtil process: miot    privacyGranted : ");
        sb.append(b);
        if (!m7518m() && b) {
            C3278f.m8796a(this, "Miot");
        }
    }

    /* renamed from: m */
    private boolean m7518m() {
        try {
            return (getApplicationInfo().flags & 2) != 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m7519o(Thread thread, Throwable th) {
        Intent intent = new Intent("com.yeelight.cherry.action.MIOT_SERVICE_CRASHED");
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        intent.putExtra("exception", stringWriter.toString());
        sendBroadcast(intent);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        MultiDex.install(this);
    }

    /* renamed from: j */
    public int mo23097j() {
        Iterator<ActivityManager.RunningAppProcessInfo> it = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (next.processName.equals("com.yeelight.cherry:miot")) {
                this.f4707b = next.pid;
                StringBuilder sb = new StringBuilder();
                sb.append("miot service pid: ");
                sb.append(this.f4707b);
                break;
            }
        }
        return this.f4707b;
    }

    /* renamed from: n */
    public boolean mo23098n() {
        String str = this.f4706a;
        return str != null && str.equals("com.yeelight.cherry");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (mo23098n()) {
            StringBuilder sb = new StringBuilder();
            sb.append("onConfigurationChanged : ");
            sb.append(configuration.locale.toString());
            C3088r.m8119q();
            for (C3010c next : YeelightDeviceManager.m7800o0().mo23289g0()) {
                next.mo23228j0();
                next.mo23225h0();
            }
            C3112v.m8242u().mo23571y();
        }
    }

    public void onCreate() {
        super.onCreate();
        Logger.setLogger(this, new C3003c(this));
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) getSystemService("activity")).getRunningAppProcesses()) {
            if (next.pid == myPid) {
                this.f4706a = next.processName;
            }
        }
        if (mo23098n()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Main process started! process id: ");
            sb.append(Process.myPid());
            f4705g = this;
            C3108x.m8224g(this);
            AppUtils.m8286g(this);
            m7516k();
            C3279g.m8801a(this);
            C3081m.m8085b(this);
            registerActivityLifecycleCallbacks(this.f4709d);
            AppUtils.m8304y();
            C3051a.m7926s(this);
            C3064h.m7983k(this);
            C3280l.m8817c();
            C3088r.m8117g();
            C3096u.m8175n();
            YeelightDeviceManager.m7802p0(this);
            C3076j.m8061e(this);
            MiotManager.getInstance().initialize(getApplicationContext());
            C3084o.m8096k().mo23462t();
            C3284x.m8851a(this);
            new C3004d(this, (C3001a) null).execute(new Void[0]);
            C3626a.m10332a(this);
            C3086p.m8110a();
            C3092s.m8139f().mo23499x();
            if (AppUtils.f4977a) {
                C3617a.m10298x(this, getPackageName());
                return;
            }
            return;
        }
        C3283v.m8841g(this);
        m7517l();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Miot process started! process id: ");
        sb2.append(Process.myPid());
        Thread.setDefaultUncaughtExceptionHandler(new C3380a(this));
    }
}
