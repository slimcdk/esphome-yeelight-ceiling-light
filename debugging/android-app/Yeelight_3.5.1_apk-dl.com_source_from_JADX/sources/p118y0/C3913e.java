package p118y0;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: y0.e */
public class C3913e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f6552a;
    @Nullable

    /* renamed from: b */
    private C3915b f6553b = null;

    /* renamed from: y0.e$b */
    private class C3915b {
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: a */
        public final String f6554a;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: b */
        public final String f6555b;

        private C3915b(C3913e eVar) {
            int q = CommonUtils.m5548q(eVar.f6552a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
            if (q != 0) {
                this.f6554a = "Unity";
                String string = eVar.f6552a.getResources().getString(q);
                this.f6555b = string;
                C3916f f = C3916f.m11190f();
                f.mo26405i("Unity Editor version is: " + string);
            } else if (eVar.m11183c("flutter_assets/NOTICES.Z")) {
                this.f6554a = "Flutter";
                this.f6555b = null;
                C3916f.m11190f().mo26405i("Development platform is: Flutter");
            } else {
                this.f6554a = null;
                this.f6555b = null;
            }
        }
    }

    public C3913e(Context context) {
        this.f6552a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m11183c(String str) {
        if (this.f6552a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f6552a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private C3915b m11184f() {
        if (this.f6553b == null) {
            this.f6553b = new C3915b();
        }
        return this.f6553b;
    }

    @Nullable
    /* renamed from: d */
    public String mo26397d() {
        return m11184f().f6554a;
    }

    @Nullable
    /* renamed from: e */
    public String mo26398e() {
        return m11184f().f6555b;
    }
}
