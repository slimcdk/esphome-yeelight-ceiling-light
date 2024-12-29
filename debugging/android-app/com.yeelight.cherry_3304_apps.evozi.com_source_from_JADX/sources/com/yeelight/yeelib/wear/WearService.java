package com.yeelight.yeelib.wear;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1399f;
import com.google.android.gms.wearable.C2419b;
import com.google.android.gms.wearable.C2421d;
import com.google.android.gms.wearable.C2422e;
import com.google.android.gms.wearable.C2423f;
import com.google.android.gms.wearable.C2426i;
import com.google.android.gms.wearable.C2521j;
import com.google.android.gms.wearable.C2522k;
import com.google.android.gms.wearable.C2527o;
import com.google.android.gms.wearable.CapabilityClient;
import com.google.android.gms.wearable.DataClient;
import com.google.android.gms.wearable.MessageClient;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p011c.p012a.p019b.p028b.p038e.C0612c;
import p011c.p012a.p019b.p028b.p038e.C0616e;
import p011c.p012a.p019b.p028b.p038e.C0619h;

public class WearService extends Service implements C4201a.C4202i, C1399f.C1401b, C1399f.C1402c, CapabilityClient.C2412a, MessageClient.C2417a, DataClient.C2414a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f20192b = WearService.class.getSimpleName();

    /* renamed from: a */
    private C1399f f20193a;

    /* renamed from: com.yeelight.yeelib.wear.WearService$a */
    class C10564a implements C0612c<List<C2522k>> {

        /* renamed from: a */
        final /* synthetic */ String f20194a;

        /* renamed from: b */
        final /* synthetic */ byte[] f20195b;

        /* renamed from: com.yeelight.yeelib.wear.WearService$a$a */
        class C10565a implements C0612c<Integer> {
            C10565a(C10564a aVar) {
            }

            /* renamed from: b */
            public void mo8639b(@NonNull C0619h<Integer> hVar) {
            }
        }

        C10564a(String str, byte[] bArr) {
            this.f20194a = str;
            this.f20195b = bArr;
        }

        /* renamed from: b */
        public void mo8639b(@NonNull C0619h<List<C2522k>> hVar) {
            for (C2522k id : hVar.mo8650k()) {
                C2527o.m8131c(WearService.this).mo13207p(id.getId(), this.f20194a, this.f20195b).mo8641b(new C10565a(this));
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.wear.WearService$b */
    class C10566b implements C0616e<List<C2522k>> {
        C10566b(WearService wearService) {
        }

        /* renamed from: b */
        public void mo8664a(List<C2522k> list) {
            int size = list.size();
            String unused = WearService.f20192b;
            "connected nodes size: " + size;
            C10567a.m25859c().mo33404e(size > 0);
        }
    }

    /* renamed from: n */
    private void m25839n() {
        C2527o.m8132d(this).mo13345n().mo8644e(new C10566b(this));
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: a */
    public void mo10836a(int i) {
        C4201a.m11608s(this).mo23445N(this);
    }

    /* renamed from: b */
    public void mo13199b(C2422e eVar) {
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            C2421d dVar = (C2421d) it.next();
            if (dVar.getType() == 1) {
                C2423f F = dVar.mo13224F();
                if (F.mo13226M().getPath().equals("/wear_exception")) {
                    String b = C2426i.m7907a(F).mo13255b().mo13232b("wear_exception");
                    "Wear exception received : " + b;
                    C4308b.m12139r("Android WEAR", b);
                }
            } else {
                dVar.getType();
            }
        }
    }

    /* renamed from: c */
    public void mo10837c(Bundle bundle) {
        C2527o.m8131c(this).mo13205n(this);
        C2527o.m8130b(this).mo13200n(this);
        C2527o.m8129a(this).mo13193n(this, Uri.parse("wear://"), 1);
        C10567a.m25859c().mo33403d(this.f20193a);
        C4201a.m11608s(this).mo23444M(this);
        if (C4201a.m11610z()) {
            mo33396m("/login", (byte[]) null);
        }
        m25839n();
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: f */
    public void mo10838f(ConnectionResult connectionResult) {
        C4201a.m11608s(this).mo23445N(this);
    }

    /* renamed from: g */
    public void mo23459g() {
        mo33396m("/logout", (byte[]) null);
    }

    /* renamed from: h */
    public void mo13203h(@NonNull C2521j jVar) {
        int m;
        long j;
        "app WEAR Message " + jVar.mo13429J() + ", message = " + jVar.mo13430g() + ", message = " + jVar.mo13432s();
        String str = new String(jVar.mo13431h());
        C4200i o0 = !str.isEmpty() ? C4257w.m11953o0(str) : null;
        String J = jVar.mo13429J();
        char c = 65535;
        switch (J.hashCode()) {
            case -2105303997:
                if (J.equals("/toggle")) {
                    c = 2;
                    break;
                }
                break;
            case 46823161:
                if (J.equals("/open")) {
                    c = 4;
                    break;
                }
                break;
            case 228797784:
                if (J.equals("/device_list")) {
                    c = 1;
                    break;
                }
                break;
            case 376231736:
                if (J.equals("/bright_down")) {
                    c = 7;
                    break;
                }
                break;
            case 1175809713:
                if (J.equals("/bright_up")) {
                    c = 6;
                    break;
                }
                break;
            case 1440326441:
                if (J.equals("/close")) {
                    c = 5;
                    break;
                }
                break;
            case 1440412820:
                if (J.equals("/color")) {
                    c = 3;
                    break;
                }
                break;
            case 1448719514:
                if (J.equals("/login")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c == 1) {
                C10567a.m25859c().mo33401a();
                mo33396m("/device_list", C10567a.m25859c().mo33402b());
            } else if (c != 2) {
                if (c != 4) {
                    if (c != 5) {
                        if (c != 6) {
                            if (c == 7 && o0 != null) {
                                m = o0.mo23408d0().mo27700m() - 15;
                                if (m <= 0) {
                                    j = 1;
                                    o0.mo23340p1(j);
                                }
                            } else {
                                return;
                            }
                        } else if (o0 != null) {
                            m = o0.mo23408d0().mo27700m() + 15;
                            if (m > 100) {
                                j = 100;
                                o0.mo23340p1(j);
                            }
                        } else {
                            return;
                        }
                        j = (long) m;
                        o0.mo23340p1(j);
                    } else if (o0 != null) {
                        o0.mo23326b1();
                    }
                } else if (o0 != null) {
                    o0.mo23334l1();
                }
            } else if (o0 == null) {
            } else {
                if (o0.mo23331k0()) {
                    o0.mo23300A1();
                } else if (o0.mo23416o0()) {
                    o0.mo23337n();
                }
            }
        } else if (C4201a.m11610z()) {
            mo33396m("/login", (byte[]) null);
        }
    }

    /* renamed from: i */
    public void mo23460i() {
        mo33396m("/login", (byte[]) null);
    }

    /* renamed from: j */
    public void mo13218j(@NonNull C2419b bVar) {
        "onCapabilityChanged: " + bVar.mo13219i().toString();
        Set<C2522k> i = bVar.mo13219i();
        if (i == null || i.isEmpty()) {
            m25839n();
        } else {
            C10567a.m25859c().mo33404e(true);
        }
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    /* renamed from: m */
    public void mo33396m(String str, byte[] bArr) {
        "app send message " + str;
        C2527o.m8132d(this).mo13345n().mo8641b(new C10564a(str, bArr));
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        C1399f.C1400a aVar = new C1399f.C1400a(this);
        aVar.mo10831a(C2527o.f5023d);
        aVar.mo10832b(this);
        aVar.mo10833c(this);
        C1399f d = aVar.mo10834d();
        this.f20193a = d;
        d.mo10825d();
    }

    public void onDestroy() {
        super.onDestroy();
        C2527o.m8131c(this).mo13206o(this);
        C2527o.m8130b(this).mo13201o(this);
        this.f20193a.mo10826e();
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }
}
