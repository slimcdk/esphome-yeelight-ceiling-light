package p109w;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* renamed from: w.i0 */
public final class C3846i0 {

    /* renamed from: a */
    private static final Uri f6468a;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f6468a = parse;
        parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    /* renamed from: a */
    public static Intent m10949a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* renamed from: b */
    public static Intent m10950b(String str, @Nullable String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: c */
    public static Intent m10951c(String str) {
        Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
