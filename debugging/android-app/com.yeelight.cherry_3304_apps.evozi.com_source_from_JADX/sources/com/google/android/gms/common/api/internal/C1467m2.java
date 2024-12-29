package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1394c;
import java.util.Collections;
import java.util.Map;
import p011c.p012a.p019b.p028b.p038e.C0612c;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.android.gms.common.api.internal.m2 */
final class C1467m2 implements C0612c<Map<C1503y1<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C1459k2 f2770a;

    private C1467m2(C1459k2 k2Var) {
        this.f2770a = k2Var;
    }

    /* renamed from: b */
    public final void mo8639b(@NonNull C0619h<Map<C1503y1<?>, String>> hVar) {
        C1459k2 k2Var;
        ConnectionResult connectionResult;
        Map s;
        this.f2770a.f2754f.lock();
        try {
            if (this.f2770a.f2762n) {
                if (hVar.mo8654o()) {
                    Map unused = this.f2770a.f2763o = new ArrayMap(this.f2770a.f2749a.size());
                    for (C1455j2 m : this.f2770a.f2749a.values()) {
                        this.f2770a.f2763o.put(m.mo10823m(), ConnectionResult.RESULT_SUCCESS);
                    }
                } else {
                    if (hVar.mo8649j() instanceof C1394c) {
                        C1394c cVar = (C1394c) hVar.mo8649j();
                        if (this.f2770a.f2760l) {
                            Map unused2 = this.f2770a.f2763o = new ArrayMap(this.f2770a.f2749a.size());
                            for (C1455j2 j2Var : this.f2770a.f2749a.values()) {
                                C1503y1 m2 = j2Var.mo10823m();
                                ConnectionResult a = cVar.mo10809a(j2Var);
                                if (this.f2770a.m3929j(j2Var, a)) {
                                    s = this.f2770a.f2763o;
                                    a = new ConnectionResult(16);
                                } else {
                                    s = this.f2770a.f2763o;
                                }
                                s.put(m2, a);
                            }
                        } else {
                            Map unused3 = this.f2770a.f2763o = cVar.mo10810b();
                        }
                        k2Var = this.f2770a;
                        connectionResult = this.f2770a.m3934o();
                    } else {
                        hVar.mo8649j();
                        Map unused4 = this.f2770a.f2763o = Collections.emptyMap();
                        k2Var = this.f2770a;
                        connectionResult = new ConnectionResult(8);
                    }
                    ConnectionResult unused5 = k2Var.f2766r = connectionResult;
                }
                if (this.f2770a.f2764p != null) {
                    this.f2770a.f2763o.putAll(this.f2770a.f2764p);
                    ConnectionResult unused6 = this.f2770a.f2766r = this.f2770a.m3934o();
                }
                if (this.f2770a.f2766r == null) {
                    this.f2770a.m3932m();
                    this.f2770a.m3933n();
                } else {
                    boolean unused7 = this.f2770a.f2762n = false;
                    this.f2770a.f2753e.mo10941a(this.f2770a.f2766r);
                }
                this.f2770a.f2757i.signalAll();
            }
        } finally {
            this.f2770a.f2754f.unlock();
        }
    }
}
