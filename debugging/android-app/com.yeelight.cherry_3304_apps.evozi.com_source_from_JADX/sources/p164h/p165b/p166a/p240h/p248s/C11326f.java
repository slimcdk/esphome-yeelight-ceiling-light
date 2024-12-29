package p164h.p165b.p166a.p240h.p248s;

import com.yeelight.yeelib.p150c.p183m.C7425x;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11222l;
import p164h.p257c.p259b.C11497c;

/* renamed from: h.b.a.h.s.f */
public class C11326f {

    /* renamed from: h */
    private static final Logger f22476h = Logger.getLogger(C11336p.class.getName());

    /* renamed from: a */
    private final C11497c f22477a;

    /* renamed from: b */
    private final int f22478b;

    /* renamed from: c */
    private final int f22479c;

    /* renamed from: d */
    private final int f22480d;

    /* renamed from: e */
    private final URI f22481e;

    /* renamed from: f */
    private final byte[] f22482f;

    /* renamed from: g */
    private C11323c f22483g;

    protected C11326f(C11497c cVar, int i, int i2, int i3, URI uri, byte[] bArr) {
        this.f22477a = cVar;
        this.f22478b = i;
        this.f22479c = i2;
        this.f22480d = i3;
        this.f22481e = uri;
        this.f22482f = bArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11326f(String str, int i, int i2, int i3, URI uri) {
        this((str == null || str.length() <= 0) ? null : C11497c.m30177g(str), i, i2, i3, uri, (byte[]) null);
    }

    /* renamed from: a */
    public C11326f mo35927a() {
        return new C11326f(mo35932f(), mo35934h(), mo35931e(), mo35929c(), mo35933g(), mo35928b());
    }

    /* renamed from: b */
    public byte[] mo35928b() {
        return this.f22482f;
    }

    /* renamed from: c */
    public int mo35929c() {
        return this.f22480d;
    }

    /* renamed from: d */
    public C11323c mo35930d() {
        return this.f22483g;
    }

    /* renamed from: e */
    public int mo35931e() {
        return this.f22479c;
    }

    /* renamed from: f */
    public C11497c mo35932f() {
        return this.f22477a;
    }

    /* renamed from: g */
    public URI mo35933g() {
        return this.f22481e;
    }

    /* renamed from: h */
    public int mo35934h() {
        return this.f22478b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo35935i(C11323c cVar) {
        if (this.f22483g == null) {
            this.f22483g = cVar;
            return;
        }
        throw new IllegalStateException("Final value has been set already, model is immutable");
    }

    /* renamed from: j */
    public List<C11222l> mo35936j() {
        Class<C11326f> cls = C11326f.class;
        ArrayList arrayList = new ArrayList();
        if (mo35932f() == null) {
            Logger logger = f22476h;
            logger.warning("UPnP specification violation of: " + mo35930d());
            Logger logger2 = f22476h;
            logger2.warning("Invalid icon, missing mime type: " + this);
        }
        if (mo35934h() == 0) {
            Logger logger3 = f22476h;
            logger3.warning("UPnP specification violation of: " + mo35930d());
            Logger logger4 = f22476h;
            logger4.warning("Invalid icon, missing width: " + this);
        }
        if (mo35931e() == 0) {
            Logger logger5 = f22476h;
            logger5.warning("UPnP specification violation of: " + mo35930d());
            Logger logger6 = f22476h;
            logger6.warning("Invalid icon, missing height: " + this);
        }
        if (mo35929c() == 0) {
            Logger logger7 = f22476h;
            logger7.warning("UPnP specification violation of: " + mo35930d());
            Logger logger8 = f22476h;
            logger8.warning("Invalid icon, missing bitmap depth: " + this);
        }
        if (mo35933g() == null) {
            arrayList.add(new C11222l(cls, "uri", "URL is required"));
        } else {
            try {
                if (mo35933g().toURL() == null) {
                    throw new MalformedURLException();
                }
            } catch (MalformedURLException e) {
                arrayList.add(new C11222l(cls, "uri", "URL must be valid: " + e.getMessage()));
            } catch (IllegalArgumentException unused) {
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Icon(" + mo35934h() + C7425x.f15025G + mo35931e() + ", MIME: " + mo35932f() + ") " + mo35933g();
    }
}
