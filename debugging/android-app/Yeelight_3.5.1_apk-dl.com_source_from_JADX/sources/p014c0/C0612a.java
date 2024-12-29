package p014c0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p028e0.C3144c;

@ShowFirstParty
@KeepForSdk
/* renamed from: c0.a */
public class C0612a {
    @KeepForSdk
    @Deprecated
    @Nullable
    /* renamed from: a */
    public static byte[] m185a(@NonNull Context context, @NonNull String str) {
        MessageDigest b;
        PackageInfo d = C3144c.m8403a(context).mo23629d(str, 64);
        Signature[] signatureArr = d.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m186b("SHA1")) == null) {
            return null;
        }
        return b.digest(d.signatures[0].toByteArray());
    }

    @Nullable
    /* renamed from: b */
    public static MessageDigest m186b(@NonNull String str) {
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
