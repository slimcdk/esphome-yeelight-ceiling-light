package com.google.p107ar.sceneform.rendering;

import android.content.res.Resources;
import android.view.View;

/* renamed from: com.google.ar.sceneform.rendering.q0 */
class C2772q0 {
    /* renamed from: a */
    static float m8438a(int i) {
        return ((float) i) / (Resources.getSystem().getDisplayMetrics().xdpi / 160.0f);
    }

    /* renamed from: b */
    static float m8439b(View view) {
        float width = (float) view.getWidth();
        float height = (float) view.getHeight();
        if (width == 0.0f || height == 0.0f) {
            return 0.0f;
        }
        return width / height;
    }
}
