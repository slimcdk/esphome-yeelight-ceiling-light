package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.C4365s;
import com.squareup.picasso.Picasso;
import java.io.InputStream;

class MediaStoreRequestHandler extends C4346g {

    /* renamed from: b */
    private static final String[] f7113b = {"orientation"};

    enum PicassoKind {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        private PicassoKind(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    MediaStoreRequestHandler(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m12241k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f7113b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    query.close();
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: l */
    static PicassoKind m12242l(int i, int i2) {
        PicassoKind picassoKind = PicassoKind.MICRO;
        if (i <= picassoKind.width && i2 <= picassoKind.height) {
            return picassoKind;
        }
        PicassoKind picassoKind2 = PicassoKind.MINI;
        return (i > picassoKind2.width || i2 > picassoKind2.height) ? PicassoKind.FULL : picassoKind2;
    }

    /* renamed from: c */
    public boolean mo28100c(C4361q qVar) {
        Uri uri = qVar.f7242d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: f */
    public C4365s.C4366a mo28101f(C4361q qVar, int i) {
        Bitmap bitmap;
        C4361q qVar2 = qVar;
        ContentResolver contentResolver = this.f7192a.getContentResolver();
        int k = m12241k(contentResolver, qVar2.f7242d);
        String type = contentResolver.getType(qVar2.f7242d);
        boolean z = type != null && type.startsWith("video/");
        if (qVar.mo28211c()) {
            PicassoKind l = m12242l(qVar2.f7246h, qVar2.f7247i);
            if (!z && l == PicassoKind.FULL) {
                return new C4365s.C4366a((Bitmap) null, mo28165j(qVar), Picasso.LoadedFrom.DISK, k);
            }
            long parseId = ContentUris.parseId(qVar2.f7242d);
            BitmapFactory.Options d = C4365s.m12392d(qVar);
            d.inJustDecodeBounds = true;
            BitmapFactory.Options options = d;
            C4365s.m12390a(qVar2.f7246h, qVar2.f7247i, l.width, l.height, d, qVar);
            if (z) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l == PicassoKind.FULL ? 1 : l.androidKind, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l.androidKind, options);
            }
            if (bitmap != null) {
                return new C4365s.C4366a(bitmap, (InputStream) null, Picasso.LoadedFrom.DISK, k);
            }
        }
        return new C4365s.C4366a((Bitmap) null, mo28165j(qVar), Picasso.LoadedFrom.DISK, k);
    }
}
