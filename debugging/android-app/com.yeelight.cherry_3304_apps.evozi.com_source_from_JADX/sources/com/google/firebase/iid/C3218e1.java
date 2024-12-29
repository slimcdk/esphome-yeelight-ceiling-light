package com.google.firebase.iid;

import android.os.Bundle;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import java.io.IOException;
import p011c.p012a.p019b.p028b.p038e.C0608a;
import p011c.p012a.p019b.p028b.p038e.C0619h;

/* renamed from: com.google.firebase.iid.e1 */
final /* synthetic */ class C3218e1 implements C0608a {
    C3218e1(C3215d1 d1Var) {
    }

    /* renamed from: a */
    public final Object mo8634a(C0619h hVar) {
        Bundle bundle = (Bundle) hVar.mo8651l(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2);
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                sb.toString();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
