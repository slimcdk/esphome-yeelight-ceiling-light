package com.squareup.leakcanary.internal;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

final class LeakCanaryUi {
    static final PorterDuffXfermode CLEAR_XFER_MODE = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    static final int LEAK_COLOR = -5155506;
    static final int LIGHT_GREY = -4539718;
    static final int ROOT_COLOR = -8083771;

    private LeakCanaryUi() {
        throw new AssertionError();
    }

    static float dpToPixel(float f, Resources resources) {
        return resources.getDisplayMetrics().density * f;
    }
}
