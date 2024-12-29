package p068n;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import p035g.C3198o;
import p052k.C3285a;
import p075o.C3388d;
import p083q.C3604a;
import p087r.C3621a;

/* renamed from: n.a */
public class C3348a implements C3354v {

    /* renamed from: a */
    private final Context f5443a;

    /* renamed from: b */
    private final C3388d f5444b;

    /* renamed from: c */
    private AlarmManager f5445c;

    /* renamed from: d */
    private final SchedulerConfig f5446d;

    /* renamed from: e */
    private final C3604a f5447e;

    @VisibleForTesting
    C3348a(Context context, C3388d dVar, AlarmManager alarmManager, C3604a aVar, SchedulerConfig schedulerConfig) {
        this.f5443a = context;
        this.f5444b = dVar;
        this.f5445c = alarmManager;
        this.f5447e = aVar;
        this.f5446d = schedulerConfig;
    }

    public C3348a(Context context, C3388d dVar, C3604a aVar, SchedulerConfig schedulerConfig) {
        this(context, dVar, (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM), aVar, schedulerConfig);
    }

    /* renamed from: a */
    public void mo24093a(C3198o oVar, int i) {
        mo24094b(oVar, i, false);
    }

    /* renamed from: b */
    public void mo24094b(C3198o oVar, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", oVar.mo23731b());
        builder.appendQueryParameter("priority", String.valueOf(C3621a.m10301a(oVar.mo23733d())));
        if (oVar.mo23732c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(oVar.mo23732c(), 0));
        }
        Intent intent = new Intent(this.f5443a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (z || !mo24095c(intent)) {
            long b0 = this.f5444b.mo24184b0(oVar);
            long g = this.f5446d.mo11255g(oVar.mo23733d(), b0, i);
            C3285a.m8855c("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", oVar, Long.valueOf(g), Long.valueOf(b0), Integer.valueOf(i));
            this.f5445c.set(3, this.f5447e.mo25913a() + g, PendingIntent.getBroadcast(this.f5443a, 0, intent, 0));
            return;
        }
        C3285a.m8854b("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c */
    public boolean mo24095c(Intent intent) {
        return PendingIntent.getBroadcast(this.f5443a, 0, intent, 536870912) != null;
    }
}
