package org.fourthline.cling.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.eclipse.jetty.util.security.Constraint;
import org.fourthline.cling.C10011c;
import org.fourthline.cling.model.C10018f;
import org.fourthline.cling.transport.C3581a;
import org.fourthline.cling.transport.RouterException;
import org.seamless.util.C10243a;
import p132b7.C4003a;
import p230x6.C12004a;

/* renamed from: org.fourthline.cling.android.b */
public class C10004b extends C3581a {
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final Logger f18467s = Logger.getLogger(C4003a.class.getName());

    /* renamed from: m */
    private final Context f18468m;

    /* renamed from: n */
    private final WifiManager f18469n;

    /* renamed from: o */
    protected WifiManager.MulticastLock f18470o;

    /* renamed from: p */
    protected WifiManager.WifiLock f18471p;

    /* renamed from: q */
    protected NetworkInfo f18472q;

    /* renamed from: r */
    protected BroadcastReceiver f18473r;

    /* renamed from: org.fourthline.cling.android.b$a */
    class C10005a extends BroadcastReceiver {
        C10005a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo40312a(Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            String stringExtra = intent.getStringExtra("reason");
            boolean booleanExtra2 = intent.getBooleanExtra("isFailover", false);
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            NetworkInfo networkInfo2 = (NetworkInfo) intent.getParcelableExtra("otherNetwork");
            C10004b.f18467s.info("Connectivity change detected...");
            Logger o = C10004b.f18467s;
            o.info("EXTRA_NO_CONNECTIVITY: " + booleanExtra);
            Logger o2 = C10004b.f18467s;
            o2.info("EXTRA_REASON: " + stringExtra);
            Logger o3 = C10004b.f18467s;
            o3.info("EXTRA_IS_FAILOVER: " + booleanExtra2);
            Logger o4 = C10004b.f18467s;
            StringBuilder sb = new StringBuilder();
            sb.append("EXTRA_NETWORK_INFO: ");
            if (networkInfo == null) {
                networkInfo = "none";
            }
            sb.append(networkInfo);
            o4.info(sb.toString());
            Logger o5 = C10004b.f18467s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EXTRA_OTHER_NETWORK_INFO: ");
            if (networkInfo2 == null) {
                networkInfo2 = "none";
            }
            sb2.append(networkInfo2);
            o5.info(sb2.toString());
            Logger o6 = C10004b.f18467s;
            o6.info("EXTRA_EXTRA_INFO: " + intent.getStringExtra("extraInfo"));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo40313b(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
            if (networkInfo == null && networkInfo2 == null) {
                return true;
            }
            return (networkInfo == null || networkInfo2 == null || networkInfo.getType() != networkInfo2.getType()) ? false : true;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                mo40312a(intent);
                NetworkInfo a = C10009e.m24771a(context);
                if (C10004b.this.f18472q != null && a == null) {
                    int i = 1;
                    while (i <= 3) {
                        try {
                            Thread.sleep(1000);
                            C10004b.f18467s.warning(String.format("%s => NONE network transition, waiting for new network... retry #%d", new Object[]{C10004b.this.f18472q.getTypeName(), Integer.valueOf(i)}));
                            a = C10009e.m24771a(context);
                            if (a != null) {
                                break;
                            }
                            i++;
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                if (mo40313b(C10004b.this.f18472q, a)) {
                    C10004b.f18467s.info("No actual network change... ignoring event!");
                    return;
                }
                try {
                    C10004b bVar = C10004b.this;
                    bVar.mo40308s(bVar.f18472q, a);
                } catch (RouterException e) {
                    C10004b.this.mo40306q(e);
                }
            }
        }
    }

    public C10004b(C10011c cVar, C12004a aVar, Context context) {
        super(cVar, aVar);
        this.f18468m = context;
        this.f18469n = (WifiManager) context.getSystemService("wifi");
        this.f18472q = C10009e.m24771a(context);
        if (!C10018f.f18493b) {
            BroadcastReceiver p = mo40305p();
            this.f18473r = p;
            context.registerReceiver(p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: e */
    public boolean mo24970e() {
        mo24977j(this.f5974f);
        try {
            boolean e = super.mo24970e();
            if (e && mo40307r()) {
                mo40309t(true);
                mo40310u(true);
            }
            return e;
        } finally {
            mo24981n(this.f5974f);
        }
    }

    /* renamed from: g */
    public boolean mo24972g() {
        mo24977j(this.f5974f);
        try {
            if (mo40307r()) {
                mo40309t(false);
                mo40310u(false);
            }
            return super.mo24972g();
        } finally {
            mo24981n(this.f5974f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo24975h() {
        return 15000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public BroadcastReceiver mo40305p() {
        return new C10005a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo40306q(RouterException routerException) {
        Throwable a = C10243a.m25753a(routerException);
        if (a instanceof InterruptedException) {
            Logger logger = f18467s;
            Level level = Level.INFO;
            logger.log(level, "Router was interrupted: " + routerException, a);
            return;
        }
        Logger logger2 = f18467s;
        Level level2 = Level.WARNING;
        logger2.log(level2, "Router error on network change: " + routerException, routerException);
    }

    /* renamed from: r */
    public boolean mo40307r() {
        return C10009e.m24773c(this.f18472q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo40308s(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        Logger logger = f18467s;
        Object[] objArr = new Object[2];
        objArr[0] = networkInfo == null ? "" : networkInfo.getTypeName();
        String str = Constraint.NONE;
        objArr[1] = networkInfo2 == null ? str : networkInfo2.getTypeName();
        logger.info(String.format("Network type changed %s => %s", objArr));
        if (mo24972g()) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = networkInfo == null ? str : networkInfo.getTypeName();
            logger.info(String.format("Disabled router on network type change (old network: %s)", objArr2));
        }
        this.f18472q = networkInfo2;
        if (mo24970e()) {
            Object[] objArr3 = new Object[1];
            if (networkInfo2 != null) {
                str = networkInfo2.getTypeName();
            }
            objArr3[0] = str;
            logger.info(String.format("Enabled router on network type change (new network: %s)", objArr3));
        }
    }

    public void shutdown() {
        super.shutdown();
        mo40311v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo40309t(boolean z) {
        Logger logger;
        String str;
        if (this.f18470o == null) {
            this.f18470o = this.f18469n.createMulticastLock(C10004b.class.getSimpleName());
        }
        if (z) {
            if (this.f18470o.isHeld()) {
                logger = f18467s;
                str = "WiFi multicast lock already acquired";
            } else {
                f18467s.info("WiFi multicast lock acquired");
                this.f18470o.acquire();
                return;
            }
        } else if (this.f18470o.isHeld()) {
            f18467s.info("WiFi multicast lock released");
            this.f18470o.release();
            return;
        } else {
            logger = f18467s;
            str = "WiFi multicast lock already released";
        }
        logger.warning(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo40310u(boolean z) {
        Logger logger;
        String str;
        if (this.f18471p == null) {
            this.f18471p = this.f18469n.createWifiLock(3, C10004b.class.getSimpleName());
        }
        if (z) {
            if (this.f18471p.isHeld()) {
                logger = f18467s;
                str = "WiFi lock already acquired";
            } else {
                f18467s.info("WiFi lock acquired");
                this.f18471p.acquire();
                return;
            }
        } else if (this.f18471p.isHeld()) {
            f18467s.info("WiFi lock released");
            this.f18471p.release();
            return;
        } else {
            logger = f18467s;
            str = "WiFi lock already released";
        }
        logger.warning(str);
    }

    /* renamed from: v */
    public void mo40311v() {
        BroadcastReceiver broadcastReceiver = this.f18473r;
        if (broadcastReceiver != null) {
            this.f18468m.unregisterReceiver(broadcastReceiver);
            this.f18473r = null;
        }
    }
}
