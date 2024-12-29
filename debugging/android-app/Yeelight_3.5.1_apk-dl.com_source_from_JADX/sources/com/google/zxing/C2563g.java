package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: com.google.zxing.g */
public final class C2563g {

    /* renamed from: a */
    private final String f4347a;

    /* renamed from: b */
    private final byte[] f4348b;

    /* renamed from: c */
    private C2564h[] f4349c;

    /* renamed from: d */
    private final BarcodeFormat f4350d;

    /* renamed from: e */
    private Map<ResultMetadataType, Object> f4351e;

    public C2563g(String str, byte[] bArr, int i, C2564h[] hVarArr, BarcodeFormat barcodeFormat, long j) {
        this.f4347a = str;
        this.f4348b = bArr;
        this.f4349c = hVarArr;
        this.f4350d = barcodeFormat;
        this.f4351e = null;
    }

    public C2563g(String str, byte[] bArr, C2564h[] hVarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, hVarArr, barcodeFormat, System.currentTimeMillis());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2563g(String str, byte[] bArr, C2564h[] hVarArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, hVarArr, barcodeFormat, j);
    }

    /* renamed from: a */
    public void mo19537a(C2564h[] hVarArr) {
        C2564h[] hVarArr2 = this.f4349c;
        if (hVarArr2 == null) {
            this.f4349c = hVarArr;
        } else if (hVarArr != null && hVarArr.length > 0) {
            C2564h[] hVarArr3 = new C2564h[(hVarArr2.length + hVarArr.length)];
            System.arraycopy(hVarArr2, 0, hVarArr3, 0, hVarArr2.length);
            System.arraycopy(hVarArr, 0, hVarArr3, hVarArr2.length, hVarArr.length);
            this.f4349c = hVarArr3;
        }
    }

    /* renamed from: b */
    public BarcodeFormat mo19538b() {
        return this.f4350d;
    }

    /* renamed from: c */
    public byte[] mo19539c() {
        return this.f4348b;
    }

    /* renamed from: d */
    public Map<ResultMetadataType, Object> mo19540d() {
        return this.f4351e;
    }

    /* renamed from: e */
    public C2564h[] mo19541e() {
        return this.f4349c;
    }

    /* renamed from: f */
    public String mo19542f() {
        return this.f4347a;
    }

    /* renamed from: g */
    public void mo19543g(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f4351e;
            if (map2 == null) {
                this.f4351e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* renamed from: h */
    public void mo19544h(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f4351e == null) {
            this.f4351e = new EnumMap(ResultMetadataType.class);
        }
        this.f4351e.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f4347a;
    }
}
