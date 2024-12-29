package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import p168h7.C9097a;
import p168h7.C9098b;

/* renamed from: org.slf4j.helpers.a */
public class C10259a implements C9097a {

    /* renamed from: a */
    final List f19319a = new ArrayList();

    /* renamed from: a */
    public List mo41713a() {
        return this.f19319a;
    }

    public C9098b getLogger(String str) {
        this.f19319a.add(str);
        return NOPLogger.NOP_LOGGER;
    }
}
