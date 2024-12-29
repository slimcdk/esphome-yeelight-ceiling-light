package p109w;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;

@KeepForSdk
/* renamed from: w.g */
public class C3840g {

    /* renamed from: a */
    private final Resources f6463a;

    /* renamed from: b */
    private final String f6464b;

    public C3840g(@NonNull Context context) {
        C0917i.m1419j(context);
        Resources resources = context.getResources();
        this.f6463a = resources;
        this.f6464b = resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: a */
    public String mo26317a(@NonNull String str) {
        int identifier = this.f6463a.getIdentifier(str, TypedValues.Custom.S_STRING, this.f6464b);
        if (identifier == 0) {
            return null;
        }
        return this.f6463a.getString(identifier);
    }
}
