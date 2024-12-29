package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C1604b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class(creator = "BitmapTeleporterCreator")
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C1528g();
    @SafeParcelable.VersionField(mo11286id = 1)

    /* renamed from: a */
    private final int f2877a;
    @SafeParcelable.Field(mo11280id = 2)

    /* renamed from: b */
    private ParcelFileDescriptor f2878b;
    @SafeParcelable.Field(mo11280id = 3)

    /* renamed from: c */
    private final int f2879c;

    /* renamed from: d */
    private Bitmap f2880d = null;

    /* renamed from: e */
    private File f2881e;

    @SafeParcelable.Constructor
    BitmapTeleporter(@SafeParcelable.Param(mo11283id = 1) int i, @SafeParcelable.Param(mo11283id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(mo11283id = 3) int i2) {
        this.f2877a = i;
        this.f2878b = parcelFileDescriptor;
        this.f2879c = i2;
    }

    /* renamed from: Q */
    private static void m4127Q(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: R */
    private final FileOutputStream m4128R() {
        File file = this.f2881e;
        if (file != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.f2878b = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Could not create temporary file", e);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f2878b == null) {
            Bitmap bitmap = this.f2880d;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(m4128R()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m4127Q(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m4127Q(dataOutputStream);
                throw th;
            }
        }
        int a = C1604b.m4435a(parcel);
        C1604b.m4446l(parcel, 1, this.f2877a);
        C1604b.m4451q(parcel, 2, this.f2878b, i | 1, false);
        C1604b.m4446l(parcel, 3, this.f2879c);
        C1604b.m4436b(parcel, a);
        this.f2878b = null;
    }
}
