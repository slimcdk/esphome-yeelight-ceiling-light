package p164h.p165b.p166a.p236e;

import android.os.Build;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import java.util.concurrent.ExecutorService;
import p164h.p165b.p166a.C4419a;
import p164h.p165b.p166a.p170k.p171d.C11452a;
import p164h.p165b.p166a.p170k.p171d.C11453b;
import p164h.p165b.p166a.p170k.p171d.C4441n;
import p164h.p165b.p166a.p170k.p171d.C4442o;
import p164h.p165b.p166a.p170k.p171d.p256u.C11474a;
import p164h.p165b.p166a.p170k.p171d.p256u.C11476b;
import p164h.p165b.p166a.p170k.p171d.p256u.C11477c;
import p164h.p165b.p166a.p170k.p172e.C11487h;
import p164h.p165b.p166a.p170k.p172e.C11490l;
import p164h.p165b.p166a.p170k.p172e.C11492n;
import p164h.p165b.p166a.p170k.p172e.C4444e;
import p164h.p165b.p166a.p170k.p172e.C4445j;
import p164h.p165b.p166a.p237f.p239e.C11189e;
import p164h.p165b.p166a.p237f.p239e.C11190f;
import p164h.p165b.p166a.p237f.p239e.C11191g;
import p164h.p165b.p166a.p237f.p239e.C11194j;
import p164h.p165b.p166a.p240h.C11217g;
import p164h.p165b.p166a.p240h.C11219i;

/* renamed from: h.b.a.e.d */
public class C11171d extends C4419a {

    /* renamed from: h.b.a.e.d$a */
    class C11172a extends C11476b {
        C11172a(C11171d dVar, ExecutorService executorService) {
            super(executorService);
        }

        /* renamed from: d */
        public String mo35527d(int i, int i2) {
            C11219i iVar = new C11219i(i, i2);
            iVar.mo35678i("Android");
            iVar.mo35679j(Build.VERSION.RELEASE);
            return iVar.toString();
        }
    }

    public C11171d() {
        this(0);
    }

    public C11171d(int i) {
        super(i, false);
        System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
    }

    /* access modifiers changed from: protected */
    public C11189e createDeviceDescriptorBinderUDA10() {
        return new C11190f();
    }

    /* access modifiers changed from: protected */
    public C4444e createGENAEventProcessor() {
        return new C4441n();
    }

    /* access modifiers changed from: protected */
    public C11217g createNamespace() {
        return new C11217g("/upnp");
    }

    /* access modifiers changed from: protected */
    public C11487h createNetworkAddressFactory(int i) {
        return new C11167a(i);
    }

    /* access modifiers changed from: protected */
    public C4445j createSOAPActionProcessor() {
        return new C4442o();
    }

    /* access modifiers changed from: protected */
    public C11191g createServiceDescriptorBinderUDA10() {
        return new C11194j();
    }

    public C11490l createStreamClient() {
        return new C11477c(new C11172a(this, getSyncProtocolExecutorService()));
    }

    public C11492n createStreamServer(C11487h hVar) {
        return new C11453b(new C11452a(C11474a.f22831c, hVar.mo36325g()));
    }

    public int getAliveIntervalMillis() {
        return 10000;
    }

    public int getRegistryMaintenanceIntervalMillis() {
        return PathInterpolatorCompat.MAX_NUM_POINTS;
    }

    public Integer getRemoteDeviceMaxAgeSeconds() {
        return 20;
    }
}
