package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.m0 */
public final class C1587m0 {

    /* renamed from: a */
    private static final Uri f3070a;

    /* renamed from: b */
    private static final Uri f3071b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f3070a = parse;
        f3071b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m4367a(String str, @Nullable String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: b */
    public static Intent m4368b(String str) {
        Uri fromParts = Uri.fromParts("package", str, (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: c */
    public static Intent m4369c() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }
}
