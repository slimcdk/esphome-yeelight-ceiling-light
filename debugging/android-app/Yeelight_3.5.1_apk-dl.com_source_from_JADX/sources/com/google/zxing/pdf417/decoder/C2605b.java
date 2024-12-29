package com.google.zxing.pdf417.decoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p062l2.C3314a;

/* renamed from: com.google.zxing.pdf417.decoder.b */
final class C2605b {

    /* renamed from: a */
    private final Map<Integer, Integer> f4436a = new HashMap();

    C2605b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo19602a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry next : this.f4436a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i) {
                i = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i) {
            }
            arrayList.add(next.getKey());
        }
        return C3314a.m9007b(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19603b(int i) {
        Integer num = this.f4436a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f4436a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
