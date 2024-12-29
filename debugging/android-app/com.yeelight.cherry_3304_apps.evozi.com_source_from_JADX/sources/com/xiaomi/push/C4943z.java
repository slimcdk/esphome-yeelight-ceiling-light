package com.xiaomi.push;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.xiaomi.push.z */
final class C4943z implements FileFilter {
    C4943z() {
    }

    public boolean accept(File file) {
        return file.isDirectory();
    }
}
