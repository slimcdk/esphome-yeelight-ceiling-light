package p014c0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
/* renamed from: c0.k */
public final class C0622k {

    /* renamed from: a */
    private static final Pattern f238a = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    static {
        Pattern.compile("\\\\.");
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public static String m220a(@Nullable String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f238a.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == 12) {
                str2 = "\\\\f";
            } else if (charAt == 13) {
                str2 = "\\\\r";
            } else if (charAt == '\"') {
                str2 = "\\\\\\\"";
            } else if (charAt == '/') {
                str2 = "\\\\/";
            } else if (charAt != '\\') {
                switch (charAt) {
                    case 8:
                        str2 = "\\\\b";
                        break;
                    case 9:
                        str2 = "\\\\t";
                        break;
                    case 10:
                        str2 = "\\\\n";
                        break;
                }
            } else {
                str2 = "\\\\\\\\";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
