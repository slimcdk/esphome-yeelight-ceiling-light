package p184m3;

import android.content.Context;
import android.content.Intent;
import com.twofortyfouram.locale.api.R$string;

/* renamed from: m3.a */
public final class C9545a {
    /* renamed from: a */
    public static CharSequence m23213a(Context context, Intent intent, String str) {
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        } else if (str == null) {
            return "";
        } else {
            if (intent == null) {
                return str;
            }
            try {
                String stringExtra = intent.getStringExtra("com.twofortyfouram.locale.intent.extra.BREADCRUMB");
                if (stringExtra == null) {
                    return str;
                }
                return context.getString(R$string.twofortyfouram_locale_breadcrumb_format, new Object[]{stringExtra, context.getString(R$string.twofortyfouram_locale_breadcrumb_separator), str});
            } catch (Exception unused) {
                return "";
            }
        }
    }
}
