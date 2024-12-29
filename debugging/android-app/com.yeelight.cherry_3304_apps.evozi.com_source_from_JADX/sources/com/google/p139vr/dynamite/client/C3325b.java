package com.google.p139vr.dynamite.client;

import android.os.IBinder;
import android.os.Parcel;
import p011c.p012a.p013a.p014a.C0451b;

/* renamed from: com.google.vr.dynamite.client.b */
public final class C3325b extends C0451b implements INativeLibraryLoader {
    C3325b(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    public final int checkVersion(String str) {
        Parcel c = mo8383c();
        c.writeString(str);
        Parcel e = mo8384e(2, c);
        int readInt = e.readInt();
        e.recycle();
        return readInt;
    }

    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel c = mo8383c();
        c.writeString(str);
        Parcel e = mo8384e(1, c);
        long readLong = e.readLong();
        e.recycle();
        return readLong;
    }
}
