package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.q6 */
final class C1955q6 extends C1971r6<FieldDescriptorType, Object> {
    C1955q6(int i) {
        super(i, (C1955q6) null);
    }

    /* renamed from: e */
    public final void mo11961e() {
        if (!mo11997i()) {
            for (int i = 0; i < mo11998j(); i++) {
                Map.Entry h = mo11995h(i);
                if (((C1811h4) h.getKey()).mo11709F()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo11999m()) {
                if (((C1811h4) entry.getKey()).mo11709F()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo11961e();
    }
}
