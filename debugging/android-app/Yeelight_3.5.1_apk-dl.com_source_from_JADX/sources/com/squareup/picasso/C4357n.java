package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
import com.squareup.okhttp.C4270c;
import com.squareup.okhttp.C4277d;
import com.squareup.okhttp.C4310u;
import com.squareup.okhttp.C4312v;
import com.squareup.okhttp.C4318x;
import com.squareup.okhttp.C4321y;
import com.squareup.picasso.Downloader;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.n */
public class C4357n implements Downloader {

    /* renamed from: a */
    private final C4310u f7228a;

    public C4357n(Context context) {
        this(C4376y.m12432f(context));
    }

    public C4357n(C4310u uVar) {
        this.f7228a = uVar;
    }

    public C4357n(File file) {
        this(file, C4376y.m12427a(file));
    }

    public C4357n(File file, long j) {
        this(m12361b());
        try {
            this.f7228a.mo27992Q(new C4270c(file, j));
        } catch (IOException unused) {
        }
    }

    /* renamed from: b */
    private static C4310u m12361b() {
        C4310u uVar = new C4310u();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        uVar.mo27993R(15000, timeUnit);
        uVar.mo27996X(20000, timeUnit);
        uVar.mo27997Y(20000, timeUnit);
        return uVar;
    }

    /* renamed from: a */
    public Downloader.C4324a mo28096a(Uri uri, int i) {
        C4277d dVar;
        if (i == 0) {
            dVar = null;
        } else if (NetworkPolicy.isOfflineOnly(i)) {
            dVar = C4277d.f6918m;
        } else {
            C4277d.C4279b bVar = new C4277d.C4279b();
            if (!NetworkPolicy.shouldReadFromDiskCache(i)) {
                bVar.mo27847c();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i)) {
                bVar.mo27848d();
            }
            dVar = bVar.mo27845a();
        }
        C4312v.C4314b o = new C4312v.C4314b().mo28055o(uri.toString());
        if (dVar != null) {
            o.mo28048h(dVar);
        }
        C4318x g = this.f7228a.mo27990M(o.mo28047g()).mo27853g();
        int o2 = g.mo28060o();
        if (o2 < 300) {
            boolean z = g.mo28058m() != null;
            C4321y k = g.mo28056k();
            return new Downloader.C4324a(k.mo28085a(), z, k.mo26479h());
        }
        g.mo28056k().close();
        throw new Downloader.ResponseException(o2 + " " + g.mo28067u(), i, o2);
    }
}
