package com.yeelight.yeelib.p150c.p184n;

import android.graphics.Color;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7556g;
import com.yeelight.yeelib.utils.C10542f;
import java.util.ArrayList;

/* renamed from: com.yeelight.yeelib.c.n.f */
public class C7555f extends C6024e {
    public C7555f(String str) {
        super(str);
        mo28886X0();
    }

    /* renamed from: X0 */
    public void mo28886X0() {
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
}
