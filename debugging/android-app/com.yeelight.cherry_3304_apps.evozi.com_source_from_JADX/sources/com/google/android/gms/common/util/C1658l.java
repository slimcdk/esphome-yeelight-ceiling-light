package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
/* renamed from: com.google.android.gms.common.util.l */
public final class C1658l {

    /* renamed from: a */
    private static final Pattern f3176a = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    static {
        Pattern.compile("\\\\.");
    }

    @KeepForSdk
    /* renamed from: a */
    public static String m4599a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = f3176a.matcher(str);
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
