package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.me */
public final class C1212me extends C1149j {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1180ke f1431c;

    public C1212me(C1180ke keVar) {
        super("internal.logger");
        this.f1431c = keVar;
        this.f1381b.put("log", new C1196le(this, false, true));
        this.f1381b.put(NotificationCompat.GROUP_KEY_SILENT, new C1035bd(this, NotificationCompat.GROUP_KEY_SILENT));
        ((C1149j) this.f1381b.get(NotificationCompat.GROUP_KEY_SILENT)).mo12769m("log", new C1196le(this, true, true));
        this.f1381b.put("unmonitored", new C1052ce(this, "unmonitored"));
        ((C1149j) this.f1381b.get("unmonitored")).mo12769m("log", new C1196le(this, false, false));
    }

    /* renamed from: a */
    public final C1261q mo12586a(C1250p4 p4Var, List list) {
        return C1261q.f1536D;
    }
}
