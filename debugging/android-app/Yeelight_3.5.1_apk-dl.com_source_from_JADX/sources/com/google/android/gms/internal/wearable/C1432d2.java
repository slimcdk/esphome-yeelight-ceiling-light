package com.google.android.gms.internal.wearable;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.wearable.d2 */
final class C1432d2 extends C1467k2 {
    C1432d2(int i) {
        super(i, (C1432d2) null);
    }

    /* renamed from: a */
    public final void mo13599a() {
        if (!mo13687b()) {
            for (int i = 0; i < mo13688c(); i++) {
                Map.Entry d = mo13691d(i);
                if (((C1445g0) d.getKey()).mo13637E()) {
                    d.setValue(Collections.unmodifiableList((List) d.getValue()));
                }
            }
            for (Map.Entry entry : mo13692e()) {
                if (((C1445g0) entry.getKey()).mo13637E()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo13599a();
    }
}
