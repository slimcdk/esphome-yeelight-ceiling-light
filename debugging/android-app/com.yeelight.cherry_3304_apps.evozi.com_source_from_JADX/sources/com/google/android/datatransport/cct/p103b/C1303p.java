package com.google.android.datatransport.cct.p103b;

import android.util.SparseArray;

/* renamed from: com.google.android.datatransport.cct.b.p */
public enum C1303p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private static final SparseArray<C1303p> f2383g = null;

    static {
        DEFAULT = new C1303p("DEFAULT", 0, 0);
        UNMETERED_ONLY = new C1303p("UNMETERED_ONLY", 1, 1);
        UNMETERED_OR_DAILY = new C1303p("UNMETERED_OR_DAILY", 2, 2);
        FAST_IF_RADIO_AWAKE = new C1303p("FAST_IF_RADIO_AWAKE", 3, 3);
        NEVER = new C1303p("NEVER", 4, 4);
        UNRECOGNIZED = new C1303p("UNRECOGNIZED", 5, -1);
        SparseArray<C1303p> sparseArray = new SparseArray<>();
        f2383g = sparseArray;
        sparseArray.put(0, DEFAULT);
        f2383g.put(1, UNMETERED_ONLY);
        f2383g.put(2, UNMETERED_OR_DAILY);
        f2383g.put(3, FAST_IF_RADIO_AWAKE);
        f2383g.put(4, NEVER);
        f2383g.put(-1, UNRECOGNIZED);
    }

    private C1303p(int i) {
    }
}
