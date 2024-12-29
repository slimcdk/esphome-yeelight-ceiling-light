package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p113x.C3897a;

/* renamed from: com.google.android.gms.common.internal.d0 */
public final class C0906d0 implements Parcelable.Creator {
    /* renamed from: a */
    static void m1370a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, getServiceRequest.f942a);
        C3897a.m11116l(parcel, 2, getServiceRequest.f943b);
        C3897a.m11116l(parcel, 3, getServiceRequest.f944c);
        C3897a.m11122r(parcel, 4, getServiceRequest.f945d, false);
        C3897a.m11115k(parcel, 5, getServiceRequest.f946e, false);
        C3897a.m11125u(parcel, 6, getServiceRequest.f947f, i, false);
        C3897a.m11109e(parcel, 7, getServiceRequest.f948g, false);
        C3897a.m11121q(parcel, 8, getServiceRequest.f949h, i, false);
        C3897a.m11125u(parcel, 10, getServiceRequest.f950i, i, false);
        C3897a.m11125u(parcel, 11, getServiceRequest.f951j, i, false);
        C3897a.m11107c(parcel, 12, getServiceRequest.f952k);
        C3897a.m11116l(parcel, 13, getServiceRequest.f953l);
        C3897a.m11107c(parcel, 14, getServiceRequest.f954m);
        C3897a.m11122r(parcel, 15, getServiceRequest.mo12175V(), false);
        C3897a.m11106b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m1462J(parcel);
        Scope[] scopeArr = GetServiceRequest.f940o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f941p;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m1455C(parcel);
            switch (SafeParcelReader.m1485u(C)) {
                case 1:
                    i = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 2:
                    i2 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 3:
                    i3 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 4:
                    str = SafeParcelReader.m1479o(parcel2, C);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m1456D(parcel2, C);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m1482r(parcel2, C, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m1470f(parcel2, C);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m1478n(parcel2, C, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m1482r(parcel2, C, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m1482r(parcel2, C, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m1486v(parcel2, C);
                    break;
                case 13:
                    i4 = SafeParcelReader.m1457E(parcel2, C);
                    break;
                case 14:
                    z2 = SafeParcelReader.m1486v(parcel2, C);
                    break;
                case 15:
                    str2 = SafeParcelReader.m1479o(parcel2, C);
                    break;
                default:
                    SafeParcelReader.m1461I(parcel2, C);
                    break;
            }
        }
        SafeParcelReader.m1484t(parcel2, J);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
