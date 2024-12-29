package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.C0687e;
import p039h.C3221a;
import p039h.C3229h;

@Keep
public class CctBackendFactory implements C3221a {
    public C3229h create(C0687e eVar) {
        return new C0642d(eVar.mo11223b(), eVar.mo11226e(), eVar.mo11225d());
    }
}
