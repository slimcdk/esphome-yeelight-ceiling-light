package com.yeelight.yeelib.managers;

import android.database.Cursor;
import com.yeelight.yeelib.data.C6062e;
import com.yeelight.yeelib.data.DeviceInteractionProvider;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.interaction.ActionType;

/* renamed from: com.yeelight.yeelib.managers.v */
public class C8301v {
    /* renamed from: a */
    public static void m19657a(C3012e eVar) {
        Cursor f = DeviceInteractionProvider.m17660f(eVar);
        if (f.moveToFirst()) {
            do {
                int i = f.getInt(f.getColumnIndex(C6062e.C6063a.C6064a.f12413e));
                StringBuilder sb = new StringBuilder();
                sb.append("Register device interact, device id: ");
                sb.append(eVar.mo23185G());
                sb.append(", event: ");
                sb.append(i);
                eVar.mo23227j(i);
            } while (f.moveToNext());
        }
        f.close();
    }

    /* renamed from: b */
    public static void m19658b(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceInteractionManager, onEvent, src device id: ");
        sb.append(str);
        sb.append(", event: ");
        sb.append(i);
        Cursor g = DeviceInteractionProvider.m17661g(str, i);
        if (g.moveToFirst()) {
            do {
                String string = g.getString(g.getColumnIndex(C6062e.C6063a.C6064a.f12410b));
                int i2 = g.getInt(g.getColumnIndex(C6062e.C6063a.C6064a.f12411c));
                C3010c j0 = YeelightDeviceManager.m7794j0(string);
                if (j0 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("DeviceInteractionManager, onEvent, do action for device: ");
                    sb2.append(string);
                    sb2.append(", action: ");
                    sb2.append(i2);
                    j0.mo23158s(ActionType.values()[i2]);
                }
            } while (g.moveToNext());
        }
        g.close();
    }
}
