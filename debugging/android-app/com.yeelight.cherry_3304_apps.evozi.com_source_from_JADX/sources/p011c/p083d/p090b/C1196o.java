package p011c.p083d.p090b;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.InputStream;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1220y;

/* renamed from: c.d.b.o */
class C1196o extends C1182g {

    /* renamed from: b */
    private static final String[] f2034b = {"orientation"};

    /* renamed from: c.d.b.o$a */
    enum C1197a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: a */
        final int f2039a;

        /* renamed from: b */
        final int f2040b;

        /* renamed from: c */
        final int f2041c;

        private C1197a(int i, int i2, int i3) {
            this.f2039a = i;
            this.f2040b = i2;
            this.f2041c = i3;
        }
    }

    C1196o(Context context) {
        super(context);
    }

    /* renamed from: k */
    static int m3087k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f2034b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    if (query != null) {
                        query.close();
                    }
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
    static C1197a m3088l(int i, int i2) {
        C1197a aVar = C1197a.MICRO;
        if (i <= aVar.f2040b && i2 <= aVar.f2041c) {
            return aVar;
        }
        C1197a aVar2 = C1197a.MINI;
        return (i > aVar2.f2040b || i2 > aVar2.f2041c) ? C1197a.FULL : aVar2;
    }

    /* renamed from: c */
    public boolean mo9912c(C1216w wVar) {
        Uri uri = wVar.f2107d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: f */
    public C1220y.C1221a mo9913f(C1216w wVar, int i) {
        Bitmap bitmap;
        C1216w wVar2 = wVar;
        ContentResolver contentResolver = this.f1992a.getContentResolver();
        int k = m3087k(contentResolver, wVar2.f2107d);
        String type = contentResolver.getType(wVar2.f2107d);
        boolean z = type != null && type.startsWith("video/");
        if (wVar.mo10024c()) {
            C1197a l = m3088l(wVar2.f2111h, wVar2.f2112i);
            if (!z && l == C1197a.FULL) {
                return new C1220y.C1221a((Bitmap) null, mo9955j(wVar), C1203t.C1209e.DISK, k);
            }
            long parseId = ContentUris.parseId(wVar2.f2107d);
            BitmapFactory.Options d = C1220y.m3151d(wVar);
            d.inJustDecodeBounds = true;
            BitmapFactory.Options options = d;
            C1220y.m3149a(wVar2.f2111h, wVar2.f2112i, l.f2040b, l.f2041c, d, wVar);
            if (z) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l == C1197a.FULL ? 1 : l.f2039a, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l.f2039a, options);
            }
            if (bitmap != null) {
                return new C1220y.C1221a(bitmap, (InputStream) null, C1203t.C1209e.DISK, k);
            }
        }
        return new C1220y.C1221a((Bitmap) null, mo9955j(wVar), C1203t.C1209e.DISK, k);
    }
}
