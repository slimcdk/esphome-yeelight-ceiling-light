package com.yeelight.yeelib.managers;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.yeelight.yeelib.service.ConnectionStateMonitor;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yeelight.yeelib.managers.e */
public class C8272e {

    /* renamed from: e */
    private static C8272e f14189e;

    /* renamed from: a */
    List<C3063a> f14190a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private boolean f14191b;

    /* renamed from: c */
    private int f14192c = -1;

    /* renamed from: d */
    private String f14193d;

    /* renamed from: com.yeelight.yeelib.managers.e$a */
    public interface C3063a {
        /* renamed from: I */
        void mo23265I();

        /* renamed from: i */
        void mo23294i(int i);

        /* renamed from: j */
        void mo23296j();

        /* renamed from: v */
        void mo23318v();
    }

    /* renamed from: com.yeelight.yeelib.managers.e$b */
    public static class C8273b extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 0);
                if (intExtra == 12) {
                    C8272e.m19511b().mo35207g();
                } else if (intExtra == 10) {
                    C8272e.m19511b().mo35206f();
                }
            } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                C8272e.m19511b().mo35213n();
            }
        }
    }

    private C8272e() {
        m19512l();
    }

    /* renamed from: b */
    public static C8272e m19511b() {
        if (f14189e == null) {
            f14189e = new C8272e();
        }
        return f14189e;
    }

    /* renamed from: l */
    private void m19512l() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        if (Build.VERSION.SDK_INT >= 21) {
            new ConnectionStateMonitor().enable(C3108x.f4951e);
        } else {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        C3108x.f4951e.registerReceiver(new C8273b(), intentFilter);
    }

    /* renamed from: a */
    public String mo35202a() {
        return this.f14193d;
    }

    /* renamed from: c */
    public boolean mo35203c() {
        return BluetoothAdapter.getDefaultAdapter() != null && BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    /* renamed from: d */
    public boolean mo35204d() {
        mo35213n();
        return this.f14191b;
    }

    /* renamed from: e */
    public boolean mo35205e() {
        return mo35204d() && this.f14192c == 1;
    }

    /* renamed from: f */
    public void mo35206f() {
        for (C3063a j : this.f14190a) {
            j.mo23296j();
        }
    }

    /* renamed from: g */
    public void mo35207g() {
        for (C3063a v : this.f14190a) {
            v.mo23318v();
        }
    }

    /* renamed from: h */
    public void mo35208h() {
        for (C3063a i : this.f14190a) {
            i.mo23294i(this.f14192c);
        }
    }

    /* renamed from: i */
    public void mo35209i() {
        for (C3063a I : this.f14190a) {
            I.mo23265I();
        }
    }

    /* renamed from: j */
    public void mo35210j(C3063a aVar) {
        mo35211k(aVar, true);
    }

    /* renamed from: k */
    public void mo35211k(C3063a aVar, boolean z) {
        if (!this.f14190a.contains(aVar)) {
            this.f14190a.add(aVar);
        }
        mo35213n();
        if (!z) {
            return;
        }
        if (this.f14191b) {
            aVar.mo23294i(this.f14192c);
        } else {
            aVar.mo23265I();
        }
    }

    /* renamed from: m */
    public void mo35212m(C3063a aVar) {
        this.f14190a.remove(aVar);
    }

    /* renamed from: n */
    public void mo35213n() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C3108x.f4951e.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.f14191b;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        this.f14191b = z2;
        if (z2) {
            int type = activeNetworkInfo.getType();
            this.f14192c = type;
            this.f14193d = type == 1 ? activeNetworkInfo.getExtraInfo() : "";
            if (this.f14191b != z) {
                m19511b().mo35208h();
                return;
            }
            return;
        }
        this.f14192c = -1;
        if (z2 != z) {
            m19511b().mo35209i();
        }
    }
}
