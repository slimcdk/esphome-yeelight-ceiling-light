package com.xiaomi.push;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.xiaomi.push.bu */
final class C4566bu implements FilenameFilter {
    C4566bu() {
    }

    public boolean accept(File file, String str) {
        return !TextUtils.isEmpty(str) && !str.toLowerCase().endsWith(".lock");
    }
}
