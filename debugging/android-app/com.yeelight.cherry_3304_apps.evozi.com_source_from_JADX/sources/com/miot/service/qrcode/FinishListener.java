package com.miot.service.qrcode;

import android.app.Activity;
import android.content.DialogInterface;

public final class FinishListener implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    private final Activity activityToFinish;

    public FinishListener(Activity activity) {
        this.activityToFinish = activity;
    }

    private void run() {
        this.activityToFinish.finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        run();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        run();
    }
}
