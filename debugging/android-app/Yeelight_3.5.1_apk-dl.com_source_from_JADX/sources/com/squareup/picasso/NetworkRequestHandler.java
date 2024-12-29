package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.squareup.picasso.C4365s;
import com.squareup.picasso.Downloader;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.InputStream;

class NetworkRequestHandler extends C4365s {

    /* renamed from: a */
    private final Downloader f7114a;

    /* renamed from: b */
    private final C4368u f7115b;

    static class ContentLengthException extends IOException {
        public ContentLengthException(String str) {
            super(str);
        }
    }

    public NetworkRequestHandler(Downloader downloader, C4368u uVar) {
        this.f7114a = downloader;
        this.f7115b = uVar;
    }

    /* renamed from: c */
    public boolean mo28100c(C4361q qVar) {
        String scheme = qVar.f7242d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo28102e() {
        return 2;
    }

    /* renamed from: f */
    public C4365s.C4366a mo28101f(C4361q qVar, int i) {
        Downloader.C4324a a = this.f7114a.mo28096a(qVar.f7242d, qVar.f7241c);
        if (a == null) {
            return null;
        }
        Picasso.LoadedFrom loadedFrom = a.f7111c ? Picasso.LoadedFrom.DISK : Picasso.LoadedFrom.NETWORK;
        Bitmap a2 = a.mo28097a();
        if (a2 != null) {
            return new C4365s.C4366a(a2, loadedFrom);
        }
        InputStream c = a.mo28099c();
        if (c == null) {
            return null;
        }
        if (loadedFrom == Picasso.LoadedFrom.DISK && a.mo28098b() == 0) {
            C4376y.m12431e(c);
            throw new ContentLengthException("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && a.mo28098b() > 0) {
            this.f7115b.mo28237f(a.mo28098b());
        }
        return new C4365s.C4366a(c, loadedFrom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo28103h(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo28104i() {
        return true;
    }
}
