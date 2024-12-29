package p164h.p165b.p166a.p236e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import p164h.p165b.p166a.C4424c;
import p164h.p165b.p166a.p168i.C4429b;
import p164h.p165b.p166a.p170k.C11451b;
import p164h.p165b.p166a.p170k.C4436a;
import p164h.p165b.p166a.p170k.C4437c;
import p164h.p165b.p166a.p240h.C11216f;
import p164h.p257c.p259b.C11495a;

/* renamed from: h.b.a.e.b */
public class C11168b extends C4437c {
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final Logger f22136s = Logger.getLogger(C4436a.class.getName());

    /* renamed from: m */
    private final Context f22137m;

    /* renamed from: n */
    private final WifiManager f22138n;

    /* renamed from: o */
    protected WifiManager.MulticastLock f22139o;

    /* renamed from: p */
    protected WifiManager.WifiLock f22140p;

    /* renamed from: q */
    protected NetworkInfo f22141q;

    /* renamed from: r */
    protected BroadcastReceiver f22142r;

    /* renamed from: h.b.a.e.b$a */
    class C11169a extends BroadcastReceiver {
        C11169a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo35524a(Intent intent) {
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            String stringExtra = intent.getStringExtra("reason");
            boolean booleanExtra2 = intent.getBooleanExtra("isFailover", false);
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            NetworkInfo networkInfo2 = (NetworkInfo) intent.getParcelableExtra("otherNetwork");
            C11168b.f22136s.info("Connectivity change detected...");
            Logger o = C11168b.f22136s;
            o.info("EXTRA_NO_CONNECTIVITY: " + booleanExtra);
            Logger o2 = C11168b.f22136s;
            o2.info("EXTRA_REASON: " + stringExtra);
            Logger o3 = C11168b.f22136s;
            o3.info("EXTRA_IS_FAILOVER: " + booleanExtra2);
            Logger o4 = C11168b.f22136s;
            StringBuilder sb = new StringBuilder();
            sb.append("EXTRA_NETWORK_INFO: ");
            if (networkInfo == null) {
                networkInfo = "none";
            }
            sb.append(networkInfo);
            o4.info(sb.toString());
            Logger o5 = C11168b.f22136s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("EXTRA_OTHER_NETWORK_INFO: ");
            if (networkInfo2 == null) {
                networkInfo2 = "none";
            }
            sb2.append(networkInfo2);
            o5.info(sb2.toString());
            Logger o6 = C11168b.f22136s;
            o6.info("EXTRA_EXTRA_INFO: " + intent.getStringExtra("extraInfo"));
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo35525b(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
            if (networkInfo == null && networkInfo2 == null) {
                return true;
            }
            return (networkInfo == null || networkInfo2 == null || networkInfo.getType() != networkInfo2.getType()) ? false : true;
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                mo35524a(intent);
                NetworkInfo a = C11173e.m29110a(context);
                if (C11168b.this.f22141q != null && a == null) {
                    int i = 1;
                    while (i <= 3) {
                        try {
                            Thread.sleep(1000);
                            C11168b.f22136s.warning(String.format("%s => NONE network transition, waiting for new network... retry #%d", new Object[]{C11168b.this.f22141q.getTypeName(), Integer.valueOf(i)}));
                            a = C11173e.m29110a(context);
                            if (a != null) {
                                break;
                            }
                            i++;
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                if (mo35525b(C11168b.this.f22141q, a)) {
                    C11168b.f22136s.info("No actual network change... ignoring event!");
                    return;
                }
                try {
                    C11168b.this.mo35520s(C11168b.this.f22141q, a);
                } catch (C11451b e) {
                    C11168b.this.mo35518q(e);
                }
            }
        }
    }

    public C11168b(C4424c cVar, C4429b bVar, Context context) {
        super(cVar, bVar);
        this.f22137m = context;
        this.f22138n = (WifiManager) context.getSystemService("wifi");
        this.f22141q = C11173e.m29110a(context);
        if (!C11216f.f22295b) {
            BroadcastReceiver p = mo35517p();
            this.f22142r = p;
            context.registerReceiver(p, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: e */
    public boolean mo24454e() {
        mo24462j(this.f8003f);
        try {
            boolean e = super.mo24454e();
            if (e && mo35519r()) {
                mo35521t(true);
                mo35522u(true);
            }
            return e;
        } finally {
            mo24466n(this.f8003f);
        }
    }

    /* renamed from: g */
    public boolean mo24459g() {
        mo24462j(this.f8003f);
        try {
            if (mo35519r()) {
                mo35521t(false);
                mo35522u(false);
            }
            return super.mo24459g();
        } finally {
            mo24466n(this.f8003f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo24460h() {
        return 15000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public BroadcastReceiver mo35517p() {
        return new C11169a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo35518q(C11451b bVar) {
        Throwable a = C11495a.m30173a(bVar);
        if (a instanceof InterruptedException) {
            Logger logger = f22136s;
            Level level = Level.INFO;
            logger.log(level, "Router was interrupted: " + bVar, a);
            return;
        }
        Logger logger2 = f22136s;
        Level level2 = Level.WARNING;
        logger2.log(level2, "Router error on network change: " + bVar, bVar);
    }

    /* renamed from: r */
    public boolean mo35519r() {
        return C11173e.m29112c(this.f22141q);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo35520s(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        Logger logger = f22136s;
        Object[] objArr = new Object[2];
        objArr[0] = networkInfo == null ? "" : networkInfo.getTypeName();
        String str = "NONE";
        objArr[1] = networkInfo2 == null ? str : networkInfo2.getTypeName();
        logger.info(String.format("Network type changed %s => %s", objArr));
        if (mo24459g()) {
            Logger logger2 = f22136s;
            Object[] objArr2 = new Object[1];
            objArr2[0] = networkInfo == null ? str : networkInfo.getTypeName();
            logger2.info(String.format("Disabled router on network type change (old network: %s)", objArr2));
        }
        this.f22141q = networkInfo2;
        if (mo24454e()) {
            Logger logger3 = f22136s;
            Object[] objArr3 = new Object[1];
            if (networkInfo2 != null) {
                str = networkInfo2.getTypeName();
            }
            objArr3[0] = str;
            logger3.info(String.format("Enabled router on network type change (new network: %s)", objArr3));
        }
    }

    public void shutdown() {
        super.shutdown();
        mo35523v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo35521t(boolean z) {
        Logger logger;
        String str;
        if (this.f22139o == null) {
            this.f22139o = this.f22138n.createMulticastLock(C11168b.class.getSimpleName());
        }
        if (z) {
            if (this.f22139o.isHeld()) {
                logger = f22136s;
                str = "WiFi multicast lock already acquired";
            } else {
                f22136s.info("WiFi multicast lock acquired");
                this.f22139o.acquire();
                return;
            }
        } else if (this.f22139o.isHeld()) {
            f22136s.info("WiFi multicast lock released");
            this.f22139o.release();
            return;
        } else {
            logger = f22136s;
            str = "WiFi multicast lock already released";
        }
        logger.warning(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo35522u(boolean z) {
        Logger logger;
        String str;
        if (this.f22140p == null) {
            this.f22140p = this.f22138n.createWifiLock(3, C11168b.class.getSimpleName());
        }
        if (z) {
            if (this.f22140p.isHeld()) {
                logger = f22136s;
                str = "WiFi lock already acquired";
            } else {
                f22136s.info("WiFi lock acquired");
                this.f22140p.acquire();
                return;
            }
        } else if (this.f22140p.isHeld()) {
            f22136s.info("WiFi lock released");
            this.f22140p.release();
            return;
        } else {
            logger = f22136s;
            str = "WiFi lock already released";
        }
        logger.warning(str);
    }

    /* renamed from: v */
    public void mo35523v() {
        BroadcastReceiver broadcastReceiver = this.f22142r;
        if (broadcastReceiver != null) {
            this.f22137m.unregisterReceiver(broadcastReceiver);
            this.f22142r = null;
        }
    }
}
