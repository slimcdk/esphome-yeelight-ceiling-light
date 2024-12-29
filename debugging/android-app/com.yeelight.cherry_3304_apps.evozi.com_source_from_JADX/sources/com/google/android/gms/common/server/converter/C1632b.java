package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C1602a;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.converter.b */
public final class C1632b implements Parcelable.Creator<StringToIntConverter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int K = C1602a.m4406K(parcel);
        int i = 0;
        ArrayList<StringToIntConverter.zaa> arrayList = null;
        while (parcel.dataPosition() < K) {
            int C = C1602a.m4398C(parcel);
            int u = C1602a.m4429u(C);
            if (u == 1) {
                i = C1602a.m4400E(parcel, C);
            } else if (u != 2) {
                C1602a.m4405J(parcel, C);
            } else {
                arrayList = C1602a.m4427s(parcel, C, StringToIntConverter.zaa.CREATOR);
            }
        }
        C1602a.m4428t(parcel, K);
        return new StringToIntConverter(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
