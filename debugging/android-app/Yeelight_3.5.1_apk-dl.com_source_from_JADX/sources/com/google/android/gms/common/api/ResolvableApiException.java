package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import androidx.annotation.NonNull;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@NonNull Status status) {
        super(status);
    }

    @NonNull
    public PendingIntent getResolution() {
        return getStatus().mo11807W();
    }

    public void startResolutionForResult(@NonNull Activity activity, int i) {
        getStatus().mo11813h0(activity, i);
    }
}
