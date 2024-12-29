package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: com.google.android.gms.wearable.internal.z1 */
public final class C2520z1 {
    /* renamed from: a */
    public static IntentFilter m8103a(String str, Uri uri, int i) {
        IntentFilter intentFilter = new IntentFilter(str);
        if (uri.getScheme() != null) {
            intentFilter.addDataScheme(uri.getScheme());
        }
        if (uri.getAuthority() != null) {
            intentFilter.addDataAuthority(uri.getAuthority(), Integer.toString(uri.getPort()));
        }
        if (uri.getPath() != null) {
            intentFilter.addDataPath(uri.getPath(), i);
        }
        return intentFilter;
    }

    /* renamed from: b */
    public static IntentFilter m8104b(String str) {
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addDataScheme(PutDataRequest.WEAR_URI_SCHEME);
        intentFilter.addDataAuthority("*", (String) null);
        return intentFilter;
    }
}
