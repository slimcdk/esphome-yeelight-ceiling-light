package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.z9 */
final class C1409z9 extends C1176ka {
    C1409z9(int i) {
        super(i, (C1160ja) null);
    }

    /* renamed from: a */
    public final void mo12921a() {
        if (!mo12932j()) {
            for (int i = 0; i < mo12922b(); i++) {
                Map.Entry g = mo12929g(i);
                if (((C1030b8) g.getKey()).mo12581E()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo12923c()) {
                if (((C1030b8) entry.getKey()).mo12581E()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo12921a();
    }
}
