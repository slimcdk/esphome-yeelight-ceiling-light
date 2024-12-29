package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p113x.C3897a;

@ShowFirstParty
@KeepForSdk
@SafeParcelable.Class(creator = "BitmapTeleporterCreator")
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new C0881a();
    @SafeParcelable.VersionField(mo12321id = 1)

    /* renamed from: a */
    final int f891a;
    @SafeParcelable.Field(mo12312id = 2)
    @Nullable

    /* renamed from: b */
    ParcelFileDescriptor f892b;
    @SafeParcelable.Field(mo12312id = 3)

    /* renamed from: c */
    final int f893c;
    @Nullable

    /* renamed from: d */
    private Bitmap f894d = null;

    /* renamed from: e */
    private File f895e;

    @SafeParcelable.Constructor
    BitmapTeleporter(@SafeParcelable.Param(mo12315id = 1) int i, @SafeParcelable.Param(mo12315id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(mo12315id = 3) int i2) {
        this.f891a = i;
        this.f892b = parcelFileDescriptor;
        this.f893c = i2;
    }

    /* renamed from: V */
    private static final void m1237V(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        if (this.f892b == null) {
            Bitmap bitmap = (Bitmap) C0917i.m1419j(this.f894d);
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            File file = this.f895e;
            if (file != null) {
                try {
                    File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                        this.f892b = ParcelFileDescriptor.open(createTempFile, 268435456);
                        createTempFile.delete();
                        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(array);
                            m1237V(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        } catch (Throwable th) {
                            m1237V(dataOutputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        throw new IllegalStateException("Temporary file is somehow already deleted");
                    }
                } catch (IOException e2) {
                    throw new IllegalStateException("Could not create temporary file", e2);
                }
            } else {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
        }
        int a = C3897a.m11105a(parcel);
        C3897a.m11116l(parcel, 1, this.f891a);
        C3897a.m11121q(parcel, 2, this.f892b, i | 1, false);
        C3897a.m11116l(parcel, 3, this.f893c);
        C3897a.m11106b(parcel, a);
        this.f892b = null;
    }
}
