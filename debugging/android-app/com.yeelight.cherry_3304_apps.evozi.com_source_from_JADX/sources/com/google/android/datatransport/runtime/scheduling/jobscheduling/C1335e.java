package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p022s.C0496a;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0519c;
import p011c.p012a.p019b.p020a.p021i.p027w.C0555a;

@RequiresApi(api = 21)
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
public class C1335e implements C1353s {

    /* renamed from: a */
    private final Context f2439a;

    /* renamed from: b */
    private final C0519c f2440b;

    /* renamed from: c */
    private final C1337g f2441c;

    public C1335e(Context context, C0519c cVar, C1337g gVar) {
        this.f2439a = context;
        this.f2440b = cVar;
        this.f2441c = gVar;
    }

    /* renamed from: c */
    private boolean m3506c(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo10234a(C0487l lVar, int i) {
        ComponentName componentName = new ComponentName(this.f2439a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f2439a.getSystemService("jobscheduler");
        int b = mo10252b(lVar);
        if (m3506c(jobScheduler, b, i)) {
            C0496a.m155a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", lVar);
            return;
        }
        long O0 = this.f2440b.mo8506O0(lVar);
        C1337g gVar = this.f2441c;
        JobInfo.Builder builder = new JobInfo.Builder(b, componentName);
        gVar.mo10254b(builder, lVar.mo8438d(), O0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", lVar.mo8436b());
        persistableBundle.putInt("priority", C0555a.m316a(lVar.mo8438d()));
        if (lVar.mo8437c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(lVar.mo8437c(), 0));
        }
        builder.setExtras(persistableBundle);
        C0496a.m156b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", lVar, Integer.valueOf(b), Long.valueOf(this.f2441c.mo10255f(lVar.mo8438d(), O0, i)), Long.valueOf(O0), Integer.valueOf(i));
        jobScheduler.schedule(builder.build());
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: b */
    public int mo10252b(C0487l lVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f2439a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(lVar.mo8436b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C0555a.m316a(lVar.mo8438d())).array());
        if (lVar.mo8437c() != null) {
            adler32.update(lVar.mo8437c());
        }
        return (int) adler32.getValue();
    }
}
