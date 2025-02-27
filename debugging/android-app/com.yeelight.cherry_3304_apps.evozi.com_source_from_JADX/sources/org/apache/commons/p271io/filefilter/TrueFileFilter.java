package org.apache.commons.p271io.filefilter;

import java.io.File;
import java.io.Serializable;

/* renamed from: org.apache.commons.io.filefilter.TrueFileFilter */
public class TrueFileFilter implements IOFileFilter, Serializable {
    public static final IOFileFilter INSTANCE;
    public static final IOFileFilter TRUE;

    static {
        TrueFileFilter trueFileFilter = new TrueFileFilter();
        TRUE = trueFileFilter;
        INSTANCE = trueFileFilter;
    }

    protected TrueFileFilter() {
    }

    public boolean accept(File file) {
        return true;
    }

    public boolean accept(File file, String str) {
        return true;
    }
}
