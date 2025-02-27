package com.xiaomi.push;

import java.util.Random;

/* renamed from: com.xiaomi.push.gy */
public class C4745gy {

    /* renamed from: a */
    private static Random f8370a = new Random();

    /* renamed from: a */
    private static final char[] f8371a = "&quot;".toCharArray();

    /* renamed from: b */
    private static final char[] f8372b = "&apos;".toCharArray();

    /* renamed from: c */
    private static final char[] f8373c = "&amp;".toCharArray();

    /* renamed from: d */
    private static final char[] f8374d = "&lt;".toCharArray();

    /* renamed from: e */
    private static final char[] f8375e = "&gt;".toCharArray();

    /* renamed from: f */
    private static char[] f8376f = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: a */
    public static String m14114a(int i) {
        if (i < 1) {
            return null;
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = f8376f[f8370a.nextInt(71)];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static String m14115a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        double d = (double) length;
        Double.isNaN(d);
        StringBuilder sb = new StringBuilder((int) (d * 1.3d));
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c = charArray[i];
            if (c <= '>') {
                if (c == '<') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    sb.append(f8374d);
                } else if (c == '>') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    sb.append(f8375e);
                } else if (c == '&') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    int i3 = i + 5;
                    if (length <= i3 || charArray[i + 1] != '#' || !Character.isDigit(charArray[i + 2]) || !Character.isDigit(charArray[i + 3]) || !Character.isDigit(charArray[i + 4]) || charArray[i3] != ';') {
                        i2 = i + 1;
                        sb.append(f8373c);
                    }
                } else if (c == '\"') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    sb.append(f8371a);
                } else if (c == '\'') {
                    if (i > i2) {
                        sb.append(charArray, i2, i - i2);
                    }
                    i2 = i + 1;
                    sb.append(f8372b);
                }
            }
            i++;
        }
        if (i2 == 0) {
            return str;
        }
        if (i > i2) {
            sb.append(charArray, i2, i - i2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m14116a(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(str2, 0);
        if (indexOf < 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = str3.toCharArray();
        int length = str2.length();
        StringBuilder sb = new StringBuilder(charArray.length);
        sb.append(charArray, 0, indexOf);
        sb.append(charArray2);
        int i = indexOf + length;
        while (true) {
            int indexOf2 = str.indexOf(str2, i);
            if (indexOf2 > 0) {
                sb.append(charArray, i, indexOf2 - i);
                sb.append(charArray2);
                i = indexOf2 + length;
            } else {
                sb.append(charArray, i, charArray.length - i);
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    public static String m14117a(byte[] bArr) {
        return String.valueOf(C4558bm.m13033a(bArr));
    }

    /* renamed from: b */
    public static final String m14118b(String str) {
        return m14116a(m14116a(m14116a(m14116a(m14116a(str, "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&apos;", "'"), "&amp;", "&");
    }
}
