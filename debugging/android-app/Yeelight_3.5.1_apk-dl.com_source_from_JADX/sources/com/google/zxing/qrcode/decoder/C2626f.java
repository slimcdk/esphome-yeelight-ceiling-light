package com.google.zxing.qrcode.decoder;

import com.google.zxing.C2564h;

/* renamed from: com.google.zxing.qrcode.decoder.f */
public final class C2626f {

    /* renamed from: a */
    private final boolean f4475a;

    C2626f(boolean z) {
        this.f4475a = z;
    }

    /* renamed from: a */
    public void mo19662a(C2564h[] hVarArr) {
        if (this.f4475a && hVarArr != null && hVarArr.length >= 3) {
            C2564h hVar = hVarArr[0];
            hVarArr[0] = hVarArr[2];
            hVarArr[2] = hVar;
        }
    }
}
