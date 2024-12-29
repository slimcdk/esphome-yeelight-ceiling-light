package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.C1315d;
import com.google.android.datatransport.runtime.backends.C1322i;
import com.google.android.datatransport.runtime.backends.C1328n;

@Keep
public class CctBackendFactory implements C1315d {
    public C1328n create(C1322i iVar) {
        return new C1306e(iVar.mo10219b(), iVar.mo10222e(), iVar.mo10221d());
    }
}
