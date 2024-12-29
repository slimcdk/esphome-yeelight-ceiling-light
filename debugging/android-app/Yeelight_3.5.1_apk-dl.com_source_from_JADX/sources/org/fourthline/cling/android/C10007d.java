package org.fourthline.cling.android;

import android.os.Build;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import java.util.concurrent.ExecutorService;
import org.fourthline.cling.C3570a;
import org.fourthline.cling.model.C10019g;
import org.fourthline.cling.model.C10021i;
import org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl;
import org.fourthline.cling.transport.impl.C10123a;
import org.fourthline.cling.transport.impl.C3584m;
import org.fourthline.cling.transport.impl.C3585n;
import p137c7.C4026a;
import p137c7.C4028b;
import p137c7.C4029c;
import p148d7.C8955e;
import p148d7.C8957g;
import p148d7.C8958h;
import p148d7.C8960j;
import p148d7.C8962l;
import p187m6.C9556a;
import p187m6.C9557b;
import p187m6.C9558c;
import p187m6.C9561f;

/* renamed from: org.fourthline.cling.android.d */
public class C10007d extends C3570a {

    /* renamed from: org.fourthline.cling.android.d$a */
    class C10008a extends C4028b {
        C10008a(C10007d dVar, ExecutorService executorService) {
            super(executorService);
        }

        /* renamed from: d */
        public String mo36786d(int i, int i2) {
            C10021i iVar = new C10021i(i, i2);
            iVar.mo40383i("Android");
            iVar.mo40384j(Build.VERSION.RELEASE);
            return iVar.toString();
        }
    }

    public C10007d() {
        this(0);
    }

    public C10007d(int i) {
        super(i, false);
        System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
    }

    /* access modifiers changed from: protected */
    public C9556a createDeviceDescriptorBinderUDA10() {
        return new C9557b();
    }

    /* access modifiers changed from: protected */
    public C8955e createGENAEventProcessor() {
        return new C3584m();
    }

    /* access modifiers changed from: protected */
    public C10019g createNamespace() {
        return new C10019g("/upnp");
    }

    /* access modifiers changed from: protected */
    public C8957g createNetworkAddressFactory(int i) {
        return new C10003a(i);
    }

    /* access modifiers changed from: protected */
    public C8958h createSOAPActionProcessor() {
        return new C3585n();
    }

    /* access modifiers changed from: protected */
    public C9558c createServiceDescriptorBinderUDA10() {
        return new C9561f();
    }

    public C8960j createStreamClient() {
        return new C4029c(new C10008a(this, getSyncProtocolExecutorService()));
    }

    public C8962l createStreamServer(C8957g gVar) {
        return new AsyncServletStreamServerImpl(new C10123a(C4026a.f6854c, gVar.mo36801g()));
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
