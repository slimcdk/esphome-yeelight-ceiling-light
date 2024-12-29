package p014c0;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;

@KeepForSdk
/* renamed from: c0.l */
public class C0623l {
    @KeepForSdk
    /* renamed from: a */
    public static void m221a(@NonNull StringBuilder sb, @NonNull HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String next : hashMap.keySet()) {
            if (!z) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            String str = hashMap.get(next);
            sb.append("\"");
            sb.append(next);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
