package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C0788i;
import com.google.android.gms.common.api.internal.C0817n1;
import com.google.android.gms.common.api.internal.C0823o1;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.C0920k;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.base.zad;
import com.google.android.gms.internal.base.zae;
import com.google.android.gms.internal.base.zao;
import com.google.errorprone.annotations.RestrictedInheritance;
import p014c0.C0620i;
import p014c0.C0624m;
import p028e0.C3142a;
import p040h0.C3234e;
import p101u.C3707b;
import p109w.C3857q;
import p223w3.C10744d;
import p223w3.C11480n;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", allowlistAnnotations = {zad.class, zae.class}, explanation = "Sub classing of GMS Core's APIs are restricted to GMS Core client libs and testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: com.google.android.gms.common.a */
public class C0721a extends C0877b {

    /* renamed from: d */
    private static final Object f507d = new Object();

    /* renamed from: e */
    private static final C0721a f508e = new C0721a();
    @GuardedBy("mLock")

    /* renamed from: c */
    private String f509c;

    @NonNull
    /* renamed from: p */
    public static C0721a m617p() {
        return f508e;
    }

    @ShowFirstParty
    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public Intent mo11770d(@Nullable Context context, int i, @Nullable String str) {
        return super.mo11770d(context, i, str);
    }

    @Nullable
    /* renamed from: e */
    public PendingIntent mo11771e(@NonNull Context context, int i, int i2) {
        return super.mo11771e(context, i, i2);
    }

    @NonNull
    /* renamed from: g */
    public final String mo11772g(int i) {
        return super.mo11772g(i);
    }

    @HideFirstParty
    /* renamed from: i */
    public int mo11773i(@NonNull Context context) {
        return super.mo11773i(context);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: j */
    public int mo11774j(@NonNull Context context, int i) {
        return super.mo11774j(context, i);
    }

    /* renamed from: m */
    public final boolean mo11775m(int i) {
        return super.mo11775m(i);
    }

    @Nullable
    /* renamed from: n */
    public Dialog mo11776n(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return mo11780s(activity, i, C3857q.m10960b(activity, mo11770d(activity, i, C10744d.f19988C), i2), onCancelListener);
    }

    @Nullable
    /* renamed from: o */
    public PendingIntent mo11777o(@NonNull Context context, @NonNull ConnectionResult connectionResult) {
        return connectionResult.mo11754d0() ? connectionResult.mo11753c0() : mo11771e(context, connectionResult.mo11751V(), 0);
    }

    /* renamed from: q */
    public boolean mo11778q(@NonNull Activity activity, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog n = mo11776n(activity, i, i2, onCancelListener);
        if (n == null) {
            return false;
        }
        mo11783v(activity, n, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: r */
    public void mo11779r(@NonNull Context context, int i) {
        mo11784w(context, i, (String) null, mo12121f(context, i, 0, C11480n.f21133C));
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: s */
    public final Dialog mo11780s(@NonNull Context context, int i, C3857q qVar, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C0920k.m1431d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C0920k.m1430c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, qVar);
        }
        String g = C0920k.m1434g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)});
        new IllegalArgumentException();
        return builder.create();
    }

    @NonNull
    /* renamed from: t */
    public final Dialog mo11781t(@NonNull Activity activity, @NonNull DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C0920k.m1431d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        mo11783v(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    @Nullable
    /* renamed from: u */
    public final C0823o1 mo11782u(Context context, C0817n1 n1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C0823o1 o1Var = new C0823o1(n1Var);
        zao.m1642a(context, o1Var, intentFilter);
        o1Var.mo12052a(context);
        if (mo12123l(context, "com.google.android.gms")) {
            return o1Var;
        }
        n1Var.mo11902a();
        o1Var.mo12053b();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo11783v(Activity activity, Dialog dialog, String str, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                SupportErrorDialogFragment.m616u(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        C3707b.m10587a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(20)
    /* renamed from: w */
    public final void mo11784w(Context context, int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        int i2;
        String str2;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null});
        new IllegalArgumentException();
        if (i == 18) {
            mo11785x(context);
        } else if (pendingIntent != null) {
            String f = C0920k.m1433f(context, i);
            String e = C0920k.m1432e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C0917i.m1419j(context.getSystemService("notification"));
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(f).setStyle(new NotificationCompat.BigTextStyle().bigText(e));
            if (C0620i.m214c(context)) {
                C0917i.m1423n(C0624m.m226e());
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (C0620i.m215d(context)) {
                    style.addAction(R$drawable.common_full_open_on_phone, resources.getString(R$string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(R$string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(e);
            }
            if (C0624m.m229h()) {
                C0917i.m1423n(C0624m.m229h());
                synchronized (f507d) {
                    str2 = this.f509c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b = C0920k.m1429b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(str2, b, 4);
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                style.setChannelId(str2);
            }
            Notification build = style.build();
            if (i == 1 || i == 2 || i == 3) {
                C0879d.f887b.set(false);
                i2 = 10436;
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo11785x(Context context) {
        new C0885f(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: y */
    public final boolean mo11786y(@NonNull Activity activity, @NonNull C0788i iVar, int i, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        Dialog s = mo11780s(activity, i, C3857q.m10961c(iVar, mo11770d(activity, i, C10744d.f19988C), 2), onCancelListener);
        if (s == null) {
            return false;
        }
        mo11783v(activity, s, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: z */
    public final boolean mo11787z(@NonNull Context context, @NonNull ConnectionResult connectionResult, int i) {
        PendingIntent o;
        if (C3142a.m8396a(context) || (o = mo11777o(context, connectionResult)) == null) {
            return false;
        }
        mo11784w(context, connectionResult.mo11751V(), (String) null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m636a(context, o, i, true), C3234e.f5217a | 134217728));
        return true;
    }
}
