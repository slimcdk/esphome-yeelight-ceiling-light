package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.HashMap;
import p113x.C3897a;

@KeepForSdk
@SafeParcelable.Class(creator = "StringToIntConverterCreator")
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.C0950a<String, Integer> {
    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C0948b();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f1119a;

    /* renamed from: b */
    private final HashMap f1120b;

    /* renamed from: c */
    private final SparseArray f1121c;

    @KeepForSdk
    public StringToIntConverter() {
        this.f1119a = 1;
        this.f1120b = new HashMap();
        this.f1121c = new SparseArray();
    }

    @SafeParcelable.Constructor
    StringToIntConverter(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) ArrayList arrayList) {
        this.f1119a = i;
        this.f1120b = new HashMap();
        this.f1121c = new SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = (zac) arrayList.get(i2);
            mo12369V(zac.f1125b, zac.f1126c);
        }
    }

    @NonNull
    /* renamed from: B */
    public final /* bridge */ /* synthetic */ Object mo12368B(@NonNull Object obj) {
        String str = (String) this.f1121c.get(((Integer) obj).intValue());
        return (str != null || !this.f1120b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }

    @NonNull
    @KeepForSdk
    @CanIgnoreReturnValue
    /* renamed from: V */
    public StringToIntConverter mo12369V(@NonNull String str, int i) {
        this.f1120b.put(str, Integer.valueOf(i));
        this.f1121c.put(i, str);
        return this;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f1119a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f1120b.keySet()) {
            arrayList.add(new zac(str, ((Integer) this.f1120b.get(str)).intValue()));
        }
        C3897a.m11126v(parcel, 2, arrayList, false);
        C3897a.m11106b(parcel, a);
    }
}
