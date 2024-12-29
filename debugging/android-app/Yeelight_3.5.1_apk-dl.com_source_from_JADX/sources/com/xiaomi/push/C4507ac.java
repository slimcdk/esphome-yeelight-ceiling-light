package com.xiaomi.push;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.xiaomi.push.ac */
final class C4507ac implements FileFilter {
    C4507ac() {
    }

    public boolean accept(File file) {
        return file.isDirectory();
    }
}
