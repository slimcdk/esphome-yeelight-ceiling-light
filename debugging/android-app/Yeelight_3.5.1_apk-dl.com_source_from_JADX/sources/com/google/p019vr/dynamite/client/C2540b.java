package com.google.p019vr.dynamite.client;

import android.os.IBinder;
import android.os.Parcel;
import p023d.C3121b;

/* renamed from: com.google.vr.dynamite.client.b */
public final class C2540b extends C3121b implements INativeLibraryLoader {
    C2540b(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    public final int checkVersion(String str) {
        Parcel c = mo23589c();
        c.writeString(str);
        Parcel e = mo23590e(2, c);
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }

    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel c = mo23589c();
        c.writeString(str);
        Parcel e = mo23590e(1, c);
        long readLong = e.readLong();
        e.recycle();
        return readLong;
    }
}
