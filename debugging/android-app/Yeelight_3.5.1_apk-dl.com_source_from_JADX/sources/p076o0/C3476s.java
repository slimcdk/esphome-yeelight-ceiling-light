package p076o0;

import androidx.core.p007os.EnvironmentCompat;
import com.google.android.gms.common.data.DataHolder;
import p069n0.C3358d;
import p069n0.C3360f;
import p105v.C3726d;

/* renamed from: o0.s */
public final class C3476s extends C3726d implements C3358d {

    /* renamed from: d */
    private final int f5583d;

    public C3476s(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f5583d = i2;
    }

    /* renamed from: G */
    public final C3360f mo24109G() {
        return new C3488w(this.f6254a, this.f6255b, this.f5583d);
    }

    public final int getType() {
        return mo26148b("event_type");
    }

    public final String toString() {
        String str = mo26148b("event_type") == 1 ? "changed" : mo26148b("event_type") == 2 ? "deleted" : EnvironmentCompat.MEDIA_UNKNOWN;
        String valueOf = String.valueOf(mo24109G());
        StringBuilder sb = new StringBuilder(str.length() + 32 + valueOf.length());
        sb.append("DataEventRef{ type=");
        sb.append(str);
        sb.append(", dataitem=");
        sb.append(valueOf);
        sb.append(" }");
        return sb.toString();
    }
}
