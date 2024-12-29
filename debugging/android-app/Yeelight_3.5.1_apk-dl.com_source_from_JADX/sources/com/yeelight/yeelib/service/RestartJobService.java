package com.yeelight.yeelib.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import com.yeelight.cherry.p141ui.activity.LauncherActivity;

@RequiresApi(api = 21)
public class RestartJobService extends JobService {
    private void startMainActivity() {
        Class<LauncherActivity> cls = LauncherActivity.class;
        try {
            int i = LauncherActivity.f10581f;
            Intent intent = new Intent(this, cls);
            intent.setFlags(268435456);
            startActivity(intent, (Bundle) null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        startMainActivity();
        jobFinished(jobParameters, false);
        return false;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public void onTaskRemoved(Intent intent) {
    }
}
