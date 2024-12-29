package com.yeelight.yeelib.wear;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C0736d;
import com.google.android.gms.wearable.C1903b;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.DataClient;
import com.google.android.gms.wearable.MessageClient;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p065m0.C3335c;
import p065m0.C3337e;
import p065m0.C3339g;
import p069n0.C3356b;
import p069n0.C3358d;
import p069n0.C3359e;
import p069n0.C3360f;
import p069n0.C3363i;
import p069n0.C3367m;
import p179k4.C9295a;

public class WearService extends Service implements C3051a.C3052i, C0736d.C0738b, C0736d.C0739c, CapabilityClient.C1898a, MessageClient.C1901a, DataClient.C1900a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f16337b = WearService.class.getSimpleName();

    /* renamed from: a */
    private C0736d f16338a;

    /* renamed from: com.yeelight.yeelib.wear.WearService$a */
    class C8897a implements C3335c<List<C3367m>> {

        /* renamed from: a */
        final /* synthetic */ String f16339a;

        /* renamed from: b */
        final /* synthetic */ byte[] f16340b;

        /* renamed from: com.yeelight.yeelib.wear.WearService$a$a */
        class C8898a implements C3335c<Integer> {
            C8898a(C8897a aVar) {
            }

            /* renamed from: a */
            public void mo12083a(@NonNull C3339g<Integer> gVar) {
            }
        }

        C8897a(String str, byte[] bArr) {
            this.f16339a = str;
            this.f16340b = bArr;
        }

        /* renamed from: a */
        public void mo12083a(@NonNull C3339g<List<C3367m>> gVar) {
            for (C3367m id : gVar.mo14768k()) {
                C1903b.m5048c(WearService.this).mo14801s(id.getId(), this.f16339a, this.f16340b).mo14760c(new C8898a(this));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.wear.WearService$b */
    class C8899b implements C3337e<List<C3367m>> {
        C8899b(WearService wearService) {
        }

        /* renamed from: b */
        public void mo14741a(List<C3367m> list) {
            int size = list.size();
            String unused = WearService.f16337b;
            StringBuilder sb = new StringBuilder();
            sb.append("connected nodes size: ");
            sb.append(size);
            C9295a.m22761c().mo37829e(size > 0);
        }
    }

    /* renamed from: m */
    private void m21239m() {
        C1903b.m5049d(this).mo14817q().mo14763f(new C8899b(this));
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: a */
    public void mo24104a(@NonNull C3356b bVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCapabilityChanged: ");
        sb.append(bVar.mo14854n().toString());
        Set<C3367m> n = bVar.mo14854n();
        if (n == null || n.isEmpty()) {
            m21239m();
        } else {
            C9295a.m22761c().mo37829e(true);
        }
    }

    /* renamed from: b */
    public void mo14796b(C3359e eVar) {
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            C3358d dVar = (C3358d) it.next();
            if (dVar.getType() == 1) {
                C3360f G = dVar.mo24109G();
                if (G.mo14869T().getPath().equals("/wear_exception")) {
                    String b = C3363i.m9200a(G).mo24137b().mo24114b("wear_exception");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Wear exception received : ");
                    sb.append(b);
                    AppUtils.m8300u("Android WEAR", b);
                }
            } else {
                dVar.getType();
            }
        }
    }

    /* renamed from: c */
    public void mo11948c(int i) {
        C3051a.m7926s(this).mo23359N(this);
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: e */
    public void mo11972e(ConnectionResult connectionResult) {
        C3051a.m7926s(this).mo23359N(this);
    }

    /* renamed from: f */
    public void mo11949f(Bundle bundle) {
        C1903b.m5048c(this).mo14799q(this);
        C1903b.m5047b(this).mo14797q(this);
        C1903b.m5046a(this).mo14788q(this, Uri.parse("wear://"), 1);
        C9295a.m22761c().mo37828d(this.f16338a);
        C3051a.m7926s(this).mo23358M(this);
        if (C3051a.m7928z()) {
            mo36671k("/login", (byte[]) null);
        }
        m21239m();
    }

    /* renamed from: g */
    public void mo23288g() {
        mo36671k("/logout", (byte[]) null);
    }

    /* renamed from: h */
    public void mo23291h() {
        mo36671k("/login", (byte[]) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d3, code lost:
        r1 = (long) r7;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24138i(@androidx.annotation.NonNull p069n0.C3366l r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "app WEAR Message "
            r0.append(r1)
            java.lang.String r1 = r7.mo14890J()
            r0.append(r1)
            java.lang.String r1 = ", message = "
            r0.append(r1)
            int r2 = r7.mo14891l()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r7.mo14895z()
            r0.append(r1)
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r7.mo14892m()
            r0.<init>(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x003c
            com.yeelight.yeelib.device.base.e r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7804r0(r0)
            goto L_0x003d
        L_0x003c:
            r0 = r2
        L_0x003d:
            java.lang.String r7 = r7.mo14890J()
            r7.hashCode()
            r1 = -1
            int r3 = r7.hashCode()
            java.lang.String r4 = "/login"
            java.lang.String r5 = "/device_list"
            switch(r3) {
                case -2105303997: goto L_0x008f;
                case 46823161: goto L_0x0084;
                case 228797784: goto L_0x007b;
                case 376231736: goto L_0x0070;
                case 1175809713: goto L_0x0065;
                case 1440326441: goto L_0x005a;
                case 1448719514: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0099
        L_0x0051:
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0058
            goto L_0x0099
        L_0x0058:
            r1 = 6
            goto L_0x0099
        L_0x005a:
            java.lang.String r3 = "/close"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0063
            goto L_0x0099
        L_0x0063:
            r1 = 5
            goto L_0x0099
        L_0x0065:
            java.lang.String r3 = "/bright_up"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x006e
            goto L_0x0099
        L_0x006e:
            r1 = 4
            goto L_0x0099
        L_0x0070:
            java.lang.String r3 = "/bright_down"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0079
            goto L_0x0099
        L_0x0079:
            r1 = 3
            goto L_0x0099
        L_0x007b:
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0082
            goto L_0x0099
        L_0x0082:
            r1 = 2
            goto L_0x0099
        L_0x0084:
            java.lang.String r3 = "/open"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x008d
            goto L_0x0099
        L_0x008d:
            r1 = 1
            goto L_0x0099
        L_0x008f:
            java.lang.String r3 = "/toggle"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            switch(r1) {
                case 0: goto L_0x00f1;
                case 1: goto L_0x00eb;
                case 2: goto L_0x00d8;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00a8;
                case 6: goto L_0x009e;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x0106
        L_0x009e:
            boolean r7 = com.yeelight.yeelib.managers.C3051a.m7928z()
            if (r7 == 0) goto L_0x0106
            r6.mo36671k(r4, r2)
            goto L_0x0106
        L_0x00a8:
            if (r0 == 0) goto L_0x0106
            r0.mo23140b1()
            goto L_0x0106
        L_0x00ae:
            if (r0 == 0) goto L_0x0106
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r0.mo23221d0()
            int r7 = r7.mo31601m()
            int r7 = r7 + 15
            r1 = 100
            if (r7 > r1) goto L_0x00bf
            goto L_0x00d3
        L_0x00bf:
            r1 = 100
            goto L_0x00d4
        L_0x00c2:
            if (r0 == 0) goto L_0x0106
            com.yeelight.yeelib.device.base.DeviceStatusBase r7 = r0.mo23221d0()
            int r7 = r7.mo31601m()
            int r7 = r7 + -15
            if (r7 > 0) goto L_0x00d3
            r1 = 1
            goto L_0x00d4
        L_0x00d3:
            long r1 = (long) r7
        L_0x00d4:
            r0.mo23154p1(r1)
            goto L_0x0106
        L_0x00d8:
            k4.a r7 = p179k4.C9295a.m22761c()
            r7.mo37826a()
            k4.a r7 = p179k4.C9295a.m22761c()
            byte[] r7 = r7.mo37827b()
            r6.mo36671k(r5, r7)
            goto L_0x0106
        L_0x00eb:
            if (r0 == 0) goto L_0x0106
            r0.mo23148l1()
            goto L_0x0106
        L_0x00f1:
            if (r0 == 0) goto L_0x0106
            boolean r7 = r0.mo23145k0()
            if (r7 == 0) goto L_0x00fd
            r0.mo23114A1()
            goto L_0x0106
        L_0x00fd:
            boolean r7 = r0.mo23230o0()
            if (r7 == 0) goto L_0x0106
            r0.mo23151n()
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.wear.WearService.mo24138i(n0.l):void");
    }

    /* renamed from: k */
    public void mo36671k(String str, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("app send message ");
        sb.append(str);
        C1903b.m5049d(this).mo14817q().mo14760c(new C8897a(str, bArr));
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C0736d d = new C0736d.C0737a(this).mo11870a(C1903b.f2984b).mo11871b(this).mo11872c(this).mo11873d();
        this.f16338a = d;
        d.mo11860d();
    }

    public void onDestroy() {
        super.onDestroy();
        C1903b.m5048c(this).mo14800r(this);
        C1903b.m5047b(this).mo14798r(this);
        this.f16338a.mo11861e();
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }
}
