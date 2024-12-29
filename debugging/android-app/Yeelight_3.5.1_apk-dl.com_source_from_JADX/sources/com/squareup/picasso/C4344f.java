package com.squareup.picasso;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import com.squareup.picasso.C4365s;
import com.squareup.picasso.Picasso;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.f */
class C4344f extends C4365s {

    /* renamed from: b */
    private static final UriMatcher f7190b;

    /* renamed from: a */
    private final Context f7191a;

    @TargetApi(14)
    /* renamed from: com.squareup.picasso.f$a */
    private static class C4345a {
        /* renamed from: a */
        static InputStream m12319a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f7190b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C4344f(Context context) {
        this.f7191a = context;
    }

    /* renamed from: j */
    private InputStream m12316j(C4361q qVar) {
        ContentResolver contentResolver = this.f7191a.getContentResolver();
        Uri uri = qVar.f7242d;
        int match = f7190b.match(uri);
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
        return Build.VERSION.SDK_INT < 14 ? ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri) : C4345a.m12319a(contentResolver, uri);
    }

    /* renamed from: c */
    public boolean mo28100c(C4361q qVar) {
        Uri uri = qVar.f7242d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f7190b.match(qVar.f7242d) != -1;
    }

    /* renamed from: f */
    public C4365s.C4366a mo28101f(C4361q qVar, int i) {
        InputStream j = m12316j(qVar);
        if (j != null) {
            return new C4365s.C4366a(j, Picasso.LoadedFrom.DISK);
        }
        return null;
    }
}
