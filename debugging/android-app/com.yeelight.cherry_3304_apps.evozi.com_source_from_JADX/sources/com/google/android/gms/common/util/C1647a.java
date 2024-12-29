package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.p105j.C1620c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@KeepForSdk
/* renamed from: com.google.android.gms.common.util.a */
public class C1647a {
    @KeepForSdk
    /* renamed from: a */
    public static byte[] m4563a(Context context, String str) {
        MessageDigest b;
        PackageInfo e = C1620c.m4502a(context).mo11303e(str, 64);
        Signature[] signatureArr = e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m4564b("SHA1")) == null) {
            return null;
        }
        return b.digest(e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m4564b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
