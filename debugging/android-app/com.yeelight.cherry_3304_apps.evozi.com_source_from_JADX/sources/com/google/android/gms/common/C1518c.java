package com.google.android.gms.common;

import android.annotation.SuppressLint;
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
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.base.R$drawable;
import com.google.android.gms.base.R$string;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.C1416b1;
import com.google.android.gms.common.api.internal.C1420c1;
import com.google.android.gms.common.internal.C1568f;
import com.google.android.gms.common.internal.C1570g;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.C1655i;
import com.google.android.gms.common.util.C1660n;
import com.google.android.gms.internal.base.C1697h;
import com.yeelight.yeelib.p150c.p183m.C6363d;
import com.yeelight.yeelib.p150c.p183m.C7070n;

/* renamed from: com.google.android.gms.common.c */
public class C1518c extends C1520d {

    /* renamed from: d */
    private static final Object f2870d = new Object();

    /* renamed from: e */
    private static final C1518c f2871e = new C1518c();
    @GuardedBy("mLock")

    /* renamed from: c */
    private String f2872c;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.c$a */
    private class C1519a extends C1697h {

        /* renamed from: a */
        private final Context f2873a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1519a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f2873a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                sb.toString();
                return;
            }
            int i2 = C1518c.this.mo11044i(this.f2873a);
            if (C1518c.this.mo11046m(i2)) {
                C1518c.this.mo11050s(this.f2873a, i2);
            }
        }
    }

    /* renamed from: q */
    public static C1518c m4095q() {
        return f2871e;
    }

    /* renamed from: t */
    static Dialog m4096t(Context context, int i, C1570g gVar, DialogInterface.OnCancelListener onCancelListener) {
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
        builder.setMessage(C1568f.m4308d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C1568f.m4307c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, gVar);
        }
        String g = C1568f.m4311g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        return builder.create();
    }

    /* renamed from: v */
    static void m4097v(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            SupportErrorDialogFragment.m3606q(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
            return;
        }
        C1517b.m4094a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: x */
    private final void m4098x(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo11052w(context);
        } else if (pendingIntent != null) {
            String f = C1568f.m4310f(context, i);
            String e = C1568f.m4309e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(f).setStyle(new NotificationCompat.BigTextStyle().bigText(e));
            if (C1655i.m4593c(context)) {
                C1609u.m4478n(C1660n.m4606f());
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (C1655i.m4594d(context)) {
                    style.addAction(R$drawable.common_full_open_on_phone, resources.getString(R$string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(R$string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(e);
            }
            if (C1660n.m4609i()) {
                C1609u.m4478n(C1660n.m4609i());
                String z = m4099z();
                if (z == null) {
                    z = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(z);
                    String b = C1568f.m4306b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(z, b, 4);
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                style.setChannelId(z);
            }
            Notification build = style.build();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C1533g.f2903d.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: z */
    private final String m4099z() {
        String str;
        synchronized (f2870d) {
            str = this.f2872c;
        }
        return str;
    }

    @ShowFirstParty
    @KeepForSdk
    @Nullable
    /* renamed from: d */
    public Intent mo11041d(Context context, int i, @Nullable String str) {
        return super.mo11041d(context, i, str);
    }

    @Nullable
    /* renamed from: e */
    public PendingIntent mo11042e(Context context, int i, int i2) {
        return super.mo11042e(context, i, i2);
    }

    /* renamed from: g */
    public final String mo11043g(int i) {
        return super.mo11043g(i);
    }

    @HideFirstParty
    /* renamed from: i */
    public int mo11044i(Context context) {
        return super.mo11044i(context);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: j */
    public int mo11045j(Context context, int i) {
        return super.mo11045j(context, i);
    }

    /* renamed from: m */
    public final boolean mo11046m(int i) {
        return super.mo11046m(i);
    }

    /* renamed from: o */
    public Dialog mo11047o(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m4096t(activity, i, C1570g.m4314a(activity, mo11041d(activity, i, C6363d.f13402G), i2), onCancelListener);
    }

    @Nullable
    /* renamed from: p */
    public PendingIntent mo11048p(Context context, ConnectionResult connectionResult) {
        return connectionResult.mo10748T() ? connectionResult.mo10747S() : mo11042e(context, connectionResult.mo10745Q(), 0);
    }

    /* renamed from: r */
    public boolean mo11049r(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o = mo11047o(activity, i, i2, onCancelListener);
        if (o == null) {
            return false;
        }
        m4097v(activity, o, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: s */
    public void mo11050s(Context context, int i) {
        m4098x(context, i, (String) null, mo11058f(context, i, 0, C7070n.f14495G));
    }

    @Nullable
    /* renamed from: u */
    public final C1416b1 mo11051u(Context context, C1420c1 c1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C1416b1 b1Var = new C1416b1(c1Var);
        context.registerReceiver(b1Var, intentFilter);
        b1Var.mo10885b(context);
        if (mo11060l(context, "com.google.android.gms")) {
            return b1Var;
        }
        c1Var.mo10895a();
        b1Var.mo10884a();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo11052w(Context context) {
        new C1519a(context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: y */
    public final boolean mo11053y(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent p = mo11048p(context, connectionResult);
        if (p == null) {
            return false;
        }
        m4098x(context, connectionResult.mo10745Q(), (String) null, GoogleApiActivity.m3608a(context, p, i));
        return true;
    }
}
