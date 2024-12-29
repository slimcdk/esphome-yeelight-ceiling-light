package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.l */
public final class C2235l extends C2352v5 {

    /* renamed from: c */
    private long f4285c;

    /* renamed from: d */
    private String f4286d;

    /* renamed from: e */
    private Boolean f4287e;

    /* renamed from: f */
    private AccountManager f4288f;

    /* renamed from: g */
    private Boolean f4289g;

    /* renamed from: h */
    private long f4290h;

    C2235l(C2111a5 a5Var) {
        super(a5Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo12683r() {
        Calendar instance = Calendar.getInstance();
        this.f4285c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        sb.append(lowerCase2);
        this.f4286d = sb.toString();
        return false;
    }

    /* renamed from: t */
    public final boolean mo12789t(Context context) {
        if (this.f4287e == null) {
            mo12414I();
            this.f4287e = Boolean.FALSE;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f4287e = Boolean.TRUE;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f4287e.booleanValue();
    }

    /* renamed from: u */
    public final long mo12790u() {
        mo13079o();
        return this.f4285c;
    }

    /* renamed from: v */
    public final String mo12791v() {
        mo13079o();
        return this.f4286d;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: w */
    public final long mo12792w() {
        mo12567h();
        return this.f4290h;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: x */
    public final void mo12793x() {
        mo12567h();
        this.f4289g = null;
        this.f4290h = 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: y */
    public final boolean mo12794y() {
        mo12567h();
        long a = mo12429f().mo11378a();
        if (a - this.f4290h > MiStatInterface.MAX_UPLOAD_INTERVAL) {
            this.f4289g = null;
        }
        Boolean bool = this.f4289g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(mo12428c(), "android.permission.GET_ACCOUNTS") != 0) {
            mo12427b().mo13100K().mo13130a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f4288f == null) {
                this.f4288f = AccountManager.get(mo12428c());
            }
            try {
                Account[] result = this.f4288f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f4288f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f4289g = Boolean.TRUE;
                        this.f4290h = a;
                        return true;
                    }
                } else {
                    this.f4289g = Boolean.TRUE;
                    this.f4290h = a;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                mo12427b().mo13097G().mo13131b("Exception checking account types", e);
            }
        }
        this.f4290h = a;
        this.f4289g = Boolean.FALSE;
        return false;
    }
}
