package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C1609u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
@KeepForSdk
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new C1530i();
    @SafeParcelable.VersionField(mo11286id = 1000)

    /* renamed from: a */
    private final int f2882a;
    @SafeParcelable.Field(getter = "getColumns", mo11280id = 1)

    /* renamed from: b */
    private final String[] f2883b;

    /* renamed from: c */
    private Bundle f2884c;
    @SafeParcelable.Field(getter = "getWindows", mo11280id = 2)

    /* renamed from: d */
    private final CursorWindow[] f2885d;
    @SafeParcelable.Field(getter = "getStatusCode", mo11280id = 3)

    /* renamed from: e */
    private final int f2886e;
    @SafeParcelable.Field(getter = "getMetadata", mo11280id = 4)

    /* renamed from: f */
    private final Bundle f2887f;

    /* renamed from: g */
    private int[] f2888g;

    /* renamed from: h */
    private int f2889h;

    /* renamed from: i */
    private boolean f2890i = false;

    /* renamed from: j */
    private boolean f2891j = true;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C1521a {
        private C1521a(String[] strArr, String str) {
            C1609u.m4475k(strArr);
            String[] strArr2 = strArr;
            new ArrayList();
            new HashMap();
        }

        /* synthetic */ C1521a(String[] strArr, String str, C1529h hVar) {
            this(strArr, (String) null);
        }
    }

    static {
        new C1529h(new String[0], (String) null);
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(mo11283id = 1000) int i, @SafeParcelable.Param(mo11283id = 1) String[] strArr, @SafeParcelable.Param(mo11283id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(mo11283id = 3) int i2, @SafeParcelable.Param(mo11283id = 4) Bundle bundle) {
        this.f2882a = i;
        this.f2883b = strArr;
        this.f2885d = cursorWindowArr;
        this.f2886e = i2;
        this.f2887f = bundle;
    }

    /* renamed from: X */
    private final void m4129X(String str, int i) {
        Bundle bundle = this.f2884c;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f2889h) {
            throw new CursorIndexOutOfBoundsException(i, this.f2889h);
        }
    }

    @KeepForSdk
    /* renamed from: Q */
    public final byte[] mo11062Q(String str, int i, int i2) {
        m4129X(str, i);
        return this.f2885d[i2].getBlob(i, this.f2884c.getInt(str));
    }

    @KeepForSdk
    /* renamed from: R */
    public final int mo11063R(String str, int i, int i2) {
        m4129X(str, i);
        return this.f2885d[i2].getInt(i, this.f2884c.getInt(str));
    }

    @KeepForSdk
    /* renamed from: S */
    public final Bundle mo11064S() {
        return this.f2887f;
    }

    @KeepForSdk
    /* renamed from: T */
    public final int mo11065T() {
        return this.f2886e;
    }

    @KeepForSdk
    /* renamed from: V */
    public final String mo11066V(String str, int i, int i2) {
        m4129X(str, i);
        return this.f2885d[i2].getString(i, this.f2884c.getInt(str));
    }

    @KeepForSdk
    /* renamed from: W */
    public final int mo11067W(int i) {
        int i2 = 0;
        C1609u.m4478n(i >= 0 && i < this.f2889h);
        while (true) {
            int[] iArr = this.f2888g;
            if (i2 >= iArr.length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.f2888g.length ? i2 - 1 : i2;
    }

    /* renamed from: Z */
    public final void mo11068Z() {
        this.f2884c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f2883b;
            if (i2 >= strArr.length) {
                break;
            }
            this.f2884c.putInt(strArr[i2], i2);
            i2++;
        }
        this.f2888g = new int[this.f2885d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f2885d;
            if (i < cursorWindowArr.length) {
                this.f2888g[i] = i3;
                i3 += this.f2885d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f2889h = i3;
                return;
            }
        }
    }

    @KeepForSdk
    public final void close() {
        synchronized (this) {
            if (!this.f2890i) {
                this.f2890i = true;
                for (CursorWindow close : this.f2885d) {
                    close.close();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            if (this.f2891j && this.f2885d.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                sb.toString();
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public final int getCount() {
        return this.f2889h;
    }

    @KeepForSdk
    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f2890i;
        }
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C1604b.m4435a(parcel);
        C1604b.m4453s(parcel, 1, this.f2883b, false);
        C1604b.m4455u(parcel, 2, this.f2885d, i, false);
        C1604b.m4446l(parcel, 3, mo11065T());
        C1604b.m4439e(parcel, 4, mo11064S(), false);
        C1604b.m4446l(parcel, 1000, this.f2882a);
        C1604b.m4436b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
