package p011c.p083d.p090b;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import java.io.InputStream;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1220y;

/* renamed from: c.d.b.f */
class C1180f extends C1220y {

    /* renamed from: b */
    private static final UriMatcher f1990b;

    /* renamed from: a */
    private final Context f1991a;

    @TargetApi(14)
    /* renamed from: c.d.b.f$a */
    private static class C1181a {
        /* renamed from: a */
        static InputStream m3040a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f1990b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f1990b.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f1990b.addURI("com.android.contacts", "contacts/#/photo", 2);
        f1990b.addURI("com.android.contacts", "contacts/#", 3);
        f1990b.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C1180f(Context context) {
        this.f1991a = context;
    }

    /* renamed from: j */
    private InputStream m3037j(C1216w wVar) {
        ContentResolver contentResolver = this.f1991a.getContentResolver();
        Uri uri = wVar.f2107d;
        int match = f1990b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return Build.VERSION.SDK_INT < 14 ? ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri) : C1181a.m3040a(contentResolver, uri);
    }

    /* renamed from: c */
    public boolean mo9912c(C1216w wVar) {
        Uri uri = wVar.f2107d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f1990b.match(wVar.f2107d) != -1;
    }

    /* renamed from: f */
    public C1220y.C1221a mo9913f(C1216w wVar, int i) {
        InputStream j = m3037j(wVar);
        if (j != null) {
            return new C1220y.C1221a(j, C1203t.C1209e.DISK);
        }
        return null;
    }
}
