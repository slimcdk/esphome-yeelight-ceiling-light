package com.yeelight.yeelib.p152f;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.yeelight.yeelib.service.ConnectionStateMonitor;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yeelight.yeelib.f.e */
public class C9784e {

    /* renamed from: e */
    private static C9784e f17695e;

    /* renamed from: a */
    List<C4213a> f17696a = new CopyOnWriteArrayList();

    /* renamed from: b */
    private boolean f17697b;

    /* renamed from: c */
    private int f17698c = -1;

    /* renamed from: d */
    private String f17699d;

    /* renamed from: com.yeelight.yeelib.f.e$a */
    public interface C4213a {
        /* renamed from: I */
        void mo23487I();

        /* renamed from: h */
        void mo23488h(int i);

        /* renamed from: j */
        void mo23489j();

        /* renamed from: v */
        void mo23490v();
    }

    /* renamed from: com.yeelight.yeelib.f.e$b */
    public static class C9785b extends BroadcastReceiver {
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                java.lang.String r5 = r6.getAction()
                int r0 = r5.hashCode()
                r1 = -1530327060(0xffffffffa4c90fec, float:-8.719683E-17)
                r2 = 0
                r3 = 1
                if (r0 == r1) goto L_0x001f
                r1 = -1172645946(0xffffffffba1ad7c6, float:-5.9067865E-4)
                if (r0 == r1) goto L_0x0015
                goto L_0x0029
            L_0x0015:
                java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0029
                r5 = 0
                goto L_0x002a
            L_0x001f:
                java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0029
                r5 = 1
                goto L_0x002a
            L_0x0029:
                r5 = -1
            L_0x002a:
                if (r5 == 0) goto L_0x004d
                if (r5 == r3) goto L_0x002f
                goto L_0x0054
            L_0x002f:
                java.lang.String r5 = "android.bluetooth.adapter.extra.STATE"
                int r5 = r6.getIntExtra(r5, r2)
                r6 = 12
                if (r5 != r6) goto L_0x0041
                com.yeelight.yeelib.f.e r5 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                r5.mo31631g()
                goto L_0x0054
            L_0x0041:
                r6 = 10
                if (r5 != r6) goto L_0x0054
                com.yeelight.yeelib.f.e r5 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                r5.mo31630f()
                goto L_0x0054
            L_0x004d:
                com.yeelight.yeelib.f.e r5 = com.yeelight.yeelib.p152f.C9784e.m23711b()
                r5.mo31637n()
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C9784e.C9785b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    private C9784e() {
        m23712l();
    }

    /* renamed from: b */
    public static C9784e m23711b() {
        if (f17695e == null) {
            f17695e = new C9784e();
        }
        return f17695e;
    }

    /* renamed from: l */
    private void m23712l() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        if (Build.VERSION.SDK_INT >= 21) {
            new ConnectionStateMonitor().enable(C4297y.f7456e);
        } else {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        C4297y.f7456e.registerReceiver(new C9785b(), intentFilter);
    }

    /* renamed from: a */
    public String mo31626a() {
        return this.f17699d;
    }

    /* renamed from: c */
    public boolean mo31627c() {
        return BluetoothAdapter.getDefaultAdapter() != null && BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    /* renamed from: d */
    public boolean mo31628d() {
        mo31637n();
        return this.f17697b;
    }

    /* renamed from: e */
    public boolean mo31629e() {
        return mo31628d() && this.f17698c == 1;
    }

    /* renamed from: f */
    public void mo31630f() {
        for (C4213a j : this.f17696a) {
            j.mo23489j();
        }
    }

    /* renamed from: g */
    public void mo31631g() {
        for (C4213a v : this.f17696a) {
            v.mo23490v();
        }
    }

    /* renamed from: h */
    public void mo31632h() {
        for (C4213a h : this.f17696a) {
            h.mo23488h(this.f17698c);
        }
    }

    /* renamed from: i */
    public void mo31633i() {
        for (C4213a I : this.f17696a) {
            I.mo23487I();
        }
    }

    /* renamed from: j */
    public void mo31634j(C4213a aVar) {
        mo31635k(aVar, true);
    }

    /* renamed from: k */
    public void mo31635k(C4213a aVar, boolean z) {
        if (!this.f17696a.contains(aVar)) {
            this.f17696a.add(aVar);
        }
        mo31637n();
        if (!z) {
            return;
        }
        if (this.f17697b) {
            aVar.mo23488h(this.f17698c);
        } else {
            aVar.mo23487I();
        }
    }

    /* renamed from: m */
    public void mo31636m(C4213a aVar) {
        this.f17696a.remove(aVar);
    }

    /* renamed from: n */
    public void mo31637n() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) C4297y.f7456e.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.f17697b;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        this.f17697b = z2;
        if (z2) {
            int type = activeNetworkInfo.getType();
            this.f17698c = type;
            this.f17699d = type == 1 ? activeNetworkInfo.getExtraInfo() : "";
            if (this.f17697b != z) {
                m23711b().mo31632h();
                return;
            }
            return;
        }
        this.f17698c = -1;
        if (z2 != z) {
            m23711b().mo31633i();
        }
    }
}
