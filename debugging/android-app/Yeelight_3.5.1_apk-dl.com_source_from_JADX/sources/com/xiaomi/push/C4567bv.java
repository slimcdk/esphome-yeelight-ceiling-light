package com.xiaomi.push;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.xiaomi.push.bv */
final class C4567bv implements FilenameFilter {
    C4567bv() {
    }

    public boolean accept(File file, String str) {
        return !TextUtils.isEmpty(str) && !str.toLowerCase().endsWith(".lock");
    }
}
