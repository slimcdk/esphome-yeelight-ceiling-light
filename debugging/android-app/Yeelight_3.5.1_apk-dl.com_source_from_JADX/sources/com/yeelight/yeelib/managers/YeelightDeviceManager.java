package com.yeelight.yeelib.managers;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.DiscoveryType;
import com.miot.common.exception.MiotException;
import com.miot.service.manipulator.codec.get.GetCodec;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.exception.IotException;
import com.p022mi.iot.common.handler.CommonHandler;
import com.p022mi.iot.common.instance.Property;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.yeelight.cherry.p141ui.activity.QuickConnectRequestProgressActivity;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C6043b;
import com.yeelight.yeelib.data.DeviceBrowserProvider;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6088b;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.C6164e;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.DeviceType;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.C6117h;
import com.yeelight.yeelib.device.xiaomi.C8244a;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.models.MeshNetWork;
import com.yeelight.yeelib.retrofit.ContentType;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3278f;
import p051j4.C3283v;
import p051j4.C9191i;
import p051j4.C9197p;
import p129b4.C3988b;
import p134c4.C4007b;
import p207s3.C10343e;
import p207s3.C10344f;
import p223w3.C10689c;
import p223w3.C10797d1;
import p223w3.C10898f0;
import p223w3.C11405l0;
import p223w3.C11406l1;
import p223w3.C11451m0;
import p223w3.C11541o0;
import p223w3.C11627r;
import p223w3.C11698t0;
import p223w3.C11729u0;
import p223w3.C11762v0;
import p232y3.C12048k;
import p237z3.C12144d;

public class YeelightDeviceManager implements C3051a.C3052i, C8281l.C3080a, C8272e.C3063a {
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final String f4760C = "YeelightDeviceManager";

    /* renamed from: Q */
    private static YeelightDeviceManager f4761Q = null;

    /* renamed from: R */
    private static boolean f4762R = false;

    /* renamed from: S */
    private static Timer f4763S = new Timer();

    /* renamed from: T */
    private static TimerTask f4764T;

    /* renamed from: U */
    private static Timer f4765U = new Timer();

    /* renamed from: V */
    private static TimerTask f4766V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public static ConcurrentHashMap<String, C3010c> f4767W = new ConcurrentHashMap<>();

    /* renamed from: X */
    private static ConcurrentHashMap<String, C10689c> f4768X = new ConcurrentHashMap<>();

    /* renamed from: Y */
    private static ConcurrentHashMap<String, C10343e> f4769Y = new ConcurrentHashMap<>();

    /* renamed from: Z */
    private static ArrayList<String> f4770Z = new ArrayList<String>() {
        {
            add("yeelink.light.ceiling5");
            add("yeelink.light.ceiling21");
            add("yeelink.light.ceiling22");
            add("yeelink.light.ceiling23");
            add("yeelink.light.color3");
            add("yeelink.light.lamp1");
            add("yeelink.light.lamp2");
            add("yeelink.light.lamp4");
            add("yeelink.light.bslamp1");
            add("yeelink.light.bslamp2");
        }
    };

    /* renamed from: A */
    private DeviceManager.DeviceHandler f4771A;

    /* renamed from: B */
    BroadcastReceiver f4772B;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f4773a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public BluetoothAdapter.LeScanCallback f4774b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ScanCallback f4775c;

    /* renamed from: d */
    private BluetoothManager f4776d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public BluetoothAdapter f4777e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public BluetoothLeScanner f4778f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ExecutorService f4779g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f4780h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f4781i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f4782j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f4783k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f4784l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f4785m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public List<String> f4786n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f4787o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public List<C12144d> f4788p;

    /* renamed from: q */
    private ArrayList<String> f4789q;

    /* renamed from: r */
    private ArrayList<String> f4790r;

    /* renamed from: s */
    private ArrayList<String> f4791s;

    /* renamed from: t */
    private ArrayList<String> f4792t;

    /* renamed from: u */
    private ArrayList<String> f4793u;

    /* renamed from: v */
    private ArrayList<String> f4794v;

    /* renamed from: w */
    private ArrayList<Device.Ownership> f4795w;

    /* renamed from: x */
    private ArrayList<Device.Ownership> f4796x;

    /* renamed from: y */
    private ArrayList<Device.Ownership> f4797y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Handler f4798z;

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$a */
    class C3027a extends Handler {
        C3027a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Bundle data = message.getData();
                boolean z = data.getBoolean("ble_discovery", true);
                boolean z2 = data.getBoolean("local_wifi_discovery", true);
                boolean z3 = data.getBoolean("remote_wifi_discovery", true);
                String unused = YeelightDeviceManager.f4760C;
                StringBuilder sb = new StringBuilder();
                sb.append("Message received: MSG_START_DEVICE_DISCOVERY, ble: ");
                sb.append(z);
                sb.append(", localWifi: ");
                sb.append(z2);
                sb.append(", remoteWifi: ");
                sb.append(z3);
                if (z && YeelightDeviceManager.this.f4777e != null && YeelightDeviceManager.this.f4777e.isEnabled() && !YeelightDeviceManager.this.f4780h && YeelightDeviceManager.this.m7774U()) {
                    String unused2 = YeelightDeviceManager.f4760C;
                    boolean unused3 = YeelightDeviceManager.this.f4780h = true;
                    if (Build.VERSION.SDK_INT < 21) {
                        YeelightDeviceManager.this.f4777e.startLeScan(YeelightDeviceManager.this.f4774b);
                    } else if (YeelightDeviceManager.this.f4778f != null) {
                        try {
                            YeelightDeviceManager.this.f4778f.startScan(YeelightDeviceManager.this.f4775c);
                        } catch (Exception | NullPointerException unused4) {
                        }
                    }
                }
                YeelightDeviceManager.this.mo23287f0(z2, z3);
                if (z || z2 || z3) {
                    for (C12144d k : YeelightDeviceManager.this.f4788p) {
                        k.mo30151k();
                    }
                }
            } else if (i == 1) {
                String unused5 = YeelightDeviceManager.f4760C;
                Bundle data2 = message.getData();
                boolean z4 = data2.getBoolean("clear_device_list", false);
                boolean z5 = data2.getBoolean("notify_scan_result", true);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (!(YeelightDeviceManager.this.f4778f == null || YeelightDeviceManager.this.f4777e == null || !YeelightDeviceManager.this.f4777e.isEnabled())) {
                        YeelightDeviceManager.this.f4778f.stopScan(YeelightDeviceManager.this.f4775c);
                    }
                } else if (YeelightDeviceManager.this.f4777e != null && YeelightDeviceManager.this.f4777e.isEnabled()) {
                    YeelightDeviceManager.this.f4777e.stopLeScan(YeelightDeviceManager.this.f4774b);
                }
                YeelightDeviceManager.this.mo23257C1();
                boolean unused6 = YeelightDeviceManager.this.f4780h = false;
                if (YeelightDeviceManager.this.f4781i) {
                    YeelightDeviceManager.this.f4798z.sendEmptyMessageDelayed(2, YeelightDeviceManager.this.f4783k);
                }
                if (z4) {
                    for (String t1 : YeelightDeviceManager.this.f4786n) {
                        YeelightDeviceManager.this.mo23315t1(t1);
                    }
                    YeelightDeviceManager.this.f4786n.clear();
                    DeviceBrowserProvider.m17587b();
                    DeviceDataProvider.m17611X();
                }
                if (z5) {
                    for (C12144d o : YeelightDeviceManager.this.f4788p) {
                        o.mo30153o();
                    }
                }
            } else if (i == 2) {
                String unused7 = YeelightDeviceManager.f4760C;
                YeelightDeviceManager.this.mo23277Y();
            } else if (i == 3) {
                String unused8 = YeelightDeviceManager.f4760C;
                if (YeelightDeviceManager.this.f4782j) {
                    YeelightDeviceManager.this.f4798z.sendEmptyMessageDelayed(3, YeelightDeviceManager.this.f4784l);
                }
                YeelightDeviceManager.this.mo23307p1();
            } else if (i == 4) {
                String unused9 = YeelightDeviceManager.f4760C;
                Toast.makeText(YeelightDeviceManager.this.f4773a, YeelightDeviceManager.this.f4773a.getText(R$string.account_login_ouath_failed_info), 0).show();
            } else if (i == 5) {
                String unused10 = YeelightDeviceManager.f4760C;
                YeelightDeviceManager.this.mo23278Z(true, false, false);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$b */
    class C3028b implements DeviceManager.DeviceHandler {
        C3028b() {
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("################ Wifi local scan, onFailed! error: ");
            sb.append(str);
        }

        public void onSucceed(List<AbstractDevice> list) {
            StringBuilder sb = new StringBuilder();
            sb.append("################ Wifi local scan, onSucceed, count: ");
            sb.append(list.size());
            for (AbstractDevice b : list) {
                C9191i.m22148b(b);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            YeelightDeviceManager.this.m7787b1(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$c */
    class C3029c extends TimerTask {
        C3029c() {
        }

        public void run() {
            String unused = YeelightDeviceManager.f4760C;
            YeelightDeviceManager.m7763M1();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            YeelightDeviceManager.m7752E1();
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$d */
    class C3030d extends TimerTask {
        C3030d() {
        }

        public void run() {
            YeelightDeviceManager.m7793i1();
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$e */
    class C3031e implements CommonHandler<List<Property>> {
        C3031e() {
        }

        /* renamed from: a */
        public void onSucceed(List<Property> list) {
            String unused = YeelightDeviceManager.f4760C;
            for (Property next : list) {
                String[] split = next.getPid().split("\\.");
                try {
                    YeelightDeviceManager.m7800o0().mo23270K0(split[0]).mo31718P1(Integer.parseInt(split[1]), next.getInstanceID(), next.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void onFailed(IotError iotError) {
            String unused = YeelightDeviceManager.f4760C;
            StringBuilder sb = new StringBuilder();
            sb.append("query spec properties onFailed: ");
            sb.append(iotError.getMessage());
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$f */
    class C3032f implements DeviceManager.DeviceHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f4801a;

        /* renamed from: b */
        final /* synthetic */ String f4802b;

        /* renamed from: c */
        final /* synthetic */ boolean f4803c;

        C3032f(boolean z, String str, boolean z2) {
            this.f4801a = z;
            this.f4802b = str;
            this.f4803c = z2;
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("################ Wifi discovery, onFailed! ret: ");
            sb.append(i);
            sb.append(" error: ");
            sb.append(str);
            for (C12144d y : YeelightDeviceManager.this.f4788p) {
                y.mo30163y(i);
            }
            if (i == -13) {
                YeelightDeviceManager.m7806t(YeelightDeviceManager.this);
                if (YeelightDeviceManager.this.f4785m >= 3) {
                    AppUtils.m8293n();
                    YeelightDeviceManager.this.f4798z.removeMessages(4);
                    YeelightDeviceManager.this.f4798z.sendEmptyMessageDelayed(4, 1000);
                    if (!AppUtils.f4977a) {
                        C3278f.m8797b(new AppUtils.SuicideException("Token invalid, Oauth record: ", AppUtils.m8285f()));
                    }
                    C3051a.m7925r().mo23354D();
                    Intent launchIntentForPackage = YeelightDeviceManager.this.f4773a.getPackageManager().getLaunchIntentForPackage("com.yeelight.cherry");
                    launchIntentForPackage.addFlags(32768);
                    YeelightDeviceManager.this.f4773a.startActivity(launchIntentForPackage);
                }
            }
            if (this.f4801a && !this.f4803c && !TextUtils.isEmpty(this.f4802b)) {
                for (C3010c cVar : YeelightDeviceManager.f4767W.values()) {
                    if ((cVar instanceof WifiDeviceBase) && cVar.mo23204R().toLowerCase().endsWith(this.f4802b.toLowerCase())) {
                        String unused = YeelightDeviceManager.f4760C;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Found target device! device id: ");
                        sb2.append(cVar.mo23185G());
                        YeelightDeviceManager.this.m7768Q0(cVar.mo23185G(), false);
                        return;
                    }
                }
            }
        }

        public void onSucceed(List<AbstractDevice> list) {
            boolean z;
            int unused = YeelightDeviceManager.this.f4785m = 0;
            if (!C3051a.m7928z()) {
                String unused2 = YeelightDeviceManager.f4760C;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("################ Wifi discovery, onSucceed, count: ");
            sb.append(list.size());
            sb.append(", check result: ");
            sb.append(this.f4801a);
            sb.append(", target mac: ");
            sb.append(this.f4802b);
            sb.append("， fromMeshConnect: ");
            sb.append(this.f4803c);
            sb.append(", connection log: ");
            sb.append(YeelightDeviceManager.this.f4787o);
            for (AbstractDevice b : list) {
                C9191i.m22148b(b);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            YeelightDeviceManager.this.m7785a1(arrayList);
            YeelightDeviceManager.this.mo23280b0(this.f4801a, this.f4803c, this.f4802b);
            if (this.f4801a && !this.f4803c && !TextUtils.isEmpty(this.f4802b)) {
                Iterator it = YeelightDeviceManager.f4767W.values().iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C3010c cVar = (C3010c) it.next();
                    if (((cVar instanceof C11406l1) || (cVar instanceof C10797d1) || (cVar instanceof WifiDeviceBase)) && cVar.mo23204R().toLowerCase().endsWith(this.f4802b.toLowerCase())) {
                        String unused3 = YeelightDeviceManager.f4760C;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Found target device! device id: ");
                        sb2.append(cVar.mo23185G());
                        YeelightDeviceManager.this.m7768Q0(cVar.mo23185G(), true);
                        break;
                    }
                }
                if (!z) {
                    if (AppUtils.f4977a) {
                        String unused4 = YeelightDeviceManager.f4760C;
                    } else {
                        String a = YeelightDeviceManager.f4760C;
                        C3278f.m8797b(new AppUtils.SuicideException(a, "Device connect succeed, but no device return from cloud! device mac: " + this.f4802b + " || " + YeelightDeviceManager.this.f4787o));
                    }
                }
            }
            for (C12144d L : YeelightDeviceManager.this.f4788p) {
                L.mo30150L();
            }
            if (list.size() > 0) {
                C3072i.m8042k().mo23438q();
                YeelightDeviceManager.this.mo23307p1();
            }
            if (AppUtils.f4986j) {
                AppUtils.f4986j = false;
                C9197p.m22169b();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$g */
    class C3033g implements CommonHandler<List<com.p022mi.iot.common.abstractdevice.AbstractDevice>> {

        /* renamed from: a */
        final /* synthetic */ boolean f4805a;

        /* renamed from: b */
        final /* synthetic */ boolean f4806b;

        /* renamed from: c */
        final /* synthetic */ String f4807c;

        C3033g(boolean z, boolean z2, String str) {
            this.f4805a = z;
            this.f4806b = z2;
            this.f4807c = str;
        }

        /* renamed from: a */
        public void onSucceed(List<com.p022mi.iot.common.abstractdevice.AbstractDevice> list) {
            boolean z = C3051a.m7928z();
            String unused = YeelightDeviceManager.f4760C;
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("discoverRemoteSpecDevices, onSuccess, device size = ");
                sb.append(list.size());
                for (com.p022mi.iot.common.abstractdevice.AbstractDevice a : list) {
                    C9191i.m22147a(a);
                }
                YeelightDeviceManager.this.m7783Z0(list);
                if (this.f4805a && this.f4806b && !TextUtils.isEmpty(this.f4807c)) {
                    boolean z2 = false;
                    Iterator it = YeelightDeviceManager.f4767W.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C3010c cVar = (C3010c) it.next();
                        if ((cVar instanceof C6100g) && cVar.mo23204R().toLowerCase().endsWith(this.f4807c.toLowerCase())) {
                            String unused2 = YeelightDeviceManager.f4760C;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Found target spec device! device id: ");
                            sb2.append(cVar.mo23185G());
                            YeelightDeviceManager.this.m7768Q0(cVar.mo23185G(), true);
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        if (AppUtils.f4977a) {
                            String unused3 = YeelightDeviceManager.f4760C;
                        } else {
                            String a2 = YeelightDeviceManager.f4760C;
                            C3278f.m8797b(new AppUtils.SuicideException(a2, "Device connect succeed, but no device return from cloud! device mac: " + this.f4807c));
                        }
                    }
                }
                for (C12144d L : YeelightDeviceManager.this.f4788p) {
                    L.mo30150L();
                }
            }
        }

        public void onFailed(IotError iotError) {
            if (this.f4805a && this.f4806b && !TextUtils.isEmpty(this.f4807c)) {
                for (C3010c cVar : YeelightDeviceManager.f4767W.values()) {
                    if ((cVar instanceof C6100g) && cVar.mo23204R().toLowerCase().endsWith(this.f4807c.toLowerCase())) {
                        String unused = YeelightDeviceManager.f4760C;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Found target spec device! device id: ");
                        sb.append(cVar.mo23185G());
                        YeelightDeviceManager.this.m7768Q0(cVar.mo23185G(), false);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$h */
    class C3034h extends ScanCallback {

        /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$h$a */
        class C3035a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f4810a;

            /* renamed from: b */
            final /* synthetic */ String f4811b;

            /* renamed from: c */
            final /* synthetic */ int f4812c;

            /* renamed from: d */
            final /* synthetic */ byte[] f4813d;

            C3035a(String str, String str2, int i, byte[] bArr) {
                this.f4810a = str;
                this.f4811b = str2;
                this.f4812c = i;
                this.f4813d = bArr;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: w3.r} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: w3.f0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: w3.f0} */
            /* JADX WARNING: type inference failed for: r0v32, types: [java.lang.Object, com.yeelight.yeelib.device.base.c, com.yeelight.yeelib.device.base.e] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    java.lang.String r0 = r10.f4810a
                    java.lang.String r1 = "Device type = "
                    java.lang.String r2 = "Device has added, type= "
                    r3 = 1
                    if (r0 == 0) goto L_0x0162
                    java.lang.String r4 = "XMCTD_"
                    boolean r0 = r0.contains(r4)
                    java.lang.String r4 = "YEE Mood Lamp"
                    if (r0 != 0) goto L_0x001b
                    java.lang.String r0 = r10.f4810a
                    boolean r0 = r0.contains(r4)
                    if (r0 == 0) goto L_0x0162
                L_0x001b:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r5 = "cherry device found: "
                    r0.append(r5)
                    java.lang.String r5 = r10.f4811b
                    r0.append(r5)
                    com.yeelight.yeelib.managers.YeelightDeviceManager$h r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r0 = r0.f4786n
                    java.lang.String r5 = r10.f4811b
                    r0.remove(r5)
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r5 = r10.f4811b
                    boolean r0 = r0.containsKey(r5)
                    if (r0 != 0) goto L_0x00e4
                    java.lang.String r0 = r10.f4810a
                    boolean r0 = r0.contains(r4)
                    if (r0 == 0) goto L_0x0096
                    w3.f0 r0 = new w3.f0
                    java.lang.String r6 = r10.f4811b
                    com.miot.common.device.Device$Ownership r7 = com.miot.common.device.Device.Ownership.NOONES
                    r8 = 1
                    r9 = 0
                    r4 = r0
                    r5 = r6
                    r4.<init>(r5, r6, r7, r8, r9)
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.lang.String r4 = r10.f4810a
                    r5 = 16
                    byte[] r4 = p149e3.C8965b.m21443d(r4, r5)
                    java.lang.String r5 = "ADV_MESH_NAME"
                    r2.put(r5, r4)
                    r4 = 7
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    java.lang.String r5 = "ADV_MESH_ADDRESS"
                    r2.put(r5, r4)
                    r4 = 4
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    java.lang.String r5 = "ADV_MESH_UUID"
                    r2.put(r5, r4)
                    r4 = 529(0x211, float:7.41E-43)
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    java.lang.String r5 = "ADV_PRODUCT_UUID"
                    r2.put(r5, r4)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.String r4 = "ADV_STATUS"
                    r2.put(r4, r3)
                    r0.mo31645g2(r2)
                    goto L_0x009f
                L_0x0096:
                    w3.r r0 = new w3.r
                    java.lang.String r2 = r10.f4811b
                    com.miot.common.device.Device$Ownership r4 = com.miot.common.device.Device.Ownership.NOONES
                    r0.<init>(r2, r2, r4, r3)
                L_0x009f:
                    com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r0.mo23221d0()
                    int r3 = r10.f4812c
                    r2.mo31553N0(r3)
                    java.util.concurrent.ConcurrentHashMap r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r3 = r0.mo23185G()
                    r2.put(r3, r0)
                    com.yeelight.yeelib.managers.YeelightDeviceManager$h r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r2 = r2.f4788p
                    java.util.Iterator r2 = r2.iterator()
                L_0x00bf:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x00cf
                    java.lang.Object r3 = r2.next()
                    z3.d r3 = (p237z3.C12144d) r3
                    r3.mo30152m(r0)
                    goto L_0x00bf
                L_0x00cf:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.Class r0 = r0.getClass()
                    java.lang.String r0 = r0.getSimpleName()
                    r2.append(r0)
                    goto L_0x0242
                L_0x00e4:
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r1 = r10.f4811b
                    java.lang.Object r0 = r0.get(r1)
                    com.yeelight.yeelib.device.base.c r0 = (com.yeelight.yeelib.device.base.C3010c) r0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r2)
                    java.lang.Class r2 = r0.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    r1.append(r2)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r0.mo23221d0()
                    r1.mo31549L0(r3)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r0.mo23221d0()
                    int r2 = r10.f4812c
                    r1.mo31553N0(r2)
                    com.miot.common.device.Device$Ownership r1 = r0.mo23212W()
                    com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.MINE
                    if (r1 == r2) goto L_0x0123
                    com.miot.common.device.Device$Ownership r1 = r0.mo23212W()
                    com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.OTHERS
                    if (r1 != r2) goto L_0x013f
                L_0x0123:
                    boolean r1 = com.yeelight.yeelib.utils.AppUtils.f4985i
                    if (r1 == 0) goto L_0x013f
                    boolean r1 = r0 instanceof p223w3.C11627r
                    if (r1 == 0) goto L_0x013f
                    com.yeelight.yeelib.managers.YeelightDeviceManager r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7800o0()
                    java.util.List r1 = r1.mo23322x0()
                    int r1 = r1.size()
                    if (r1 != r3) goto L_0x013f
                    r1 = 0
                    com.yeelight.yeelib.utils.AppUtils.f4985i = r1
                    r0.mo23151n()
                L_0x013f:
                    boolean r1 = r0 instanceof com.yeelight.yeelib.device.base.C3012e
                    if (r1 == 0) goto L_0x0245
                    com.yeelight.yeelib.managers.YeelightDeviceManager$h r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r1 = r1.f4788p
                    java.util.Iterator r1 = r1.iterator()
                L_0x014f:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0245
                    java.lang.Object r2 = r1.next()
                    z3.d r2 = (p237z3.C12144d) r2
                    r3 = r0
                    com.yeelight.yeelib.device.base.e r3 = (com.yeelight.yeelib.device.base.C3012e) r3
                    r2.mo30149E(r3)
                    goto L_0x014f
                L_0x0162:
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r4 = r10.f4811b
                    boolean r0 = r0.containsKey(r4)
                    if (r0 == 0) goto L_0x01d3
                    com.yeelight.yeelib.managers.YeelightDeviceManager$h r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r0 = r0.f4786n
                    java.lang.String r1 = r10.f4811b
                    r0.remove(r1)
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r1 = r10.f4811b
                    java.lang.Object r0 = r0.get(r1)
                    com.yeelight.yeelib.device.base.c r0 = (com.yeelight.yeelib.device.base.C3010c) r0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r2)
                    java.lang.Class r2 = r0.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    r1.append(r2)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r0.mo23221d0()
                    r1.mo31549L0(r3)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r0.mo23221d0()
                    int r2 = r10.f4812c
                    r1.mo31553N0(r2)
                    java.lang.String r1 = r0.mo23208T()
                    java.lang.String r2 = "yeelink.light.gingko"
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L_0x01bd
                    com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r0 = (com.yeelight.yeelib.device.base.PrivateMeshDeviceBase) r0
                    byte[] r1 = r10.f4813d
                    r0.mo31649k2(r1)
                L_0x01bd:
                    com.yeelight.yeelib.managers.YeelightDeviceManager$h r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    byte[] r1 = r10.f4813d
                    boolean r0 = r0.m7769R0(r1)
                    if (r0 == 0) goto L_0x0245
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r1 = r10.f4811b
                    r0.remove(r1)
                    goto L_0x0242
                L_0x01d3:
                    com.yeelight.yeelib.managers.YeelightDeviceManager$h r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    byte[] r2 = r10.f4813d
                    java.lang.String r3 = r10.f4811b
                    int r4 = r10.f4812c
                    boolean r0 = r0.m7790e1(r2, r3, r4)
                    if (r0 == 0) goto L_0x01e4
                    return
                L_0x01e4:
                    com.yeelight.yeelib.managers.YeelightDeviceManager$h r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.lang.String r2 = r10.f4810a
                    java.lang.String r3 = r10.f4811b
                    byte[] r4 = r10.f4813d
                    w3.f0 r0 = r0.mo23285d1(r2, r3, r4)
                    if (r0 == 0) goto L_0x0245
                    com.yeelight.yeelib.managers.YeelightDeviceManager$h r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r2 = r2.f4786n
                    java.lang.String r3 = r10.f4811b
                    r2.remove(r3)
                    java.util.concurrent.ConcurrentHashMap r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r3 = r0.mo23185G()
                    r2.put(r3, r0)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r0.mo23221d0()
                    int r3 = r10.f4812c
                    r2.mo31553N0(r3)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.Class<w3.f0> r1 = p223w3.C10898f0.class
                    java.lang.String r1 = r1.getSimpleName()
                    r2.append(r1)
                    com.yeelight.yeelib.managers.YeelightDeviceManager$h r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r1 = r1.f4788p
                    java.util.Iterator r1 = r1.iterator()
                L_0x0232:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0242
                    java.lang.Object r2 = r1.next()
                    z3.d r2 = (p237z3.C12144d) r2
                    r2.mo30152m(r0)
                    goto L_0x0232
                L_0x0242:
                    com.yeelight.yeelib.data.DeviceBrowserProvider.m17587b()
                L_0x0245:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.YeelightDeviceManager.C3034h.C3035a.run():void");
            }
        }

        C3034h() {
        }

        public void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            BluetoothDevice device = scanResult.getDevice();
            String name = device.getName();
            String address = device.getAddress();
            int rssi = scanResult.getRssi();
            byte[] bytes = scanResult.getScanRecord().getBytes();
            if (rssi >= -100 && YeelightDeviceManager.this.f4780h) {
                YeelightDeviceManager.this.f4779g.execute(new C3035a(name, address, rssi, bytes));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$i */
    class C3036i implements BluetoothAdapter.LeScanCallback {

        /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$i$a */
        class C3037a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f4816a;

            /* renamed from: b */
            final /* synthetic */ String f4817b;

            /* renamed from: c */
            final /* synthetic */ int f4818c;

            /* renamed from: d */
            final /* synthetic */ byte[] f4819d;

            C3037a(String str, String str2, int i, byte[] bArr) {
                this.f4816a = str;
                this.f4817b = str2;
                this.f4818c = i;
                this.f4819d = bArr;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: w3.r} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: w3.f0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: w3.f0} */
            /* JADX WARNING: type inference failed for: r0v33, types: [java.lang.Object, com.yeelight.yeelib.device.base.c, com.yeelight.yeelib.device.base.e] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    java.lang.String r0 = r10.f4816a
                    java.lang.String r1 = "Device type = "
                    java.lang.String r2 = "Device has added, type= "
                    r3 = 1
                    if (r0 == 0) goto L_0x0162
                    java.lang.String r4 = "XMCTD_"
                    boolean r0 = r0.contains(r4)
                    java.lang.String r4 = "YEE Mood Lamp"
                    if (r0 != 0) goto L_0x001b
                    java.lang.String r0 = r10.f4816a
                    boolean r0 = r0.contains(r4)
                    if (r0 == 0) goto L_0x0162
                L_0x001b:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r5 = "cherry device found: "
                    r0.append(r5)
                    java.lang.String r5 = r10.f4817b
                    r0.append(r5)
                    com.yeelight.yeelib.managers.YeelightDeviceManager$i r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r0 = r0.f4786n
                    java.lang.String r5 = r10.f4817b
                    r0.remove(r5)
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r5 = r10.f4817b
                    boolean r0 = r0.containsKey(r5)
                    if (r0 != 0) goto L_0x00e4
                    java.lang.String r0 = r10.f4816a
                    boolean r0 = r0.contains(r4)
                    if (r0 == 0) goto L_0x0096
                    w3.f0 r0 = new w3.f0
                    java.lang.String r6 = r10.f4817b
                    com.miot.common.device.Device$Ownership r7 = com.miot.common.device.Device.Ownership.NOONES
                    r8 = 1
                    r9 = 0
                    r4 = r0
                    r5 = r6
                    r4.<init>(r5, r6, r7, r8, r9)
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.lang.String r4 = r10.f4816a
                    r5 = 16
                    byte[] r4 = p149e3.C8965b.m21443d(r4, r5)
                    java.lang.String r5 = "ADV_MESH_NAME"
                    r2.put(r5, r4)
                    r4 = 7
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    java.lang.String r5 = "ADV_MESH_ADDRESS"
                    r2.put(r5, r4)
                    r4 = 4
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    java.lang.String r5 = "ADV_MESH_UUID"
                    r2.put(r5, r4)
                    r4 = 529(0x211, float:7.41E-43)
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    java.lang.String r5 = "ADV_PRODUCT_UUID"
                    r2.put(r5, r4)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.String r4 = "ADV_STATUS"
                    r2.put(r4, r3)
                    r0.mo31645g2(r2)
                    goto L_0x009f
                L_0x0096:
                    w3.r r0 = new w3.r
                    java.lang.String r2 = r10.f4817b
                    com.miot.common.device.Device$Ownership r4 = com.miot.common.device.Device.Ownership.NOONES
                    r0.<init>(r2, r2, r4, r3)
                L_0x009f:
                    com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r0.mo23221d0()
                    int r3 = r10.f4818c
                    r2.mo31553N0(r3)
                    java.util.concurrent.ConcurrentHashMap r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r3 = r0.mo23185G()
                    r2.put(r3, r0)
                    com.yeelight.yeelib.managers.YeelightDeviceManager$i r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r2 = r2.f4788p
                    java.util.Iterator r2 = r2.iterator()
                L_0x00bf:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x00cf
                    java.lang.Object r3 = r2.next()
                    z3.d r3 = (p237z3.C12144d) r3
                    r3.mo30152m(r0)
                    goto L_0x00bf
                L_0x00cf:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.Class r0 = r0.getClass()
                    java.lang.String r0 = r0.getSimpleName()
                    r2.append(r0)
                    goto L_0x0251
                L_0x00e4:
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r1 = r10.f4817b
                    java.lang.Object r0 = r0.get(r1)
                    com.yeelight.yeelib.device.base.c r0 = (com.yeelight.yeelib.device.base.C3010c) r0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r2)
                    java.lang.Class r2 = r0.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    r1.append(r2)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r0.mo23221d0()
                    r1.mo31549L0(r3)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r0.mo23221d0()
                    int r2 = r10.f4818c
                    r1.mo31553N0(r2)
                    com.miot.common.device.Device$Ownership r1 = r0.mo23212W()
                    com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.MINE
                    if (r1 == r2) goto L_0x0123
                    com.miot.common.device.Device$Ownership r1 = r0.mo23212W()
                    com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.OTHERS
                    if (r1 != r2) goto L_0x013f
                L_0x0123:
                    boolean r1 = com.yeelight.yeelib.utils.AppUtils.f4985i
                    if (r1 == 0) goto L_0x013f
                    boolean r1 = r0 instanceof p223w3.C11627r
                    if (r1 == 0) goto L_0x013f
                    com.yeelight.yeelib.managers.YeelightDeviceManager r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7800o0()
                    java.util.List r1 = r1.mo23322x0()
                    int r1 = r1.size()
                    if (r1 != r3) goto L_0x013f
                    r1 = 0
                    com.yeelight.yeelib.utils.AppUtils.f4985i = r1
                    r0.mo23151n()
                L_0x013f:
                    boolean r1 = r0 instanceof com.yeelight.yeelib.device.base.C3012e
                    if (r1 == 0) goto L_0x0254
                    com.yeelight.yeelib.managers.YeelightDeviceManager$i r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r1 = r1.f4788p
                    java.util.Iterator r1 = r1.iterator()
                L_0x014f:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0254
                    java.lang.Object r2 = r1.next()
                    z3.d r2 = (p237z3.C12144d) r2
                    r3 = r0
                    com.yeelight.yeelib.device.base.e r3 = (com.yeelight.yeelib.device.base.C3012e) r3
                    r2.mo30149E(r3)
                    goto L_0x014f
                L_0x0162:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r4 = "Device is undefine, name = "
                    r0.append(r4)
                    java.lang.String r4 = r10.f4816a
                    r0.append(r4)
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r4 = r10.f4817b
                    boolean r0 = r0.containsKey(r4)
                    if (r0 == 0) goto L_0x01e2
                    com.yeelight.yeelib.managers.YeelightDeviceManager$i r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r0 = r0.f4786n
                    java.lang.String r1 = r10.f4817b
                    r0.remove(r1)
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r1 = r10.f4817b
                    java.lang.Object r0 = r0.get(r1)
                    com.yeelight.yeelib.device.base.c r0 = (com.yeelight.yeelib.device.base.C3010c) r0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r2)
                    java.lang.Class r2 = r0.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    r1.append(r2)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r0.mo23221d0()
                    r1.mo31549L0(r3)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r1 = r0.mo23221d0()
                    int r2 = r10.f4818c
                    r1.mo31553N0(r2)
                    java.lang.String r1 = r0.mo23208T()
                    java.lang.String r2 = "yeelink.light.gingko"
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L_0x01cc
                    com.yeelight.yeelib.device.base.PrivateMeshDeviceBase r0 = (com.yeelight.yeelib.device.base.PrivateMeshDeviceBase) r0
                    byte[] r1 = r10.f4819d
                    r0.mo31649k2(r1)
                L_0x01cc:
                    com.yeelight.yeelib.managers.YeelightDeviceManager$i r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    byte[] r1 = r10.f4819d
                    boolean r0 = r0.m7769R0(r1)
                    if (r0 == 0) goto L_0x0254
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r1 = r10.f4817b
                    r0.remove(r1)
                    goto L_0x0251
                L_0x01e2:
                    com.yeelight.yeelib.managers.YeelightDeviceManager$i r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    byte[] r2 = r10.f4819d
                    java.lang.String r3 = r10.f4817b
                    int r4 = r10.f4818c
                    boolean r0 = r0.m7790e1(r2, r3, r4)
                    if (r0 == 0) goto L_0x01f3
                    return
                L_0x01f3:
                    com.yeelight.yeelib.managers.YeelightDeviceManager$i r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.lang.String r2 = r10.f4816a
                    java.lang.String r3 = r10.f4817b
                    byte[] r4 = r10.f4819d
                    w3.f0 r0 = r0.mo23285d1(r2, r3, r4)
                    if (r0 == 0) goto L_0x0254
                    com.yeelight.yeelib.managers.YeelightDeviceManager$i r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r2 = r2.f4786n
                    java.lang.String r3 = r10.f4817b
                    r2.remove(r3)
                    java.util.concurrent.ConcurrentHashMap r2 = com.yeelight.yeelib.managers.YeelightDeviceManager.f4767W
                    java.lang.String r3 = r0.mo23185G()
                    r2.put(r3, r0)
                    com.yeelight.yeelib.device.base.DeviceStatusBase r2 = r0.mo23221d0()
                    int r3 = r10.f4818c
                    r2.mo31553N0(r3)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.Class<w3.f0> r1 = p223w3.C10898f0.class
                    java.lang.String r1 = r1.getSimpleName()
                    r2.append(r1)
                    com.yeelight.yeelib.managers.YeelightDeviceManager$i r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.this
                    com.yeelight.yeelib.managers.YeelightDeviceManager r1 = com.yeelight.yeelib.managers.YeelightDeviceManager.this
                    java.util.List r1 = r1.f4788p
                    java.util.Iterator r1 = r1.iterator()
                L_0x0241:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0251
                    java.lang.Object r2 = r1.next()
                    z3.d r2 = (p237z3.C12144d) r2
                    r2.mo30152m(r0)
                    goto L_0x0241
                L_0x0251:
                    com.yeelight.yeelib.data.DeviceBrowserProvider.m17587b()
                L_0x0254:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.YeelightDeviceManager.C3036i.C3037a.run():void");
            }
        }

        C3036i() {
        }

        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            String name = bluetoothDevice.getName();
            String address = bluetoothDevice.getAddress();
            StringBuilder sb = new StringBuilder();
            sb.append("mLegacyScanCallback: ble device found: ");
            sb.append(address);
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(name);
            sb.append(" : ");
            sb.append(bluetoothDevice.getType());
            sb.append(" : ");
            sb.append(bluetoothDevice.getBondState());
            if (i >= -100 && YeelightDeviceManager.this.f4780h) {
                YeelightDeviceManager.this.f4779g.execute(new C3037a(name, address, i, bArr));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$j */
    class C3038j implements com.miot.api.CommonHandler<String> {
        C3038j(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("refreshWifiDeviceStatus, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.getInt("code") == 0) {
                            String string = jSONObject.getString("did");
                            String string2 = jSONObject.getString("result");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("device: ");
                            sb2.append(string);
                            sb2.append(", prop result: ");
                            sb2.append(string2);
                            C3010c j0 = YeelightDeviceManager.m7794j0(string);
                            if (j0 != null) {
                                j0.mo23164w0(string2);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("refreshWifiDeviceStatus, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$k */
    class C3039k implements com.miot.api.CommonHandler<String> {
        C3039k(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("refreshWifiDeviceInfo, onSucceed : ");
            sb.append(str);
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.getInt("code") == 0) {
                            String string = jSONObject.getString("did");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                            int i2 = jSONObject2.getInt("life");
                            String string2 = jSONObject2.getString("mac");
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("ap");
                            int i3 = jSONObject3.getInt("rssi");
                            String string3 = jSONObject3.getString("ssid");
                            String string4 = jSONObject2.getJSONObject("netif").getString("localIp");
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("DeviceInfo, rssi = ");
                            sb2.append(i3);
                            sb2.append(" , ssid = ");
                            sb2.append(string3);
                            sb2.append(" , mac = ");
                            sb2.append(string2);
                            sb2.append(" , local ip = ");
                            sb2.append(string4);
                            sb2.append(" life = ");
                            sb2.append(i2);
                            C3010c j0 = YeelightDeviceManager.m7794j0(string);
                            if (j0 == null) {
                                j0 = YeelightDeviceManager.m7761L0(string);
                            }
                            if (j0 != null) {
                                j0.mo23221d0().mo31553N0(i3);
                                j0.mo23221d0().mo31559Q0(string3);
                                j0.mo23221d0().mo31527A0(string2);
                                j0.mo23221d0().mo31628z0(string4);
                                j0.mo23221d0().mo31626y0(i2);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("refreshWifiDeviceInfo, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$l */
    class C3040l implements C4007b<String> {
        C3040l() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = YeelightDeviceManager.f4760C;
            StringBuilder sb = new StringBuilder();
            sb.append("requestMiBandType onSuccess: ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    JSONArray jSONArray = jSONObject.getJSONObject(com.miot.api.Constants.EXTRA_PUSH_MESSAGE).getJSONArray("AppBandDevices");
                    String unused2 = YeelightDeviceManager.f4760C;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("requestMiBandType appBandDevices: ");
                    sb2.append(jSONArray.toString());
                    C3108x.f4951e.getSharedPreferences("miband", 0).edit().putString("deviceType", jSONArray.toString()).apply();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = YeelightDeviceManager.f4760C;
            StringBuilder sb = new StringBuilder();
            sb.append("requestMiBandType errorCode: ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$m */
    class C3041m extends BroadcastReceiver {
        C3041m(YeelightDeviceManager yeelightDeviceManager) {
        }

        public void onReceive(Context context, Intent intent) {
            MiPushCommandMessage miPushCommandMessage;
            StringBuilder sb;
            String miPushCommandMessage2;
            MiPushMessage miPushMessage;
            String action = intent.getAction();
            if (action != null) {
                if (!action.equals(com.miot.api.Constants.ACTION_PUSH_COMMAND)) {
                    if (action.equals(com.miot.api.Constants.ACTION_PUSH_MESSAGE) && (intent.getSerializableExtra(com.miot.api.Constants.EXTRA_PUSH_MESSAGE) instanceof MiPushMessage) && (miPushMessage = (MiPushMessage) intent.getSerializableExtra(com.miot.api.Constants.EXTRA_PUSH_MESSAGE)) != null) {
                        String unused = YeelightDeviceManager.f4760C;
                        sb = new StringBuilder();
                        sb.append("message: ");
                        miPushCommandMessage2 = miPushMessage.toString();
                    } else {
                        return;
                    }
                } else if ((intent.getSerializableExtra(com.miot.api.Constants.EXTRA_PUSH_COMMAND) instanceof MiPushCommandMessage) && (miPushCommandMessage = (MiPushCommandMessage) intent.getSerializableExtra(com.miot.api.Constants.EXTRA_PUSH_COMMAND)) != null) {
                    String unused2 = YeelightDeviceManager.f4760C;
                    sb = new StringBuilder();
                    sb.append("command: ");
                    miPushCommandMessage2 = miPushCommandMessage.toString();
                } else {
                    return;
                }
                sb.append(miPushCommandMessage2);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$n */
    class C3042n implements com.miot.api.CommonHandler<String> {
        C3042n(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$o */
    class C3043o implements com.miot.api.CommonHandler<String> {
        C3043o(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$p */
    class C3044p implements com.miot.api.CommonHandler<String> {
        C3044p(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$q */
    class C3045q implements com.miot.api.CommonHandler<String> {
        C3045q(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group open, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$r */
    class C3046r implements com.miot.api.CommonHandler<String> {
        C3046r(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$s */
    class C3047s implements com.miot.api.CommonHandler<String> {
        C3047s(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$t */
    class C3048t implements com.miot.api.CommonHandler<String> {
        C3048t(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$u */
    class C3049u implements com.miot.api.CommonHandler<String> {
        C3049u(YeelightDeviceManager yeelightDeviceManager) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group close, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.YeelightDeviceManager$v */
    class C3050v implements C4007b<String> {
        C3050v() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = YeelightDeviceManager.f4760C;
            StringBuilder sb = new StringBuilder();
            sb.append("sync device group to cloud onSuccess: ");
            sb.append(str);
            try {
                if (TextUtils.equals("200", new JSONObject(str).optString("code"))) {
                    YeelightDeviceManager.m7747A1(true);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = YeelightDeviceManager.f4760C;
            StringBuilder sb = new StringBuilder();
            sb.append("sync device group to cloud onFailure: ");
            sb.append(str);
        }
    }

    public YeelightDeviceManager() {
        this.f4780h = false;
        this.f4781i = false;
        this.f4782j = false;
        new ArrayList();
        this.f4789q = new ArrayList<String>() {
            {
                add("yeelink.light.mono1");
                add("yeelink.light.mono2");
                add("yeelink.light.mono4");
                add("yeelink.light.mono5");
                add("yeelink.light.monoa");
                add("yeelink.light.monob");
                add("yeelink.light.color1");
                add("yeelink.light.color2");
                add("yeelink.light.color3");
                add("yeelink.light.color4");
                add("yeelink.light.color5");
                add("yeelink.light.color6");
                add("yeelink.light.color8");
                add("yeelink.light.colora");
                add("yeelink.light.colorb");
                add("yeelink.light.colore");
                add("yeelink.light.colorc");
                add("yeelink.light.plate2");
                add("yeelink.light.ct2");
                add("yeelink.light.cta");
                add("yeelink.light.ctc");
                add("yeelink.light.panel1");
                add("yeelink.light.panel3");
                add("yeelink.light.strip1");
                add("yeelink.light.strip2");
                add("yeelink.light.strip4");
                add("yeelink.light.strip6");
                add("yeelink.light.strip8");
                add("yeelink.light.stripa");
                add("yeelink.light.lamp1");
                add("yeelink.light.lamp4");
                add("yeelink.light.lamp7");
                add("yeelink.light.lamp8");
                add("yeelink.light.lamp9");
                add("yeelink.light.lamp10");
                add("yeelink.light.lamp15");
                add("yeelink.light.lamp17");
                add("yeelink.light.lamp2");
                add("yeelink.light.lamp3");
                add("yeelink.light.lamp5");
                add("yeelink.light.ble1");
                add("yeelink.light.bslamp1");
                add("yeelink.light.bslamp2");
                add("yeelink.light.bslamp3");
                add("yeelink.light.lamp19");
                add("yeelink.light.ceiling1");
                add("yeelink.light.ceiling2");
                add("yeelink.light.ceiling3");
                add("yeelink.light.ceiling4");
                add("yeelink.light.ceiling5");
                add("yeelink.light.ceiling6");
                add("yeelink.light.ceiling7");
                add("yeelink.light.ceiling8");
                add("yeelink.light.ceiling9");
                add("yeelink.light.ceiling10");
                add("yeelink.light.ceiling11");
                add("yeelink.light.ceiling12");
                add("yeelink.light.ceiling13");
                add("yeelink.light.ceiling14");
                add("yeelink.light.ceiling15");
                add("yeelink.light.ceiling16");
                add("yeelink.light.ceiling17");
                add("yeelink.light.ceiling18");
                add("yeelink.light.ceiling19");
                add("yeelink.light.ceiling20");
                add("yeelink.light.ceiling21");
                add("yeelink.light.ceiling22");
                add("yeelink.light.ceiling23");
                add("yeelink.light.ceiling24");
                add("yeelink.light.ceil26");
                add("yeelink.light.ceil27");
                add("yeelink.light.ceil29");
                add("yeelink.light.ceil30");
                add("yeelink.light.ceil31");
                add("yeelink.light.ceil32");
                add("yeelink.light.ceil33");
                add("yeelink.light.ceil35");
                add("yeelink.light.ceila");
                add("yeelink.light.ceilb");
                add("yeelink.light.ceilc");
                add("yeelink.light.ceild");
                add("yeelink.light.ceile");
                add("yilai.light.ceiling1");
                add("yilai.light.ceiling2");
                add("yilai.light.ceiling3");
                add("yeelink.light.gingko");
                add("yeelink.bhf_light.v1");
                add("yeelink.light.dnlight2");
                add("yeelink.light.meshbulb1");
                add("yeelink.light.meshbulb2");
                add("yeelink.light.spot1");
                add("yeelink.light.dn2grp");
                add("yeelink.light.mb1grp");
                add("yeelink.light.mb2grp");
                add("yeelink.light.sp1grp");
                add("yeelink.light.ml1");
                add("yeelink.light.ml2");
                add("yeelink.light.fancl1");
                add("yeelink.light.fancl2");
                add("yeelink.light.fancl5");
                add("yeelink.light.fancl6");
            }
        };
        this.f4790r = new ArrayList<String>() {
            {
                add("yeelink.light.mono1");
                add("yeelink.light.mono2");
                add("yeelink.light.mono4");
                add("yeelink.light.mono5");
                add("yeelink.light.monoa");
                add("yeelink.light.monob");
                add("yeelink.light.color1");
                add("yeelink.light.color2");
                add("yeelink.light.color3");
                add("yeelink.light.color4");
                add("yeelink.light.color5");
                add("yeelink.light.color6");
                add("yeelink.light.color8");
                add("yeelink.light.colorb");
                add("yeelink.light.colore");
                add("yeelink.light.colorc");
                add("yeelink.light.plate2");
                add("yeelink.light.ct2");
                add("yeelink.light.cta");
                add("yeelink.light.ctc");
                add("yeelink.light.panel1");
                add("yeelink.light.panel3");
                add("yeelink.light.strip1");
                add("yeelink.light.strip2");
                add("yeelink.light.strip4");
                add("yeelink.light.strip6");
                add("yeelink.light.strip8");
                add("yeelink.light.stripa");
                add("yeelink.light.lamp1");
                add("yeelink.light.lamp4");
                add("yeelink.light.lamp7");
                add("yeelink.light.lamp8");
                add("yeelink.light.lamp9");
                add("yeelink.light.lamp10");
                add("yeelink.light.lamp15");
                add("yeelink.light.lamp2");
                add("yeelink.light.lamp3");
                add("yeelink.light.lamp5");
                add("yeelink.light.lamp17");
                add("yeelink.light.ble1");
                add("yeelink.light.bslamp1");
                add("yeelink.light.bslamp2");
                add("yeelink.light.bslamp3");
                add("yeelink.light.lamp19");
                add("yeelink.light.ceiling1");
                add("yeelink.light.ceiling2");
                add("yeelink.light.ceiling3");
                add("yeelink.light.ceiling4");
                add("yeelink.light.ceiling5");
                add("yeelink.light.ceiling6");
                add("yeelink.light.ceiling7");
                add("yeelink.light.ceiling8");
                add("yeelink.light.ceiling9");
                add("yeelink.light.ceiling10");
                add("yeelink.light.ceiling11");
                add("yeelink.light.ceiling12");
                add("yeelink.light.ceiling13");
                add("yeelink.light.ceiling14");
                add("yeelink.light.ceiling15");
                add("yeelink.light.ceiling16");
                add("yeelink.light.ceiling17");
                add("yeelink.light.ceiling18");
                add("yeelink.light.ceiling19");
                add("yeelink.light.ceiling20");
                add("yeelink.light.ceiling21");
                add("yeelink.light.ceiling22");
                add("yeelink.light.ceiling23");
                add("yeelink.light.ceiling24");
                add("yeelink.light.ceil26");
                add("yeelink.light.ceil27");
                add("yeelink.light.ceil29");
                add("yeelink.light.ceil30");
                add("yeelink.light.ceil31");
                add("yeelink.light.ceil32");
                add("yeelink.light.ceil33");
                add("yeelink.light.ceil35");
                add("yeelink.light.ceila");
                add("yeelink.light.ceilb");
                add("yeelink.light.ceilc");
                add("yeelink.light.ceild");
                add("yeelink.light.ceile");
                add("yilai.light.ceiling1");
                add("yilai.light.ceiling2");
                add("yilai.light.ceiling3");
                add("yeelink.light.gingko");
                add("yeelink.bhf_light.v1");
                add("yeelink.light.fancl1");
                add("yeelink.light.fancl2");
                add("yeelink.light.fancl5");
                add("yeelink.light.fancl6");
            }
        };
        this.f4791s = new ArrayList<String>() {
            {
                add("yeelink.light.mono1");
                add("yeelink.light.mono2");
                add("yeelink.light.mono4");
                add("yeelink.light.mono5");
                add("yeelink.light.monoa");
                add("yeelink.light.monob");
                add("yeelink.light.color1");
                add("yeelink.light.color2");
                add("yeelink.light.color3");
                add("yeelink.light.color4");
                add("yeelink.light.color5");
                add("yeelink.light.color6");
                add("yeelink.light.color8");
                add("yeelink.light.colora");
                add("yeelink.light.colorb");
                add("yeelink.light.colore");
                add("yeelink.light.colorc");
                add("yeelink.light.plate2");
                add("yeelink.light.ct2");
                add("yeelink.light.cta");
                add("yeelink.light.ctc");
                add("yeelink.light.panel1");
                add("yeelink.light.panel3");
                add("yeelink.light.strip1");
                add("yeelink.light.strip2");
                add("yeelink.light.strip4");
                add("yeelink.light.strip6");
                add("yeelink.light.strip8");
                add("yeelink.light.stripa");
                add("yeelink.light.lamp1");
                add("yeelink.light.lamp4");
                add("yeelink.light.lamp7");
                add("yeelink.light.lamp8");
                add("yeelink.light.lamp9");
                add("yeelink.light.lamp10");
                add("yeelink.light.lamp15");
                add("yeelink.light.lamp2");
                add("yeelink.light.lamp3");
                add("yeelink.light.lamp5");
                add("yeelink.light.lamp17");
                add("yeelink.light.bslamp1");
                add("yeelink.light.bslamp2");
                add("yeelink.light.bslamp3");
                add("yeelink.light.lamp19");
                add("yeelink.light.ceiling1");
                add("yeelink.light.ceiling2");
                add("yeelink.light.ceiling3");
                add("yeelink.light.ceiling4");
                add("yeelink.light.ceiling5");
                add("yeelink.light.ceiling6");
                add("yeelink.light.ceiling7");
                add("yeelink.light.ceiling8");
                add("yeelink.light.ceiling9");
                add("yeelink.light.ceiling10");
                add("yeelink.light.ceiling11");
                add("yeelink.light.ceiling12");
                add("yeelink.light.ceiling13");
                add("yeelink.light.ceiling14");
                add("yeelink.light.ceiling15");
                add("yeelink.light.ceiling16");
                add("yeelink.light.ceiling17");
                add("yeelink.light.ceiling18");
                add("yeelink.light.ceiling19");
                add("yeelink.light.ceiling20");
                add("yeelink.light.ceiling21");
                add("yeelink.light.ceiling22");
                add("yeelink.light.ceiling23");
                add("yeelink.light.ceiling24");
                add("yeelink.light.ceil26");
                add("yeelink.light.ceil27");
                add("yeelink.light.ceil29");
                add("yeelink.light.ceil30");
                add("yeelink.light.ceil31");
                add("yeelink.light.ceil32");
                add("yeelink.light.ceil33");
                add("yeelink.light.ceil35");
                add("yeelink.light.ceila");
                add("yeelink.light.ceilb");
                add("yeelink.light.ceilc");
                add("yeelink.light.ceild");
                add("yeelink.light.ceile");
                add("yilai.light.ceiling1");
                add("yilai.light.ceiling2");
                add("yilai.light.ceiling3");
                add("yeelink.wifispeaker.v1");
                add("yeelink.bhf_light.v1");
                add("yeelink.gateway.v1");
                add("yeelink.gateway.va");
                add("yeelink.curtain.ctmt1");
                add("yeelink.switch.sw1");
                add("yeelink.plug.plug");
                add("yeelink.light.fancl1");
                add("yeelink.light.fancl2");
                add("yeelink.light.fancl5");
                add("yeelink.light.fancl6");
            }
        };
        this.f4792t = new ArrayList<String>() {
            {
                add("yeelink.light.ble1");
                add("yeelink.bleremote.v1");
                add("yeelink.light.gingko");
                add("yeelink.light.dnlight2");
                add("yeelink.light.meshbulb1");
                add("yeelink.light.meshbulb2");
                add("yeelink.light.spot1");
                add("yeelink.light.dn2grp");
                add("yeelink.light.mb1grp");
                add("yeelink.light.mb2grp");
                add("yeelink.light.sp1grp");
                add("yeelink.light.ml1");
                add("yeelink.light.ml2");
            }
        };
        this.f4793u = new ArrayList<String>() {
            {
                add("yeelink.light.dnlight2");
                add("yeelink.light.meshbulb1");
                add("yeelink.light.meshbulb2");
                add("yeelink.light.spot1");
                add("yeelink.light.dn2grp");
                add("yeelink.light.mb1grp");
                add("yeelink.light.mb2grp");
                add("yeelink.light.sp1grp");
                add("yeelink.light.ml1");
                add("yeelink.light.ml2");
                add("yeelink.curtain.ctmt1");
                add("yeelink.light.fancl1");
                add("yeelink.light.fancl2");
                add("yeelink.light.fancl5");
                add("yeelink.light.fancl6");
            }
        };
        new ArrayList<String>() {
            {
                add("yeelink.bleremote.v1");
            }
        };
        this.f4794v = new ArrayList<String>() {
            {
                add("yeelink.light.group");
            }
        };
        new ArrayList<String>() {
            {
                add("yeelink.light.room");
            }
        };
        new ArrayList<String>() {
            {
                add("yeelink.light.landevice");
            }
        };
        new ArrayList<String>() {
            {
                add("yeelink.light.mesh");
            }
        };
        this.f4795w = new ArrayList<Device.Ownership>() {
            {
                add(Device.Ownership.MINE);
                add(Device.Ownership.OTHERS);
            }
        };
        this.f4796x = new ArrayList<Device.Ownership>() {
            {
                add(Device.Ownership.MINE);
                add(Device.Ownership.OTHERS);
                add(Device.Ownership.NOONES);
            }
        };
        this.f4797y = new ArrayList<Device.Ownership>() {
            {
                add(Device.Ownership.NOONES);
            }
        };
        this.f4798z = new C3027a(Looper.getMainLooper());
        this.f4771A = new C3028b();
        this.f4772B = new C3041m(this);
        this.f4786n = new CopyOnWriteArrayList();
        this.f4788p = new ArrayList();
        C8272e.m19511b().mo35210j(this);
        C3051a.m7925r().mo23358M(this);
        C8281l.m19542b().mo35225e(this);
    }

    public YeelightDeviceManager(Context context) {
        this();
        this.f4773a = context;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        this.f4776d = bluetoothManager;
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f4777e = adapter;
        if (adapter == null) {
            C9197p.m22175h();
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f4778f = adapter.getBluetoothLeScanner();
        }
        this.f4779g = Executors.newFixedThreadPool(5);
        mo23311r1();
    }

    /* renamed from: A1 */
    public static void m7747A1(boolean z) {
        C3283v.m8844j("SYNC_GROUP_FLAG", z);
    }

    /* renamed from: E0 */
    private List<C3010c> m7751E0() {
        return mo23273N0(this.f4792t, this.f4797y);
    }

    /* renamed from: E1 */
    public static void m7752E1() {
        if (!f4762R) {
            for (C3010c next : f4767W.values()) {
                if ((next instanceof WifiDeviceBase) && next.mo23145k0()) {
                    ((WifiDeviceBase) next).mo31492U1();
                }
            }
            for (C3010c next2 : f4767W.values()) {
                if ((next2 instanceof C6100g) && next2.mo23145k0()) {
                    ((C6100g) next2).mo31732g2();
                }
            }
            C3029c cVar = new C3029c();
            f4764T = cVar;
            f4763S.schedule(cVar, 3300000);
            C3030d dVar = new C3030d();
            f4766V = dVar;
            f4765U.schedule(dVar, 0, 6000);
            f4762R = true;
        }
    }

    /* renamed from: F1 */
    public static void m7754F1() {
        if (!m7766O0()) {
            String str = AppUtils.f4988l + "apis/app/api/v3/w/user/groups/sync";
            List<C3010c> h0 = m7800o0().mo23292h0();
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                for (C3010c next : h0) {
                    C6119c cVar = null;
                    if (next instanceof C6119c) {
                        cVar = (C6119c) next;
                    }
                    if (cVar != null && !(cVar instanceof C6164e) && !(cVar instanceof C6169f)) {
                        if (cVar.mo31751I1() > 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("name", next.mo23210U());
                            jSONObject2.put("delayTime", next.mo23181D());
                            JSONArray jSONArray2 = new JSONArray();
                            for (C3012e next2 : cVar.mo31753K1()) {
                                if (!(next2 instanceof C6081a)) {
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put("realdid", next2 instanceof C6100g ? ((C6100g) next2).mo31698M1() : next2.mo23185G());
                                    jSONObject3.put("model", next2.mo23208T());
                                    jSONArray2.put(jSONObject3);
                                }
                            }
                            jSONObject2.put("subDevices", jSONArray2);
                            jSONArray.put(jSONObject2);
                        }
                    }
                }
                jSONObject.put("groups", jSONArray);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C3988b.m11575k(str, (Map<String, String>) null, (Map<String, String>) null, jSONObject.toString(), String.class, new C3050v(), true, ContentType.JSON);
        }
    }

    /* renamed from: G0 */
    private List<C3010c> m7756G0() {
        return mo23273N0(this.f4791s, this.f4797y);
    }

    /* renamed from: K1 */
    private static void m7759K1() {
        for (C3010c next : f4767W.values()) {
            if (next instanceof C6100g) {
                ((C6100g) next).mo31733h2();
            }
        }
    }

    /* renamed from: L0 */
    public static C6100g m7761L0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Map.Entry<String, C3010c> value : f4767W.entrySet()) {
            C3010c cVar = (C3010c) value.getValue();
            if (cVar instanceof C6100g) {
                C6100g gVar = (C6100g) cVar;
                if (str.equals(gVar.mo31698M1())) {
                    return gVar;
                }
            }
        }
        return null;
    }

    /* renamed from: M1 */
    public static void m7763M1() {
        if (f4762R) {
            f4764T.cancel();
            f4763S.purge();
            f4766V.cancel();
            f4765U.purge();
            for (C3010c next : f4767W.values()) {
                if (next instanceof WifiDeviceBase) {
                    ((WifiDeviceBase) next).mo31493V1();
                }
            }
            m7759K1();
            f4762R = false;
        }
    }

    /* renamed from: O0 */
    public static boolean m7766O0() {
        return C3283v.m8836b("SYNC_GROUP_FLAG", false);
    }

    /* renamed from: P */
    private void m7767P() {
        if (!C3051a.m7928z()) {
            AppUtils.m8300u(f4760C, "addConnectedBleDevice, no reason to be here!");
        }
        for (BluetoothDevice next : this.f4776d.getConnectedDevices(7)) {
            StringBuilder sb = new StringBuilder();
            sb.append("addConnectedBleDevice, device address = ");
            sb.append(next.getAddress());
            if (f4767W.containsKey(next.getAddress())) {
                f4767W.get(next.getAddress()).mo23221d0().mo31549L0(true);
                if (!f4767W.get(next.getAddress()).mo23145k0() && !f4767W.get(next.getAddress()).mo23147l0()) {
                    f4767W.get(next.getAddress()).mo23151n();
                }
            } else if (next.getName() != null && next.getName().contains("XMCTD_")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DeviceManager, addConnectedBleDevice, id: ");
                sb2.append(next.getAddress());
                C11627r rVar = new C11627r(next.getAddress(), next.getAddress(), Device.Ownership.MINE, true);
                f4767W.put(rVar.mo23185G(), rVar);
                rVar.mo23151n();
            } else if (m7775U0(next.getName())) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Found miband, name: ");
                sb3.append(next.getName());
                sb3.append(", device id: ");
                sb3.append(next.getAddress());
                if (!f4769Y.containsKey(next.getAddress())) {
                    C10343e eVar = new C10343e(next.getAddress());
                    eVar.mo41922d(21);
                    f4769Y.put(next.getAddress(), eVar);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m7768Q0(String str, boolean z) {
        Intent intent = new Intent();
        try {
            int i = QuickConnectRequestProgressActivity.f11212c;
            intent.setClass(this.f4773a, QuickConnectRequestProgressActivity.class);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        intent.addFlags(268435456);
        intent.putExtra("com.yeelight.cherry.device_id", str);
        intent.putExtra("request_flag", z);
        this.f4773a.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public boolean m7769R0(byte[] bArr) {
        return m7771S0(bArr) && bArr[19] != 2;
    }

    /* renamed from: S */
    public static boolean m7770S(JSONObject jSONObject, com.miot.api.CommonHandler<String> commonHandler) {
        try {
            MiotManager.getDeviceManager().callSmarthomeApi("/home/batchrpc", jSONObject, commonHandler);
            return true;
        } catch (MiotException unused) {
            return false;
        }
    }

    /* renamed from: S0 */
    private boolean m7771S0(byte[] bArr) {
        return bArr[5] == -107 && bArr[6] == -2;
    }

    /* renamed from: T */
    private void m7772T() {
        this.f4786n.clear();
        for (C3010c next : f4767W.values()) {
            if ((next instanceof C6081a) && next.mo23149m0()) {
                this.f4786n.add(next.mo23185G());
            }
        }
    }

    /* renamed from: T0 */
    public static boolean m7773T0(String str) {
        return "yeelink.light.dnlight2".equals(str) || "yeelink.light.meshbulb1".equals(str) || "yeelink.light.meshbulb2".equals(str) || "yeelink.light.spot1".equals(str) || "yeelink.light.dn2grp".equals(str) || "yeelink.light.mb1grp".equals(str) || "yeelink.light.mb2grp".equals(str) || "yeelink.light.sp1grp".equals(str) || "yeelink.light.ml1".equals(str) || "yeelink.light.ml2".equals(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public boolean m7774U() {
        return Build.VERSION.SDK_INT >= 31 ? ContextCompat.checkSelfPermission(this.f4773a, "android.permission.BLUETOOTH_SCAN") == 0 : ContextCompat.checkSelfPermission(this.f4773a, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* renamed from: U0 */
    public static boolean m7775U0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String string = C3108x.f4951e.getSharedPreferences("miband", 0).getString("deviceType", "");
        if (TextUtils.isEmpty(string)) {
            string = "[\"Amazfit\",\"MI\",\"MI1A\",\"MI1S\",\"MI Band 2\",\"Mi Band 3\",\"Mi Smart Band 4\"]";
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            for (int i = 0; i < jSONArray.length(); i++) {
                String string2 = jSONArray.getString(i);
                if (!TextUtils.isEmpty(string2)) {
                    if (str.toLowerCase().contains(string2.toLowerCase())) {
                        return true;
                    }
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    /* renamed from: V */
    private void m7776V() {
        for (C3010c next : f4767W.values()) {
            if (next instanceof C6081a) {
                next.mo23221d0().mo31549L0(false);
            }
        }
        DeviceDataProvider.m17611X();
    }

    /* renamed from: V0 */
    public static boolean m7777V0(String str) {
        if (!TextUtils.isEmpty(str)) {
            return f4770Z.contains(str);
        }
        return false;
    }

    /* renamed from: W */
    private void m7778W() {
        for (C3010c next : f4767W.values()) {
            if (!(next instanceof C6081a)) {
                next.mo23163v0();
                f4767W.remove(next.mo23185G());
            }
        }
    }

    /* renamed from: W0 */
    private boolean m7779W0(byte[] bArr) {
        return m7771S0(bArr) && bArr[19] == 2;
    }

    /* renamed from: X */
    public static boolean m7780X(String str) {
        return f4767W.get(str) != null;
    }

    /* renamed from: X0 */
    private boolean m7781X0(String str) {
        return "yeelink.light.dnlight2".equals(str) || "yeelink.light.meshbulb1".equals(str) || "yeelink.light.meshbulb2".equals(str) || "yeelink.light.spot1".equals(str) || "yeelink.light.dn2grp".equals(str) || "yeelink.light.mb1grp".equals(str) || "yeelink.light.mb2grp".equals(str) || "yeelink.light.sp1grp".equals(str) || "yeelink.light.ml1".equals(str) || "yeelink.light.ml2".equals(str) || "yeelink.curtain.ctmt1".equals(str) || "yeelink.light.fancl1".equals(str) || "yeelink.light.fancl2".equals(str) || "yeelink.light.fancl5".equals(str) || "yeelink.light.fancl6".equals(str);
    }

    /* renamed from: Y0 */
    private void m7782Y0(C6100g gVar, String str) {
        C3010c j0 = m7794j0(str);
        if (j0 != null) {
            String address = j0.mo23206S().getAddress();
            gVar.mo23194L0(address);
            StringBuilder sb = new StringBuilder();
            sb.append("mesh device found in open app device, device token = ");
            sb.append(j0.mo23206S().getDevice().getDeviceToken());
            sb.append(", device mac = ");
            sb.append(address);
            sb.append(" , device id = ");
            sb.append(gVar.mo23185G());
            gVar.mo23199O0(j0.mo23212W());
            gVar.mo31700d2(j0.mo23206S().getDevice().getDeviceToken());
            gVar.mo23196M0(j0.mo23206S());
            gVar.mo31701e2(str);
            if (!TextUtils.isEmpty(str)) {
                f4767W.remove(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public synchronized void m7783Z0(List<com.p022mi.iot.common.abstractdevice.AbstractDevice> list) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append("cloud spec v2 device retrieve stamp: ");
        sb.append(valueOf);
        for (com.p022mi.iot.common.abstractdevice.AbstractDevice next : list) {
            if (next == null) {
                C3278f.m8797b(new AppUtils.SuicideException("NullDevice", "onCloudSpecDeviceFound, null device, user id: " + C3051a.m7925r().mo23366v() + ", server: " + C8281l.m19542b().mo35223a()));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remote spec device ID: ");
                sb2.append(next.getDeviceId());
                sb2.append(", model: ");
                sb2.append(next.getDevice().getDeviceType());
                sb2.append(", name :");
                sb2.append(next.getName());
                sb2.append(", mac: ");
                sb2.append(next.getDevice().getMac());
                C3010c cVar = f4767W.get(next.getDeviceId());
                if (!f4767W.containsKey(next.getDeviceId()) || cVar == null || cVar.mo23204R() == null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onCloudSpecDeviceFound, new device, trying to build it, device model: ");
                    sb3.append(next.getDevice().getDeviceType());
                    if (f4767W.containsKey(next.getDevice().getRealID())) {
                        C6100g a = C8244a.m19442a(next);
                        if (a == null) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("mesh device is null: ");
                            sb4.append(next.getName());
                            sb4.append("   deviceId: ");
                            sb4.append(next.getDeviceId());
                        } else {
                            m7782Y0(a, a.mo31698M1());
                            a.mo31699X1(next);
                            a.mo23207S0(valueOf);
                            f4767W.put(next.getDeviceId(), a);
                            DeviceDataProvider.m17615a0(a);
                        }
                    }
                } else {
                    C6100g gVar = (C6100g) cVar;
                    m7782Y0(gVar, next.getDevice().getRealID());
                    gVar.mo31699X1(next);
                    gVar.mo23207S0(valueOf);
                }
            }
        }
        for (C3010c next2 : mo23252A0()) {
            if (!next2.mo23224f0().equals(valueOf)) {
                DeviceDataProvider.m17627i(next2);
            }
        }
        DeviceDataProvider.m17611X();
        m7763M1();
        m7752E1();
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public synchronized void m7785a1(List<AbstractDevice> list) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append("cloud device retrieve stamp: ");
        sb.append(valueOf);
        for (AbstractDevice next : list) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("remote device ID: ");
            sb2.append(next.getDeviceId());
            sb2.append(", address: ");
            sb2.append(next.getAddress());
            sb2.append(", name :");
            sb2.append(next.getName());
            sb2.append(", rssi: ");
            sb2.append(next.getDevice().getConnectionInfo().getRssi());
            sb2.append(", device owership = ");
            sb2.append(next.getOwnership());
            if (!next.getDeviceModel().equals("yeelink.bleremote.v1")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("remote wifi device found, device name: ");
                sb3.append(next.getName());
                m7788c1(next);
                boolean X0 = m7781X0(next.getDeviceModel());
                if (f4767W.containsKey(next.getDeviceId())) {
                    C3010c cVar = f4767W.get(next.getDeviceId());
                    if (cVar != null) {
                        if (!cVar.mo23188I().mo31880a().equals(next.getDeviceModel()) && !X0) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("locale device model : ");
                            sb4.append(cVar.mo23188I().mo31880a());
                            sb4.append(" , remote device model = ");
                            sb4.append(next.getDeviceModel());
                            Uri b0 = DeviceDataProvider.m17617b0(cVar, next.getDeviceModel());
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("update uri = ");
                            sb5.append(b0.toString());
                        }
                        cVar.mo23196M0(next);
                        cVar.mo23207S0(valueOf);
                    }
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("onCloudWifiDeviceFound, new device, trying to build it, device model: ");
                    sb6.append(next.getDeviceModel());
                    C3010c a = C6088b.m17785a(next);
                    if (a != null) {
                        a.mo23196M0(next);
                        a.mo23207S0(valueOf);
                        f4767W.put(next.getDeviceId(), a);
                        if (!X0 && (next.getOwnership() == Device.Ownership.MINE || next.getOwnership() == Device.Ownership.OTHERS)) {
                            DeviceDataProvider.m17615a0(a);
                        }
                    }
                }
            }
        }
        for (C3010c next2 : mo23256C0()) {
            if (!next2.mo23224f0().equals(valueOf) && ((next2 instanceof WifiDeviceBase) || (next2 instanceof C6117h) || (next2 instanceof C10797d1))) {
                DeviceDataProvider.m17627i(next2);
            }
        }
        DeviceDataProvider.m17611X();
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public void m7787b1(List<AbstractDevice> list) {
        for (AbstractDevice next : list) {
            StringBuilder sb = new StringBuilder();
            sb.append("local device ID: ");
            sb.append(next.getDeviceId());
            sb.append(", address: ");
            sb.append(next.getAddress());
            sb.append(" , name :");
            sb.append(next.getName());
            sb.append(", model : ");
            sb.append(next.getDeviceModel());
            String q0 = m7803q0(next.getAddress());
            next.setName(C3088r.m8117g().mo23473m(next.getDeviceModel()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("####### onLocalWifiDeviceFound, device: ");
            sb2.append(q0);
            if (f4767W.containsKey(q0)) {
                C3010c cVar = f4767W.get(q0);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("onLocalWifiDeviceFound, existing device model: ");
                sb3.append(cVar.mo23208T());
                cVar.mo23196M0(next);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("onLocalWifiDeviceFound, new device, trying to build it, device model: ");
                sb4.append(next.getDeviceModel());
                C3010c a = C6088b.m17785a(next);
                if (a != null) {
                    a.mo23196M0(next);
                    f4767W.put(q0, a);
                }
            }
        }
        DeviceBrowserProvider.m17587b();
    }

    /* renamed from: c1 */
    private void m7788c1(AbstractDevice abstractDevice) {
        StringBuilder sb = new StringBuilder();
        sb.append("parse local device with address: ");
        sb.append(abstractDevice.getAddress());
        if (abstractDevice.isOnline()) {
            String str = null;
            Iterator<C3010c> it = f4767W.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3010c next = it.next();
                if (next instanceof WifiDeviceBase) {
                    WifiDeviceBase wifiDeviceBase = (WifiDeviceBase) next;
                    if (wifiDeviceBase.mo23206S() != null && ((wifiDeviceBase.mo23206S().getDeviceId() == null || wifiDeviceBase.mo23206S().getDeviceId().isEmpty()) && m7803q0(abstractDevice.getAddress()).equals(m7803q0(wifiDeviceBase.mo23204R())))) {
                        str = m7803q0(abstractDevice.getAddress());
                        break;
                    }
                }
            }
            if (str != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove local device with key: ");
                sb2.append(str);
                f4767W.remove(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e1 */
    public boolean m7790e1(byte[] bArr, String str, int i) {
        boolean z;
        if (m7779W0(bArr)) {
            byte b = (bArr[9] & 255) | ((bArr[10] & 255) << 8);
            StringBuilder sb = new StringBuilder();
            sb.append("parse mesh device, pid = ");
            sb.append(b);
            if (b == 948) {
                C11541o0 o0Var = new C11541o0(str);
                o0Var.mo23221d0().mo31553N0(i);
                f4767W.put(o0Var.mo23204R(), o0Var);
                for (C12144d m : this.f4788p) {
                    m.mo30152m(o0Var);
                }
            } else if (b == 2076) {
                C11729u0 u0Var = new C11729u0(str);
                u0Var.mo23221d0().mo31553N0(i);
                f4767W.put(u0Var.mo23204R(), u0Var);
                for (C12144d m2 : this.f4788p) {
                    m2.mo30152m(u0Var);
                }
            } else if (b != 2342) {
                switch (b) {
                    case 995:
                        C11451m0 m0Var = new C11451m0(str);
                        m0Var.mo23221d0().mo31553N0(i);
                        f4767W.put(m0Var.mo23204R(), m0Var);
                        for (C12144d m3 : this.f4788p) {
                            m3.mo30152m(m0Var);
                        }
                        break;
                    case 996:
                        C11405l0 l0Var = new C11405l0(str);
                        l0Var.mo23221d0().mo31553N0(i);
                        f4767W.put(l0Var.mo23204R(), l0Var);
                        for (C12144d m4 : this.f4788p) {
                            m4.mo30152m(l0Var);
                        }
                        break;
                    case 997:
                        C11698t0 t0Var = new C11698t0(str);
                        t0Var.mo23221d0().mo31553N0(i);
                        f4767W.put(t0Var.mo23204R(), t0Var);
                        for (C12144d m5 : this.f4788p) {
                            m5.mo30152m(t0Var);
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                C11762v0 v0Var = new C11762v0(str);
                v0Var.mo23221d0().mo31553N0(i);
                f4767W.put(v0Var.mo23204R(), v0Var);
                for (C12144d m6 : this.f4788p) {
                    m6.mo30152m(v0Var);
                }
            }
            z = true;
            if (z) {
                this.f4786n.remove(str);
                DeviceBrowserProvider.m17587b();
                return true;
            }
        }
        return false;
    }

    /* renamed from: f1 */
    private MeshNetWork m7792f1(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12380a);
        int columnIndex2 = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12382c);
        int columnIndex3 = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12381b);
        int columnIndex4 = cursor.getColumnIndex(C6043b.C6054f.C6055a.f12383d);
        MeshNetWork meshNetWork = new MeshNetWork();
        meshNetWork.setId(cursor.getInt(columnIndex));
        meshNetWork.setName(cursor.getString(columnIndex2));
        meshNetWork.setNetworkName(cursor.getString(columnIndex3));
        meshNetWork.setPassword(cursor.getString(columnIndex4));
        StringBuilder sb = new StringBuilder();
        sb.append("mesh name = ");
        sb.append(meshNetWork.getNetworkName());
        sb.append(", pwd = ");
        sb.append(meshNetWork.getPassword());
        return meshNetWork;
    }

    /* renamed from: i1 */
    public static void m7793i1() {
        List<Property> I1;
        if (C3051a.m7925r().mo23351A()) {
            ArrayList arrayList = new ArrayList();
            for (C3010c next : f4767W.values()) {
                if ((next instanceof C6100g) && next.mo23145k0() && (I1 = ((C6100g) next).mo31712I1()) != null) {
                    arrayList.addAll(I1);
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    MiotManager.getControllerManager().getPropertiesV2(arrayList, new C3031e());
                } catch (IotException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: j0 */
    public static C3010c m7794j0(String str) {
        return f4767W.get(str);
    }

    /* renamed from: l0 */
    public static DeviceType m7796l0(String str) {
        return C8277g.m19534a(str);
    }

    /* renamed from: o0 */
    public static YeelightDeviceManager m7800o0() {
        if (f4761Q == null) {
            f4761Q = new YeelightDeviceManager();
        }
        return f4761Q;
    }

    /* renamed from: p0 */
    public static YeelightDeviceManager m7802p0(Context context) {
        if (f4761Q == null) {
            f4761Q = new YeelightDeviceManager(context);
        }
        return f4761Q;
    }

    /* renamed from: q0 */
    private String m7803q0(String str) {
        String[] split = str.toLowerCase().split(Constants.COLON_SEPARATOR);
        if (split.length < 2) {
            return "";
        }
        return split[split.length - 2] + Constants.COLON_SEPARATOR + split[split.length - 1];
    }

    /* renamed from: r0 */
    public static C3012e m7804r0(String str) {
        C3010c j0 = m7794j0(str);
        if ((j0 instanceof C3012e) || j0 == null) {
            return (C3012e) j0;
        }
        AppUtils.m8300u(f4760C, "not light device id!!!!!");
        return null;
    }

    /* renamed from: t */
    static /* synthetic */ int m7806t(YeelightDeviceManager yeelightDeviceManager) {
        int i = yeelightDeviceManager.f4785m;
        yeelightDeviceManager.f4785m = i + 1;
        return i;
    }

    /* renamed from: w1 */
    public static void m7809w1() {
        C3988b.m11567c(AppUtils.f4993q + "mihome_key_value/get/third_party_mibind/AppBandDevices", String.class, new C3040l());
    }

    /* renamed from: z1 */
    private void m7813z1(JSONObject jSONObject) {
        m7770S(jSONObject, new C3039k(this));
    }

    /* renamed from: A0 */
    public List<C3010c> mo23252A0() {
        ArrayList arrayList = new ArrayList();
        for (C3010c add : mo23273N0(this.f4793u, this.f4795w)) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: B0 */
    public List<WifiDeviceBase> mo23253B0() {
        ArrayList arrayList = new ArrayList();
        for (C3010c next : mo23273N0(this.f4791s, this.f4795w)) {
            if (next instanceof WifiDeviceBase) {
                arrayList.add((WifiDeviceBase) next);
            }
        }
        return arrayList;
    }

    /* renamed from: B1 */
    public void mo23254B1() {
        this.f4798z.removeMessages(1);
        Message message = new Message();
        message.what = 1;
        Bundle bundle = new Bundle();
        bundle.putBoolean("notify_scan_result", false);
        message.setData(bundle);
        this.f4798z.sendMessage(message);
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: C0 */
    public List<C3010c> mo23256C0() {
        ArrayList arrayList = new ArrayList();
        for (C3010c add : mo23273N0(this.f4791s, this.f4795w)) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: C1 */
    public void mo23257C1() {
        if (MiotManager.getDeviceManager() != null) {
            try {
                MiotManager.getDeviceManager().stopScan();
                for (C12144d t : this.f4788p) {
                    t.mo30160t();
                }
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: D0 */
    public List<WifiDeviceBase> mo23258D0() {
        ArrayList arrayList = new ArrayList();
        this.f4791s.remove("yeelink.wifispeaker.v1");
        this.f4791s.remove("yeelink.gateway.v1");
        this.f4791s.remove("yeelink.gateway.va");
        for (C3010c next : mo23273N0(this.f4791s, this.f4795w)) {
            if (next instanceof WifiDeviceBase) {
                arrayList.add((WifiDeviceBase) next);
            }
        }
        return arrayList;
    }

    /* renamed from: D1 */
    public void mo23259D1() {
        this.f4782j = false;
        this.f4798z.removeMessages(3);
    }

    /* renamed from: F0 */
    public List<C3010c> mo23260F0() {
        List<C3010c> G0 = m7756G0();
        G0.addAll(m7751E0());
        for (C3010c next : m7751E0()) {
            StringBuilder sb = new StringBuilder();
            sb.append("new ble device : ");
            sb.append(next.mo23204R());
            sb.append(", model : ");
            sb.append(next.mo23208T());
        }
        return G0;
    }

    /* renamed from: G1 */
    public boolean mo23261G1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C3010c next : mo23321w0()) {
                if (next instanceof C6081a) {
                    if (next.mo23145k0()) {
                        ((C6081a) next).mo23140b1();
                    }
                } else if (next instanceof C6094f) {
                    ((C6094f) next).mo23140b1();
                } else if (next.mo23145k0()) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("off");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23185G());
                    jSONObject2.put("params", jSONArray2);
                    jSONArray.put(jSONObject2);
                    if (jSONArray.length() == 49) {
                        jSONObject.put("method", "set_power");
                        jSONObject.put("rpcs", jSONArray);
                        m7770S(jSONObject, new C3048t(this));
                        jSONObject = new JSONObject();
                        jSONArray = new JSONArray();
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_power");
            jSONObject.put("rpcs", jSONArray);
            m7770S(jSONObject, new C3049u(this));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: H0 */
    public List<C3010c> mo23263H0() {
        ArrayList arrayList = new ArrayList();
        for (C3010c next : mo23324y0()) {
            if (next.mo23230o0()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: H1 */
    public boolean mo23264H1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C3010c next : mo23321w0()) {
                if (next instanceof C6081a) {
                    if (next.mo23145k0()) {
                        ((C6081a) next).mo23140b1();
                    }
                } else if ((next instanceof WifiDeviceBase) && next.mo23200P() != null) {
                    ((WifiDeviceBase) next).mo23140b1();
                } else if (next instanceof C6094f) {
                    ((C6094f) next).mo23140b1();
                } else if (next.mo23145k0()) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("off");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23185G());
                    jSONObject2.put("params", jSONArray2);
                    jSONArray.put(jSONObject2);
                    if (jSONArray.length() == 49) {
                        jSONObject.put("method", "set_power");
                        jSONObject.put("rpcs", jSONArray);
                        m7770S(jSONObject, new C3046r(this));
                        jSONObject = new JSONObject();
                        jSONArray = new JSONArray();
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_power");
            jSONObject.put("rpcs", jSONArray);
            m7770S(jSONObject, new C3047s(this));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: I */
    public void mo23265I() {
        m7778W();
        mo23297j1();
    }

    /* renamed from: I0 */
    public List<WifiDeviceBase> mo23266I0() {
        ArrayList arrayList = new ArrayList();
        for (C3010c next : mo23324y0()) {
            if (next.mo23230o0() && (next instanceof WifiDeviceBase)) {
                arrayList.add((WifiDeviceBase) next);
            }
        }
        return arrayList;
    }

    /* renamed from: I1 */
    public boolean mo23267I1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C3010c next : mo23321w0()) {
                if (next instanceof C6081a) {
                    if (next.mo23145k0()) {
                        ((C6081a) next).mo23148l1();
                    }
                } else if (next instanceof C6094f) {
                    ((C6094f) next).mo23148l1();
                } else if (next.mo23145k0()) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("on");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23185G());
                    jSONObject2.put("params", jSONArray2);
                    jSONArray.put(jSONObject2);
                    if (jSONArray.length() == 49) {
                        jSONObject.put("method", "set_power");
                        jSONObject.put("rpcs", jSONArray);
                        m7770S(jSONObject, new C3044p(this));
                        jSONObject = new JSONObject();
                        jSONArray = new JSONArray();
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_power");
            jSONObject.put("rpcs", jSONArray);
            m7770S(jSONObject, new C3045q(this));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: J0 */
    public C6169f mo23268J0(String str) {
        C3010c j0 = m7794j0(str);
        if (j0 == null || !(j0 instanceof C6169f)) {
            return null;
        }
        return (C6169f) j0;
    }

    /* renamed from: J1 */
    public boolean mo23269J1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C3010c next : mo23321w0()) {
                if (next instanceof C6081a) {
                    if (next.mo23145k0()) {
                        ((C6081a) next).mo23148l1();
                    }
                } else if ((next instanceof WifiDeviceBase) && next.mo23200P() != null) {
                    ((WifiDeviceBase) next).mo23148l1();
                } else if (next instanceof C6094f) {
                    ((C6094f) next).mo23148l1();
                } else if (next.mo23145k0()) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("on");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23185G());
                    jSONObject2.put("params", jSONArray2);
                    jSONArray.put(jSONObject2);
                    if (jSONArray.length() == 49) {
                        jSONObject.put("method", "set_power");
                        jSONObject.put("rpcs", jSONArray);
                        m7770S(jSONObject, new C3042n(this));
                        jSONObject = new JSONObject();
                        jSONArray = new JSONArray();
                    }
                }
            }
            if (jSONArray.length() == 0) {
                return true;
            }
            jSONObject.put("method", "set_power");
            jSONObject.put("rpcs", jSONArray);
            m7770S(jSONObject, new C3043o(this));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: K0 */
    public C6100g mo23270K0(String str) {
        C3010c j0 = m7794j0(str);
        if (j0 instanceof C6100g) {
            return (C6100g) j0;
        }
        return null;
    }

    /* renamed from: L1 */
    public void mo23271L1(C12144d dVar) {
        this.f4788p.remove(dVar);
    }

    /* renamed from: M0 */
    public List<C3010c> mo23272M0(List<String> list) {
        return mo23273N0(list, this.f4796x);
    }

    /* renamed from: N0 */
    public List<C3010c> mo23273N0(List<String> list, List<Device.Ownership> list2) {
        List<C3010c> g0 = mo23289g0();
        ArrayList arrayList = new ArrayList();
        for (C3010c next : g0) {
            if (list.contains(next.mo23208T()) && list2.contains(next.mo23212W())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: P0 */
    public WifiDeviceBase mo23274P0(String str) {
        C3010c j0 = m7794j0(str);
        if (j0 != null && (j0 instanceof WifiDeviceBase)) {
            return (WifiDeviceBase) j0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("this is not a yeelight device, device id: ");
        sb.append(str);
        return null;
    }

    /* renamed from: Q */
    public void mo23275Q(C3010c cVar) {
        if (!(cVar instanceof C10689c)) {
            f4767W.put(cVar.mo23185G(), cVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("addCherryUpnpDevice, id: ");
        sb.append(cVar.mo23185G());
        C10689c cVar2 = (C10689c) cVar;
        f4768X.put(cVar.mo23185G(), cVar2);
        for (C3010c next : f4767W.values()) {
            if (next.mo23185G().equals(cVar.mo23185G())) {
                next.mo23209T0(cVar2);
            }
        }
        DeviceDataProvider.m17611X();
    }

    /* renamed from: R */
    public void mo23276R(String str) {
        if (C8272e.m19511b().mo35204d() && MiotManager.getDeviceManager() != null) {
            this.f4787o += str + " || ";
        }
    }

    /* renamed from: Y */
    public void mo23277Y() {
        mo23278Z(true, true, true);
    }

    /* renamed from: Z */
    public void mo23278Z(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        sb.append("device discovery, ble: ");
        sb.append(z);
        sb.append(", local wifi: ");
        sb.append(z2);
        sb.append(", remote wifi: ");
        sb.append(z3);
        if (!C3051a.m7928z()) {
            C3051a.m7925r().mo23355G();
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 && !(ContextCompat.checkSelfPermission(this.f4773a, "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(this.f4773a, "android.permission.BLUETOOTH_CONNECT") == 0)) {
            z = false;
        }
        if (z) {
            if (i >= 21) {
                mo23293h1();
            } else {
                mo23290g1();
            }
        }
        this.f4798z.removeMessages(2);
        this.f4798z.removeMessages(1);
        Message obtainMessage = this.f4798z.obtainMessage(1);
        Bundle bundle = new Bundle();
        bundle.putBoolean("clear_device_list", true);
        obtainMessage.setData(bundle);
        this.f4798z.sendMessageDelayed(obtainMessage, 15000);
        Message obtainMessage2 = this.f4798z.obtainMessage(0);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("ble_discovery", z);
        bundle2.putBoolean("local_wifi_discovery", z2);
        bundle2.putBoolean("remote_wifi_discovery", z3);
        obtainMessage2.setData(bundle2);
        this.f4798z.sendMessage(obtainMessage2);
    }

    /* renamed from: a0 */
    public void mo23279a0() {
        if (MiotManager.getDeviceManager() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(DiscoveryType.MIOT_WIFI);
            try {
                MiotManager.getDeviceManager().startScan(arrayList, this.f4771A);
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b0 */
    public void mo23280b0(boolean z, boolean z2, String str) {
        if (C8272e.m19511b().mo35204d() && MiotManager.getControllerManager() != null) {
            try {
                MiotManager.getControllerManager().getDeviceListV2(new C3033g(z, z2, str));
            } catch (IotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo23281c(String str) {
        if (C3051a.m7928z()) {
            m7778W();
            mo23297j1();
        }
    }

    /* renamed from: c0 */
    public void mo23282c0() {
        mo23284d0(false, (String) null);
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: d0 */
    public void mo23284d0(boolean z, String str) {
        mo23286e0(z, false, str);
    }

    /* renamed from: d1 */
    public C10898f0 mo23285d1(String str, String str2, byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        char c = 0;
        int i = 0;
        int i2 = 0;
        byte[] bArr3 = null;
        boolean z = false;
        while (i < length) {
            byte b = bArr2[i] & 255;
            if (b <= 0 || b > length - i) {
                return null;
            }
            int i3 = i + 1;
            byte b2 = bArr2[i3] & 255;
            int i4 = i3 + 1;
            if (b2 == 2) {
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                int i5 = i4 + 1;
                objArr[c] = Byte.valueOf(bArr2[i4]);
                sb.append(String.format("%02x", objArr));
                Object[] objArr2 = new Object[1];
                int i6 = i5 + 1;
                objArr2[c] = Byte.valueOf(bArr2[i5]);
                sb.append(String.format("%02x", objArr2));
                String sb2 = sb.toString();
                if (sb2.toUpperCase().equals("87FE")) {
                    z = true;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Device record: uuid=");
                sb3.append(sb2);
                i4 = i6;
            }
            if (b2 == 9) {
                int i7 = b - 1;
                if (i7 > 16 || i7 <= 0) {
                    return null;
                }
                while (true) {
                    if (bArr2[(i4 + i7) - 1] != 0) {
                        break;
                    }
                    int i8 = i7 - 1;
                    if (i7 <= 0) {
                        i7 = i8;
                        break;
                    }
                    i7 = i8;
                }
                byte[] bArr4 = new byte[i7];
                System.arraycopy(bArr2, i4, bArr4, 0, i7);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("parse name : ");
                sb4.append(str);
                sb4.append(" : ");
                sb4.append(new String(bArr4));
                if (z) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("ADV_MESH_NAME", bArr4);
                    hashMap.put("ADV_MESH_ADDRESS", 101);
                    hashMap.put("ADV_MESH_UUID", 529);
                    hashMap.put("ADV_PRODUCT_UUID", 4);
                    hashMap.put("ADV_STATUS", 1);
                    C10898f0 f0Var = new C10898f0(str2, str2, Device.Ownership.NOONES, true, (String) null);
                    f0Var.mo31645g2(hashMap);
                    return f0Var;
                }
                String str3 = str2;
                bArr3 = bArr4;
            } else if (b2 == 255 && (i2 = i2 + 1) == 2) {
                int i9 = i4 + 1;
                int i10 = i9 + 1;
                int i11 = (bArr2[i4] << 8) + bArr2[i9];
                if (i11 != 4354 && i11 != 25601) {
                    return null;
                }
                int i12 = i10 + 1;
                int i13 = bArr2[i10] + (bArr2[i12] << 8);
                int i14 = i12 + 1 + 4;
                int i15 = i14 + 1;
                int i16 = i15 + 1;
                int i17 = bArr2[i14] + (bArr2[i15] << 8);
                int i18 = i16 + 1;
                byte b3 = bArr2[i16] & 255;
                int i19 = bArr2[i18] + (bArr2[i18 + 1] << 8);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ADV_MESH_NAME", bArr3);
                hashMap2.put("ADV_MESH_ADDRESS", Integer.valueOf(i19));
                hashMap2.put("ADV_MESH_UUID", Integer.valueOf(i13));
                hashMap2.put("ADV_PRODUCT_UUID", Integer.valueOf(i17));
                hashMap2.put("ADV_STATUS", Integer.valueOf(b3));
                C10898f0 f0Var2 = new C10898f0(str2, str2, Device.Ownership.NOONES, true, (String) null);
                f0Var2.mo31645g2(hashMap2);
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Parse a telink device!! address = ");
                sb5.append(str2);
                sb5.append(", meshUid= ");
                sb5.append(i13);
                sb5.append(", productId = ");
                sb5.append(i17);
                sb5.append(", meshAddress = ");
                sb5.append(i19 & 255);
                sb5.append(", status = ");
                sb5.append(b3);
                return f0Var2;
            } else {
                String str4 = str2;
            }
            i += b + 1;
            c = 0;
        }
        return null;
    }

    /* renamed from: e0 */
    public void mo23286e0(boolean z, boolean z2, String str) {
        if (C8272e.m19511b().mo35204d() && MiotManager.getDeviceManager() != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("discoverRemoteWifiDevices, retrieve remote device list! check result: ");
                sb.append(z);
                sb.append(", mac: ");
                sb.append(str);
                sb.append("， fromMeshConnect: ");
                sb.append(z2);
                MiotManager.getDeviceManager().getRemoteDeviceList(new C3032f(z, str, z2));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: f0 */
    public void mo23287f0(boolean z, boolean z2) {
        if (z) {
            mo23279a0();
        }
        if (z2) {
            mo23282c0();
        }
    }

    /* renamed from: g */
    public void mo23288g() {
    }

    /* renamed from: g0 */
    public List<C3010c> mo23289g0() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f4767W.values());
        return arrayList;
    }

    /* renamed from: g1 */
    public boolean mo23290g1() {
        if (this.f4777e == null) {
            return false;
        }
        m7767P();
        m7772T();
        if (this.f4774b != null) {
            return true;
        }
        this.f4774b = new C3036i();
        return true;
    }

    /* renamed from: h */
    public void mo23291h() {
        mo23313s1();
        mo23297j1();
        mo23278Z(true, false, true);
        m7809w1();
    }

    /* renamed from: h0 */
    public List<C3010c> mo23292h0() {
        return mo23272M0(this.f4794v);
    }

    @RequiresApi(api = 21)
    /* renamed from: h1 */
    public boolean mo23293h1() {
        if (this.f4777e == null) {
            return false;
        }
        m7767P();
        m7772T();
        if (this.f4775c != null) {
            return true;
        }
        this.f4775c = new C3034h();
        return true;
    }

    /* renamed from: i */
    public void mo23294i(int i) {
        if (C3051a.m7928z()) {
            mo23278Z(false, false, true);
            C8293t.m19620n().mo35258t();
        }
    }

    /* renamed from: i0 */
    public C6081a mo23295i0(String str) {
        C3010c j0 = m7794j0(str);
        if (j0 instanceof C6081a) {
            return (C6081a) j0;
        }
        String str2 = f4760C;
        AppUtils.m8302w(str2, " is not light device id: " + str, false);
        return null;
    }

    /* renamed from: j */
    public void mo23296j() {
        this.f4780h = false;
        m7776V();
    }

    /* renamed from: j1 */
    public void mo23297j1() {
        mo23299k1();
        mo23301l1();
        mo23303m1();
        DeviceDataProvider.m17611X();
        StringBuilder sb = new StringBuilder();
        sb.append("is login? ");
        sb.append(C3051a.m7928z());
        sb.append(", mid: ");
        sb.append(C3051a.m7925r().mo23366v());
        C8293t.m19620n().mo35258t();
    }

    /* renamed from: k0 */
    public WifiDeviceBase mo23298k0(String str) {
        for (C3010c next : f4767W.values()) {
            if ((next instanceof WifiDeviceBase) && ((C12048k) next.mo23221d0()).mo42734Z0().equals(str)) {
                return (WifiDeviceBase) next;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ca, code lost:
        if (r2 != null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ef, code lost:
        if (r2 != null) goto L_0x00cc;
     */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23299k1() {
        /*
            r11 = this;
            android.database.Cursor r0 = com.yeelight.yeelib.data.DeviceDataProvider.m17644z()
            boolean r1 = r0.moveToFirst()
            if (r1 == 0) goto L_0x0169
        L_0x000a:
            java.lang.String r1 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12331c
            int r1 = r0.getColumnIndex(r1)
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12332d
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12334f
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r2 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12330b
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12335g
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r5 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12338j
            int r5 = r0.getColumnIndex(r5)
            java.lang.String r8 = r0.getString(r5)
            java.lang.String r5 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12337i
            int r5 = r0.getColumnIndex(r5)
            int r9 = r0.getInt(r5)
            java.lang.String r5 = f4760C
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Read device from database: deviceId="
            r6.append(r10)
            r6.append(r1)
            java.lang.String r10 = ", deviceMac="
            r6.append(r10)
            r6.append(r4)
            java.lang.String r10 = ", deviceModel="
            r6.append(r10)
            r6.append(r3)
            java.lang.String r10 = ", deviceName="
            r6.append(r10)
            r6.append(r7)
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L_0x0082
            com.yeelight.yeelib.data.DeviceDataProvider.m17628j(r1)
            goto L_0x0150
        L_0x0082:
            java.lang.String r6 = "bluetooth"
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x00d5
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.device.base.c> r2 = f4767W
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0094
            goto L_0x0150
        L_0x0094:
            r2 = 0
            java.lang.String r5 = "yeelink.light.ble1"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x00a8
            w3.r r10 = new w3.r
            com.miot.common.device.Device$Ownership r5 = com.miot.common.device.Device.Ownership.MINE
            r6 = 0
            r2 = r10
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x00ca
        L_0x00a8:
            java.lang.String r5 = "yeelink.bleremote.v1"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x00b8
            w3.b r2 = new w3.b
            com.miot.common.device.Device$Ownership r3 = com.miot.common.device.Device.Ownership.MINE
            r2.<init>(r1, r4, r7, r3)
            goto L_0x00ca
        L_0x00b8:
            java.lang.String r5 = "yeelink.light.gingko"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x00ca
            w3.f0 r10 = new w3.f0
            com.miot.common.device.Device$Ownership r5 = com.miot.common.device.Device.Ownership.MINE
            r6 = 0
            r2 = r10
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x00ca:
            if (r2 == 0) goto L_0x013d
        L_0x00cc:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.device.base.c> r3 = f4767W
            r3.put(r1, r2)
            r2.mo23186G0(r9)
            goto L_0x013d
        L_0x00d5:
            java.lang.String r4 = "wifi"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x00f2
            java.lang.String r2 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12336h
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.valueOf(r2)
            com.yeelight.yeelib.device.base.c r2 = com.yeelight.yeelib.device.C6088b.m17786b(r3, r1, r7, r2)
            if (r2 == 0) goto L_0x013d
            goto L_0x00cc
        L_0x00f2:
            java.lang.String r4 = "bluetooth_mesh"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0111
            java.lang.String r4 = "spec_wifi"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0103
            goto L_0x0111
        L_0x0103:
            java.lang.String r3 = "mesh"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x013d
            java.lang.String r2 = "======= mesh device ========"
            p051j4.C9189e.m22139b(r5, r2)
            goto L_0x013d
        L_0x0111:
            java.lang.String r2 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12336h
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r4 = com.yeelight.yeelib.data.C6043b.C6044a.C6045a.f12332d
            int r4 = r0.getColumnIndex(r4)
            java.lang.String r4 = r0.getString(r4)
            com.yeelight.yeelib.device.base.g r3 = com.yeelight.yeelib.device.xiaomi.C8244a.m19443b(r3, r1, r7)
            if (r3 == 0) goto L_0x013d
            com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.valueOf(r2)
            r3.mo23199O0(r2)
            r3.mo23194L0(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.device.base.c> r2 = f4767W
            r2.put(r1, r3)
            r3.mo23186G0(r9)
        L_0x013d:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L_0x0150
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.device.base.c> r2 = f4767W
            java.lang.Object r1 = r2.get(r1)
            com.yeelight.yeelib.device.base.c r1 = (com.yeelight.yeelib.device.base.C3010c) r1
            if (r1 == 0) goto L_0x0150
            r1.mo23203Q0(r8)
        L_0x0150:
            boolean r1 = r0.moveToNext()
            if (r1 != 0) goto L_0x000a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "device count:"
            r1.append(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.device.base.c> r2 = f4767W
            int r2 = r2.size()
            r1.append(r2)
        L_0x0169:
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.YeelightDeviceManager.mo23299k1():void");
    }

    /* renamed from: l */
    public void mo23300l() {
        m7759K1();
        mo23313s1();
    }

    /* renamed from: l1 */
    public void mo23301l1() {
        Cursor C = DeviceDataProvider.m17590C();
        if (C.moveToFirst()) {
            do {
                String valueOf = String.valueOf(C.getInt(C.getColumnIndex(C6043b.C6046b.C6047a.f12342a)));
                String valueOf2 = String.valueOf(C.getString(C.getColumnIndex(C6043b.C6046b.C6047a.f12344c)));
                int i = C.getInt(C.getColumnIndex(C6043b.C6046b.C6047a.f12345d));
                C6119c cVar = new C6119c(valueOf, valueOf2);
                cVar.mo23186G0(i);
                f4767W.put(valueOf, cVar);
            } while (C.moveToNext());
        }
        C.close();
    }

    /* renamed from: m0 */
    public C3012e mo23302m0(String str) {
        C3010c j0 = m7794j0(str);
        if (j0 instanceof C3012e) {
            return (C3012e) j0;
        }
        String str2 = f4760C;
        AppUtils.m8302w(str2, str + " is not group id: " + str, false);
        return null;
    }

    /* renamed from: m1 */
    public void mo23303m1() {
        Cursor D = DeviceDataProvider.m17591D();
        if (D.moveToFirst()) {
            do {
                MeshNetWork f1 = m7792f1(D);
                ConcurrentHashMap<String, C3010c> concurrentHashMap = f4767W;
                if (!concurrentHashMap.containsKey(f1.getName() + "_" + f1.getId())) {
                    C6164e eVar = new C6164e(f1);
                    f4767W.put(eVar.mo23185G(), eVar);
                }
            } while (D.moveToNext());
        }
        D.close();
    }

    /* renamed from: n0 */
    public C6119c mo23304n0(String str) {
        C3010c j0 = m7794j0(str);
        if (j0 instanceof C6119c) {
            return (C6119c) j0;
        }
        String str2 = f4760C;
        AppUtils.m8302w(str2, str + " is not group id: " + str, false);
        return null;
    }

    /* renamed from: n1 */
    public void mo23305n1() {
        for (C3010c next : mo23322x0()) {
            if (next.mo23145k0() && (next instanceof C6081a)) {
                ((C6081a) next).mo31517N1();
            }
        }
    }

    /* renamed from: o1 */
    public void mo23306o1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C3010c next : f4767W.values()) {
                try {
                    if (((next instanceof WifiDeviceBase) || (next instanceof C10344f)) && next.mo23145k0() && !m7773T0(next.mo23208T())) {
                        JSONArray jSONArray2 = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next instanceof C10344f ? ((C10344f) next).mo31698M1() : next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "miIO.info");
                            jSONObject.put("rpcs", jSONArray);
                            StringBuilder sb = new StringBuilder();
                            sb.append("refreshWifiDeviceInfo, json to send: ");
                            sb.append(jSONObject.toString());
                            m7813z1(jSONObject);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONArray = new JSONArray();
                                jSONObject = jSONObject3;
                            } catch (Exception e) {
                                JSONObject jSONObject4 = jSONObject3;
                                e = e;
                                jSONObject = jSONObject4;
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                }
            }
            if (jSONArray.length() != 0) {
                jSONObject.put("method", "miIO.info");
                jSONObject.put("rpcs", jSONArray);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("refreshWifiDeviceInfo, json to send: ");
                sb2.append(jSONObject.toString());
                m7813z1(jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: p1 */
    public void mo23307p1() {
        mo23306o1();
        mo23305n1();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C3010c next : f4767W.values()) {
                if ((next instanceof WifiDeviceBase) && next.mo23145k0()) {
                    if ((next.mo23212W() == Device.Ownership.MINE || next.mo23212W() == Device.Ownership.OTHERS) && !m7773T0(next.mo23208T())) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (String put : next.mo23170z()) {
                            jSONArray2.put(put);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23185G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", GetCodec.DEFAULT_GET_PROPERTY);
                            jSONObject.put("rpcs", jSONArray);
                            StringBuilder sb = new StringBuilder();
                            sb.append("refreshWifiDeviceStatus, json to send: ");
                            sb.append(jSONObject.toString());
                            mo23325y1(jSONObject);
                            jSONObject = new JSONObject();
                            jSONArray = new JSONArray();
                        }
                    }
                }
            }
            if (jSONArray.length() != 0) {
                jSONObject.put("method", GetCodec.DEFAULT_GET_PROPERTY);
                jSONObject.put("rpcs", jSONArray);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("refreshWifiDeviceStatus, json to send: ");
                sb2.append(jSONObject.toString());
                mo23325y1(jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: q1 */
    public void mo23309q1(C12144d dVar) {
        if (dVar != null) {
            this.f4788p.add(dVar);
        }
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }

    /* renamed from: r1 */
    public void mo23311r1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.miot.api.Constants.ACTION_PUSH_COMMAND);
        intentFilter.addAction(com.miot.api.Constants.ACTION_PUSH_MESSAGE);
        this.f4773a.registerReceiver(this.f4772B, intentFilter);
    }

    /* renamed from: s0 */
    public List<C3012e> mo23312s0(String str) {
        ArrayList arrayList = new ArrayList();
        for (C3010c next : f4767W.values()) {
            if ((next instanceof C3012e) && TextUtils.equals(next.mo23217Z(), str)) {
                arrayList.add((C3012e) next);
            }
        }
        return arrayList;
    }

    /* renamed from: s1 */
    public void mo23313s1() {
        for (C3010c v0 : f4767W.values()) {
            v0.mo23163v0();
        }
        f4767W.clear();
    }

    /* renamed from: t0 */
    public C6094f mo23314t0(String str) {
        C3010c j0 = m7794j0(str);
        if (j0 instanceof C6094f) {
            return (C6094f) j0;
        }
        String str2 = f4760C;
        AppUtils.m8302w(str2, " is not light device id: " + str, false);
        return null;
    }

    /* renamed from: t1 */
    public void mo23315t1(String str) {
        C3010c cVar = f4767W.get(str);
        if (cVar == null) {
            return;
        }
        if (Device.Ownership.MINE != cVar.mo23212W() && Device.Ownership.OTHERS != cVar.mo23212W() && cVar.mo23149m0()) {
            cVar.mo23163v0();
            f4767W.remove(str);
        } else if (!cVar.mo23147l0()) {
            cVar.mo23221d0().mo31549L0(false);
        }
    }

    /* renamed from: u0 */
    public List<C10343e> mo23316u0() {
        ArrayList arrayList = new ArrayList();
        for (C10343e add : f4769Y.values()) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: u1 */
    public void mo23317u1(String str) {
        for (C3010c next : f4767W.values()) {
            if (next.mo23185G().equals(str)) {
                next.mo23209T0((C10689c) null);
            }
        }
        f4768X.remove(str);
        DeviceDataProvider.m17611X();
    }

    /* renamed from: v */
    public void mo23318v() {
        if (C3051a.m7928z() && m7800o0().mo23322x0().size() != 0) {
            this.f4798z.sendEmptyMessageDelayed(5, 3000);
        }
    }

    /* renamed from: v0 */
    public List<C3012e> mo23319v0() {
        ArrayList arrayList = new ArrayList();
        for (C3010c next : mo23273N0(this.f4790r, this.f4795w)) {
            if (next instanceof C3012e) {
                arrayList.add((C3012e) next);
            }
        }
        return arrayList;
    }

    /* renamed from: v1 */
    public void mo23320v1(String str) {
        C3010c cVar = f4767W.get(str);
        if (cVar != null) {
            cVar.mo23163v0();
            f4767W.remove(str);
        }
        DeviceBrowserProvider.m17587b();
    }

    /* renamed from: w0 */
    public List<C3012e> mo23321w0() {
        ArrayList arrayList = new ArrayList();
        for (C3010c next : mo23273N0(this.f4789q, this.f4795w)) {
            if (next instanceof C3012e) {
                arrayList.add((C3012e) next);
            }
        }
        return arrayList;
    }

    /* renamed from: x0 */
    public List<C3010c> mo23322x0() {
        return mo23273N0(this.f4792t, this.f4795w);
    }

    /* renamed from: x1 */
    public void mo23323x1(long j) {
        if (!this.f4782j) {
            this.f4784l = j;
            this.f4782j = true;
            this.f4798z.sendEmptyMessageDelayed(3, j);
        }
    }

    /* renamed from: y0 */
    public List<C3010c> mo23324y0() {
        ArrayList arrayList = new ArrayList();
        for (C3010c next : f4767W.values()) {
            if (next.mo23212W().equals(Device.Ownership.MINE) || next.mo23212W().equals(Device.Ownership.OTHERS)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: y1 */
    public void mo23325y1(JSONObject jSONObject) {
        m7770S(jSONObject, new C3038j(this));
    }

    /* renamed from: z0 */
    public List<C6094f> mo23326z0(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList();
        for (C3010c next : mo23273N0(arrayList, this.f4795w)) {
            if (next instanceof C6094f) {
                arrayList2.add((C6094f) next);
            }
        }
        return arrayList2;
    }
}
