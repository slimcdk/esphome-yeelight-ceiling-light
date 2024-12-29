package com.yeelight.yeelib.p152f;

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
import com.miot.api.CommonHandler;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.abstractdevice.AbstractDevice;
import com.miot.common.device.Device;
import com.miot.common.device.DiscoveryType;
import com.miot.common.exception.MiotException;
import com.miot.service.manipulator.codec.get.GetCodec;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.exception.IotException;
import com.p146mi.iot.common.instance.Property;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.C7579c;
import com.yeelight.yeelib.data.DeviceBrowserProvider;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.xiaomi.C9756a;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C5979b;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.C6000f;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p150c.p151i.C6046l;
import com.yeelight.yeelib.p150c.p151i.C6050n;
import com.yeelight.yeelib.p150c.p151i.C6067o;
import com.yeelight.yeelib.p150c.p151i.C6072p;
import com.yeelight.yeelib.p150c.p183m.C6318b1;
import com.yeelight.yeelib.p150c.p183m.C6324c;
import com.yeelight.yeelib.p150c.p183m.C6459e0;
import com.yeelight.yeelib.p150c.p183m.C6922j1;
import com.yeelight.yeelib.p150c.p183m.C6979k0;
import com.yeelight.yeelib.p150c.p183m.C7038l0;
import com.yeelight.yeelib.p150c.p183m.C7100n0;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p150c.p183m.C7259s0;
import com.yeelight.yeelib.p150c.p183m.C7290t0;
import com.yeelight.yeelib.p150c.p183m.C7323u0;
import com.yeelight.yeelib.p150c.p184n.C7562l;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p153g.C9850s;
import com.yeelight.yeelib.p186e.C9769d;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10545k;
import com.yeelight.yeelib.utils.C10551r;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
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

/* renamed from: com.yeelight.yeelib.f.w */
public class C4257w implements C4201a.C4202i, C4230l.C4231a, C9784e.C4213a {
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static final String f7391G = "w";

    /* renamed from: H */
    private static C4257w f7392H = null;

    /* renamed from: I */
    private static boolean f7393I = false;

    /* renamed from: J */
    private static Timer f7394J = new Timer();

    /* renamed from: K */
    private static TimerTask f7395K;

    /* renamed from: L */
    private static Timer f7396L = new Timer();

    /* renamed from: M */
    private static TimerTask f7397M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static ConcurrentHashMap<String, C4198d> f7398N = new ConcurrentHashMap<>();

    /* renamed from: O */
    private static ConcurrentHashMap<String, C6324c> f7399O = new ConcurrentHashMap<>();

    /* renamed from: P */
    private static ConcurrentHashMap<String, C6046l> f7400P = new ConcurrentHashMap<>();

    /* renamed from: Q */
    private static ArrayList<String> f7401Q = new C4277k();

    /* renamed from: A */
    private DeviceManager.DeviceHandler f7402A;

    /* renamed from: B */
    BroadcastReceiver f7403B;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f7404a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public BluetoothAdapter.LeScanCallback f7405b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ScanCallback f7406c;

    /* renamed from: d */
    private BluetoothManager f7407d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public BluetoothAdapter f7408e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public BluetoothLeScanner f7409f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ExecutorService f7410g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f7411h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f7412i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f7413j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f7414k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f7415l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f7416m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public List<String> f7417n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f7418o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public List<C9769d> f7419p;

    /* renamed from: q */
    private ArrayList<String> f7420q;

    /* renamed from: r */
    private ArrayList<String> f7421r;

    /* renamed from: s */
    private ArrayList<String> f7422s;

    /* renamed from: t */
    private ArrayList<String> f7423t;

    /* renamed from: u */
    private ArrayList<String> f7424u;

    /* renamed from: v */
    private ArrayList<String> f7425v;

    /* renamed from: w */
    private ArrayList<Device.Ownership> f7426w;

    /* renamed from: x */
    private ArrayList<Device.Ownership> f7427x;

    /* renamed from: y */
    private ArrayList<Device.Ownership> f7428y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public Handler f7429z;

    /* renamed from: com.yeelight.yeelib.f.w$a */
    class C4258a extends ArrayList<String> {
        C4258a(C4257w wVar) {
            add("yeelink.light.landevice");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$a0 */
    class C4259a0 implements CommonHandler<String> {
        C4259a0(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group close, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group close, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$b */
    class C4260b extends ArrayList<String> {
        C4260b(C4257w wVar) {
            add("yeelink.light.mesh");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$b0 */
    class C4261b0 implements CommonHandler<String> {
        C4261b0(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group close, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group close, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$c */
    class C4262c extends ArrayList<Device.Ownership> {
        C4262c(C4257w wVar) {
            add(Device.Ownership.MINE);
            add(Device.Ownership.OTHERS);
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$c0 */
    class C4263c0 extends ArrayList<String> {
        C4263c0(C4257w wVar) {
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
            add("yeelink.light.colorc");
            add("yeelink.light.ct2");
            add("yeelink.light.cta");
            add("yeelink.light.panel1");
            add("yeelink.light.panel3");
            add("yeelink.light.strip1");
            add("yeelink.light.strip2");
            add("yeelink.light.strip4");
            add("yeelink.light.strip6");
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
            add("yeelink.light.ceila");
            add("yeelink.light.ceilb");
            add("yeelink.light.ceilc");
            add("yeelink.light.ceild");
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
    }

    /* renamed from: com.yeelight.yeelib.f.w$d */
    class C4264d extends ArrayList<Device.Ownership> {
        C4264d(C4257w wVar) {
            add(Device.Ownership.MINE);
            add(Device.Ownership.OTHERS);
            add(Device.Ownership.NOONES);
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$d0 */
    class C4265d0 extends ArrayList<String> {
        C4265d0(C4257w wVar) {
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
            add("yeelink.light.colorc");
            add("yeelink.light.ct2");
            add("yeelink.light.cta");
            add("yeelink.light.panel1");
            add("yeelink.light.panel3");
            add("yeelink.light.strip1");
            add("yeelink.light.strip2");
            add("yeelink.light.strip4");
            add("yeelink.light.strip6");
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
            add("yeelink.light.ceila");
            add("yeelink.light.ceilb");
            add("yeelink.light.ceilc");
            add("yeelink.light.ceild");
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
    }

    /* renamed from: com.yeelight.yeelib.f.w$e */
    class C4266e extends ArrayList<Device.Ownership> {
        C4266e(C4257w wVar) {
            add(Device.Ownership.NOONES);
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$e0 */
    class C4267e0 extends ArrayList<String> {
        C4267e0(C4257w wVar) {
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
    }

    /* renamed from: com.yeelight.yeelib.f.w$f */
    class C4268f extends Handler {
        C4268f(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Bundle data = message.getData();
                boolean z = data.getBoolean("ble_discovery", true);
                boolean z2 = data.getBoolean("local_wifi_discovery", true);
                boolean z3 = data.getBoolean("remote_wifi_discovery", true);
                String unused = C4257w.f7391G;
                "Message received: MSG_START_DEVICE_DISCOVERY, ble: " + z + ", localWifi: " + z2 + ", remoteWifi: " + z3;
                if (z && C4257w.this.f7408e != null && C4257w.this.f7408e.isEnabled() && !C4257w.this.f7411h && ContextCompat.checkSelfPermission(C4257w.this.f7404a, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    String unused2 = C4257w.f7391G;
                    boolean unused3 = C4257w.this.f7411h = true;
                    if (Build.VERSION.SDK_INT < 21) {
                        C4257w.this.f7408e.startLeScan(C4257w.this.f7405b);
                    } else if (C4257w.this.f7409f != null) {
                        try {
                            C4257w.this.f7409f.startScan(C4257w.this.f7406c);
                        } catch (Exception | NullPointerException unused4) {
                        }
                    }
                }
                C4257w.this.mo23663d0(z2, z3);
                if (z || z2 || z3) {
                    for (C9769d k : C4257w.this.f7419p) {
                        k.mo26095k();
                    }
                }
            } else if (i == 1) {
                String unused5 = C4257w.f7391G;
                Bundle data2 = message.getData();
                boolean z4 = data2.getBoolean("clear_device_list", false);
                boolean z5 = data2.getBoolean("notify_scan_result", true);
                if (Build.VERSION.SDK_INT >= 21) {
                    if (!(C4257w.this.f7409f == null || C4257w.this.f7408e == null || !C4257w.this.f7408e.isEnabled())) {
                        C4257w.this.f7409f.stopScan(C4257w.this.f7406c);
                    }
                } else if (C4257w.this.f7408e != null && C4257w.this.f7408e.isEnabled()) {
                    C4257w.this.f7408e.stopLeScan(C4257w.this.f7405b);
                }
                C4257w.this.mo23696x1();
                boolean unused6 = C4257w.this.f7411h = false;
                if (C4257w.this.f7412i) {
                    C4257w.this.f7429z.sendEmptyMessageDelayed(2, C4257w.this.f7414k);
                }
                if (z4) {
                    for (String p1 : C4257w.this.f7417n) {
                        C4257w.this.mo23682p1(p1);
                    }
                    C4257w.this.f7417n.clear();
                    DeviceBrowserProvider.m22365b();
                    DeviceDataProvider.m22389X();
                }
                if (z5) {
                    for (C9769d o : C4257w.this.f7419p) {
                        o.mo26097o();
                    }
                }
            } else if (i == 2) {
                String unused7 = C4257w.f7391G;
                C4257w.this.mo23654W();
            } else if (i == 3) {
                String unused8 = C4257w.f7391G;
                if (C4257w.this.f7413j) {
                    C4257w.this.f7429z.sendEmptyMessageDelayed(3, C4257w.this.f7415l);
                }
                C4257w.this.mo23677l1();
            } else if (i == 4) {
                String unused9 = C4257w.f7391G;
                Toast.makeText(C4257w.this.f7404a, C4257w.this.f7404a.getText(R$string.account_login_ouath_failed_info), 0).show();
            } else if (i == 5) {
                String unused10 = C4257w.f7391G;
                C4257w.this.mo23655X(true, false, false);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$f0 */
    class C4269f0 extends ArrayList<String> {
        C4269f0(C4257w wVar) {
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
    }

    /* renamed from: com.yeelight.yeelib.f.w$g */
    class C4270g implements DeviceManager.DeviceHandler {
        C4270g() {
        }

        public void onFailed(int i, String str) {
            "################ Wifi local scan, onFailed! error: " + str;
        }

        public void onSucceed(List<AbstractDevice> list) {
            "################ Wifi local scan, onSucceed, count: " + list.size();
            for (AbstractDevice b : list) {
                C10545k.m25749b(b);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            C4257w.this.m11936X0(arrayList);
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$g0 */
    class C4271g0 extends ArrayList<String> {
        C4271g0(C4257w wVar) {
            add("yeelink.bleremote.v1");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$h */
    static class C4272h extends TimerTask {
        C4272h() {
        }

        public void run() {
            String unused = C4257w.f7391G;
            C4257w.m11912G1();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            C4257w.m11964z1();
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$h0 */
    class C4273h0 extends ArrayList<String> {
        C4273h0(C4257w wVar) {
            add("yeelink.light.group");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$i */
    static class C4274i extends TimerTask {
        C4274i() {
        }

        public void run() {
            C4257w.m11943e1();
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$i0 */
    class C4275i0 extends ArrayList<String> {
        C4275i0(C4257w wVar) {
            add("yeelink.light.room");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$j */
    static class C4276j implements com.p146mi.iot.common.handler.CommonHandler<List<Property>> {
        C4276j() {
        }

        /* renamed from: a */
        public void onSucceed(List<Property> list) {
            String unused = C4257w.f7391G;
            for (Property next : list) {
                String[] split = next.getPid().split("\\.");
                try {
                    C4257w.m11947l0().mo23648H0(split[0]).mo27832P1(Integer.parseInt(split[1]), next.getInstanceID(), next.getValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void onFailed(IotError iotError) {
            String unused = C4257w.f7391G;
            "query spec properties onFailed: " + iotError.getMessage();
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$k */
    static class C4277k extends ArrayList<String> {
        C4277k() {
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
    }

    /* renamed from: com.yeelight.yeelib.f.w$l */
    class C4278l implements DeviceManager.DeviceHandler {

        /* renamed from: a */
        final /* synthetic */ boolean f7432a;

        /* renamed from: b */
        final /* synthetic */ String f7433b;

        /* renamed from: c */
        final /* synthetic */ boolean f7434c;

        C4278l(boolean z, String str, boolean z2) {
            this.f7432a = z;
            this.f7433b = str;
            this.f7434c = z2;
        }

        public void onFailed(int i, String str) {
            "################ Wifi discovery, onFailed! ret: " + i + " error: " + str;
            for (C9769d y : C4257w.this.f7419p) {
                y.mo26107y(i);
            }
            if (i == -13) {
                C4257w.m11955s(C4257w.this);
                if (C4257w.this.f7416m >= 3) {
                    C4308b.m12133l();
                    C4257w.this.f7429z.removeMessages(4);
                    C4257w.this.f7429z.sendEmptyMessageDelayed(4, 1000);
                    if (!C4308b.f7482a) {
                        C4310h.m12146b(new C4308b.C4309a("Token invalid, Oauth record: ", C4308b.m12127f()));
                    }
                    C4201a.m11607r().mo23440D();
                    Intent launchIntentForPackage = C4257w.this.f7404a.getPackageManager().getLaunchIntentForPackage("com.yeelight.cherry");
                    launchIntentForPackage.addFlags(32768);
                    C4257w.this.f7404a.startActivity(launchIntentForPackage);
                }
            }
            if (this.f7432a && !this.f7434c && !TextUtils.isEmpty(this.f7433b)) {
                for (C4198d dVar : C4257w.f7398N.values()) {
                    if ((dVar instanceof C6006h) && dVar.mo23391R().toLowerCase().endsWith(this.f7433b.toLowerCase())) {
                        String unused = C4257w.f7391G;
                        "Found target device! device id: " + dVar.mo23372G();
                        C4257w.this.m11918M0(dVar.mo23372G(), false);
                        return;
                    }
                }
            }
        }

        public void onSucceed(List<AbstractDevice> list) {
            boolean z;
            int unused = C4257w.this.f7416m = 0;
            if (!C4201a.m11610z()) {
                String unused2 = C4257w.f7391G;
                return;
            }
            "################ Wifi discovery, onSucceed, count: " + list.size() + ", check result: " + this.f7432a + ", target mac: " + this.f7433b + "， fromMeshConnect: " + this.f7434c + ", connection log: " + C4257w.this.f7418o;
            for (AbstractDevice b : list) {
                C10545k.m25749b(b);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            C4257w.this.m11935W0(arrayList);
            C4257w.this.mo23657Z(this.f7432a, this.f7434c, this.f7433b);
            if (this.f7432a && !this.f7434c && !TextUtils.isEmpty(this.f7433b)) {
                Iterator it = C4257w.f7398N.values().iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C4198d dVar = (C4198d) it.next();
                    if (((dVar instanceof C6922j1) || (dVar instanceof C6318b1) || (dVar instanceof C6006h)) && dVar.mo23391R().toLowerCase().endsWith(this.f7433b.toLowerCase())) {
                        String unused3 = C4257w.f7391G;
                        "Found target device! device id: " + dVar.mo23372G();
                        C4257w.this.m11918M0(dVar.mo23372G(), true);
                        break;
                    }
                }
                if (!z) {
                    if (C4308b.f7482a) {
                        String unused4 = C4257w.f7391G;
                    } else {
                        C4310h.m12146b(new C4308b.C4309a(C4257w.f7391G, "Device connect succeed, but no device return from cloud! device mac: " + this.f7433b + " || " + C4257w.this.f7418o));
                    }
                }
            }
            for (C9769d L : C4257w.this.f7419p) {
                L.mo26094L();
            }
            if (list.size() > 0) {
                C4222h.m11725k().mo23539q();
                C4257w.this.mo23677l1();
            }
            if (C4308b.f7489h) {
                C4308b.f7489h = false;
                C10551r.m25770b();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$m */
    class C4279m implements com.p146mi.iot.common.handler.CommonHandler<List<com.p146mi.iot.common.abstractdevice.AbstractDevice>> {

        /* renamed from: a */
        final /* synthetic */ boolean f7436a;

        /* renamed from: b */
        final /* synthetic */ boolean f7437b;

        /* renamed from: c */
        final /* synthetic */ String f7438c;

        C4279m(boolean z, boolean z2, String str) {
            this.f7436a = z;
            this.f7437b = z2;
            this.f7438c = str;
        }

        /* renamed from: a */
        public void onSucceed(List<com.p146mi.iot.common.abstractdevice.AbstractDevice> list) {
            boolean z = C4201a.m11610z();
            String unused = C4257w.f7391G;
            if (z) {
                "discoverRemoteSpecDevices, onSuccess, device size = " + list.size();
                for (com.p146mi.iot.common.abstractdevice.AbstractDevice a : list) {
                    C10545k.m25748a(a);
                }
                C4257w.this.m11934V0(list);
                if (this.f7436a && this.f7437b && !TextUtils.isEmpty(this.f7438c)) {
                    boolean z2 = false;
                    Iterator it = C4257w.f7398N.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C4198d dVar = (C4198d) it.next();
                        if ((dVar instanceof C6050n) && dVar.mo23391R().toLowerCase().endsWith(this.f7438c.toLowerCase())) {
                            String unused2 = C4257w.f7391G;
                            "Found target spec device! device id: " + dVar.mo23372G();
                            C4257w.this.m11918M0(dVar.mo23372G(), true);
                            z2 = true;
                            break;
                        }
                    }
                    if (!z2) {
                        if (C4308b.f7482a) {
                            String unused3 = C4257w.f7391G;
                        } else {
                            C4310h.m12146b(new C4308b.C4309a(C4257w.f7391G, "Device connect succeed, but no device return from cloud! device mac: " + this.f7438c));
                        }
                    }
                }
                for (C9769d L : C4257w.this.f7419p) {
                    L.mo26094L();
                }
            }
        }

        public void onFailed(IotError iotError) {
            if (this.f7436a && this.f7437b && !TextUtils.isEmpty(this.f7438c)) {
                for (C4198d dVar : C4257w.f7398N.values()) {
                    if ((dVar instanceof C6050n) && dVar.mo23391R().toLowerCase().endsWith(this.f7438c.toLowerCase())) {
                        String unused = C4257w.f7391G;
                        "Found target spec device! device id: " + dVar.mo23372G();
                        C4257w.this.m11918M0(dVar.mo23372G(), false);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$n */
    class C4280n extends ScanCallback {

        /* renamed from: com.yeelight.yeelib.f.w$n$a */
        class C4281a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f7441a;

            /* renamed from: b */
            final /* synthetic */ String f7442b;

            /* renamed from: c */
            final /* synthetic */ int f7443c;

            /* renamed from: d */
            final /* synthetic */ byte[] f7444d;

            C4281a(String str, String str2, int i, byte[] bArr) {
                this.f7441a = str;
                this.f7442b = str2;
                this.f7443c = i;
                this.f7444d = bArr;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: com.yeelight.yeelib.c.m.e0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: com.yeelight.yeelib.c.m.q} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: com.yeelight.yeelib.c.m.e0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: com.yeelight.yeelib.c.m.e0} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    java.lang.String r0 = r10.f7441a
                    java.lang.String r1 = "Device type = "
                    java.lang.String r2 = "Device has added, type= "
                    r3 = 1
                    if (r0 == 0) goto L_0x016b
                    java.lang.String r4 = "XMCTD_"
                    boolean r0 = r0.contains(r4)
                    java.lang.String r4 = "YEE Mood Lamp"
                    if (r0 != 0) goto L_0x001b
                    java.lang.String r0 = r10.f7441a
                    boolean r0 = r0.contains(r4)
                    if (r0 == 0) goto L_0x016b
                L_0x001b:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r5 = "cherry device found: "
                    r0.append(r5)
                    java.lang.String r5 = r10.f7442b
                    r0.append(r5)
                    r0.toString()
                    com.yeelight.yeelib.f.w$n r0 = com.yeelight.yeelib.p152f.C4257w.C4280n.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r0 = r0.f7417n
                    java.lang.String r5 = r10.f7442b
                    r0.remove(r5)
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r5 = r10.f7442b
                    boolean r0 = r0.containsKey(r5)
                    if (r0 != 0) goto L_0x00ea
                    java.lang.String r0 = r10.f7441a
                    boolean r0 = r0.contains(r4)
                    if (r0 == 0) goto L_0x0099
                    com.yeelight.yeelib.c.m.e0 r0 = new com.yeelight.yeelib.c.m.e0
                    java.lang.String r6 = r10.f7442b
                    com.miot.common.device.Device$Ownership r7 = com.miot.common.device.Device.Ownership.NOONES
                    r8 = 1
                    r9 = 0
                    r4 = r0
                    r5 = r6
                    r4.<init>(r5, r6, r7, r8, r9)
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.lang.String r4 = r10.f7441a
                    r5 = 16
                    byte[] r4 = com.telink.p149b.C3963b.m10657d(r4, r5)
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
                    r0.mo27815g2(r2)
                    goto L_0x00a2
                L_0x0099:
                    com.yeelight.yeelib.c.m.q r0 = new com.yeelight.yeelib.c.m.q
                    java.lang.String r2 = r10.f7442b
                    com.miot.common.device.Device$Ownership r4 = com.miot.common.device.Device.Ownership.NOONES
                    r0.<init>(r2, r2, r4, r3)
                L_0x00a2:
                    com.yeelight.yeelib.c.i.e r2 = r0.mo23408d0()
                    int r3 = r10.f7443c
                    r2.mo27650L0(r3)
                    java.util.concurrent.ConcurrentHashMap r2 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r3 = r0.mo23372G()
                    r2.put(r3, r0)
                    com.yeelight.yeelib.f.w$n r2 = com.yeelight.yeelib.p152f.C4257w.C4280n.this
                    com.yeelight.yeelib.f.w r2 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r2 = r2.f7419p
                    java.util.Iterator r2 = r2.iterator()
                L_0x00c2:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x00d2
                    java.lang.Object r3 = r2.next()
                    com.yeelight.yeelib.e.d r3 = (com.yeelight.yeelib.p186e.C9769d) r3
                    r3.mo26096m(r0)
                    goto L_0x00c2
                L_0x00d2:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.Class r0 = r0.getClass()
                    java.lang.String r0 = r0.getSimpleName()
                    r2.append(r0)
                    r2.toString()
                    goto L_0x0253
                L_0x00ea:
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r1 = r10.f7442b
                    java.lang.Object r0 = r0.get(r1)
                    com.yeelight.yeelib.c.i.d r0 = (com.yeelight.yeelib.p150c.p151i.C4198d) r0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r2)
                    java.lang.Class r2 = r0.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    r1.append(r2)
                    r1.toString()
                    com.yeelight.yeelib.c.i.e r1 = r0.mo23408d0()
                    r1.mo27646J0(r3)
                    com.yeelight.yeelib.c.i.e r1 = r0.mo23408d0()
                    int r2 = r10.f7443c
                    r1.mo27650L0(r2)
                    com.miot.common.device.Device$Ownership r1 = r0.mo23399W()
                    com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.MINE
                    if (r1 == r2) goto L_0x012c
                    com.miot.common.device.Device$Ownership r1 = r0.mo23399W()
                    com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.OTHERS
                    if (r1 != r2) goto L_0x0148
                L_0x012c:
                    boolean r1 = com.yeelight.yeelib.utils.C4308b.f7488g
                    if (r1 == 0) goto L_0x0148
                    boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C7186q
                    if (r1 == 0) goto L_0x0148
                    com.yeelight.yeelib.f.w r1 = com.yeelight.yeelib.p152f.C4257w.m11947l0()
                    java.util.List r1 = r1.mo23690u0()
                    int r1 = r1.size()
                    if (r1 != r3) goto L_0x0148
                    r1 = 0
                    com.yeelight.yeelib.utils.C4308b.f7488g = r1
                    r0.mo23337n()
                L_0x0148:
                    boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.p151i.C4200i
                    if (r1 == 0) goto L_0x0256
                    com.yeelight.yeelib.f.w$n r1 = com.yeelight.yeelib.p152f.C4257w.C4280n.this
                    com.yeelight.yeelib.f.w r1 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r1 = r1.f7419p
                    java.util.Iterator r1 = r1.iterator()
                L_0x0158:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0256
                    java.lang.Object r2 = r1.next()
                    com.yeelight.yeelib.e.d r2 = (com.yeelight.yeelib.p186e.C9769d) r2
                    r3 = r0
                    com.yeelight.yeelib.c.i.i r3 = (com.yeelight.yeelib.p150c.p151i.C4200i) r3
                    r2.mo26093E(r3)
                    goto L_0x0158
                L_0x016b:
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r4 = r10.f7442b
                    boolean r0 = r0.containsKey(r4)
                    if (r0 == 0) goto L_0x01df
                    com.yeelight.yeelib.f.w$n r0 = com.yeelight.yeelib.p152f.C4257w.C4280n.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r0 = r0.f7417n
                    java.lang.String r1 = r10.f7442b
                    r0.remove(r1)
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r1 = r10.f7442b
                    java.lang.Object r0 = r0.get(r1)
                    com.yeelight.yeelib.c.i.d r0 = (com.yeelight.yeelib.p150c.p151i.C4198d) r0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r2)
                    java.lang.Class r2 = r0.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    r1.append(r2)
                    r1.toString()
                    com.yeelight.yeelib.c.i.e r1 = r0.mo23408d0()
                    r1.mo27646J0(r3)
                    com.yeelight.yeelib.c.i.e r1 = r0.mo23408d0()
                    int r2 = r10.f7443c
                    r1.mo27650L0(r2)
                    java.lang.String r1 = r0.mo23395T()
                    java.lang.String r2 = "yeelink.light.gingko"
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L_0x01c9
                    com.yeelight.yeelib.c.i.m r0 = (com.yeelight.yeelib.p150c.p151i.C6047m) r0
                    byte[] r1 = r10.f7444d
                    r0.mo27819k2(r1)
                L_0x01c9:
                    com.yeelight.yeelib.f.w$n r0 = com.yeelight.yeelib.p152f.C4257w.C4280n.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    byte[] r1 = r10.f7444d
                    boolean r0 = r0.m11920N0(r1)
                    if (r0 == 0) goto L_0x0256
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r1 = r10.f7442b
                    r0.remove(r1)
                    goto L_0x0253
                L_0x01df:
                    com.yeelight.yeelib.f.w$n r0 = com.yeelight.yeelib.p152f.C4257w.C4280n.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    byte[] r2 = r10.f7444d
                    java.lang.String r3 = r10.f7442b
                    int r4 = r10.f7443c
                    boolean r0 = r0.m11939a1(r2, r3, r4)
                    if (r0 == 0) goto L_0x01f0
                    return
                L_0x01f0:
                    com.yeelight.yeelib.f.w$n r0 = com.yeelight.yeelib.p152f.C4257w.C4280n.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    java.lang.String r2 = r10.f7441a
                    java.lang.String r3 = r10.f7442b
                    byte[] r4 = r10.f7444d
                    com.yeelight.yeelib.c.m.e0 r0 = r0.mo23658Z0(r2, r3, r4)
                    if (r0 == 0) goto L_0x0256
                    com.yeelight.yeelib.f.w$n r2 = com.yeelight.yeelib.p152f.C4257w.C4280n.this
                    com.yeelight.yeelib.f.w r2 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r2 = r2.f7417n
                    java.lang.String r3 = r10.f7442b
                    r2.remove(r3)
                    java.util.concurrent.ConcurrentHashMap r2 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r3 = r0.mo23372G()
                    r2.put(r3, r0)
                    com.yeelight.yeelib.c.i.e r2 = r0.mo23408d0()
                    int r3 = r10.f7443c
                    r2.mo27650L0(r3)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.Class r1 = r0.getClass()
                    java.lang.String r1 = r1.getSimpleName()
                    r2.append(r1)
                    r2.toString()
                    com.yeelight.yeelib.f.w$n r1 = com.yeelight.yeelib.p152f.C4257w.C4280n.this
                    com.yeelight.yeelib.f.w r1 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r1 = r1.f7419p
                    java.util.Iterator r1 = r1.iterator()
                L_0x0243:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0253
                    java.lang.Object r2 = r1.next()
                    com.yeelight.yeelib.e.d r2 = (com.yeelight.yeelib.p186e.C9769d) r2
                    r2.mo26096m(r0)
                    goto L_0x0243
                L_0x0253:
                    com.yeelight.yeelib.data.DeviceBrowserProvider.m22365b()
                L_0x0256:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4257w.C4280n.C4281a.run():void");
            }
        }

        C4280n() {
        }

        public void onScanResult(int i, ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            BluetoothDevice device = scanResult.getDevice();
            String name = device.getName();
            String address = device.getAddress();
            int rssi = scanResult.getRssi();
            byte[] bytes = scanResult.getScanRecord().getBytes();
            if (rssi >= -100 && C4257w.this.f7411h) {
                C4257w.this.f7410g.execute(new C4281a(name, address, rssi, bytes));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$o */
    class C4282o implements BluetoothAdapter.LeScanCallback {

        /* renamed from: com.yeelight.yeelib.f.w$o$a */
        class C4283a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f7447a;

            /* renamed from: b */
            final /* synthetic */ String f7448b;

            /* renamed from: c */
            final /* synthetic */ int f7449c;

            /* renamed from: d */
            final /* synthetic */ byte[] f7450d;

            C4283a(String str, String str2, int i, byte[] bArr) {
                this.f7447a = str;
                this.f7448b = str2;
                this.f7449c = i;
                this.f7450d = bArr;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: com.yeelight.yeelib.c.m.e0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: com.yeelight.yeelib.c.m.q} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: com.yeelight.yeelib.c.m.e0} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: com.yeelight.yeelib.c.m.e0} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    java.lang.String r0 = r10.f7447a
                    java.lang.String r1 = "Device type = "
                    java.lang.String r2 = "Device has added, type= "
                    r3 = 1
                    if (r0 == 0) goto L_0x016b
                    java.lang.String r4 = "XMCTD_"
                    boolean r0 = r0.contains(r4)
                    java.lang.String r4 = "YEE Mood Lamp"
                    if (r0 != 0) goto L_0x001b
                    java.lang.String r0 = r10.f7447a
                    boolean r0 = r0.contains(r4)
                    if (r0 == 0) goto L_0x016b
                L_0x001b:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r5 = "cherry device found: "
                    r0.append(r5)
                    java.lang.String r5 = r10.f7448b
                    r0.append(r5)
                    r0.toString()
                    com.yeelight.yeelib.f.w$o r0 = com.yeelight.yeelib.p152f.C4257w.C4282o.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r0 = r0.f7417n
                    java.lang.String r5 = r10.f7448b
                    r0.remove(r5)
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r5 = r10.f7448b
                    boolean r0 = r0.containsKey(r5)
                    if (r0 != 0) goto L_0x00ea
                    java.lang.String r0 = r10.f7447a
                    boolean r0 = r0.contains(r4)
                    if (r0 == 0) goto L_0x0099
                    com.yeelight.yeelib.c.m.e0 r0 = new com.yeelight.yeelib.c.m.e0
                    java.lang.String r6 = r10.f7448b
                    com.miot.common.device.Device$Ownership r7 = com.miot.common.device.Device.Ownership.NOONES
                    r8 = 1
                    r9 = 0
                    r4 = r0
                    r5 = r6
                    r4.<init>(r5, r6, r7, r8, r9)
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.lang.String r4 = r10.f7447a
                    r5 = 16
                    byte[] r4 = com.telink.p149b.C3963b.m10657d(r4, r5)
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
                    r0.mo27815g2(r2)
                    goto L_0x00a2
                L_0x0099:
                    com.yeelight.yeelib.c.m.q r0 = new com.yeelight.yeelib.c.m.q
                    java.lang.String r2 = r10.f7448b
                    com.miot.common.device.Device$Ownership r4 = com.miot.common.device.Device.Ownership.NOONES
                    r0.<init>(r2, r2, r4, r3)
                L_0x00a2:
                    com.yeelight.yeelib.c.i.e r2 = r0.mo23408d0()
                    int r3 = r10.f7449c
                    r2.mo27650L0(r3)
                    java.util.concurrent.ConcurrentHashMap r2 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r3 = r0.mo23372G()
                    r2.put(r3, r0)
                    com.yeelight.yeelib.f.w$o r2 = com.yeelight.yeelib.p152f.C4257w.C4282o.this
                    com.yeelight.yeelib.f.w r2 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r2 = r2.f7419p
                    java.util.Iterator r2 = r2.iterator()
                L_0x00c2:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L_0x00d2
                    java.lang.Object r3 = r2.next()
                    com.yeelight.yeelib.e.d r3 = (com.yeelight.yeelib.p186e.C9769d) r3
                    r3.mo26096m(r0)
                    goto L_0x00c2
                L_0x00d2:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.Class r0 = r0.getClass()
                    java.lang.String r0 = r0.getSimpleName()
                    r2.append(r0)
                    r2.toString()
                    goto L_0x0265
                L_0x00ea:
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r1 = r10.f7448b
                    java.lang.Object r0 = r0.get(r1)
                    com.yeelight.yeelib.c.i.d r0 = (com.yeelight.yeelib.p150c.p151i.C4198d) r0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r2)
                    java.lang.Class r2 = r0.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    r1.append(r2)
                    r1.toString()
                    com.yeelight.yeelib.c.i.e r1 = r0.mo23408d0()
                    r1.mo27646J0(r3)
                    com.yeelight.yeelib.c.i.e r1 = r0.mo23408d0()
                    int r2 = r10.f7449c
                    r1.mo27650L0(r2)
                    com.miot.common.device.Device$Ownership r1 = r0.mo23399W()
                    com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.MINE
                    if (r1 == r2) goto L_0x012c
                    com.miot.common.device.Device$Ownership r1 = r0.mo23399W()
                    com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.OTHERS
                    if (r1 != r2) goto L_0x0148
                L_0x012c:
                    boolean r1 = com.yeelight.yeelib.utils.C4308b.f7488g
                    if (r1 == 0) goto L_0x0148
                    boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C7186q
                    if (r1 == 0) goto L_0x0148
                    com.yeelight.yeelib.f.w r1 = com.yeelight.yeelib.p152f.C4257w.m11947l0()
                    java.util.List r1 = r1.mo23690u0()
                    int r1 = r1.size()
                    if (r1 != r3) goto L_0x0148
                    r1 = 0
                    com.yeelight.yeelib.utils.C4308b.f7488g = r1
                    r0.mo23337n()
                L_0x0148:
                    boolean r1 = r0 instanceof com.yeelight.yeelib.p150c.p151i.C4200i
                    if (r1 == 0) goto L_0x0268
                    com.yeelight.yeelib.f.w$o r1 = com.yeelight.yeelib.p152f.C4257w.C4282o.this
                    com.yeelight.yeelib.f.w r1 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r1 = r1.f7419p
                    java.util.Iterator r1 = r1.iterator()
                L_0x0158:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0268
                    java.lang.Object r2 = r1.next()
                    com.yeelight.yeelib.e.d r2 = (com.yeelight.yeelib.p186e.C9769d) r2
                    r3 = r0
                    com.yeelight.yeelib.c.i.i r3 = (com.yeelight.yeelib.p150c.p151i.C4200i) r3
                    r2.mo26093E(r3)
                    goto L_0x0158
                L_0x016b:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r4 = "Device is undefine, name = "
                    r0.append(r4)
                    java.lang.String r4 = r10.f7447a
                    r0.append(r4)
                    r0.toString()
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r4 = r10.f7448b
                    boolean r0 = r0.containsKey(r4)
                    if (r0 == 0) goto L_0x01f1
                    com.yeelight.yeelib.f.w$o r0 = com.yeelight.yeelib.p152f.C4257w.C4282o.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r0 = r0.f7417n
                    java.lang.String r1 = r10.f7448b
                    r0.remove(r1)
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r1 = r10.f7448b
                    java.lang.Object r0 = r0.get(r1)
                    com.yeelight.yeelib.c.i.d r0 = (com.yeelight.yeelib.p150c.p151i.C4198d) r0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    r1.append(r2)
                    java.lang.Class r2 = r0.getClass()
                    java.lang.String r2 = r2.getSimpleName()
                    r1.append(r2)
                    r1.toString()
                    com.yeelight.yeelib.c.i.e r1 = r0.mo23408d0()
                    r1.mo27646J0(r3)
                    com.yeelight.yeelib.c.i.e r1 = r0.mo23408d0()
                    int r2 = r10.f7449c
                    r1.mo27650L0(r2)
                    java.lang.String r1 = r0.mo23395T()
                    java.lang.String r2 = "yeelink.light.gingko"
                    boolean r1 = r1.equals(r2)
                    if (r1 == 0) goto L_0x01db
                    com.yeelight.yeelib.c.i.m r0 = (com.yeelight.yeelib.p150c.p151i.C6047m) r0
                    byte[] r1 = r10.f7450d
                    r0.mo27819k2(r1)
                L_0x01db:
                    com.yeelight.yeelib.f.w$o r0 = com.yeelight.yeelib.p152f.C4257w.C4282o.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    byte[] r1 = r10.f7450d
                    boolean r0 = r0.m11920N0(r1)
                    if (r0 == 0) goto L_0x0268
                    java.util.concurrent.ConcurrentHashMap r0 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r1 = r10.f7448b
                    r0.remove(r1)
                    goto L_0x0265
                L_0x01f1:
                    com.yeelight.yeelib.f.w$o r0 = com.yeelight.yeelib.p152f.C4257w.C4282o.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    byte[] r2 = r10.f7450d
                    java.lang.String r3 = r10.f7448b
                    int r4 = r10.f7449c
                    boolean r0 = r0.m11939a1(r2, r3, r4)
                    if (r0 == 0) goto L_0x0202
                    return
                L_0x0202:
                    com.yeelight.yeelib.f.w$o r0 = com.yeelight.yeelib.p152f.C4257w.C4282o.this
                    com.yeelight.yeelib.f.w r0 = com.yeelight.yeelib.p152f.C4257w.this
                    java.lang.String r2 = r10.f7447a
                    java.lang.String r3 = r10.f7448b
                    byte[] r4 = r10.f7450d
                    com.yeelight.yeelib.c.m.e0 r0 = r0.mo23658Z0(r2, r3, r4)
                    if (r0 == 0) goto L_0x0268
                    com.yeelight.yeelib.f.w$o r2 = com.yeelight.yeelib.p152f.C4257w.C4282o.this
                    com.yeelight.yeelib.f.w r2 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r2 = r2.f7417n
                    java.lang.String r3 = r10.f7448b
                    r2.remove(r3)
                    java.util.concurrent.ConcurrentHashMap r2 = com.yeelight.yeelib.p152f.C4257w.f7398N
                    java.lang.String r3 = r0.mo23372G()
                    r2.put(r3, r0)
                    com.yeelight.yeelib.c.i.e r2 = r0.mo23408d0()
                    int r3 = r10.f7449c
                    r2.mo27650L0(r3)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.Class r1 = r0.getClass()
                    java.lang.String r1 = r1.getSimpleName()
                    r2.append(r1)
                    r2.toString()
                    com.yeelight.yeelib.f.w$o r1 = com.yeelight.yeelib.p152f.C4257w.C4282o.this
                    com.yeelight.yeelib.f.w r1 = com.yeelight.yeelib.p152f.C4257w.this
                    java.util.List r1 = r1.f7419p
                    java.util.Iterator r1 = r1.iterator()
                L_0x0255:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0265
                    java.lang.Object r2 = r1.next()
                    com.yeelight.yeelib.e.d r2 = (com.yeelight.yeelib.p186e.C9769d) r2
                    r2.mo26096m(r0)
                    goto L_0x0255
                L_0x0265:
                    com.yeelight.yeelib.data.DeviceBrowserProvider.m22365b()
                L_0x0268:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4257w.C4282o.C4283a.run():void");
            }
        }

        C4282o() {
        }

        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            String name = bluetoothDevice.getName();
            String address = bluetoothDevice.getAddress();
            "mLegacyScanCallback: ble device found: " + address + Constants.COLON_SEPARATOR + name + " : " + bluetoothDevice.getType() + " : " + bluetoothDevice.getBondState();
            if (i >= -100 && C4257w.this.f7411h) {
                C4257w.this.f7410g.execute(new C4283a(name, address, i, bArr));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$p */
    class C4284p implements CommonHandler<String> {
        C4284p(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "refreshWifiDeviceStatus, onSucceed : " + str;
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("result");
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.getInt("code") == 0) {
                            String string = jSONObject.getString("did");
                            String string2 = jSONObject.getString("result");
                            "device: " + string + ", prop result: " + string2;
                            C4198d h0 = C4257w.m11945h0(string);
                            if (h0 != null) {
                                h0.mo23351w0(string2);
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
            "refreshWifiDeviceStatus, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$q */
    class C4285q implements CommonHandler<String> {
        C4285q(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "refreshWifiDeviceInfo, onSucceed : " + str;
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
                            "DeviceInfo, rssi = " + i3 + " , ssid = " + string3 + " , mac = " + string2 + " , local ip = " + string4 + " life = " + i2;
                            C4198d h0 = C4257w.m11945h0(string);
                            if (h0 == null) {
                                h0 = C4257w.m11913I0(string);
                            }
                            if (h0 != null) {
                                h0.mo23408d0().mo27650L0(i3);
                                h0.mo23408d0().mo27656O0(string3);
                                h0.mo23408d0().mo27727z0(string2);
                                h0.mo23408d0().mo27725y0(string4);
                                h0.mo23408d0().mo27723x0(i2);
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
            "refreshWifiDeviceInfo, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$r */
    static class C4286r implements C9874b<String> {
        C4286r() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C4257w.f7391G;
            "requestMiBandType onSuccess: " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("code") == 1) {
                    JSONArray jSONArray = jSONObject.getJSONObject(com.miot.api.Constants.EXTRA_PUSH_MESSAGE).getJSONArray("AppBandDevices");
                    String unused2 = C4257w.f7391G;
                    "requestMiBandType appBandDevices: " + jSONArray.toString();
                    C4297y.f7456e.getSharedPreferences("miband", 0).edit().putString("deviceType", jSONArray.toString()).apply();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C4257w.f7391G;
            "requestMiBandType errorCode: " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$s */
    class C4287s extends BroadcastReceiver {
        C4287s(C4257w wVar) {
        }

        public void onReceive(Context context, Intent intent) {
            MiPushCommandMessage miPushCommandMessage;
            StringBuilder sb;
            String miPushCommandMessage2;
            MiPushMessage miPushMessage;
            String action = intent.getAction();
            if (action != null) {
                char c = 65535;
                int hashCode = action.hashCode();
                if (hashCode != 1875058397) {
                    if (hashCode == 1879588761 && action.equals(com.miot.api.Constants.ACTION_PUSH_MESSAGE)) {
                        c = 1;
                    }
                } else if (action.equals(com.miot.api.Constants.ACTION_PUSH_COMMAND)) {
                    c = 0;
                }
                if (c != 0) {
                    if (c == 1 && (intent.getSerializableExtra(com.miot.api.Constants.EXTRA_PUSH_MESSAGE) instanceof MiPushMessage) && (miPushMessage = (MiPushMessage) intent.getSerializableExtra(com.miot.api.Constants.EXTRA_PUSH_MESSAGE)) != null) {
                        String unused = C4257w.f7391G;
                        sb = new StringBuilder();
                        sb.append("message: ");
                        miPushCommandMessage2 = miPushMessage.toString();
                    } else {
                        return;
                    }
                } else if ((intent.getSerializableExtra(com.miot.api.Constants.EXTRA_PUSH_COMMAND) instanceof MiPushCommandMessage) && (miPushCommandMessage = (MiPushCommandMessage) intent.getSerializableExtra(com.miot.api.Constants.EXTRA_PUSH_COMMAND)) != null) {
                    String unused2 = C4257w.f7391G;
                    sb = new StringBuilder();
                    sb.append("command: ");
                    miPushCommandMessage2 = miPushCommandMessage.toString();
                } else {
                    return;
                }
                sb.append(miPushCommandMessage2);
                sb.toString();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$t */
    class C4288t implements CommonHandler<String> {
        C4288t(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group open, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group open, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$u */
    class C4289u implements CommonHandler<String> {
        C4289u(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group open, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group open, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$v */
    class C4290v extends ArrayList<String> {
        C4290v(C4257w wVar) {
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
            add("yeelink.light.colorc");
            add("yeelink.light.ct2");
            add("yeelink.light.cta");
            add("yeelink.light.panel1");
            add("yeelink.light.panel3");
            add("yeelink.light.strip1");
            add("yeelink.light.strip2");
            add("yeelink.light.strip4");
            add("yeelink.light.strip6");
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
            add("yeelink.light.ceila");
            add("yeelink.light.ceilb");
            add("yeelink.light.ceilc");
            add("yeelink.light.ceild");
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
    }

    /* renamed from: com.yeelight.yeelib.f.w$w */
    class C4291w implements CommonHandler<String> {
        C4291w(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group open, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group open, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$x */
    class C4292x implements CommonHandler<String> {
        C4292x(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group open, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group open, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$y */
    class C4293y implements CommonHandler<String> {
        C4293y(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group close, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group close, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.w$z */
    class C4294z implements CommonHandler<String> {
        C4294z(C4257w wVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group close, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group close, onFailed : error : " + str + " , error code : " + i;
        }
    }

    public C4257w() {
        this.f7411h = false;
        this.f7412i = false;
        this.f7413j = false;
        new ArrayList();
        this.f7420q = new C4290v(this);
        this.f7421r = new C4263c0(this);
        this.f7422s = new C4265d0(this);
        this.f7423t = new C4267e0(this);
        this.f7424u = new C4269f0(this);
        new C4271g0(this);
        this.f7425v = new C4273h0(this);
        new C4275i0(this);
        new C4258a(this);
        new C4260b(this);
        this.f7426w = new C4262c(this);
        this.f7427x = new C4264d(this);
        this.f7428y = new C4266e(this);
        this.f7429z = new C4268f(Looper.getMainLooper());
        this.f7402A = new C4270g();
        this.f7403B = new C4287s(this);
        this.f7417n = new CopyOnWriteArrayList();
        this.f7419p = new ArrayList();
        C9784e.m23711b().mo31634j(this);
        C4201a.m11607r().mo23444M(this);
        C4230l.m11766b().mo23554e(this);
    }

    public C4257w(Context context) {
        this();
        this.f7404a = context;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        this.f7407d = bluetoothManager;
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        this.f7408e = adapter;
        if (adapter == null) {
            C10551r.m25776h();
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f7409f = adapter.getBluetoothLeScanner();
        }
        this.f7410g = Executors.newFixedThreadPool(5);
        mo23679n1();
    }

    /* renamed from: B0 */
    private List<C4198d> m11905B0() {
        return mo23650K0(this.f7423t, this.f7428y);
    }

    /* renamed from: D0 */
    private List<C4198d> m11907D0() {
        return mo23650K0(this.f7422s, this.f7428y);
    }

    /* renamed from: E1 */
    private static void m11909E1() {
        for (C4198d next : f7398N.values()) {
            if (next instanceof C6050n) {
                ((C6050n) next).mo27847h2();
            }
        }
    }

    /* renamed from: G1 */
    public static void m11912G1() {
        if (f7393I) {
            f7395K.cancel();
            f7394J.purge();
            f7397M.cancel();
            f7396L.purge();
            for (C4198d next : f7398N.values()) {
                if (next instanceof C6006h) {
                    ((C6006h) next).mo27576V1();
                }
            }
            m11909E1();
            f7393I = false;
        }
    }

    /* renamed from: I0 */
    public static C6050n m11913I0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Map.Entry<String, C4198d> value : f7398N.entrySet()) {
            C4198d dVar = (C4198d) value.getValue();
            if (dVar instanceof C6050n) {
                C6050n nVar = (C6050n) dVar;
                if (str.equals(nVar.mo27788M1())) {
                    return nVar;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public void m11918M0(String str, boolean z) {
        Intent intent = new Intent();
        try {
            intent.setClass(this.f7404a, Class.forName("com.yeelight.cherry.ui.activity.QuickConnectRequestProgressActivity"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        intent.addFlags(268435456);
        intent.putExtra("com.yeelight.cherry.device_id", str);
        intent.putExtra("request_flag", z);
        this.f7404a.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public boolean m11920N0(byte[] bArr) {
        return m11922O0(bArr) && bArr[19] != 2;
    }

    /* renamed from: O */
    private void m11921O() {
        if (!C4201a.m11610z()) {
            C4308b.m12139r(f7391G, "addConnectedBleDevice, no reason to be here!");
        }
        for (BluetoothDevice next : this.f7407d.getConnectedDevices(7)) {
            "addConnectedBleDevice, device address = " + next.getAddress();
            if (f7398N.containsKey(next.getAddress())) {
                f7398N.get(next.getAddress()).mo23408d0().mo27646J0(true);
                if (!f7398N.get(next.getAddress()).mo23331k0() && !f7398N.get(next.getAddress()).mo23333l0()) {
                    f7398N.get(next.getAddress()).mo23337n();
                }
            } else if (next.getName() != null && next.getName().contains("XMCTD_")) {
                "DeviceManager, addConnectedBleDevice, id: " + next.getAddress();
                C7186q qVar = new C7186q(next.getAddress(), next.getAddress(), Device.Ownership.MINE, true);
                f7398N.put(qVar.mo23372G(), qVar);
                qVar.mo23337n();
            } else if (m11924Q0(next.getName())) {
                "Found miband, name: " + next.getName() + ", device id: " + next.getAddress();
                if (!f7400P.containsKey(next.getAddress())) {
                    C6046l lVar = new C6046l(next.getAddress());
                    lVar.mo27800d(21);
                    f7400P.put(next.getAddress(), lVar);
                }
            }
        }
    }

    /* renamed from: O0 */
    private boolean m11922O0(byte[] bArr) {
        return bArr[5] == -107 && bArr[6] == -2;
    }

    /* renamed from: P0 */
    public static boolean m11923P0(String str) {
        return "yeelink.light.dnlight2".equals(str) || "yeelink.light.meshbulb1".equals(str) || "yeelink.light.meshbulb2".equals(str) || "yeelink.light.spot1".equals(str) || "yeelink.light.dn2grp".equals(str) || "yeelink.light.mb1grp".equals(str) || "yeelink.light.mb2grp".equals(str) || "yeelink.light.sp1grp".equals(str) || "yeelink.light.ml1".equals(str) || "yeelink.light.ml2".equals(str);
    }

    /* renamed from: Q0 */
    public static boolean m11924Q0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String string = C4297y.f7456e.getSharedPreferences("miband", 0).getString("deviceType", "");
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

    /* renamed from: R */
    public static boolean m11925R(JSONObject jSONObject, CommonHandler<String> commonHandler) {
        try {
            MiotManager.getDeviceManager().callSmarthomeApi("/home/batchrpc", jSONObject, commonHandler);
            return true;
        } catch (MiotException unused) {
            return false;
        }
    }

    /* renamed from: R0 */
    public static boolean m11926R0(String str) {
        if (!TextUtils.isEmpty(str)) {
            return f7401Q.contains(str);
        }
        return false;
    }

    /* renamed from: S */
    private void m11927S() {
        this.f7417n.clear();
        for (C4198d next : f7398N.values()) {
            if ((next instanceof C5972a) && next.mo23335m0()) {
                this.f7417n.add(next.mo23372G());
            }
        }
    }

    /* renamed from: S0 */
    private boolean m11928S0(byte[] bArr) {
        return m11922O0(bArr) && bArr[19] == 2;
    }

    /* renamed from: T */
    private void m11929T() {
        for (C4198d next : f7398N.values()) {
            if (next instanceof C5972a) {
                next.mo23408d0().mo27646J0(false);
            }
        }
        DeviceDataProvider.m22389X();
    }

    /* renamed from: T0 */
    private boolean m11930T0(String str) {
        return "yeelink.light.dnlight2".equals(str) || "yeelink.light.meshbulb1".equals(str) || "yeelink.light.meshbulb2".equals(str) || "yeelink.light.spot1".equals(str) || "yeelink.light.dn2grp".equals(str) || "yeelink.light.mb1grp".equals(str) || "yeelink.light.mb2grp".equals(str) || "yeelink.light.sp1grp".equals(str) || "yeelink.light.ml1".equals(str) || "yeelink.light.ml2".equals(str) || "yeelink.curtain.ctmt1".equals(str) || "yeelink.light.fancl1".equals(str) || "yeelink.light.fancl2".equals(str) || "yeelink.light.fancl5".equals(str) || "yeelink.light.fancl6".equals(str);
    }

    /* renamed from: U */
    private void m11931U() {
        for (C4198d next : f7398N.values()) {
            if (!(next instanceof C5972a)) {
                next.mo23349v0();
                f7398N.remove(next.mo23372G());
            }
        }
    }

    /* renamed from: U0 */
    private void m11932U0(C6050n nVar, String str) {
        C4198d h0 = m11945h0(str);
        if (h0 != null) {
            String address = h0.mo23393S().getAddress();
            nVar.mo23381L0(address);
            "mesh device found in open app device, device token = " + h0.mo23393S().getDevice().getDeviceToken() + ", device mac = " + address + " , device id = " + nVar.mo23372G();
            nVar.mo23386O0(h0.mo23399W());
            nVar.mo27790d2(h0.mo23393S().getDevice().getDeviceToken());
            nVar.mo23383M0(h0.mo23393S());
            nVar.mo27791e2(str);
            if (!TextUtils.isEmpty(str)) {
                f7398N.remove(str);
            }
        }
    }

    /* renamed from: V */
    public static boolean m11933V(String str) {
        return f7398N.get(str) != null;
    }

    /* access modifiers changed from: private */
    /* renamed from: V0 */
    public synchronized void m11934V0(List<com.p146mi.iot.common.abstractdevice.AbstractDevice> list) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        "cloud spec v2 device retrieve stamp: " + valueOf;
        for (com.p146mi.iot.common.abstractdevice.AbstractDevice next : list) {
            if (next == null) {
                C4310h.m12146b(new C4308b.C4309a("NullDevice", "onCloudSpecDeviceFound, null device, user id: " + C4201a.m11607r().mo23452v() + ", server: " + C4230l.m11766b().mo23552a()));
            } else {
                "remote spec device ID: " + next.getDeviceId() + ", model: " + next.getDevice().getDeviceType() + ", name :" + next.getName() + ", mac: " + next.getDevice().getMac();
                C4198d dVar = f7398N.get(next.getDeviceId());
                if (!f7398N.containsKey(next.getDeviceId()) || dVar == null || dVar.mo23391R() == null) {
                    "onCloudSpecDeviceFound, new device, trying to build it, device model: " + next.getDevice().getDeviceType();
                    if (f7398N.containsKey(next.getDevice().getRealID())) {
                        C6050n a = C9756a.m23653a(next);
                        if (a == null) {
                            "mesh device is null: " + next.getName() + "   deviceId: " + next.getDeviceId();
                        } else {
                            m11932U0(a, a.mo27788M1());
                            a.mo27789X1(next);
                            a.mo23394S0(valueOf);
                            f7398N.put(next.getDeviceId(), a);
                            DeviceDataProvider.m22393a0(a);
                        }
                    }
                } else {
                    C6050n nVar = (C6050n) dVar;
                    m11932U0(nVar, next.getDevice().getRealID());
                    nVar.mo27789X1(next);
                    nVar.mo23394S0(valueOf);
                }
            }
        }
        for (C4198d next2 : mo23695x0()) {
            if (!next2.mo23411f0().equals(valueOf)) {
                DeviceDataProvider.m22405i(next2);
            }
        }
        DeviceDataProvider.m22389X();
        m11912G1();
        m11964z1();
    }

    /* access modifiers changed from: private */
    /* renamed from: W0 */
    public synchronized void m11935W0(List<AbstractDevice> list) {
        String valueOf = String.valueOf(System.currentTimeMillis());
        "cloud device retrieve stamp: " + valueOf;
        for (AbstractDevice next : list) {
            "remote device ID: " + next.getDeviceId() + ", address: " + next.getAddress() + ", name :" + next.getName() + ", rssi: " + next.getDevice().getConnectionInfo().getRssi() + ", device owership = " + next.getOwnership();
            if (next == null) {
                C4310h.m12146b(new C4308b.C4309a("NullDevice", "onCloudWifiDeviceFound, null device, user id: " + C4201a.m11607r().mo23452v() + ", server: " + C4230l.m11766b().mo23552a()));
            }
            if (!next.getDeviceModel().equals("yeelink.bleremote.v1")) {
                "remote wifi device found, device name: " + next.getName();
                m11937Y0(next);
                boolean T0 = m11930T0(next.getDeviceModel());
                if (f7398N.containsKey(next.getDeviceId())) {
                    C4198d dVar = f7398N.get(next.getDeviceId());
                    if (dVar != null) {
                        if (!dVar.mo23375I().mo29075a().equals(next.getDeviceModel()) && !T0) {
                            "locale device model : " + dVar.mo23375I().mo29075a() + " , remote device model = " + next.getDeviceModel();
                            Uri b0 = DeviceDataProvider.m22395b0(dVar, next.getDeviceModel());
                            "update uri = " + b0.toString();
                        }
                        dVar.mo23383M0(next);
                        dVar.mo23394S0(valueOf);
                    }
                } else {
                    "onCloudWifiDeviceFound, new device, trying to build it, device model: " + next.getDeviceModel();
                    C4198d a = C5979b.m17534a(next);
                    if (a != null) {
                        a.mo23383M0(next);
                        a.mo23394S0(valueOf);
                        f7398N.put(next.getDeviceId(), a);
                        if (!T0 && (next.getOwnership() == Device.Ownership.MINE || next.getOwnership() == Device.Ownership.OTHERS)) {
                            DeviceDataProvider.m22393a0(a);
                        }
                    }
                }
            }
        }
        for (C4198d next2 : mo23699z0()) {
            if (!next2.mo23411f0().equals(valueOf) && ((next2 instanceof C6006h) || (next2 instanceof C6072p) || (next2 instanceof C6318b1))) {
                DeviceDataProvider.m22405i(next2);
            }
        }
        DeviceDataProvider.m22389X();
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public void m11936X0(List<AbstractDevice> list) {
        for (AbstractDevice next : list) {
            "local device ID: " + next.getDeviceId() + ", address: " + next.getAddress() + " , name :" + next.getName() + ", model : " + next.getDeviceModel();
            String n0 = m11951n0(next.getAddress());
            next.setName(C4239r.m11807g().mo23580m(next.getDeviceModel()));
            "####### onLocalWifiDeviceFound, device: " + n0;
            if (f7398N.containsKey(n0)) {
                C4198d dVar = f7398N.get(n0);
                "onLocalWifiDeviceFound, existing device model: " + dVar.mo23395T();
                dVar.mo23383M0(next);
            } else {
                "onLocalWifiDeviceFound, new device, trying to build it, device model: " + next.getDeviceModel();
                C4198d a = C5979b.m17534a(next);
                if (a != null) {
                    a.mo23383M0(next);
                    f7398N.put(n0, a);
                }
            }
        }
        DeviceBrowserProvider.m22365b();
    }

    /* renamed from: Y0 */
    private void m11937Y0(AbstractDevice abstractDevice) {
        "parse local device with address: " + abstractDevice.getAddress();
        if (abstractDevice.isOnline()) {
            String str = null;
            Iterator<C4198d> it = f7398N.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4198d next = it.next();
                if (next instanceof C6006h) {
                    C6006h hVar = (C6006h) next;
                    if (hVar.mo23393S() != null && ((hVar.mo23393S().getDeviceId() == null || hVar.mo23393S().getDeviceId().isEmpty()) && m11951n0(abstractDevice.getAddress()).equals(m11951n0(hVar.mo23391R())))) {
                        str = m11951n0(abstractDevice.getAddress());
                        break;
                    }
                }
            }
            if (str != null) {
                "remove local device with key: " + str;
                f7398N.remove(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public boolean m11939a1(byte[] bArr, String str, int i) {
        boolean z;
        if (m11928S0(bArr)) {
            byte b = (bArr[9] & 255) | ((bArr[10] & 255) << 8);
            "parse mesh device, pid = " + b;
            if (b == 948) {
                C7100n0 n0Var = new C7100n0(str);
                n0Var.mo23408d0().mo27650L0(i);
                f7398N.put(n0Var.mo23391R(), n0Var);
                for (C9769d m : this.f7419p) {
                    m.mo26096m(n0Var);
                }
            } else if (b == 2076) {
                C7290t0 t0Var = new C7290t0(str);
                t0Var.mo23408d0().mo27650L0(i);
                f7398N.put(t0Var.mo23391R(), t0Var);
                for (C9769d m2 : this.f7419p) {
                    m2.mo26096m(t0Var);
                }
            } else if (b != 2342) {
                switch (b) {
                    case 995:
                        C7038l0 l0Var = new C7038l0(str);
                        l0Var.mo23408d0().mo27650L0(i);
                        f7398N.put(l0Var.mo23391R(), l0Var);
                        for (C9769d m3 : this.f7419p) {
                            m3.mo26096m(l0Var);
                        }
                        break;
                    case 996:
                        C6979k0 k0Var = new C6979k0(str);
                        k0Var.mo23408d0().mo27650L0(i);
                        f7398N.put(k0Var.mo23391R(), k0Var);
                        for (C9769d m4 : this.f7419p) {
                            m4.mo26096m(k0Var);
                        }
                        break;
                    case 997:
                        C7259s0 s0Var = new C7259s0(str);
                        s0Var.mo23408d0().mo27650L0(i);
                        f7398N.put(s0Var.mo23391R(), s0Var);
                        for (C9769d m5 : this.f7419p) {
                            m5.mo26096m(s0Var);
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                C7323u0 u0Var = new C7323u0(str);
                u0Var.mo23408d0().mo27650L0(i);
                f7398N.put(u0Var.mo23391R(), u0Var);
                for (C9769d m6 : this.f7419p) {
                    m6.mo26096m(u0Var);
                }
            }
            z = true;
            if (z) {
                this.f7417n.remove(str);
                DeviceBrowserProvider.m22365b();
                return true;
            }
        }
        return false;
    }

    /* renamed from: b1 */
    private C9850s m11941b1(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15421a);
        int columnIndex2 = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15423c);
        int columnIndex3 = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15422b);
        int columnIndex4 = cursor.getColumnIndex(C7579c.C7590f.C7591a.f15424d);
        C9850s sVar = new C9850s();
        sVar.mo31824e(cursor.getInt(columnIndex));
        sVar.mo31826f(cursor.getString(columnIndex2));
        sVar.mo31827g(cursor.getString(columnIndex3));
        sVar.mo31828h(cursor.getString(columnIndex4));
        "mesh name = " + sVar.mo31822c() + ", pwd = " + sVar.mo31823d();
        return sVar;
    }

    /* renamed from: e1 */
    public static void m11943e1() {
        List<Property> I1;
        if (C4201a.m11607r().mo23437A()) {
            ArrayList arrayList = new ArrayList();
            for (C4198d next : f7398N.values()) {
                if ((next instanceof C6050n) && next.mo23331k0() && (I1 = ((C6050n) next).mo27826I1()) != null) {
                    arrayList.addAll(I1);
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    MiotManager.getControllerManager().getPropertiesV2(arrayList, new C4276j());
                } catch (IotException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: h0 */
    public static C4198d m11945h0(String str) {
        return f7398N.get(str);
    }

    /* renamed from: l0 */
    public static C4257w m11947l0() {
        if (f7392H == null) {
            f7392H = new C4257w();
        }
        return f7392H;
    }

    /* renamed from: m0 */
    public static C4257w m11949m0(Context context) {
        if (f7392H == null) {
            f7392H = new C4257w(context);
        }
        return f7392H;
    }

    /* renamed from: n0 */
    private String m11951n0(String str) {
        String[] split = str.toLowerCase().split(Constants.COLON_SEPARATOR);
        if (split.length < 2) {
            return "";
        }
        return split[split.length - 2] + Constants.COLON_SEPARATOR + split[split.length - 1];
    }

    /* renamed from: o0 */
    public static C4200i m11953o0(String str) {
        C4198d h0 = m11945h0(str);
        if ((h0 instanceof C4200i) || h0 == null) {
            return (C4200i) h0;
        }
        C4308b.m12139r(f7391G, "not light device id!!!!!");
        return null;
    }

    /* renamed from: s */
    static /* synthetic */ int m11955s(C4257w wVar) {
        int i = wVar.f7416m;
        wVar.f7416m = i + 1;
        return i;
    }

    /* renamed from: s1 */
    public static void m11956s1() {
        C9862d.m24133c(C4308b.f7492k + "mihome_key_value/get/third_party_mibind/AppBandDevices", String.class, new C4286r());
    }

    /* renamed from: v1 */
    private void m11959v1(JSONObject jSONObject) {
        m11925R(jSONObject, new C4285q(this));
    }

    /* renamed from: z1 */
    public static void m11964z1() {
        if (!f7393I) {
            for (C4198d next : f7398N.values()) {
                if ((next instanceof C6006h) && next.mo23331k0()) {
                    ((C6006h) next).mo27575U1();
                }
            }
            for (C4198d next2 : f7398N.values()) {
                if ((next2 instanceof C6050n) && next2.mo23331k0()) {
                    ((C6050n) next2).mo27846g2();
                }
            }
            C4272h hVar = new C4272h();
            f7395K = hVar;
            f7394J.schedule(hVar, 3300000);
            C4274i iVar = new C4274i();
            f7397M = iVar;
            f7396L.schedule(iVar, 0, 6000);
            f7393I = true;
        }
    }

    /* renamed from: A0 */
    public List<C6006h> mo23638A0() {
        ArrayList arrayList = new ArrayList();
        this.f7422s.remove("yeelink.wifispeaker.v1");
        this.f7422s.remove("yeelink.gateway.v1");
        this.f7422s.remove("yeelink.gateway.va");
        for (C4198d next : mo23650K0(this.f7422s, this.f7426w)) {
            if (next instanceof C6006h) {
                arrayList.add((C6006h) next);
            }
        }
        return arrayList;
    }

    /* renamed from: A1 */
    public boolean mo23639A1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4198d next : mo23688t0()) {
                if (next instanceof C5972a) {
                    if (next.mo23331k0()) {
                        ((C5972a) next).mo23326b1();
                    }
                } else if (next instanceof C6039j) {
                    ((C6039j) next).mo23326b1();
                } else if (next.mo23331k0()) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("off");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23372G());
                    jSONObject2.put("params", jSONArray2);
                    jSONArray.put(jSONObject2);
                    if (jSONArray.length() == 49) {
                        jSONObject.put("method", "set_power");
                        jSONObject.put("rpcs", jSONArray);
                        m11925R(jSONObject, new C4259a0(this));
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
            m11925R(jSONObject, new C4261b0(this));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: B1 */
    public boolean mo23640B1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4198d next : mo23688t0()) {
                if (next instanceof C5972a) {
                    if (next.mo23331k0()) {
                        ((C5972a) next).mo23326b1();
                    }
                } else if ((next instanceof C6006h) && next.mo23387P() != null) {
                    ((C6006h) next).mo23326b1();
                } else if (next instanceof C6039j) {
                    ((C6039j) next).mo23326b1();
                } else if (next.mo23331k0()) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("off");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23372G());
                    jSONObject2.put("params", jSONArray2);
                    jSONArray.put(jSONObject2);
                    if (jSONArray.length() == 49) {
                        jSONObject.put("method", "set_power");
                        jSONObject.put("rpcs", jSONArray);
                        m11925R(jSONObject, new C4293y(this));
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
            m11925R(jSONObject, new C4294z(this));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: C0 */
    public List<C4198d> mo23641C0() {
        List<C4198d> D0 = m11907D0();
        D0.addAll(m11905B0());
        for (C4198d next : m11905B0()) {
            "new ble device : " + next.mo23391R() + ", model : " + next.mo23395T();
        }
        return D0;
    }

    /* renamed from: C1 */
    public boolean mo23642C1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4198d next : mo23688t0()) {
                if (next instanceof C5972a) {
                    if (next.mo23331k0()) {
                        ((C5972a) next).mo23334l1();
                    }
                } else if (next instanceof C6039j) {
                    ((C6039j) next).mo23334l1();
                } else if (next.mo23331k0()) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("on");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23372G());
                    jSONObject2.put("params", jSONArray2);
                    jSONArray.put(jSONObject2);
                    if (jSONArray.length() == 49) {
                        jSONObject.put("method", "set_power");
                        jSONObject.put("rpcs", jSONArray);
                        m11925R(jSONObject, new C4291w(this));
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
            m11925R(jSONObject, new C4292x(this));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: D1 */
    public boolean mo23643D1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4198d next : mo23688t0()) {
                if (next instanceof C5972a) {
                    if (next.mo23331k0()) {
                        ((C5972a) next).mo23334l1();
                    }
                } else if ((next instanceof C6006h) && next.mo23387P() != null) {
                    ((C6006h) next).mo23334l1();
                } else if (next instanceof C6039j) {
                    ((C6039j) next).mo23334l1();
                } else if (next.mo23331k0()) {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put("on");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23372G());
                    jSONObject2.put("params", jSONArray2);
                    jSONArray.put(jSONObject2);
                    if (jSONArray.length() == 49) {
                        jSONObject.put("method", "set_power");
                        jSONObject.put("rpcs", jSONArray);
                        m11925R(jSONObject, new C4288t(this));
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
            m11925R(jSONObject, new C4289u(this));
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: E0 */
    public List<C4198d> mo23644E0() {
        ArrayList arrayList = new ArrayList();
        for (C4198d next : mo23692v0()) {
            if (next.mo23416o0()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: F0 */
    public List<C6006h> mo23645F0() {
        ArrayList arrayList = new ArrayList();
        for (C4198d next : mo23692v0()) {
            if (next.mo23416o0() && (next instanceof C6006h)) {
                arrayList.add((C6006h) next);
            }
        }
        return arrayList;
    }

    /* renamed from: F1 */
    public void mo23646F1(C9769d dVar) {
        this.f7419p.remove(dVar);
    }

    /* renamed from: G0 */
    public C6005g mo23647G0(String str) {
        C4198d h0 = m11945h0(str);
        if (h0 == null || !(h0 instanceof C6005g)) {
            return null;
        }
        return (C6005g) h0;
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: H0 */
    public C6050n mo23648H0(String str) {
        C4198d h0 = m11945h0(str);
        if (h0 instanceof C6050n) {
            return (C6050n) h0;
        }
        return null;
    }

    /* renamed from: I */
    public void mo23487I() {
        m11931U();
        mo23667f1();
    }

    /* renamed from: J0 */
    public List<C4198d> mo23649J0(List<String> list) {
        return mo23650K0(list, this.f7427x);
    }

    /* renamed from: K0 */
    public List<C4198d> mo23650K0(List<String> list, List<Device.Ownership> list2) {
        List<C4198d> e0 = mo23665e0();
        ArrayList arrayList = new ArrayList();
        for (C4198d next : e0) {
            if (list.contains(next.mo23395T()) && list2.contains(next.mo23399W())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: L0 */
    public C6006h mo23651L0(String str) {
        C4198d h0 = m11945h0(str);
        if (h0 != null && (h0 instanceof C6006h)) {
            return (C6006h) h0;
        }
        "this is not a yeelight device, device id: " + str;
        return null;
    }

    /* renamed from: P */
    public void mo23652P(C4198d dVar) {
        if (!(dVar instanceof C6324c)) {
            f7398N.put(dVar.mo23372G(), dVar);
            return;
        }
        "addCherryUpnpDevice, id: " + dVar.mo23372G();
        C6324c cVar = (C6324c) dVar;
        f7399O.put(dVar.mo23372G(), cVar);
        for (C4198d next : f7398N.values()) {
            if (next.mo23372G().equals(dVar.mo23372G())) {
                next.mo23396T0(cVar);
            }
        }
        DeviceDataProvider.m22389X();
    }

    /* renamed from: Q */
    public void mo23653Q(String str) {
        if (C9784e.m23711b().mo31628d() && MiotManager.getDeviceManager() != null) {
            this.f7418o += str + " || ";
        }
    }

    /* renamed from: W */
    public void mo23654W() {
        mo23655X(true, true, true);
    }

    /* renamed from: X */
    public void mo23655X(boolean z, boolean z2, boolean z3) {
        "device discovery, ble: " + z + ", local wifi: " + z2 + ", remote wifi: " + z3;
        if (!C4201a.m11610z()) {
            C4201a.m11607r().mo23441G();
            return;
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 21) {
                mo23664d1();
            } else {
                mo23662c1();
            }
        }
        this.f7429z.removeMessages(2);
        this.f7429z.removeMessages(1);
        Message obtainMessage = this.f7429z.obtainMessage(1);
        Bundle bundle = new Bundle();
        bundle.putBoolean("clear_device_list", true);
        obtainMessage.setData(bundle);
        this.f7429z.sendMessageDelayed(obtainMessage, 15000);
        Message obtainMessage2 = this.f7429z.obtainMessage(0);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("ble_discovery", z);
        bundle2.putBoolean("local_wifi_discovery", z2);
        bundle2.putBoolean("remote_wifi_discovery", z3);
        obtainMessage2.setData(bundle2);
        this.f7429z.sendMessage(obtainMessage2);
    }

    /* renamed from: Y */
    public void mo23656Y() {
        if (MiotManager.getDeviceManager() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(DiscoveryType.MIOT_WIFI);
            try {
                MiotManager.getDeviceManager().startScan(arrayList, this.f7402A);
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: Z */
    public void mo23657Z(boolean z, boolean z2, String str) {
        if (C9784e.m23711b().mo31628d() && MiotManager.getControllerManager() != null) {
            try {
                MiotManager.getControllerManager().getDeviceListV2(new C4279m(z, z2, str));
            } catch (IotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: Z0 */
    public C6459e0 mo23658Z0(String str, String str2, byte[] bArr) {
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
                "Device record: uuid=" + sb2;
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
                "parse name : " + str + " : " + new String(bArr4);
                if (z) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("ADV_MESH_NAME", bArr4);
                    hashMap.put("ADV_MESH_ADDRESS", 101);
                    hashMap.put("ADV_MESH_UUID", 529);
                    hashMap.put("ADV_PRODUCT_UUID", 4);
                    hashMap.put("ADV_STATUS", 1);
                    C6459e0 e0Var = new C6459e0(str2, str2, Device.Ownership.NOONES, true, (String) null);
                    e0Var.mo27815g2(hashMap);
                    return e0Var;
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
                C6459e0 e0Var2 = new C6459e0(str2, str2, Device.Ownership.NOONES, true, (String) null);
                e0Var2.mo27815g2(hashMap2);
                "Parse a telink device!! address = " + str2 + ", meshUid= " + i13 + ", productId = " + i17 + ", meshAddress = " + (i19 & 255) + ", status = " + b3;
                return e0Var2;
            } else {
                String str4 = str2;
            }
            i += b + 1;
            c = 0;
        }
        return null;
    }

    /* renamed from: a0 */
    public void mo23659a0() {
        mo23660b0(false, (String) null);
    }

    /* renamed from: b0 */
    public void mo23660b0(boolean z, String str) {
        mo23661c0(z, false, str);
    }

    /* renamed from: c */
    public void mo23557c(String str) {
        if (C4201a.m11610z()) {
            m11931U();
            mo23667f1();
        }
    }

    /* renamed from: c0 */
    public void mo23661c0(boolean z, boolean z2, String str) {
        if (C9784e.m23711b().mo31628d() && MiotManager.getDeviceManager() != null) {
            try {
                "discoverRemoteWifiDevices, retrieve remote device list! check result: " + z + ", mac: " + str + "， fromMeshConnect: " + z2;
                MiotManager.getDeviceManager().getRemoteDeviceList(new C4278l(z, str, z2));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c1 */
    public boolean mo23662c1() {
        if (this.f7408e == null) {
            return false;
        }
        m11921O();
        m11927S();
        if (this.f7405b != null) {
            return true;
        }
        this.f7405b = new C4282o();
        return true;
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: d0 */
    public void mo23663d0(boolean z, boolean z2) {
        if (z) {
            mo23656Y();
        }
        if (z2) {
            mo23659a0();
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: d1 */
    public boolean mo23664d1() {
        if (this.f7408e == null) {
            return false;
        }
        m11921O();
        m11927S();
        if (this.f7406c != null) {
            return true;
        }
        this.f7406c = new C4280n();
        return true;
    }

    /* renamed from: e0 */
    public List<C4198d> mo23665e0() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f7398N.values());
        return arrayList;
    }

    /* renamed from: f0 */
    public List<C4198d> mo23666f0() {
        return mo23649J0(this.f7425v);
    }

    /* renamed from: f1 */
    public void mo23667f1() {
        mo23669g1();
        mo23670h1();
        mo23672i1();
        DeviceDataProvider.m22389X();
        "is login? " + C4201a.m11610z() + ", mid: " + C4201a.m11607r().mo23452v();
        C9812t.m23832j().mo31688o();
    }

    /* renamed from: g */
    public void mo23459g() {
    }

    /* renamed from: g0 */
    public C5972a mo23668g0(String str) {
        C4198d h0 = m11945h0(str);
        if (h0 instanceof C5972a) {
            return (C5972a) h0;
        }
        String str2 = f7391G;
        C4308b.m12141t(str2, " is not light device id: " + str, false);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00cb, code lost:
        if (r2 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f0, code lost:
        if (r2 != null) goto L_0x00cd;
     */
    /* renamed from: g1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo23669g1() {
        /*
            r11 = this;
            android.database.Cursor r0 = com.yeelight.yeelib.data.DeviceDataProvider.m22422z()
            boolean r1 = r0.moveToFirst()
            if (r1 == 0) goto L_0x016f
        L_0x000a:
            java.lang.String r1 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15372c
            int r1 = r0.getColumnIndex(r1)
            java.lang.String r1 = r0.getString(r1)
            java.lang.String r2 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15373d
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r4 = r0.getString(r2)
            java.lang.String r2 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15375f
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r7 = r0.getString(r2)
            java.lang.String r2 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15371b
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15376g
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r3 = r0.getString(r3)
            java.lang.String r5 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15379j
            int r5 = r0.getColumnIndex(r5)
            java.lang.String r8 = r0.getString(r5)
            java.lang.String r5 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15378i
            int r5 = r0.getColumnIndex(r5)
            int r9 = r0.getInt(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Read device from database: deviceId="
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ", deviceMac="
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = ", deviceModel="
            r5.append(r6)
            r5.append(r3)
            java.lang.String r6 = ", deviceName="
            r5.append(r6)
            r5.append(r7)
            r5.toString()
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L_0x0083
            com.yeelight.yeelib.data.DeviceDataProvider.m22406j(r1)
            goto L_0x0153
        L_0x0083:
            java.lang.String r5 = "bluetooth"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x00d6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.c.i.d> r2 = f7398N
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L_0x0095
            goto L_0x0153
        L_0x0095:
            r2 = 0
            java.lang.String r5 = "yeelink.light.ble1"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x00a9
            com.yeelight.yeelib.c.m.q r10 = new com.yeelight.yeelib.c.m.q
            com.miot.common.device.Device$Ownership r5 = com.miot.common.device.Device.Ownership.MINE
            r6 = 0
            r2 = r10
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x00cb
        L_0x00a9:
            java.lang.String r5 = "yeelink.bleremote.v1"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x00b9
            com.yeelight.yeelib.c.m.b r2 = new com.yeelight.yeelib.c.m.b
            com.miot.common.device.Device$Ownership r3 = com.miot.common.device.Device.Ownership.MINE
            r2.<init>(r1, r4, r7, r3)
            goto L_0x00cb
        L_0x00b9:
            java.lang.String r5 = "yeelink.light.gingko"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x00cb
            com.yeelight.yeelib.c.m.e0 r10 = new com.yeelight.yeelib.c.m.e0
            com.miot.common.device.Device$Ownership r5 = com.miot.common.device.Device.Ownership.MINE
            r6 = 0
            r2 = r10
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x00cb:
            if (r2 == 0) goto L_0x0140
        L_0x00cd:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.c.i.d> r3 = f7398N
            r3.put(r1, r2)
            r2.mo23373G0(r9)
            goto L_0x0140
        L_0x00d6:
            java.lang.String r4 = "wifi"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x00f3
            java.lang.String r2 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15377h
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.valueOf(r2)
            com.yeelight.yeelib.c.i.d r2 = com.yeelight.yeelib.p150c.C5979b.m17535b(r3, r1, r7, r2)
            if (r2 == 0) goto L_0x0140
            goto L_0x00cd
        L_0x00f3:
            java.lang.String r4 = "bluetooth_mesh"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0114
            java.lang.String r4 = "spec_wifi"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0104
            goto L_0x0114
        L_0x0104:
            java.lang.String r3 = "mesh"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0140
            java.lang.String r2 = f7391G
            java.lang.String r3 = "======= mesh device ========"
            com.yeelight.yeelib.utils.C10543g.m25741b(r2, r3)
            goto L_0x0140
        L_0x0114:
            java.lang.String r2 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15377h
            int r2 = r0.getColumnIndex(r2)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r4 = com.yeelight.yeelib.data.C7579c.C7580a.C7581a.f15373d
            int r4 = r0.getColumnIndex(r4)
            java.lang.String r4 = r0.getString(r4)
            com.yeelight.yeelib.c.i.n r3 = com.yeelight.yeelib.device.xiaomi.C9756a.m23654b(r3, r1, r7)
            if (r3 == 0) goto L_0x0140
            com.miot.common.device.Device$Ownership r2 = com.miot.common.device.Device.Ownership.valueOf(r2)
            r3.mo23386O0(r2)
            r3.mo23381L0(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.c.i.d> r2 = f7398N
            r2.put(r1, r3)
            r3.mo23373G0(r9)
        L_0x0140:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L_0x0153
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.c.i.d> r2 = f7398N
            java.lang.Object r1 = r2.get(r1)
            com.yeelight.yeelib.c.i.d r1 = (com.yeelight.yeelib.p150c.p151i.C4198d) r1
            if (r1 == 0) goto L_0x0153
            r1.mo23390Q0(r8)
        L_0x0153:
            boolean r1 = r0.moveToNext()
            if (r1 != 0) goto L_0x000a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "device count:"
            r1.append(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.yeelight.yeelib.c.i.d> r2 = f7398N
            int r2 = r2.size()
            r1.append(r2)
            r1.toString()
        L_0x016f:
            r0.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4257w.mo23669g1():void");
    }

    /* renamed from: h */
    public void mo23488h(int i) {
        if (C4201a.m11610z()) {
            mo23655X(false, false, true);
            C9812t.m23832j().mo31688o();
        }
    }

    /* renamed from: h1 */
    public void mo23670h1() {
        Cursor C = DeviceDataProvider.m22368C();
        if (C.moveToFirst()) {
            do {
                String valueOf = String.valueOf(C.getInt(C.getColumnIndex(C7579c.C7582b.C7583a.f15383a)));
                String valueOf2 = String.valueOf(C.getString(C.getColumnIndex(C7579c.C7582b.C7583a.f15385c)));
                int i = C.getInt(C.getColumnIndex(C7579c.C7582b.C7583a.f15386d));
                C5980c cVar = new C5980c(valueOf, valueOf2);
                cVar.mo23373G0(i);
                f7398N.put(valueOf, cVar);
            } while (C.moveToNext());
        }
        C.close();
    }

    /* renamed from: i */
    public void mo23460i() {
        mo23680o1();
        mo23667f1();
        mo23655X(true, false, true);
        m11956s1();
    }

    /* renamed from: i0 */
    public C6006h mo23671i0(String str) {
        for (C4198d next : f7398N.values()) {
            if ((next instanceof C6006h) && ((C7562l) next.mo23408d0()).mo28965X0().equals(str)) {
                return (C6006h) next;
            }
        }
        return null;
    }

    /* renamed from: i1 */
    public void mo23672i1() {
        Cursor D = DeviceDataProvider.m22369D();
        if (D.moveToFirst()) {
            do {
                C9850s b1 = m11941b1(D);
                ConcurrentHashMap<String, C4198d> concurrentHashMap = f7398N;
                if (!concurrentHashMap.containsKey(b1.mo31821b() + "_" + b1.mo31820a())) {
                    C6000f fVar = new C6000f(b1);
                    f7398N.put(fVar.mo23372G(), fVar);
                }
            } while (D.moveToNext());
        }
        D.close();
    }

    /* renamed from: j */
    public void mo23489j() {
        this.f7411h = false;
        m11929T();
    }

    /* renamed from: j0 */
    public C4200i mo23673j0(String str) {
        C4198d h0 = m11945h0(str);
        if (h0 instanceof C4200i) {
            return (C4200i) h0;
        }
        String str2 = f7391G;
        C4308b.m12141t(str2, str + " is not group id: " + str, false);
        return null;
    }

    /* renamed from: j1 */
    public void mo23674j1() {
        for (C4198d next : mo23690u0()) {
            if (next.mo23331k0() && (next instanceof C5972a)) {
                ((C5972a) next).mo27485N1();
            }
        }
    }

    /* renamed from: k0 */
    public C5980c mo23675k0(String str) {
        C4198d h0 = m11945h0(str);
        if (h0 instanceof C5980c) {
            return (C5980c) h0;
        }
        String str2 = f7391G;
        C4308b.m12141t(str2, str + " is not group id: " + str, false);
        return null;
    }

    /* renamed from: k1 */
    public void mo23676k1() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4198d next : f7398N.values()) {
                try {
                    if (((next instanceof C6006h) || (next instanceof C6067o)) && next.mo23331k0() && !m11923P0(next.mo23395T())) {
                        JSONArray jSONArray2 = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next instanceof C6067o ? ((C6067o) next).mo27788M1() : next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", "miIO.info");
                            jSONObject.put("rpcs", jSONArray);
                            "refreshWifiDeviceInfo, json to send: " + jSONObject.toString();
                            m11959v1(jSONObject);
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
                "refreshWifiDeviceInfo, json to send: " + jSONObject.toString();
                m11959v1(jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: l */
    public void mo23461l() {
        m11909E1();
        mo23680o1();
    }

    /* renamed from: l1 */
    public void mo23677l1() {
        mo23676k1();
        mo23674j1();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4198d next : f7398N.values()) {
                if ((next instanceof C6006h) && next.mo23331k0()) {
                    if ((next.mo23399W() == Device.Ownership.MINE || next.mo23399W() == Device.Ownership.OTHERS) && !m11923P0(next.mo23395T())) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (String put : next.mo23357z()) {
                            jSONArray2.put(put);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("did", next.mo23372G());
                        jSONObject2.put("params", jSONArray2);
                        jSONArray.put(jSONObject2);
                        if (jSONArray.length() == 49) {
                            jSONObject.put("method", GetCodec.DEFAULT_GET_PROPERTY);
                            jSONObject.put("rpcs", jSONArray);
                            "refreshWifiDeviceStatus, json to send: " + jSONObject.toString();
                            mo23691u1(jSONObject);
                            jSONObject = new JSONObject();
                            jSONArray = new JSONArray();
                        }
                    }
                }
            }
            if (jSONArray.length() != 0) {
                jSONObject.put("method", GetCodec.DEFAULT_GET_PROPERTY);
                jSONObject.put("rpcs", jSONArray);
                "refreshWifiDeviceStatus, json to send: " + jSONObject.toString();
                mo23691u1(jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: m1 */
    public void mo23678m1(C9769d dVar) {
        if (dVar != null) {
            this.f7419p.add(dVar);
        }
    }

    /* renamed from: n1 */
    public void mo23679n1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.miot.api.Constants.ACTION_PUSH_COMMAND);
        intentFilter.addAction(com.miot.api.Constants.ACTION_PUSH_MESSAGE);
        this.f7404a.registerReceiver(this.f7403B, intentFilter);
    }

    /* renamed from: o1 */
    public void mo23680o1() {
        for (C4198d v0 : f7398N.values()) {
            v0.mo23349v0();
        }
        f7398N.clear();
    }

    /* renamed from: p0 */
    public List<C4200i> mo23681p0(String str) {
        ArrayList arrayList = new ArrayList();
        for (C4198d next : f7398N.values()) {
            if ((next instanceof C4200i) && TextUtils.equals(next.mo23404Z(), str)) {
                arrayList.add((C4200i) next);
            }
        }
        return arrayList;
    }

    /* renamed from: p1 */
    public void mo23682p1(String str) {
        C4198d dVar = f7398N.get(str);
        if (dVar == null) {
            return;
        }
        if (Device.Ownership.MINE != dVar.mo23399W() && Device.Ownership.OTHERS != dVar.mo23399W() && dVar.mo23335m0()) {
            dVar.mo23349v0();
            f7398N.remove(str);
        } else if (!dVar.mo23333l0()) {
            dVar.mo23408d0().mo27646J0(false);
        }
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: q0 */
    public C6039j mo23683q0(String str) {
        C4198d h0 = m11945h0(str);
        if (h0 instanceof C6039j) {
            return (C6039j) h0;
        }
        String str2 = f7391G;
        C4308b.m12141t(str2, " is not light device id: " + str, false);
        return null;
    }

    /* renamed from: q1 */
    public void mo23684q1(String str) {
        for (C4198d next : f7398N.values()) {
            if (next.mo23372G().equals(str)) {
                next.mo23396T0((C6324c) null);
            }
        }
        f7399O.remove(str);
        DeviceDataProvider.m22389X();
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }

    /* renamed from: r0 */
    public List<C6046l> mo23685r0() {
        ArrayList arrayList = new ArrayList();
        for (C6046l add : f7400P.values()) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: r1 */
    public void mo23686r1(String str) {
        C4198d dVar = f7398N.get(str);
        if (dVar != null) {
            dVar.mo23349v0();
            f7398N.remove(str);
        }
        DeviceBrowserProvider.m22365b();
    }

    /* renamed from: s0 */
    public List<C4200i> mo23687s0() {
        ArrayList arrayList = new ArrayList();
        for (C4198d next : mo23650K0(this.f7421r, this.f7426w)) {
            if (next instanceof C4200i) {
                arrayList.add((C4200i) next);
            }
        }
        return arrayList;
    }

    /* renamed from: t0 */
    public List<C4200i> mo23688t0() {
        ArrayList arrayList = new ArrayList();
        for (C4198d next : mo23650K0(this.f7420q, this.f7426w)) {
            if (next instanceof C4200i) {
                arrayList.add((C4200i) next);
            }
        }
        return arrayList;
    }

    /* renamed from: t1 */
    public void mo23689t1(long j) {
        if (!this.f7413j) {
            this.f7415l = j;
            this.f7413j = true;
            this.f7429z.sendEmptyMessageDelayed(3, j);
        }
    }

    /* renamed from: u0 */
    public List<C4198d> mo23690u0() {
        return mo23650K0(this.f7423t, this.f7426w);
    }

    /* renamed from: u1 */
    public void mo23691u1(JSONObject jSONObject) {
        m11925R(jSONObject, new C4284p(this));
    }

    /* renamed from: v */
    public void mo23490v() {
        if (C4201a.m11610z() && m11947l0().mo23690u0().size() != 0) {
            this.f7429z.sendEmptyMessageDelayed(5, 3000);
        }
    }

    /* renamed from: v0 */
    public List<C4198d> mo23692v0() {
        ArrayList arrayList = new ArrayList();
        for (C4198d next : f7398N.values()) {
            if (next.mo23399W().equals(Device.Ownership.MINE) || next.mo23399W().equals(Device.Ownership.OTHERS)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: w0 */
    public List<C6039j> mo23693w0(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        ArrayList arrayList2 = new ArrayList();
        for (C4198d next : mo23650K0(arrayList, this.f7426w)) {
            if (next instanceof C6039j) {
                arrayList2.add((C6039j) next);
            }
        }
        return arrayList2;
    }

    /* renamed from: w1 */
    public void mo23694w1() {
        this.f7429z.removeMessages(1);
        Message message = new Message();
        message.what = 1;
        Bundle bundle = new Bundle();
        bundle.putBoolean("notify_scan_result", false);
        message.setData(bundle);
        this.f7429z.sendMessage(message);
    }

    /* renamed from: x0 */
    public List<C4198d> mo23695x0() {
        ArrayList arrayList = new ArrayList();
        for (C4198d add : mo23650K0(this.f7424u, this.f7426w)) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: x1 */
    public void mo23696x1() {
        if (MiotManager.getDeviceManager() != null) {
            try {
                MiotManager.getDeviceManager().stopScan();
                for (C9769d t : this.f7419p) {
                    t.mo26104t();
                }
            } catch (MiotException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: y0 */
    public List<C6006h> mo23697y0() {
        ArrayList arrayList = new ArrayList();
        for (C4198d next : mo23650K0(this.f7422s, this.f7426w)) {
            if (next instanceof C6006h) {
                arrayList.add((C6006h) next);
            }
        }
        return arrayList;
    }

    /* renamed from: y1 */
    public void mo23698y1() {
        this.f7413j = false;
        this.f7429z.removeMessages(3);
    }

    /* renamed from: z0 */
    public List<C4198d> mo23699z0() {
        ArrayList arrayList = new ArrayList();
        for (C4198d add : mo23650K0(this.f7422s, this.f7426w)) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
