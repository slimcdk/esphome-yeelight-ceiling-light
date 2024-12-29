package androidx.core.hardware.fingerprint;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
public class FingerprintManagerCompat {
    private final Context mContext;

    @RequiresApi(23)
    static class Api23Impl {
        private Api23Impl() {
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        static void authenticate(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @DoNotInline
        static FingerprintManager.CryptoObject getCryptoObject(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @DoNotInline
        public static FingerprintManager getFingerprintManagerOrNull(Context context) {
            int i = Build.VERSION.SDK_INT;
            if (i != 23 && (i <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) {
                return null;
            }
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        static boolean hasEnrolledFingerprints(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }

        @RequiresPermission("android.permission.USE_FINGERPRINT")
        @DoNotInline
        static boolean isHardwareDetected(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @DoNotInline
        public static CryptoObject unwrapCryptoObject(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new CryptoObject(cryptoObject.getMac());
            }
            return null;
        }

        @DoNotInline
        public static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new FingerprintManager.CryptoObject(cryptoObject.getMac());
            }
            return null;
        }
    }

    public static abstract class AuthenticationCallback {
        public void onAuthenticationError(int i, CharSequence charSequence) {
        }

        public void onAuthenticationFailed() {
        }

        public void onAuthenticationHelp(int i, CharSequence charSequence) {
        }

        public void onAuthenticationSucceeded(AuthenticationResult authenticationResult) {
        }
    }

    public static final class AuthenticationResult {
        private final CryptoObject mCryptoObject;

        public AuthenticationResult(CryptoObject cryptoObject) {
            this.mCryptoObject = cryptoObject;
        }

        public CryptoObject getCryptoObject() {
            return this.mCryptoObject;
        }
    }

    public static class CryptoObject {
        private final Cipher mCipher;
        private final Mac mMac;
        private final Signature mSignature;

        public CryptoObject(@NonNull Signature signature) {
            this.mSignature = signature;
            this.mCipher = null;
            this.mMac = null;
        }

        public CryptoObject(@NonNull Cipher cipher) {
            this.mCipher = cipher;
            this.mSignature = null;
            this.mMac = null;
        }

        public CryptoObject(@NonNull Mac mac) {
            this.mMac = mac;
            this.mCipher = null;
            this.mSignature = null;
        }

        @Nullable
        public Cipher getCipher() {
            return this.mCipher;
        }

        @Nullable
        public Mac getMac() {
            return this.mMac;
        }

        @Nullable
        public Signature getSignature() {
            return this.mSignature;
        }
    }

    private FingerprintManagerCompat(Context context) {
        this.mContext = context;
    }

    @NonNull
    public static FingerprintManagerCompat from(@NonNull Context context) {
        return new FingerprintManagerCompat(context);
    }

    @RequiresApi(23)
    @Nullable
    private static FingerprintManager getFingerprintManagerOrNull(@NonNull Context context) {
        return Api23Impl.getFingerprintManagerOrNull(context);
    }

    @RequiresApi(23)
    static CryptoObject unwrapCryptoObject(FingerprintManager.CryptoObject cryptoObject) {
        return Api23Impl.unwrapCryptoObject(cryptoObject);
    }

    @RequiresApi(23)
    private static FingerprintManager.AuthenticationCallback wrapCallback(final AuthenticationCallback authenticationCallback) {
        return new FingerprintManager.AuthenticationCallback() {
            public void onAuthenticationError(int i, CharSequence charSequence) {
                AuthenticationCallback.this.onAuthenticationError(i, charSequence);
            }

            public void onAuthenticationFailed() {
                AuthenticationCallback.this.onAuthenticationFailed();
            }

            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                AuthenticationCallback.this.onAuthenticationHelp(i, charSequence);
            }

            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                AuthenticationCallback.this.onAuthenticationSucceeded(new AuthenticationResult(FingerprintManagerCompat.unwrapCryptoObject(Api23Impl.getCryptoObject(authenticationResult))));
            }
        };
    }

    @RequiresApi(23)
    private static FingerprintManager.CryptoObject wrapCryptoObject(CryptoObject cryptoObject) {
        return Api23Impl.wrapCryptoObject(cryptoObject);
    }

    @RequiresPermission("android.permission.USE_FINGERPRINT")
    public void authenticate(@Nullable CryptoObject cryptoObject, int i, @Nullable androidx.core.p007os.CancellationSignal cancellationSignal, @NonNull AuthenticationCallback authenticationCallback, @Nullable Handler handler) {
        FingerprintManager fingerprintManagerOrNull;
        if (Build.VERSION.SDK_INT >= 23 && (fingerprintManagerOrNull = getFingerprintManagerOrNull(this.mContext)) != null) {
            Api23Impl.authenticate(fingerprintManagerOrNull, wrapCryptoObject(cryptoObject), cancellationSignal != null ? (CancellationSignal) cancellationSignal.getCancellationSignalObject() : null, i, wrapCallback(authenticationCallback), handler);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = getFingerprintManagerOrNull(r3.mContext);
     */
    @androidx.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasEnrolledFingerprints() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 < r2) goto L_0x0016
            android.content.Context r0 = r3.mContext
            android.hardware.fingerprint.FingerprintManager r0 = getFingerprintManagerOrNull(r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.hasEnrolledFingerprints(r0)
            if (r0 == 0) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.hardware.fingerprint.FingerprintManagerCompat.hasEnrolledFingerprints():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = getFingerprintManagerOrNull(r3.mContext);
     */
    @androidx.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isHardwareDetected() {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 23
            if (r0 < r2) goto L_0x0016
            android.content.Context r0 = r3.mContext
            android.hardware.fingerprint.FingerprintManager r0 = getFingerprintManagerOrNull(r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = androidx.core.hardware.fingerprint.FingerprintManagerCompat.Api23Impl.isHardwareDetected(r0)
            if (r0 == 0) goto L_0x0016
            r1 = 1
        L_0x0016:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.hardware.fingerprint.FingerprintManagerCompat.isHardwareDetected():boolean");
    }
}
