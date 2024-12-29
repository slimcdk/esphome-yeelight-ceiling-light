package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.time.C1354a;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p022s.C0496a;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p027w.C0555a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
public class C1329a implements C1353s {

    /* renamed from: a */
    private final Context f2425a;

    /* renamed from: b */
    private final C0519c f2426b;

    /* renamed from: c */
    private AlarmManager f2427c;

    /* renamed from: d */
    private final C1337g f2428d;

    /* renamed from: e */
    private final C1354a f2429e;

    @VisibleForTesting
    C1329a(Context context, C0519c cVar, AlarmManager alarmManager, C1354a aVar, C1337g gVar) {
        this.f2425a = context;
        this.f2426b = cVar;
        this.f2427c = alarmManager;
        this.f2429e = aVar;
        this.f2428d = gVar;
    }

    public C1329a(Context context, C0519c cVar, C1354a aVar, C1337g gVar) {
        this(context, cVar, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), aVar, gVar);
    }

    /* renamed from: a */
    public void mo10234a(C0487l lVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", lVar.mo8436b());
        builder.appendQueryParameter("priority", String.valueOf(C0555a.m316a(lVar.mo8438d())));
        if (lVar.mo8437c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(lVar.mo8437c(), 0));
        }
        Intent intent = new Intent(this.f2425a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (mo10235b(intent)) {
            C0496a.m155a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", lVar);
            return;
        }
        long O0 = this.f2426b.mo8506O0(lVar);
        long f = this.f2428d.mo10255f(lVar.mo8438d(), O0, i);
        C0496a.m156b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", lVar, Long.valueOf(f), Long.valueOf(O0), Integer.valueOf(i));
        this.f2427c.set(3, this.f2429e.mo10267a() + f, PendingIntent.getBroadcast(this.f2425a, 0, intent, 0));
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public boolean mo10235b(Intent intent) {
        return PendingIntent.getBroadcast(this.f2425a, 0, intent, 536870912) != null;
    }
}
