package com.xiaomi.account.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.BadParcelableException;

public class ParcelableAttackGuardian {
    private static final String TAG = "ParcelableAttackGuardian";

    public boolean safeCheck(Activity activity) {
        StringBuilder sb;
        String str;
        if (activity == null || activity.getIntent() == null) {
            return true;
        }
        try {
            unparcelIntent(new Intent(activity.getIntent()));
            return true;
        } catch (BadParcelableException unused) {
            sb = new StringBuilder();
            str = "fail checking ParcelableAttack for Activity ";
            sb.append(str);
            sb.append(activity.getClass().getName());
            return false;
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof ClassNotFoundException)) {
                return true;
            }
            sb = new StringBuilder();
            str = "fail checking SerializableAttack for Activity ";
            sb.append(str);
            sb.append(activity.getClass().getName());
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void unparcelIntent(Intent intent) {
        intent.getStringExtra("");
    }
}
