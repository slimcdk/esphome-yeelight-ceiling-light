package com.yeelight.yeelib.service;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(api = 21)
public class RestartJobService extends JobService {
    private void startMainActivity() {
        try {
            Intent intent = new Intent(this, Class.forName("com.yeelight.cherry.ui.activity.LauncherActivity"));
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
