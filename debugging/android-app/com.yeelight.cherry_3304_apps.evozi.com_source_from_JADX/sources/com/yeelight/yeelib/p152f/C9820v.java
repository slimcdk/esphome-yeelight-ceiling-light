package com.yeelight.yeelib.p152f;

import android.database.Cursor;
import com.yeelight.yeelib.data.C7598f;
import com.yeelight.yeelib.data.DeviceInteractionProvider;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p185d.C7563a;

/* renamed from: com.yeelight.yeelib.f.v */
public class C9820v {
    /* renamed from: a */
    public static void m23868a(C4200i iVar) {
        Cursor f = DeviceInteractionProvider.m22438f(iVar);
        if (f.moveToFirst()) {
            do {
                int i = f.getInt(f.getColumnIndex(C7598f.C7599a.C7600a.f15454e));
                "Register device interact, device id: " + iVar.mo23372G() + ", event: " + i;
                iVar.mo23413j(i);
            } while (f.moveToNext());
        }
        f.close();
    }

    /* renamed from: b */
    public static void m23869b(String str, int i) {
        "DeviceInteractionManager, onEvent, src device id: " + str + ", event: " + i;
        Cursor g = DeviceInteractionProvider.m22439g(str, i);
        if (g.moveToFirst()) {
            do {
                String string = g.getString(g.getColumnIndex(C7598f.C7599a.C7600a.f15451b));
                int i2 = g.getInt(g.getColumnIndex(C7598f.C7599a.C7600a.f15452c));
                C4198d h0 = C4257w.m11945h0(string);
                if (h0 != null) {
                    "DeviceInteractionManager, onEvent, do action for device: " + string + ", action: " + i2;
                    h0.mo23344s(C7563a.values()[i2]);
                }
            } while (g.moveToNext());
        }
        g.close();
    }
}
