package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.R$string;

/* renamed from: com.google.android.gms.measurement.internal.g5 */
public final class C1627g5 {
    /* renamed from: a */
    public static String m4241a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R$string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @Nullable
    /* renamed from: b */
    public static final String m4242b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, TypedValues.Custom.S_STRING, str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
