package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.annotation.WorkerThread;
import androidx.core.content.ContextCompat;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C1735p extends C1654i6 {

    /* renamed from: c */
    private long f2500c;

    /* renamed from: d */
    private String f2501d;

    /* renamed from: e */
    private AccountManager f2502e;

    /* renamed from: f */
    private Boolean f2503f;

    /* renamed from: g */
    private long f2504g;

    C1735p(C1717n5 n5Var) {
        super(n5Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14033j() {
        Calendar instance = Calendar.getInstance();
        this.f2500c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f2501d = lowerCase + Constants.ACCEPT_TIME_SEPARATOR_SERVER + lowerCase2;
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: o */
    public final long mo14414o() {
        mo14009h();
        return this.f2504g;
    }

    /* renamed from: p */
    public final long mo14415p() {
        mo14241k();
        return this.f2500c;
    }

    /* renamed from: q */
    public final String mo14416q() {
        mo14241k();
        return this.f2501d;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final void mo14417r() {
        mo14009h();
        this.f2503f = null;
        this.f2504g = 0;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: s */
    public final boolean mo14418s() {
        mo14009h();
        long a = this.f2143a.mo14229c().mo11029a();
        if (a - this.f2504g > 86400000) {
            this.f2503f = null;
        }
        Boolean bool = this.f2503f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(this.f2143a.mo14231f(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f2143a.mo14228b().mo14042y().mo14693a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f2502e == null) {
                this.f2502e = AccountManager.get(this.f2143a.mo14231f());
            }
            try {
                Account[] result = this.f2502e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f2502e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f2503f = Boolean.TRUE;
                        this.f2504g = a;
                        return true;
                    }
                } else {
                    this.f2503f = Boolean.TRUE;
                    this.f2504g = a;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                this.f2143a.mo14228b().mo14037t().mo14694b("Exception checking account types", e);
            }
        }
        this.f2504g = a;
        this.f2503f = Boolean.FALSE;
        return false;
    }
}
