package com.xiaomi.push;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.xiaomi.push.bl */
final class C4538bl implements FilenameFilter {
    C4538bl() {
    }

    public boolean accept(File file, String str) {
        return !TextUtils.isEmpty(str) && !str.toLowerCase().endsWith(".lock");
    }
}
