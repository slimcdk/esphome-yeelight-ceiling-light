package com.yeelight.yeelib.p152f;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.yeelight.yeelib.service.NotificationBarControlService;
import com.yeelight.yeelib.utils.C10551r;
import java.util.List;
import p011c.p091e.p092a.p093a.p099e.C1242a;
import p011c.p091e.p092a.p093a.p099e.C1245c;

/* renamed from: com.yeelight.yeelib.f.y */
public class C4297y {

    /* renamed from: e */
    public static Context f7456e;

    /* renamed from: f */
    public static NotificationBarControlService.NotificationBarController f7457f;

    /* renamed from: a */
    private BluetoothManager f7458a;

    /* renamed from: b */
    private BluetoothAdapter f7459b;

    /* renamed from: c */
    private ConnectivityManager f7460c;

    /* renamed from: d */
    public C1242a f7461d;

    /* renamed from: com.yeelight.yeelib.f.y$a */
    static class C4298a implements ServiceConnection {
    }

    /* renamed from: com.yeelight.yeelib.f.y$b */
    static class C4299b {

        /* renamed from: a */
        static final C4297y f7462a = new C4297y((C4298a) null);
    }

    private C4297y() {
        this.f7458a = null;
        this.f7459b = null;
        m12066i();
    }

    /* synthetic */ C4297y(C4298a aVar) {
        this();
    }

    /* renamed from: f */
    public static C4297y m12064f() {
        return C4299b.f7462a;
    }

    /* renamed from: g */
    public static C4297y m12065g(Context context) {
        f7456e = context;
        return C4299b.f7462a;
    }

    /* renamed from: i */
    private void m12066i() {
        C1242a a = C1245c.m3206a(f7456e, "wx964e82e70e57a271", true);
        this.f7461d = a;
        a.mo10056b("wx964e82e70e57a271");
    }

    /* renamed from: k */
    private boolean m12067k(int i) {
        StringBuilder sb;
        String str;
        if (this.f7460c == null) {
            this.f7460c = (ConnectivityManager) f7456e.getSystemService("connectivity");
        }
        boolean z = false;
        if (i == 1) {
            NetworkInfo networkInfo = this.f7460c.getNetworkInfo(1);
            if (networkInfo != null) {
                z = networkInfo.isConnected();
            }
            sb = new StringBuilder();
            str = "WIFI isConnected=";
        } else if (i != 2) {
            if (i == 3) {
                BluetoothAdapter b = mo23731b();
                if (b != null) {
                    z = b.isEnabled();
                } else {
                    C10551r.m25776h();
                }
                sb = new StringBuilder();
                str = "Bluetooth isenable=";
            }
            return z;
        } else {
            NetworkInfo networkInfo2 = this.f7460c.getNetworkInfo(0);
            if (networkInfo2 != null) {
                z = networkInfo2.isConnected();
            }
            sb = new StringBuilder();
            str = "Mobile isConnected=";
        }
        sb.append(str);
        sb.append(z);
        sb.toString();
        return z;
    }

    /* renamed from: l */
    public static void m12068l() {
        try {
            Intent intent = new Intent(f7456e, Class.forName("com.yeelight.cherry.ui.activity.LauncherActivity"));
            intent.setFlags(268468224);
            f7456e.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public boolean mo23730a() {
        return mo23733d() < 6;
    }

    /* renamed from: b */
    public BluetoothAdapter mo23731b() {
        if (this.f7459b == null) {
            this.f7459b = mo23732c().getAdapter();
        }
        return this.f7459b;
    }

    /* renamed from: c */
    public BluetoothManager mo23732c() {
        if (this.f7458a == null) {
            this.f7458a = (BluetoothManager) f7456e.getSystemService("bluetooth");
        }
        return this.f7458a;
    }

    /* renamed from: d */
    public int mo23733d() {
        int size = mo23734e().size();
        "getConnectedBleDevices, count: " + size;
        return size;
    }

    /* renamed from: e */
    public List<BluetoothDevice> mo23734e() {
        return mo23732c().getConnectedDevices(7);
    }

    /* renamed from: h */
    public C1242a mo23735h() {
        return this.f7461d;
    }

    /* renamed from: j */
    public boolean mo23736j() {
        return m12067k(3);
    }

    /* renamed from: m */
    public void mo23737m(Context context, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            context.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
        } else {
            ((WifiManager) context.getSystemService("wifi")).setWifiEnabled(z);
        }
    }
}
