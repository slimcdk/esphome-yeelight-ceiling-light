package com.yeelight.yeelib.managers;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import com.yeelight.cherry.p141ui.activity.LauncherActivity;
import com.yeelight.yeelib.service.KillNotificationService;
import com.yeelight.yeelib.service.NotificationBarControlService;
import java.util.List;
import p051j4.C9197p;
import p178k3.C9289a;
import p178k3.C9292c;

/* renamed from: com.yeelight.yeelib.managers.x */
public class C3108x {

    /* renamed from: e */
    public static Context f4951e;

    /* renamed from: f */
    public static NotificationBarControlService.NotificationBarController f4952f;

    /* renamed from: a */
    private BluetoothManager f4953a;

    /* renamed from: b */
    private BluetoothAdapter f4954b;

    /* renamed from: c */
    private ConnectivityManager f4955c;

    /* renamed from: d */
    public C9289a f4956d;

    /* renamed from: com.yeelight.yeelib.managers.x$a */
    class C3109a implements ServiceConnection {
        C3109a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C3108x.f4952f = (NotificationBarControlService.NotificationBarController) iBinder;
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C3108x.f4952f = null;
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.x$b */
    class C3110b implements ServiceConnection {
        C3110b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ((KillNotificationService.KillBinder) iBinder).service.startService(new Intent(C3108x.f4951e, KillNotificationService.class));
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.x$c */
    static class C3111c {

        /* renamed from: a */
        static final C3108x f4957a = new C3108x((C3109a) null);
    }

    static {
        new C3109a();
        new C3110b();
    }

    private C3108x() {
        this.f4953a = null;
        this.f4954b = null;
        m8225i();
    }

    /* synthetic */ C3108x(C3109a aVar) {
        this();
    }

    /* renamed from: f */
    public static C3108x m8223f() {
        return C3111c.f4957a;
    }

    /* renamed from: g */
    public static C3108x m8224g(Context context) {
        f4951e = context;
        return C3111c.f4957a;
    }

    /* renamed from: i */
    private void m8225i() {
        C9289a a = C9292c.m22736a(f4951e, "wx964e82e70e57a271", true);
        this.f4956d = a;
        a.mo37802c("wx964e82e70e57a271");
    }

    /* renamed from: k */
    private boolean m8226k(int i) {
        StringBuilder sb;
        String str;
        if (this.f4955c == null) {
            this.f4955c = (ConnectivityManager) f4951e.getSystemService("connectivity");
        }
        boolean z = false;
        if (i == 1) {
            NetworkInfo networkInfo = this.f4955c.getNetworkInfo(1);
            if (networkInfo != null) {
                z = networkInfo.isConnected();
            }
            sb = new StringBuilder();
            str = "WIFI isConnected=";
        } else if (i != 2) {
            if (i == 3) {
                BluetoothAdapter b = mo23541b();
                if (b != null) {
                    z = b.isEnabled();
                } else {
                    C9197p.m22175h();
                }
                sb = new StringBuilder();
                str = "Bluetooth isenable=";
            }
            return z;
        } else {
            NetworkInfo networkInfo2 = this.f4955c.getNetworkInfo(0);
            if (networkInfo2 != null) {
                z = networkInfo2.isConnected();
            }
            sb = new StringBuilder();
            str = "Mobile isConnected=";
        }
        sb.append(str);
        sb.append(z);
        return z;
    }

    /* renamed from: l */
    public static void m8227l() {
        Class<LauncherActivity> cls = LauncherActivity.class;
        try {
            int i = LauncherActivity.f10581f;
            Intent intent = new Intent(f4951e, cls);
            intent.setFlags(268468224);
            f4951e.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public boolean mo23540a() {
        return mo23543d() < 6;
    }

    /* renamed from: b */
    public BluetoothAdapter mo23541b() {
        if (this.f4954b == null) {
            this.f4954b = mo23542c().getAdapter();
        }
        return this.f4954b;
    }

    /* renamed from: c */
    public BluetoothManager mo23542c() {
        if (this.f4953a == null) {
            this.f4953a = (BluetoothManager) f4951e.getSystemService("bluetooth");
        }
        return this.f4953a;
    }

    /* renamed from: d */
    public int mo23543d() {
        int size = mo23544e().size();
        StringBuilder sb = new StringBuilder();
        sb.append("getConnectedBleDevices, count: ");
        sb.append(size);
        return size;
    }

    /* renamed from: e */
    public List<BluetoothDevice> mo23544e() {
        return mo23542c().getConnectedDevices(7);
    }

    /* renamed from: h */
    public C9289a mo23545h() {
        return this.f4956d;
    }

    /* renamed from: j */
    public boolean mo23546j() {
        return m8226k(3);
    }

    /* renamed from: m */
    public void mo23547m(Context context, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            context.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
        } else {
            ((WifiManager) context.getSystemService("wifi")).setWifiEnabled(z);
        }
    }
}
