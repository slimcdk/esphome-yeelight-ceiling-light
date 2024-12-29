package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p105v.C3729g;
import p113x.C3897a;

@KeepName
@KeepForSdk
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new C0883c();
    @SafeParcelable.VersionField(mo12321id = 1000)

    /* renamed from: a */
    final int f896a;
    @SafeParcelable.Field(getter = "getColumns", mo12312id = 1)

    /* renamed from: b */
    private final String[] f897b;

    /* renamed from: c */
    Bundle f898c;
    @SafeParcelable.Field(getter = "getWindows", mo12312id = 2)

    /* renamed from: d */
    private final CursorWindow[] f899d;
    @SafeParcelable.Field(getter = "getStatusCode", mo12312id = 3)

    /* renamed from: e */
    private final int f900e;
    @SafeParcelable.Field(getter = "getMetadata", mo12312id = 4)
    @Nullable

    /* renamed from: f */
    private final Bundle f901f;

    /* renamed from: g */
    int[] f902g;

    /* renamed from: h */
    int f903h;

    /* renamed from: i */
    boolean f904i = false;

    /* renamed from: j */
    private boolean f905j = true;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C0880a {
        /* synthetic */ C0880a(String[] strArr, String str, C3729g gVar) {
            String[] strArr2 = (String[]) C0917i.m1419j(strArr);
            new ArrayList();
            new HashMap();
        }
    }

    static {
        new C0882b(new String[0], (String) null);
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(mo12315id = 1000) int i, @SafeParcelable.Param(mo12315id = 1) String[] strArr, @SafeParcelable.Param(mo12315id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(mo12315id = 3) int i2, @SafeParcelable.Param(mo12315id = 4) @Nullable Bundle bundle) {
        this.f896a = i;
        this.f897b = strArr;
        this.f899d = cursorWindowArr;
        this.f900e = i2;
        this.f901f = bundle;
    }

    /* renamed from: k0 */
    private final void m1238k0(String str, int i) {
        Bundle bundle = this.f898c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f903h) {
            throw new CursorIndexOutOfBoundsException(i, this.f903h);
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: V */
    public byte[] mo12125V(@NonNull String str, int i, int i2) {
        m1238k0(str, i);
        return this.f899d[i2].getBlob(i, this.f898c.getInt(str));
    }

    @KeepForSdk
    /* renamed from: W */
    public int mo12126W(@NonNull String str, int i, int i2) {
        m1238k0(str, i);
        return this.f899d[i2].getInt(i, this.f898c.getInt(str));
    }

    @KeepForSdk
    @Nullable
    /* renamed from: c0 */
    public Bundle mo12127c0() {
        return this.f901f;
    }

    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.f904i) {
                this.f904i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f899d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    @KeepForSdk
    /* renamed from: d0 */
    public int mo12129d0() {
        return this.f900e;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: f0 */
    public String mo12130f0(@NonNull String str, int i, int i2) {
        m1238k0(str, i);
        return this.f899d[i2].getString(i, this.f898c.getInt(str));
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.f905j && this.f899d.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    /* renamed from: g0 */
    public int mo12132g0(int i) {
        int length;
        int i2 = 0;
        C0917i.m1423n(i >= 0 && i < this.f903h);
        while (true) {
            int[] iArr = this.f902g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == length ? i2 - 1 : i2;
    }

    @KeepForSdk
    public int getCount() {
        return this.f903h;
    }

    /* renamed from: h0 */
    public final void mo12134h0() {
        this.f898c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f897b;
            if (i2 >= strArr.length) {
                break;
            }
            this.f898c.putInt(strArr[i2], i2);
            i2++;
        }
        this.f902g = new int[this.f899d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f899d;
            if (i < cursorWindowArr.length) {
                this.f902g[i] = i3;
                i3 += this.f899d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f903h = i3;
                return;
            }
        }
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f904i;
        }
        return z;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11123s(parcel, 1, this.f897b, false);
        C3897a.m11125u(parcel, 2, this.f899d, i, false);
        C3897a.m11116l(parcel, 3, mo12129d0());
        C3897a.m11109e(parcel, 4, mo12127c0(), false);
        C3897a.m11116l(parcel, 1000, this.f896a);
        C3897a.m11106b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
