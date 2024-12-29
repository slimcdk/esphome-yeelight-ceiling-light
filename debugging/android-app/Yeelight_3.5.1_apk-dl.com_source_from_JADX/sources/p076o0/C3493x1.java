package p076o0;

import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: o0.x1 */
public final class C3493x1 {
    /* renamed from: a */
    public static IntentFilter m9549a(String str) {
        IntentFilter intentFilter = new IntentFilter(str);
        intentFilter.addDataScheme(PutDataRequest.WEAR_URI_SCHEME);
        intentFilter.addDataAuthority("*", (String) null);
        return intentFilter;
    }

    /* renamed from: b */
    public static IntentFilter m9550b(String str, Uri uri, int i) {
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
}
