package p068n;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p035g.C3198o;
import p052k.C3285a;
import p075o.C3388d;
import p087r.C3621a;

@RequiresApi(api = 21)
/* renamed from: n.c */
public class C3349c implements C3354v {

    /* renamed from: a */
    private final Context f5448a;

    /* renamed from: b */
    private final C3388d f5449b;

    /* renamed from: c */
    private final SchedulerConfig f5450c;

    public C3349c(Context context, C3388d dVar, SchedulerConfig schedulerConfig) {
        this.f5448a = context;
        this.f5449b = dVar;
        this.f5450c = schedulerConfig;
    }

    /* renamed from: d */
    private boolean m9125d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo next : jobScheduler.getAllPendingJobs()) {
            int i3 = next.getExtras().getInt("attemptNumber");
            if (next.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo24093a(C3198o oVar, int i) {
        mo24094b(oVar, i, false);
    }

    /* renamed from: b */
    public void mo24094b(C3198o oVar, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f5448a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f5448a.getSystemService("jobscheduler");
        int c = mo24096c(oVar);
        if (z || !m9125d(jobScheduler, c, i)) {
            long b0 = this.f5449b.mo24184b0(oVar);
            JobInfo.Builder c2 = this.f5450c.mo11253c(new JobInfo.Builder(c, componentName), oVar.mo23733d(), b0, i);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", oVar.mo23731b());
            persistableBundle.putInt("priority", C3621a.m10301a(oVar.mo23733d()));
            if (oVar.mo23732c() != null) {
                persistableBundle.putString("extras", Base64.encodeToString(oVar.mo23732c(), 0));
            }
            c2.setExtras(persistableBundle);
            C3285a.m8855c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(c), Long.valueOf(this.f5450c.mo11255g(oVar.mo23733d(), b0, i)), Long.valueOf(b0), Integer.valueOf(i));
            jobScheduler.schedule(c2.build());
            return;
        }
        C3285a.m8854b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: c */
    public int mo24096c(C3198o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f5448a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.mo23731b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C3621a.m10301a(oVar.mo23733d())).array());
        if (oVar.mo23732c() != null) {
            adler32.update(oVar.mo23732c());
        }
        return (int) adler32.getValue();
    }
}
