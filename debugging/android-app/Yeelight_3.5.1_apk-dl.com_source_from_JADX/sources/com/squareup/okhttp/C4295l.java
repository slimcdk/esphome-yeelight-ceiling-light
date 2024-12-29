package com.squareup.okhttp;

import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import okio.ByteString;

/* renamed from: com.squareup.okhttp.l */
public final class C4295l {
    /* renamed from: a */
    public static String m11968a(String str, String str2) {
        try {
            String base64 = ByteString.m9966of((str + Constants.COLON_SEPARATOR + str2).getBytes("ISO-8859-1")).base64();
            return "Basic " + base64;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
