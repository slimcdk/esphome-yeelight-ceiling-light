package p012b2;

import com.google.zxing.C2562f;

/* renamed from: b2.b */
public final class C0600b implements C2562f {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[LOOP:0: B:29:0x005c->B:30:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.C2563g mo10969a(com.google.zxing.C2546b r11, java.util.Map<com.google.zxing.DecodeHintType, ?> r12) {
        /*
            r10 = this;
            c2.a r0 = new c2.a
            com.google.zxing.common.b r11 = r11.mo19454a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            b2.a r2 = r0.mo11057a(r11)     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            com.google.zxing.h[] r3 = r2.mo23620b()     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            com.google.zxing.aztec.decoder.Decoder r4 = new com.google.zxing.aztec.decoder.Decoder     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4.<init>()     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            d2.b r2 = r4.mo19453c(r2)     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004e
            r1 = 1
            b2.a r0 = r0.mo11057a(r1)     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            com.google.zxing.h[] r4 = r0.mo23620b()     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            com.google.zxing.aztec.decoder.Decoder r1 = new com.google.zxing.aztec.decoder.Decoder     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            r1.<init>()     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            d2.b r1 = r1.mo19453c(r0)     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            r11 = move-exception
            goto L_0x0047
        L_0x0046:
            r11 = move-exception
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x004c
            throw r3
        L_0x004c:
            throw r11
        L_0x004d:
            throw r2
        L_0x004e:
            r6 = r4
            if (r12 == 0) goto L_0x0066
            com.google.zxing.DecodeHintType r0 = com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            com.google.zxing.i r12 = (com.google.zxing.C2565i) r12
            if (r12 == 0) goto L_0x0066
            int r0 = r6.length
        L_0x005c:
            if (r11 >= r0) goto L_0x0066
            r2 = r6[r11]
            r12.foundPossibleResultPoint(r2)
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0066:
            com.google.zxing.g r11 = new com.google.zxing.g
            java.lang.String r3 = r1.mo23611h()
            byte[] r4 = r1.mo23608e()
            int r5 = r1.mo23606c()
            com.google.zxing.BarcodeFormat r7 = com.google.zxing.BarcodeFormat.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.mo23604a()
            if (r12 == 0) goto L_0x0089
            com.google.zxing.ResultMetadataType r0 = com.google.zxing.ResultMetadataType.BYTE_SEGMENTS
            r11.mo19544h(r0, r12)
        L_0x0089:
            java.lang.String r12 = r1.mo23605b()
            if (r12 == 0) goto L_0x0094
            com.google.zxing.ResultMetadataType r0 = com.google.zxing.ResultMetadataType.ERROR_CORRECTION_LEVEL
            r11.mo19544h(r0, r12)
        L_0x0094:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p012b2.C0600b.mo10969a(com.google.zxing.b, java.util.Map):com.google.zxing.g");
    }

    public void reset() {
    }
}
