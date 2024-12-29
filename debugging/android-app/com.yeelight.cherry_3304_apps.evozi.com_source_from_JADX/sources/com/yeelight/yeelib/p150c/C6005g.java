package com.yeelight.yeelib.p150c;

import android.content.Intent;
import android.view.View;
import com.miot.common.device.Device;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7555f;
import com.yeelight.yeelib.p190i.C9875a;
import java.util.Iterator;

/* renamed from: com.yeelight.yeelib.c.g */
public class C6005g extends C5980c {

    /* renamed from: G */
    private C9875a f12722G;

    public C6005g(C9875a aVar) {
        super(aVar.mo31953n(), "yeelink.light.room", new C7555f(aVar.mo31954o()));
        this.f12722G = aVar;
        this.f12672x = aVar.mo31949i();
        mo23386O0(Device.Ownership.MINE);
        "RoomDevice init : " + aVar.toString();
        mo23365B0(this);
        mo27506S1();
        mo23374H0(aVar.mo31953n());
        mo23414j0();
        mo23408d0().mo27697k0((long) mo27495F1());
        mo27512Y1();
    }

    /* renamed from: D */
    public int mo23368D() {
        C9875a aVar = this.f12722G;
        if (aVar == null) {
            return 15;
        }
        return aVar.mo31948h();
    }

    /* renamed from: G0 */
    public void mo23373G0(int i) {
        C9875a aVar = this.f12722G;
        if (aVar != null) {
            aVar.mo31964x(i);
        }
    }

    /* renamed from: I1 */
    public int mo27496I1() {
        return this.f12672x.size();
    }

    /* renamed from: N0 */
    public void mo23385N0(String str) {
        super.mo23385N0(str);
        this.f12722G.mo31940A(str);
    }

    /* renamed from: U */
    public String mo23397U() {
        return this.f12722G.mo31954o();
    }

    /* renamed from: Z1 */
    public void mo27550Z1(C4200i iVar) {
        mo27498K1().add(iVar);
        iVar.mo23369D0(this);
        iVar.mo23358z0(this);
    }

    /* renamed from: a2 */
    public int mo27551a2() {
        return this.f12722G.mo31951l();
    }

    /* renamed from: b2 */
    public int mo27552b2() {
        return this.f12722G.mo31952m();
    }

    /* renamed from: c2 */
    public C9875a mo27553c2() {
        return this.f12722G;
    }

    /* renamed from: d2 */
    public int mo27554d2() {
        return this.f12722G.mo31957r();
    }

    /* renamed from: e2 */
    public void mo27555e2(C4200i iVar) {
        mo27498K1().remove(iVar);
        iVar.mo23402X0(this);
        iVar.mo23319V0(this);
    }

    /* renamed from: f2 */
    public void mo27556f2(C9875a aVar) {
        Iterator<C4200i> it = this.f12672x.iterator();
        while (it.hasNext()) {
            C4200i next = it.next();
            next.mo23319V0(this);
            next.mo23402X0(this);
            next.mo23400W0(this);
        }
        this.f12722G = aVar;
        this.f12672x = aVar.mo31949i();
        mo23365B0(this);
        mo27506S1();
        mo27512Y1();
    }

    public void onStatusChange(int i, C6024e eVar) {
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
        try {
            Intent intent = new Intent(view.getContext(), Class.forName("com.yeelight.cherry.ui.activity.RoomMainActivity"));
            intent.putExtra("com.yeelight.cherry.device_id", mo23372G());
            view.getContext().startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
