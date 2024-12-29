package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.annotation.KeepForSdk;
import javax.annotation.Nullable;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.w */
public class C1613w {

    /* renamed from: a */
    private final Resources f3087a;

    /* renamed from: b */
    private final String f3088b;

    public C1613w(Context context) {
        C1609u.m4475k(context);
        Resources resources = context.getResources();
        this.f3087a = resources;
        this.f3088b = resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public String mo11290a(String str) {
        int identifier = this.f3087a.getIdentifier(str, "string", this.f3088b);
        if (identifier == 0) {
            return null;
        }
        return this.f3087a.getString(identifier);
    }
}
