package p076o0;

import com.xiaomi.mipush.sdk.Constants;
import p069n0.C3361g;

/* renamed from: o0.t */
public final class C3479t implements C3361g {

    /* renamed from: a */
    private final String f5584a;

    /* renamed from: b */
    private final String f5585b;

    public C3479t(C3361g gVar) {
        this.f5584a = gVar.getId();
        this.f5585b = gVar.mo14829v();
    }

    /* renamed from: P */
    public final /* bridge */ /* synthetic */ Object mo14826P() {
        return this;
    }

    public final String getId() {
        return this.f5584a;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetEntity[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f5584a == null) {
            str = ",noid";
        } else {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            str = this.f5584a;
        }
        sb.append(str);
        sb.append(", key=");
        sb.append(this.f5585b);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: v */
    public final String mo14829v() {
        return this.f5585b;
    }
}
