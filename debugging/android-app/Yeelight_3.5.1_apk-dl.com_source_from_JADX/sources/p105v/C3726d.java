package p105v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C0914h;
import com.google.android.gms.common.internal.C0917i;

@KeepForSdk
/* renamed from: v.d */
public abstract class C3726d {
    @NonNull
    @KeepForSdk

    /* renamed from: a */
    protected final DataHolder f6254a;
    @KeepForSdk

    /* renamed from: b */
    protected int f6255b;

    /* renamed from: c */
    private int f6256c;

    @KeepForSdk
    public C3726d(@NonNull DataHolder dataHolder, int i) {
        this.f6254a = (DataHolder) C0917i.m1419j(dataHolder);
        mo26150d(i);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public byte[] mo26147a(@NonNull String str) {
        return this.f6254a.mo12125V(str, this.f6255b, this.f6256c);
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: b */
    public int mo26148b(@NonNull String str) {
        return this.f6254a.mo12126W(str, this.f6255b, this.f6256c);
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public String mo26149c(@NonNull String str) {
        return this.f6254a.mo12130f0(str, this.f6255b, this.f6256c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo26150d(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f6254a.getCount()) {
            z = true;
        }
        C0917i.m1423n(z);
        this.f6255b = i;
        this.f6256c = this.f6254a.mo12132g0(i);
    }

    @KeepForSdk
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C3726d) {
            C3726d dVar = (C3726d) obj;
            return C0914h.m1402a(Integer.valueOf(dVar.f6255b), Integer.valueOf(this.f6255b)) && C0914h.m1402a(Integer.valueOf(dVar.f6256c), Integer.valueOf(this.f6256c)) && dVar.f6254a == this.f6254a;
        }
    }

    @KeepForSdk
    public int hashCode() {
        return C0914h.m1403b(Integer.valueOf(this.f6255b), Integer.valueOf(this.f6256c), this.f6254a);
    }
}
