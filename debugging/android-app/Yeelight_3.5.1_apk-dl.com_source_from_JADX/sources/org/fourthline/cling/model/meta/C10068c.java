package org.fourthline.cling.model.meta;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10023k;
import org.seamless.util.C10245c;
import p223w3.C11819x;

/* renamed from: org.fourthline.cling.model.meta.c */
public class C10068c {

    /* renamed from: h */
    private static final Logger f18573h = Logger.getLogger(C10071f.class.getName());

    /* renamed from: a */
    private final C10245c f18574a;

    /* renamed from: b */
    private final int f18575b;

    /* renamed from: c */
    private final int f18576c;

    /* renamed from: d */
    private final int f18577d;

    /* renamed from: e */
    private final URI f18578e;

    /* renamed from: f */
    private final byte[] f18579f;

    /* renamed from: g */
    private C10067b f18580g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10068c(String str, int i, int i2, int i3, URI uri) {
        this((str == null || str.length() <= 0) ? null : C10245c.m25757g(str), i, i2, i3, uri, (byte[]) null);
    }

    protected C10068c(C10245c cVar, int i, int i2, int i3, URI uri, byte[] bArr) {
        this.f18574a = cVar;
        this.f18575b = i;
        this.f18576c = i2;
        this.f18577d = i3;
        this.f18578e = uri;
        this.f18579f = bArr;
    }

    /* renamed from: a */
    public C10068c mo40517a() {
        return new C10068c(mo40522f(), mo40524h(), mo40521e(), mo40519c(), mo40523g(), mo40518b());
    }

    /* renamed from: b */
    public byte[] mo40518b() {
        return this.f18579f;
    }

    /* renamed from: c */
    public int mo40519c() {
        return this.f18577d;
    }

    /* renamed from: d */
    public C10067b mo40520d() {
        return this.f18580g;
    }

    /* renamed from: e */
    public int mo40521e() {
        return this.f18576c;
    }

    /* renamed from: f */
    public C10245c mo40522f() {
        return this.f18574a;
    }

    /* renamed from: g */
    public URI mo40523g() {
        return this.f18578e;
    }

    /* renamed from: h */
    public int mo40524h() {
        return this.f18575b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo40525i(C10067b bVar) {
        if (this.f18580g == null) {
            this.f18580g = bVar;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: j */
    public List<C10023k> mo40526j() {
        Class<C10068c> cls = C10068c.class;
        ArrayList arrayList = new ArrayList();
        if (mo40522f() == null) {
            Logger logger = f18573h;
            logger.warning("UPnP specification violation of: " + mo40520d());
            logger.warning("Invalid icon, missing mime type: " + this);
        }
        if (mo40524h() == 0) {
            Logger logger2 = f18573h;
            logger2.warning("UPnP specification violation of: " + mo40520d());
            logger2.warning("Invalid icon, missing width: " + this);
        }
        if (mo40521e() == 0) {
            Logger logger3 = f18573h;
            logger3.warning("UPnP specification violation of: " + mo40520d());
            logger3.warning("Invalid icon, missing height: " + this);
        }
        if (mo40519c() == 0) {
            Logger logger4 = f18573h;
            logger4.warning("UPnP specification violation of: " + mo40520d());
            logger4.warning("Invalid icon, missing bitmap depth: " + this);
        }
        if (mo40523g() == null) {
            arrayList.add(new C10023k(cls, "uri", "URL is required"));
        } else {
            try {
                if (mo40523g().toURL() == null) {
                    throw new MalformedURLException();
                }
            } catch (MalformedURLException e) {
                arrayList.add(new C10023k(cls, "uri", "URL must be valid: " + e.getMessage()));
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Icon(" + mo40524h() + C11819x.f21648C + mo40521e() + ", MIME: " + mo40522f() + ") " + mo40523g();
    }
}
