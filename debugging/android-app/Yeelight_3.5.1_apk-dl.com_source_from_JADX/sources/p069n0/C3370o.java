package p069n0;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C0895b;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.wearable.C1448g3;
import com.google.android.gms.internal.wearable.C1453h3;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;

@VisibleForTesting
/* renamed from: n0.o */
public class C3370o {

    /* renamed from: a */
    private final PutDataRequest f5480a;

    /* renamed from: b */
    private final C3362h f5481b;

    private C3370o(PutDataRequest putDataRequest, @Nullable C3362h hVar) {
        this.f5480a = putDataRequest;
        C3362h hVar2 = new C3362h();
        this.f5481b = hVar2;
        if (hVar != null) {
            hVar2.mo24116d(hVar);
        }
    }

    @RecentlyNonNull
    /* renamed from: b */
    public static C3370o m9209b(@RecentlyNonNull String str) {
        C0895b.m1290d(str, "path must not be null");
        return new C3370o(PutDataRequest.m5034V(str), (C3362h) null);
    }

    @RecentlyNonNull
    /* renamed from: a */
    public PutDataRequest mo24141a() {
        C1448g3 a = C1453h3.m3548a(this.f5481b);
        this.f5480a.mo14811d0(a.f1780a.mo13622f());
        int size = a.f1781b.size();
        int i = 0;
        while (i < size) {
            String num = Integer.toString(i);
            Asset asset = a.f1781b.get(i);
            if (num == null) {
                String valueOf = String.valueOf(asset);
                StringBuilder sb = new StringBuilder(valueOf.length() + 26);
                sb.append("asset key cannot be null: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (asset == null) {
                throw new IllegalStateException(num.length() != 0 ? "asset cannot be null: key=".concat(num) : new String("asset cannot be null: key="));
            } else {
                if (Log.isLoggable("DataMap", 3)) {
                    String valueOf2 = String.valueOf(asset);
                    StringBuilder sb2 = new StringBuilder(num.length() + 33 + valueOf2.length());
                    sb2.append("asPutDataRequest: adding asset: ");
                    sb2.append(num);
                    sb2.append(" ");
                    sb2.append(valueOf2);
                }
                this.f5480a.mo14810c0(num, asset);
                i++;
            }
        }
        return this.f5480a;
    }

    @RecentlyNonNull
    /* renamed from: c */
    public C3362h mo24142c() {
        return this.f5481b;
    }
}
