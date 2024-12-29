package p239z5;

import java.io.OutputStreamWriter;
import java.io.Writer;
import org.eclipse.jetty.http.C9887a;

/* renamed from: z5.m */
public class C12179m extends Writer {

    /* renamed from: a */
    final C12178l f22431a;

    /* renamed from: b */
    int f22432b;

    /* renamed from: c */
    int f22433c = 0;

    public C12179m(C12178l lVar) {
        this.f22431a = lVar;
        C9887a aVar = lVar.f22424c;
    }

    /* renamed from: a */
    private Writer m31736a() {
        C12178l lVar = this.f22431a;
        if (lVar.f22428g == null) {
            C12178l lVar2 = this.f22431a;
            lVar.f22428g = new OutputStreamWriter(lVar2.f22430i, lVar2.f22427f);
        }
        return this.f22431a.f22428g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo43055c(java.lang.String r3) {
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
            r2.f22432b = r0
            z5.l r0 = r2.f22431a
            java.lang.String r0 = r0.f22427f
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x002d
        L_0x0024:
            z5.l r0 = r2.f22431a
            r1 = 0
            r0.f22428g = r1
            goto L_0x002d
        L_0x002a:
            r0 = 1
        L_0x002b:
            r2.f22432b = r0
        L_0x002d:
            z5.l r0 = r2.f22431a
            r0.f22427f = r3
            org.eclipse.jetty.util.g r3 = r0.f22430i
            if (r3 != 0) goto L_0x003e
            org.eclipse.jetty.util.g r3 = new org.eclipse.jetty.util.g
            r1 = 512(0x200, float:7.175E-43)
            r3.<init>(r1)
            r0.f22430i = r3
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p239z5.C12179m.mo43055c(java.lang.String):void");
    }

    public void close() {
        this.f22431a.close();
    }

    public void flush() {
        this.f22431a.flush();
    }

    public void write(String str, int i, int i2) {
        while (i2 > 512) {
            write(str, i, 512);
            i += 512;
            i2 -= 512;
        }
        C12178l lVar = this.f22431a;
        if (lVar.f22429h == null) {
            lVar.f22429h = new char[512];
        }
        char[] cArr = lVar.f22429h;
        str.getChars(i, i + i2, cArr, 0);
        write(cArr, 0, i2);
    }

    public void write(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        C12178l lVar = this.f22431a;
        while (i2 > 0) {
            lVar.f22430i.reset();
            int i5 = 512;
            if (i2 <= 512) {
                i5 = i2;
            }
            int i6 = this.f22432b;
            if (i6 != 0) {
                int i7 = 0;
                if (i6 == 1) {
                    byte[] a = lVar.f22430i.mo40241a();
                    int count = lVar.f22430i.getCount();
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
                        lVar.f22430i.mo40242c(count);
                    }
                } else if (i6 == 2) {
                    byte[] a2 = lVar.f22430i.mo40241a();
                    int count2 = lVar.f22430i.getCount();
                    if (count2 + i5 > a2.length) {
                        i5 = a2.length - count2;
                    }
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i5) {
                            break;
                        }
                        char c2 = cArr[i + i9];
                        if (this.f22433c == 0) {
                            boolean isHighSurrogate = Character.isHighSurrogate((char) c2);
                            i3 = c2;
                            if (isHighSurrogate) {
                                this.f22433c = c2;
                                i9++;
                            }
                        } else {
                            char c3 = (char) c2;
                            if (Character.isLowSurrogate(c3)) {
                                i3 = Character.toCodePoint((char) this.f22433c, c3);
                            } else {
                                i3 = this.f22433c;
                                this.f22433c = 0;
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
                            this.f22433c = 0;
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
                    lVar.f22430i.mo40242c(count2);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                Writer a3 = m31736a();
                a3.write(cArr, i, i5);
                a3.flush();
            }
            lVar.f22430i.writeTo(lVar);
            i2 -= i5;
            i += i5;
        }
    }
}
