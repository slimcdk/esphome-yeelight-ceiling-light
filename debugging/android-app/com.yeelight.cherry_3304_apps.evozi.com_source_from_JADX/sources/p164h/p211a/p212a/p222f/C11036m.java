package p164h.p211a.p212a.p222f;

import java.io.OutputStreamWriter;
import java.io.Writer;
import p164h.p211a.p212a.p216c.C10889a;

/* renamed from: h.a.a.f.m */
public class C11036m extends Writer {

    /* renamed from: a */
    final C11035l f21631a;

    /* renamed from: b */
    int f21632b;

    /* renamed from: c */
    int f21633c = 0;

    public C11036m(C11035l lVar) {
        this.f21631a = lVar;
        C10889a aVar = lVar.f21624b;
    }

    /* renamed from: a */
    private Writer m28233a() {
        C11035l lVar = this.f21631a;
        if (lVar.f21628f == null) {
            C11035l lVar2 = this.f21631a;
            lVar.f21628f = new OutputStreamWriter(lVar2.f21630h, lVar2.f21627e);
        }
        return this.f21631a.f21628f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34914b(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x002a
            java.lang.String r0 = "ISO-8859-1"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x000b
            goto L_0x002a
        L_0x000b:
            java.lang.String r0 = "UTF-8"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0015
            r0 = 2
            goto L_0x002b
        L_0x0015:
            r0 = 0
            r2.f21632b = r0
            h.a.a.f.l r0 = r2.f21631a
            java.lang.String r0 = r0.f21627e
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x002d
        L_0x0024:
            h.a.a.f.l r0 = r2.f21631a
            r1 = 0
            r0.f21628f = r1
            goto L_0x002d
        L_0x002a:
            r0 = 1
        L_0x002b:
            r2.f21632b = r0
        L_0x002d:
            h.a.a.f.l r0 = r2.f21631a
            r0.f21627e = r3
            h.a.a.h.g r3 = r0.f21630h
            if (r3 != 0) goto L_0x003e
            h.a.a.h.g r3 = new h.a.a.h.g
            r1 = 512(0x200, float:7.175E-43)
            r3.<init>(r1)
            r0.f21630h = r3
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.C11036m.mo34914b(java.lang.String):void");
    }

    public void close() {
        this.f21631a.close();
    }

    public void flush() {
        this.f21631a.flush();
    }

    public void write(String str, int i, int i2) {
        while (i2 > 512) {
            write(str, i, 512);
            i += 512;
            i2 -= 512;
        }
        C11035l lVar = this.f21631a;
        if (lVar.f21629g == null) {
            lVar.f21629g = new char[512];
        }
        char[] cArr = this.f21631a.f21629g;
        str.getChars(i, i + i2, cArr, 0);
        write(cArr, 0, i2);
    }

    public void write(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        C11035l lVar = this.f21631a;
        while (i2 > 0) {
            lVar.f21630h.reset();
            int i5 = 512;
            if (i2 <= 512) {
                i5 = i2;
            }
            int i6 = this.f21632b;
            if (i6 != 0) {
                int i7 = 0;
                if (i6 == 1) {
                    byte[] a = lVar.f21630h.mo35354a();
                    int count = lVar.f21630h.getCount();
                    if (i5 > a.length - count) {
                        i5 = a.length - count;
                    }
                    while (i7 < i5) {
                        char c = cArr[i + i7];
                        int i8 = count + 1;
                        a[count] = (byte) (c < 256 ? c : '?');
                        i7++;
                        count = i8;
                    }
                    if (count >= 0) {
                        lVar.f21630h.mo35355b(count);
                    }
                } else if (i6 == 2) {
                    byte[] a2 = lVar.f21630h.mo35354a();
                    int count2 = lVar.f21630h.getCount();
                    if (count2 + i5 > a2.length) {
                        i5 = a2.length - count2;
                    }
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i5) {
                            break;
                        }
                        char c2 = cArr[i + i9];
                        if (this.f21633c == 0) {
                            boolean isHighSurrogate = Character.isHighSurrogate((char) c2);
                            i3 = c2;
                            if (isHighSurrogate) {
                                this.f21633c = c2;
                                i9++;
                            }
                        } else {
                            char c3 = (char) c2;
                            if (Character.isLowSurrogate(c3)) {
                                i3 = Character.toCodePoint((char) this.f21633c, c3);
                            } else {
                                i3 = this.f21633c;
                                this.f21633c = 0;
                                i9--;
                            }
                        }
                        if ((i3 & -128) != 0) {
                            if ((i3 & -2048) != 0) {
                                if ((-65536 & i3) == 0) {
                                    if (count2 + 3 > a2.length) {
                                        break;
                                    }
                                    int i10 = count2 + 1;
                                    a2[count2] = (byte) ((i3 >> 12) | 224);
                                    int i11 = i10 + 1;
                                    a2[i10] = (byte) (((i3 >> 6) & 63) | 128);
                                    i4 = i11 + 1;
                                    a2[i11] = (byte) ((i3 & 63) | 128);
                                } else if ((-14680064 & i3) == 0) {
                                    if (count2 + 4 > a2.length) {
                                        break;
                                    }
                                    int i12 = count2 + 1;
                                    a2[count2] = (byte) ((i3 >> 18) | 240);
                                    int i13 = i12 + 1;
                                    a2[i12] = (byte) (((i3 >> 12) & 63) | 128);
                                    int i14 = i13 + 1;
                                    a2[i13] = (byte) (((i3 >> 6) & 63) | 128);
                                    count2 = i14 + 1;
                                    a2[i14] = (byte) ((i3 & 63) | 128);
                                } else if ((-201326592 & i3) == 0) {
                                    if (count2 + 5 > a2.length) {
                                        break;
                                    }
                                    int i15 = count2 + 1;
                                    a2[count2] = (byte) ((i3 >> 24) | 248);
                                    int i16 = i15 + 1;
                                    a2[i15] = (byte) (((i3 >> 18) & 63) | 128);
                                    int i17 = i16 + 1;
                                    a2[i16] = (byte) (((i3 >> 12) & 63) | 128);
                                    int i18 = i17 + 1;
                                    a2[i17] = (byte) (((i3 >> 6) & 63) | 128);
                                    i4 = i18 + 1;
                                    a2[i18] = (byte) ((i3 & 63) | 128);
                                } else if ((Integer.MIN_VALUE & i3) != 0) {
                                    a2[count2] = 63;
                                    count2++;
                                } else if (count2 + 6 > a2.length) {
                                    break;
                                } else {
                                    int i19 = count2 + 1;
                                    a2[count2] = (byte) ((i3 >> 30) | 252);
                                    int i20 = i19 + 1;
                                    a2[i19] = (byte) (((i3 >> 24) & 63) | 128);
                                    int i21 = i20 + 1;
                                    a2[i20] = (byte) (((i3 >> 18) & 63) | 128);
                                    int i22 = i21 + 1;
                                    a2[i21] = (byte) (((i3 >> 12) & 63) | 128);
                                    int i23 = i22 + 1;
                                    a2[i22] = (byte) (((i3 >> 6) & 63) | 128);
                                    count2 = i23 + 1;
                                    a2[i23] = (byte) ((i3 & 63) | 128);
                                }
                                count2 = i4;
                            } else if (count2 + 2 > a2.length) {
                                break;
                            } else {
                                int i24 = count2 + 1;
                                a2[count2] = (byte) ((i3 >> 6) | 192);
                                count2 = i24 + 1;
                                a2[i24] = (byte) ((i3 & 63) | 128);
                            }
                            this.f21633c = 0;
                            if (count2 == a2.length) {
                                i9++;
                                break;
                            }
                            i9++;
                        } else if (count2 >= a2.length) {
                            break;
                        } else {
                            a2[count2] = (byte) i3;
                            count2++;
                            i9++;
                        }
                    }
                    i5 = i9;
                    lVar.f21630h.mo35355b(count2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                Writer a3 = m28233a();
                a3.write(cArr, i, i5);
                a3.flush();
            }
            lVar.f21630h.writeTo(lVar);
            i2 -= i5;
            i += i5;
        }
    }
}
