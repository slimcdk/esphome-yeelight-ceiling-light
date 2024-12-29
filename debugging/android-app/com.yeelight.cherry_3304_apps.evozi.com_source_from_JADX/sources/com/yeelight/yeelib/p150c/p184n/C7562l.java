package com.yeelight.yeelib.p150c.p184n;

import android.graphics.Color;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.utils.C10542f;
import java.util.ArrayList;

/* renamed from: com.yeelight.yeelib.c.n.l */
public class C7562l extends C6024e {

    /* renamed from: K */
    private C6024e.C6028d f15252K;

    /* renamed from: L */
    private String f15253L;

    public C7562l(String str) {
        super(str);
        C6024e.C6028d dVar = C6024e.C6028d.DEVICE_MODE_SUNSHINE;
        this.f15252K = dVar;
        mo27630B0(dVar);
        mo28966Y0();
    }

    /* renamed from: B0 */
    public void mo27630B0(C6024e.C6028d dVar) {
        if (dVar == C6024e.C6028d.DEVICE_MODE_FLOW && this.f12775e.mo28897j() != C6024e.C6028d.DEVICE_MODE_FLOW) {
            this.f15252K = this.f12775e.mo28897j();
        }
        super.mo27630B0(dVar);
    }

    /* renamed from: X0 */
    public String mo28965X0() {
        return this.f15253L;
    }

    /* renamed from: Y0 */
    public void mo28966Y0() {
        ArrayList arrayList = new ArrayList();
        float[] fArr = {10.0f, 1.0f, C10542f.m25732a(this.f12775e.mo28888a())};
        arrayList.add(new C7556g.C7557a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 70.0f;
        arrayList.add(new C7556g.C7557a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 160.0f;
        arrayList.add(new C7556g.C7557a(Color.HSVToColor(fArr), 2000));
        fArr[0] = 270.0f;
        arrayList.add(new C7556g.C7557a(Color.HSVToColor(fArr), 2000));
        mo27701m0(arrayList);
    }

    /* renamed from: Z0 */
    public void mo28967Z0() {
        mo27630B0(this.f15252K);
    }

    /* renamed from: a1 */
    public void mo28968a1(String str) {
        this.f15253L = str;
    }
}
